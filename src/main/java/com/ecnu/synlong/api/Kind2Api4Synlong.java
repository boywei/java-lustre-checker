package com.ecnu.synlong.api;

import com.ecnu.synlong.common.SolverOption;
import edu.uiowa.cs.clc.kind2.Kind2Exception;
import edu.uiowa.cs.clc.kind2.api.*;
import lombok.Data;
import lombok.Setter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
public class Kind2Api4Synlong /*extends Kind2Api*/ {

	private static final String KIND2 = "kind2";
	// 睡眠时间
	private static final long POLL_INTERVAL = 100;

	// module smt
	private SolverOption smtSolver = SolverOption.Z3;

	private String z3Bin;

	//TODO 改为相对路径
	private static final String FILE_PATH = "/home/keepcalmm/IdeaProjects/synlong/file/test_lustre.lus";


	public String execute(String program) {
//		Result result = new Result();
		return execute(program, new IProgressMonitor() {
			@Override
			public boolean isCanceled() {
				return false;
			}

			@Override
			public void done() {}
		});
//		return result;
	}

	public String execute(String program, IProgressMonitor monitor) {
		try {
			return callKind2(program, monitor);
		} catch (Throwable t) {
			throw new Kind2Exception(t.getMessage(), t);
		}

	}

	private String callKind2(String program, IProgressMonitor monitor)
			throws IOException, InterruptedException {
		ProcessBuilder builder = getKind2ProcessBuilder();
		// TODO
		saveKind2Program(program);

		Process process = null;
		String output = "";

		try {
//			System.out.println(1/0);
			process = builder.start();
			process.getOutputStream().write(program.getBytes());
			process.getOutputStream().flush();
			process.getOutputStream().close();
			while (!monitor.isCanceled() && process.isAlive()) {
				int available = process.getInputStream().available();
				byte[] bytes = new byte[available];
				process.getInputStream().read(bytes);
				output += new String(bytes);
				System.out.println("output: " + output);
				sleep();
			}
		} finally {
			if (!monitor.isCanceled()) {
				int available = process.getInputStream().available();
				byte[] bytes = new byte[available];
				process.getInputStream().read(bytes);
				output += new String(bytes);
			}
			if (process != null) {
				process.destroy();
			}
			monitor.done();
		}
		return output;
	}

	/**
	 * 判断Kind2是否可用
	 *
     */
	public boolean checkKind2Available() throws IOException {
		ProcessBuilder builder = new ProcessBuilder("bash -c" + KIND2, "--version");
		builder.redirectErrorStream(true);
		Process process = builder.start();

//		String output = ApiUtil.readAll(process.getInputStream());
		if (process.exitValue() != 0) {
			return false;
		} else {
			return true;
		}
//		return output;
	}

	/**
	 * 保存传入的lustre模型
	 *
	 * @param program
	 */
	private void saveKind2Program(String program) {
		try {
			File file = new File(FILE_PATH);
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(program);
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
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
	 *
	 * @return ProcessBuilder对象
	 */
	private ProcessBuilder getKind2ProcessBuilder() {
		List<String> options = new ArrayList<>();
		options.add("bash");
		options.add("-c");
		options.add(KIND2);
		options.add(FILE_PATH);
		options.add("--smt_solver");
		options.add(smtSolver.toString());
//		options.add("--z3_bin");
//		options.add("/Users/wei/z3-4.12.5-arm64-osx-11.0/bin/z3");
//		options.addAll(getOptions());
		ProcessBuilder builder = new ProcessBuilder(options);
		builder.redirectErrorStream(true);
		return builder;
//		return new ProcessBuilder("bash", "-c", "kind2 " + FILE_PATH + " --smt_solver z3 ");
	}

}
