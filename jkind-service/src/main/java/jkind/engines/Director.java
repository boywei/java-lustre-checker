package jkind.engines;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import jkind.ExitCodes;
import jkind.JKindException;
import jkind.JKindSettings;
import jkind.Main;
import jkind.StdErr;
import jkind.advice.Advice;
import jkind.advice.AdviceReader;
import jkind.advice.AdviceWriter;
import jkind.engines.invariant.GraphInvariantGenerationEngine;
import jkind.engines.ivcs.AllIVCs;
import jkind.engines.ivcs.AllIvcsExtractorEngine;
import jkind.engines.ivcs.IvcReductionEngine;
import jkind.engines.ivcs.IvcUtil;
import jkind.engines.messages.BaseStepMessage;
import jkind.engines.messages.EngineType;
import jkind.engines.messages.InductiveCounterexampleMessage;
import jkind.engines.messages.InvalidMessage;
import jkind.engines.messages.InvariantMessage;
import jkind.engines.messages.Itinerary;
import jkind.engines.messages.Message;
import jkind.engines.messages.MessageHandler;
import jkind.engines.messages.UnknownMessage;
import jkind.engines.messages.ValidMessage;
import jkind.engines.pdr.PdrEngine;
import jkind.lustre.Expr;
import jkind.results.Counterexample;
import jkind.results.layout.NodeLayout;
import jkind.solvers.Model;
import jkind.translation.Specification;
import jkind.util.CounterexampleExtractor;
import jkind.util.ModelReconstructionEvaluator;
import jkind.util.Util;
import jkind.writers.*;

public class Director extends MessageHandler {
	public static final String NAME = "director";

	private final JKindSettings settings;
	private final Specification userSpec;
	private final Specification analysisSpec;
	private final Writer writer;
	public final long startTime;

	private final List<String> remainingProperties = new ArrayList<>();
	private final List<String> validProperties = new ArrayList<>();
	private final List<String> invalidProperties = new ArrayList<>();
	private int baseStep = 0;
	private final Map<String, InductiveCounterexampleMessage> inductiveCounterexamples = new HashMap<>();

	private final List<Engine> engines = new ArrayList<>();
	private final List<Thread> threads = new ArrayList<>();

	private Advice inputAdvice;
	private AdviceWriter adviceWriter;

	private MiniJKind miniJkind;

	private StringBuilder output = new StringBuilder();

	public Director(JKindSettings settings, Specification userSpec, Specification analysisSpec) {
		this(settings, userSpec, analysisSpec, null);
	}

	public Director(JKindSettings settings, Specification userSpec, Specification analysisSpec, MiniJKind miniJkind) {
		this.settings = settings;
		this.userSpec = userSpec;
		this.analysisSpec = analysisSpec;
		this.miniJkind = miniJkind;
		this.writer = getWriter();
		this.startTime = System.currentTimeMillis();
		this.remainingProperties.addAll(analysisSpec.node.properties);

		if (settings.readAdvice != null) {
			this.inputAdvice = AdviceReader.read(settings.readAdvice);
		}

		if (settings.writeAdvice != null) {
			this.adviceWriter = new AdviceWriter(settings.writeAdvice);
			this.adviceWriter.addVarDecls(Util.getVarDecls(analysisSpec.node));
		}

		initializeUnknowns(settings, analysisSpec.node.properties);
	}

	private final Writer getWriter() {
		try {
			if (settings.excel) {
				return new ExcelWriter(settings.filename + ".xls", userSpec.node);
			} else if (settings.xml) {
				return new XmlWriter(settings.filename + ".xml", userSpec.typeMap, settings.xmlToStdout);
			} else if (settings.miniJkind) {
				return new ConsoleWriter(new NodeLayout(userSpec.node), miniJkind);
			} else {
//				return new ConsoleWriter(new NodeLayout(userSpec.node));
				return new StringWriter(new NodeLayout(userSpec.node));
			}
		} catch (IOException e) {
			throw new JKindException("Unable to open output file", e);
		}
	}

	public int run() {
		if (!settings.miniJkind) {
			printHeader();
		}
		writer.begin();
		addShutdownHook();
		createAndStartEngines();

		while (!timeout() && propertiesRemaining() && someThreadAlive() && !someEngineFailed() && !exitRequested()) {
			processMessages();
			sleep(100);
		}

		processMessages();
		int exitCode = 0;
		if (removeShutdownHook()) {
			postProcessing();
			exitCode = reportFailures();
		}

		// Needed for minijkind; other cases the top-level jkind shuts down
		if (settings.miniJkind) {
			stopEngines();
		}

		System.out.println(output.toString());
		System.out.println(writer.toString());

		return exitCode;
	}

	public String getResult() {
		return output.toString() + " " + writer.toString();
	}

	private boolean exitRequested() {
		try {
			while (System.in.available() > 0) {
				if (System.in.read() == Util.END_OF_TEXT) {
					return true;
				}
			}
		} catch (IOException e) {
		}
		return false;
	}

	private void postProcessing() {
		writeUnknowns();
		writer.end();
		writeAdvice();
		printSummary();
	}

	private final Thread shutdownHook = new Thread("shutdown-hook") {
		@Override
		public void run() {
			Director.sleep(100);
			postProcessing();
		}
	};

	private void addShutdownHook() {
		Runtime.getRuntime().addShutdownHook(shutdownHook);
	}

	private boolean removeShutdownHook() {
		try {
			Runtime.getRuntime().removeShutdownHook(shutdownHook);
			return true;
		} catch (IllegalStateException e) {
			// JVM already shutting down
			return false;
		}
	}

	private void createAndStartEngines() {
		createEngines();
		threads.forEach(Thread::start);
	}

	private void createEngines() {
		if (settings.boundedModelChecking) {
			addEngine(new BmcEngine(analysisSpec, settings, this));
		}

		if (settings.kInduction) {
			addEngine(new KInductionEngine(analysisSpec, settings, this));
		}

		if (settings.invariantGeneration) {
			addEngine(new GraphInvariantGenerationEngine(analysisSpec, settings, this));
		}

		if (settings.smoothCounterexamples) {
			addEngine(new SmoothingEngine(analysisSpec, settings, this));
		}

		if (settings.pdrMax > 0) {
			addEngine(new PdrEngine(analysisSpec, settings, this));
		}

		if (settings.readAdvice != null) {
			addEngine(new AdviceEngine(analysisSpec, settings, this, inputAdvice));
		}

		if (settings.reduceIvc) {
			addEngine(new IvcReductionEngine(analysisSpec, settings, this));
		}

		if (settings.allIvcs) {
			addEngine(new AllIvcsExtractorEngine(analysisSpec, settings, this));
		}
	}

	private void addEngine(Engine engine) {
		engines.add(engine);
		threads.add(new Thread(engine, engine.getName()));
	}

	private void stopEngines() {
		try {
			for (Engine engine : engines) {
				// Add code to kill thread.
				engine.stopEngine();
			}
		} catch (Throwable t) {
		}
	}

	private static void sleep(int millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
		}
	}

	private boolean timeout() {
		long timeout = startTime + ((long) settings.timeout) * 1000;
		return System.currentTimeMillis() > timeout;
	}

	private boolean propertiesRemaining() {
		return !remainingProperties.isEmpty();
	}

	private boolean someThreadAlive() {
		return threads.stream().anyMatch(Thread::isAlive);
	}

	private boolean someEngineFailed() {
		return engines.stream().anyMatch(e -> e.getThrowable() != null);
	}

	private void writeUnknowns() {
		if (!remainingProperties.isEmpty()) {
			writer.writeUnknown(remainingProperties, baseStep, convertInductiveCounterexamples(), getRuntime());
		}
	}

	private int reportFailures() {
		int exitCode = 0;
		for (Engine engine : engines) {
			// MWW: specialized for miniJKind - we kill solvers abruptly
			// for "internal" runs.
			boolean engine_throwable = (engine.getThrowable() != null);
			boolean no_minijkind = (!settings.miniJkind);
			boolean timeout = timeout();

			if (engine_throwable) {
				StdErr.println(engine.getName() + " process failed");
				StdErr.printStackTrace(engine.getThrowable());
				exitCode = ExitCodes.UNCAUGHT_EXCEPTION;
				if (engine.getThrowable().toString().contains("IvcException")) {
					exitCode = ExitCodes.IVC_EXCEPTION;
				}
				if (!no_minijkind) {
					StdErr.println("failed during miniJKind run");
				}
				if (timeout) {
					StdErr.println("timeout occurred");
				}
			}
		}
		return exitCode;
	}

	private void printHeader() {
		if (!settings.xmlToStdout) {
			output.append("一共有 " + remainingProperties.size() + " 条性质待检验.\n");
			output.append("待检验的性质: " + remainingProperties + "\n");
		}
	}

	private void writeAdvice() {
		if (adviceWriter != null) {
			adviceWriter.write();
		}
	}

	public void broadcast(Message message) {
		receiveMessage(message);
		for (Engine engine : engines) {
			engine.receiveMessage(message);
		}
	}

	@Override
	protected void handleMessage(ValidMessage vm) {
		if (vm.getNextDestination() != null) {
			if (vm.getNextDestination().equals(EngineType.IVC_REDUCTION) && adviceWriter != null) {
				adviceWriter.addInvariants(vm.invariants);
			}
			return;
		}

		List<String> newValid = intersect(vm.valid, remainingProperties);
		if (newValid.isEmpty()) {
			return;
		}

		remainingProperties.removeAll(newValid);
		validProperties.addAll(newValid);
		inductiveCounterexamples.keySet().removeAll(newValid);

		if (adviceWriter != null) {
			adviceWriter.addInvariants(vm.invariants);
		}

		List<Expr> invariants = settings.reduceIvc ? vm.invariants : Collections.emptyList();

		if ((!settings.miniJkind) && (settings.reduceIvc)) {
			Set<String> ivc = IvcUtil.findRightSide(vm.ivc, settings.allAssigned, analysisSpec.node.equations);
			List<AllIVCs> allIvcs = new ArrayList<>();
			if (settings.allIvcs) {
				for (AllIVCs item : vm.allIvcs) {
					allIvcs.add(new AllIVCs(IvcUtil.findRightSide(item.getAllIVCSet(), settings.allAssigned,
							analysisSpec.node.equations), item.getAllIVCList()));
				}
			}
			writer.writeValid(newValid, vm.source, vm.k, vm.proofTime, getRuntime(), invariants, ivc, allIvcs,
					vm.mivcTimedOut);
		} else {
			writer.writeValid(newValid, vm.source, vm.k, vm.proofTime, getRuntime(), invariants, vm.ivc, vm.allIvcs,
					vm.mivcTimedOut);
		}
	}

	private List<String> intersect(List<String> list1, List<String> list2) {
		List<String> result = new ArrayList<>();
		result.addAll(list1);
		result.retainAll(list2);
		return result;
	}

	@Override
	protected void handleMessage(InvalidMessage im) {
		if (im.getNextDestination() != null) {
			return;
		}

		List<String> newInvalid = intersect(im.invalid, remainingProperties);
		if (newInvalid.isEmpty()) {
			return;
		}

		remainingProperties.removeAll(newInvalid);
		invalidProperties.addAll(newInvalid);
		inductiveCounterexamples.keySet().removeAll(newInvalid);

		double runtime = getRuntime();
		for (String invalidProp : newInvalid) {
			Counterexample cex = extractCounterexample(invalidProp, im.length, im.model, true);
			writer.writeInvalid(invalidProp, im.source, cex, Collections.emptyList(), runtime);
		}
	}

	@Override
	protected void handleMessage(InductiveCounterexampleMessage icm) {
		for (String property : icm.properties) {
			inductiveCounterexamples.put(property, icm);
		}
	}

	private final Map<String, Integer> bmcUnknowns = new HashMap<>();
	private final Set<String> kInductionUnknowns = new HashSet<>();
	private final Set<String> pdrUnknowns = new HashSet<>();

	private void initializeUnknowns(JKindSettings settings, List<String> properties) {
		if (!settings.boundedModelChecking) {
			for (String prop : properties) {
				bmcUnknowns.put(prop, 0);
			}
		}

		if (!settings.kInduction) {
			kInductionUnknowns.addAll(properties);
		}

		if (settings.pdrMax <= 0) {
			pdrUnknowns.addAll(properties);
		}
	}

	@Override
	protected void handleMessage(UnknownMessage um) {
		if (um.source.equals(NAME)) {
			return;
		}

		markUnknowns(um);

		Map<Integer, List<String>> completed = getCompletelyUnknownByBaseStep(um);
		for (Entry<Integer, List<String>> entry : completed.entrySet()) {
			int baseStep = entry.getKey();
			List<String> unknowns = entry.getValue();
			remainingProperties.removeAll(unknowns);
			writer.writeUnknown(um.unknown, baseStep, convertInductiveCounterexamples(), getRuntime());
			broadcast(new UnknownMessage(NAME, unknowns));
		}
	}

	private Map<Integer, List<String>> getCompletelyUnknownByBaseStep(UnknownMessage um) {
		return um.unknown.stream().filter(this::isCompletelyUnknown).collect(Collectors.groupingBy(bmcUnknowns::get));
	}

	private void markUnknowns(UnknownMessage um) {
		switch (um.source) {
		case BmcEngine.NAME:
			for (String prop : um.unknown) {
				bmcUnknowns.put(prop, baseStep);
			}
			break;

		case KInductionEngine.NAME:
			kInductionUnknowns.addAll(um.unknown);
			break;

		case PdrEngine.NAME:
			pdrUnknowns.addAll(um.unknown);
			break;
		}
	}

	public boolean isCompletelyUnknown(String prop) {
		return bmcUnknowns.containsKey(prop) && kInductionUnknowns.contains(prop) && pdrUnknowns.contains(prop);
	}

	@Override
	protected void handleMessage(BaseStepMessage bsm) {
		baseStep = bsm.step;
		if (!bsm.properties.isEmpty()) {
			writer.writeBaseStep(bsm.properties, baseStep);
		}
	}

	@Override
	protected void handleMessage(InvariantMessage im) {
	}

	public Itinerary getValidMessageItinerary() {
		List<EngineType> destinations = new ArrayList<>();
		if (settings.reduceIvc) {
			destinations.add(EngineType.IVC_REDUCTION);
		}
		if (settings.allIvcs) {
			destinations.add(EngineType.IVC_REDUCTION_ALL);
		}

		return new Itinerary(destinations);
	}

	public Itinerary getInvalidMessageItinerary() {
		List<EngineType> destinations = new ArrayList<>();
		if (settings.smoothCounterexamples) {
			destinations.add(EngineType.SMOOTHING);
		}
		return new Itinerary(destinations);
	}

	private double getRuntime() {
		return (System.currentTimeMillis() - startTime) / 1000.0;
	}

	private void printSummary() {
		if (!settings.xmlToStdout && !settings.miniJkind) {
			output.append("    -------------------------------------\n");
			output.append("    --^^--          详情           --^^--\n");
			output.append("    -------------------------------------\n");
			if (!validProperties.isEmpty()) {
				output.append("所有通过的性质: " + validProperties + "\n");
			}
			if (!invalidProperties.isEmpty()) {
				output.append("所有不通过的性质: " + invalidProperties + "\n");
			}

			List<String> unknownProperties = new ArrayList<>(analysisSpec.node.properties);
			unknownProperties.removeAll(validProperties);
			unknownProperties.removeAll(invalidProperties);
			if (!unknownProperties.isEmpty()) {
				output.append("所有未知的性质: " + unknownProperties + "\n");
			}
		}
	}

	private Map<String, Counterexample> convertInductiveCounterexamples() {
		Map<String, Counterexample> result = new HashMap<>();

		for (String prop : inductiveCounterexamples.keySet()) {
			InductiveCounterexampleMessage icm = inductiveCounterexamples.get(prop);
			result.put(prop, extractCounterexample(prop, icm.length, icm.model, false));
		}

		return result;
	}

	private Counterexample extractCounterexample(String property, int k, Model model, boolean concrete) {
		model = ModelReconstructionEvaluator.reconstruct(userSpec, analysisSpec, model, property, k, concrete);
		return CounterexampleExtractor.extract(userSpec, k, model);
	}

	public List<String> getRemainingProperties() {
		return remainingProperties;
	}

	public List<String> getValidProperties() {
		return validProperties;
	}

	public List<String> getInvalidProperties() {
		return invalidProperties;
	}

	public int getBaseStep() {
		return baseStep;
	}

	public Map<String, InductiveCounterexampleMessage> getInductiveCounterexamples() {
		return inductiveCounterexamples;
	}

	public Advice getInputAdvice() {
		return inputAdvice;
	}

}
