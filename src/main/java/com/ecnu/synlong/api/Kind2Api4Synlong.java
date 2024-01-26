package com.ecnu.synlong.api;

import edu.uiowa.cs.clc.kind2.Kind2Exception;
import edu.uiowa.cs.clc.kind2.api.*;
import edu.uiowa.cs.clc.kind2.results.Result;
import lombok.Data;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
public class Kind2Api4Synlong extends Kind2Api {

	private static final long POLL_INTERVAL = 100;

	private List<String> otherOptions;


	// module smt
	private SolverOption smtSolver = SolverOption.Z3;
	private QESolverOption qeSmtSolver;
	private ITPSolverOption itpSmtSolver;
	private String smtLogic;
	private Boolean checkSatAssume;
	private Boolean smtShortNames;
	private String bitwuzlaBin;
	private String z3Bin;
	private String cvc5Bin;
	private String mathsatBin;
	private String opensmtBin;
	private String smtinterpolJar;
	private String yicesBin;
	private String yices2Bin;
	private Boolean smtTrace;

	// module ind
	private Boolean indPrintCex;

	//module ic3ia
	private Integer ic3iaMax;

	// module test
	private Boolean testgen;
	private Boolean testgenGraphOnly;
	private Integer testgenLen;

	// module interpreter
	private String interpreterInputFile;
	private Integer interpreterSteps;

	// module contracts
	private Boolean compositional;
	private Boolean checkModes;
	private Boolean checkImplem;
	private Boolean refinement;

	// module ivc
	private Boolean ivc;
	private HashSet<IVCCategory> ivcCategories;
	private Boolean ivcAll;
	private Boolean ivcApproximate;
	private Boolean ivcSmallestFirst;
	private Boolean ivcOnlyMainNode;
	private Boolean ivcMustSet;
	private Boolean printIVC;
	private Boolean printIVCComplement;
	private String minimizeProgram;
	private String ivcOutputDir;
	private Integer ivcPrecomputedMCS;
	private Integer ivcUCTimeout;

	// module mcs
	private Set<MCSCategory> mcsCategories;
	private Boolean mcsOnlyMainNode;
	private Boolean mcsAll;
	private Integer mcsMaxCardinality;
	private Boolean printMCS;
	private Boolean printMCSComplement;
	private Boolean printMCSCounterexample;
	private Boolean mcsPerProperty;

	// general
	private String outputDir;
	private List<String> includeDirs;
	private String realPrecision;
	private Boolean logInvs;
	private Boolean dumpCex;
	private Float timeout;
	private Boolean oldFrontend;
	private Boolean onlyParse;
	private Boolean lsp;
	private Set<Module> enabledSet;
	private Set<Module> disabledSet;
	private Boolean modular;
	private Boolean sliceNodes;
	private Boolean checkReach;
	private Boolean checkNonvacuity;
	private Boolean checkSubproperties;
	private LogLevel logLevel;
	private String lusMain;
	private String fakeFilepath;

	private static final String FILE_PATH = "/home/keepcalmm/ideaProjects/synlong/file/test_lustre.lus";

	@Override
	public void execute(String program, Result result, IProgressMonitor monitor) {
		try {
			callKind2(program, result, monitor);
		} catch (Throwable t) {
			throw new Kind2Exception(t.getMessage(), t);
		}
	}

	private void callKind2(String program, Result result, IProgressMonitor monitor)
			throws IOException, InterruptedException {
		ProcessBuilder builder = getKind2ProcessBuilder();
		// TODO
		saveKind2Program(program);

		Process process = null;
		String output = "";

		try {
			process = builder.start();
			process.getOutputStream().write(program.getBytes());
			process.getOutputStream().flush();
			process.getOutputStream().close();
			while (!monitor.isCanceled() && process.isAlive()) {
				int available = process.getInputStream().available();
				byte[] bytes = new byte[available];
				process.getInputStream().read(bytes);
				output += new String(bytes);
				sleep();
			}
		} finally {
			if (!monitor.isCanceled()) {
				int available = process.getInputStream().available();
				byte[] bytes = new byte[available];
				process.getInputStream().read(bytes);
				output += new String(bytes);
				try {
					result.initialize(output);
				} catch (RuntimeException e) {
				}
			}
			if (process != null) {
				process.destroy();
			}
			monitor.done();
		}
	}

	/**
	 * 保存传入的lustre模型
	 * @param program
	 */
	private void saveKind2Program(String program) {
		try (FileWriter fileWriter = new FileWriter(FILE_PATH)) {
			fileWriter.append(program);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	void sleep() {
		try {
			Thread.sleep(Kind2Api4Synlong.POLL_INTERVAL);
		} catch (InterruptedException e) {
		}
	}


	/**
	 * 获取ProcessBuilder对象，并设置执行命令
	 * @return ProcessBuilder对象
	 */
	private ProcessBuilder getKind2ProcessBuilder() {
		List<String> options = new ArrayList<>();
		options.add("bash");
		options.add("-c");
		options.add(KIND2);
		options.add(FILE_PATH); // TODO: 扩展
		options.add("--smt_solver");
		options.add(smtSolver.toString());
//		options.add("--z3_bin");
//		options.add("/Users/wei/z3-4.12.5-arm64-osx-11.0/bin/z3");
		options.addAll(getOptions());
		ProcessBuilder builder = new ProcessBuilder(options);
		builder.redirectErrorStream(true);
		return builder;
//		return new ProcessBuilder("bash", "-c", "kind2 " + FILE_PATH + " --smt_solver z3 ");
	}

	public List<String> getOptions() {
		List<String> options = new ArrayList<>();
		options.add("-json");
		if (logLevel != null) {
			options.add(logLevel.getOption());
		}
		if (lusMain != null) {
			options.add("--lus_main");
			options.add(lusMain);
		}
		if (smtSolver != null) {
			options.add("--smt_solver");
			options.add(smtSolver.toString());
		}
		if (qeSmtSolver != null) {
			options.add("--smt_qe_solver");
			options.add(qeSmtSolver.toString());
		}
		if (itpSmtSolver != null) {
			options.add("--smt_itp_solver");
			options.add(itpSmtSolver.toString());
		}
		if (smtLogic != null) {
			options.add("--smt_logic");
			options.add(smtLogic);
		}
		if (checkSatAssume != null) {
			options.add("--check_sat_assume");
			options.add(checkSatAssume.toString());
		}
		if (smtShortNames != null) {
			options.add("--smt_short_names");
			options.add(smtShortNames.toString());
		}
		if (bitwuzlaBin != null) {
			options.add("--bitwuzla_bin");
			options.add(bitwuzlaBin);
		}
		if (cvc5Bin != null) {
			options.add("--cvc5_bin");
			options.add(cvc5Bin);
		}
		if (mathsatBin != null) {
			options.add("--mathsat_bin");
			options.add(mathsatBin);
		}
		if (opensmtBin != null) {
			options.add("--opensmt_bin");
			options.add(opensmtBin);
		}
		if (smtinterpolJar != null) {
			options.add("--smtinterpol_jar");
			options.add(smtinterpolJar);
		}
		if (yicesBin != null) {
			options.add("--yices_bin");
			options.add(yicesBin);
		}
		if (yices2Bin != null) {
			options.add("--yices2_bin");
			options.add(yices2Bin);
		}
		if (z3Bin != null) {
			options.add("--z3_bin");
			options.add(z3Bin);
		}
		if (smtTrace != null) {
			options.add("--smt_trace");
			options.add(smtTrace.toString());
		}
		if (indPrintCex != null) {
			options.add("--ind_print_cex");
			options.add(indPrintCex.toString());
		}
		if (ic3iaMax != null) {
			options.add("--ic3ia_max");
			options.add(ic3iaMax.toString());
		}
		if (testgen != null) {
			options.add("--testgen");
			options.add(testgen.toString());
		}
		if (testgenGraphOnly != null) {
			options.add("--testgen_graph_only");
			options.add(testgenGraphOnly.toString());
		}
		if (testgenLen != null) {
			options.add("--testgen_len");
			options.add(testgenLen.toString());
		}
		if (interpreterInputFile != null) {
			options.add("--interpreter_input_file");
			options.add(interpreterInputFile.toString());
		}
		if (interpreterSteps != null) {
			options.add("--interpreter_steps");
			options.add(interpreterSteps.toString());
		}
		if (compositional != null) {
			options.add("--compositional");
			options.add(compositional.toString());
		}
		if (checkModes != null) {
			options.add("--check_modes");
			options.add(checkModes.toString());
		}
		if (checkImplem != null) {
			options.add("--check_implem");
			options.add(checkImplem.toString());
		}
		if (refinement != null) {
			options.add("--refinement");
			options.add(refinement.toString());
		}
		if (ivc != null) {
			options.add("--ivc");
			options.add(ivc.toString());
		}
		if (!ivcCategories.isEmpty()) {
			for (IVCCategory category : ivcCategories) {
				options.add("--ivc_category");
				options.add(category.toString());
			}
		}
		if (ivcAll != null) {
			options.add("--ivc_all");
			options.add(ivcAll.toString());
		}
		if (ivcApproximate != null) {
			options.add("--ivc_approximate");
			options.add(ivcApproximate.toString());
		}
		if (ivcSmallestFirst != null) {
			options.add("--ivc_smallest_first");
			options.add(ivcSmallestFirst.toString());
		}
		if (ivcOnlyMainNode != null) {
			options.add("--ivc_only_main_node");
			options.add(ivcOnlyMainNode.toString());
		}
		if (ivcMustSet != null) {
			options.add("--ivc_must_set");
			options.add(ivcMustSet.toString());
		}
		if (printIVC != null) {
			options.add("--print_ivc");
			options.add(printIVC.toString());
		}
		if (printIVCComplement != null) {
			options.add("--print_ivc_complement");
			options.add(printIVCComplement.toString());
		}
		if (minimizeProgram != null) {
			options.add("--minimize_program");
			options.add(minimizeProgram.toString());
		}
		if (ivcOutputDir != null) {
			options.add("--ivc_output_dir");
			options.add(ivcOutputDir.toString());
		}
		if (ivcPrecomputedMCS != null) {
			options.add("--ivc_precomputed_mcs");
			options.add(ivcPrecomputedMCS.toString());
		}
		if (ivcUCTimeout != null) {
			options.add("--ivc_uc_timeout");
			options.add(ivcUCTimeout.toString());
		}
		if (!mcsCategories.isEmpty()) {
			for (MCSCategory category : mcsCategories) {
				options.add("--mcs_category");
				options.add(category.toString());
			}
		}
		if (mcsOnlyMainNode != null) {
			options.add("--mcs_only_main_node");
			options.add(mcsOnlyMainNode.toString());
		}
		if (mcsAll != null) {
			options.add("--mcs_all");
			options.add(mcsAll.toString());
		}
		if (mcsMaxCardinality != null) {
			options.add("--mcs_max_cardinality");
			options.add(mcsMaxCardinality.toString());
		}
		if (printMCS != null) {
			options.add("--print_mcs");
			options.add(printMCS.toString());
		}
		if (printMCSComplement != null) {
			options.add("--print_mcs_complement");
			options.add(printMCSComplement.toString());
		}
		if (printMCSCounterexample != null) {
			options.add("--print_mcs_counterexample");
			options.add(printMCSCounterexample.toString());
		}
		if (mcsPerProperty != null) {
			options.add("--mcs_per_property");
			options.add(mcsPerProperty.toString());
		}
		if (outputDir != null) {
			options.add("--output_dir");
			options.add(outputDir);
		}
		if (!includeDirs.isEmpty()) {
			for (String dir : includeDirs) {
				options.add("--include_dir");
				options.add(dir);
			}
		}
		if (realPrecision != null) {
			options.add("--real_precision");
			options.add(realPrecision);
		}
		if (logInvs != null) {
			options.add("--log_invs");
			options.add(logInvs.toString());
		}
		if (dumpCex != null) {
			options.add("--dump_cex");
			options.add(dumpCex.toString());
		}
		if (timeout != null) {
			options.add("--timeout");
			options.add(timeout.toString());
		}
		if (oldFrontend != null) {
			options.add("--old_frontend");
			options.add(oldFrontend.toString());
		}
		if (onlyParse != null) {
			options.add("--only_parse");
			options.add(onlyParse.toString());
		}
		if (lsp != null) {
			options.add("--lsp");
			options.add(lsp.toString());
		}
		if (!enabledSet.isEmpty()) {
			for (Module module : enabledSet) {
				options.add("--enable");
				options.add(module.toString());
			}
		}
		if (!disabledSet.isEmpty()) {
			for (Module module : disabledSet) {
				options.add("--disable");
				options.add(module.toString());
			}
		}
		if (modular != null) {
			options.add("--modular");
			options.add(modular.toString());
		}
		if (sliceNodes != null) {
			options.add("--slice_nodes");
			options.add(sliceNodes.toString());
		}
		if (checkReach != null) {
			options.add("--check_reach");
			options.add(checkReach.toString());
		}
		if (checkNonvacuity != null) {
			options.add("--check_nonvacuity");
			options.add(checkNonvacuity.toString());
		}
		if (checkSubproperties != null) {
			options.add("--check_subproperties");
			options.add(checkSubproperties.toString());
		}
		if (fakeFilepath != null) {
			options.add("--fake_filepath");
			options.add(fakeFilepath);
		}
		options.addAll(this.otherOptions);
		return options;
	}
	public void setSmtSolver(SolverOption smtSolver) {
		this.smtSolver = smtSolver;
	}
}
