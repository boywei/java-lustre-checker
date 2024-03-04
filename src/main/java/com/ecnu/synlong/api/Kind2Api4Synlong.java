package com.ecnu.synlong.api;

import com.ecnu.synlong.common.Output;
import com.ecnu.synlong.common.SolverOption;
import edu.uiowa.cs.clc.kind2.Kind2Exception;
import edu.uiowa.cs.clc.kind2.api.*;
import lombok.Data;
import lombok.Setter;

import java.io.*;
import java.util.*;

@Data
public class Kind2Api4Synlong /*extends Kind2Api*/ {

    //TODO 挂载服务器时需修改
    private static final String KIND2 = "/usr/local/kind2/kind2";
    // 睡眠时间
    private static final long POLL_INTERVAL = 100;

    // module smt
    private SolverOption smtSolver = SolverOption.Z3;

    private String z3Bin;

    //TODO 挂载服务器时需修改
    private static final String FILE_PATH = "/home/jiang/Documents/ECNU/synlong/synlong/file/test.lus";


    public Output<String, Map<String, String>> execute(String program) {
//        return execute(program, new IProgressMonitor() {
//            @Override
//            public boolean isCanceled() {
//                return false;
//            }
//
//            @Override
//            public void done() {
//            }
//        });
        return callKind2(program);
    }

    @Deprecated
    public String execute(String program, IProgressMonitor monitor) {
        try {
            return callKind2(program, monitor);
        } catch (Throwable t) {
            throw new Kind2Exception(t.getMessage(), t);
        }

    }

    @Deprecated
    private String callKind2(String program, IProgressMonitor monitor)
            throws IOException, InterruptedException {
//		ProcessBuilder builder = getKind2ProcessBuilder();
        ProcessBuilder builder = new ProcessBuilder("bash", "-c", "kind2 " + FILE_PATH + " --smt_solver z3");
        System.out.println(ApiUtil.getQuotedCommand(builder.command()));
        // TODO
        saveKind2Program(program);

        Process process = null;
        String output = "";

        try {
            process = builder.start();
//			process.getOutputStream().write(program.getBytes());
//			process.getOutputStream().flush();
//			process.getOutputStream().close();
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

    //    public List<String> callKind2(String program) {
    public Output<String, Map<String, String>> callKind2(String program) {
        StringBuilder output = new StringBuilder();
        saveKind2Program(program);

        try {
            // 创建一个新的进程
            Process process = getKind2ProcessBuilder().start();

            // 从进程的输出流读取结果
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                // 将输出结果去除命令行格式
                output.append(removeAnsiEscapeCodes(line));

                output.append("\n"); // 如果需要在每行之间添加换行符

            }

            int exitCode = process.waitFor();
            if (exitCode != 0) {
                throw new Kind2Exception("命令执行失败，退出码: " + exitCode);
            }
        } catch (IOException | InterruptedException e) {
            throw new Kind2Exception("执行命令时发生错误: " + e.getMessage(), e);
        }

//        return OutputUtil.OutputInitialize(output.toString().trim()); // 返回处理过的输出结果
        return OutputUtil.OutputInit(output.toString().trim());
    }

    private static String removeAnsiEscapeCodes(String input) {

        return input.replaceAll("\u001B\\[[;\\d]*m", "");

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
            FileWriter fw = new FileWriter(file.getAbsoluteFile(), false);
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
    public ProcessBuilder getKind2ProcessBuilder() {
        List<String> options = new ArrayList<>();
//        options.add("bash");
//        options.add("-c");
        options.add(KIND2);
//        options.add("/usr/local/kind2/kind2");
        options.add(FILE_PATH);
        options.add("--smt_solver");
        options.add(smtSolver.toString());
//		options.add("--z3_bin");
//		options.add("/Users/wei/z3-4.12.5-arm64-osx-11.0/bin/z3");
//		options.addAll(getOptions());
        ProcessBuilder builder = new ProcessBuilder(options);
        builder.redirectErrorStream(true);
        return builder;
    }

}
