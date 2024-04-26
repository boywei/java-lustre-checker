package com.ecnu.synlong.api;

import com.ecnu.synlong.common.Output;
import com.ecnu.synlong.common.SolverOption;
import com.fasterxml.jackson.core.JsonProcessingException;
import edu.uiowa.cs.clc.kind2.Kind2Exception;
import edu.uiowa.cs.clc.kind2.api.IProgressMonitor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
@Component
public class Api2 {

//    @Value("${tool.path}")
    private String TOOL = "./file/tool/tool";
    // 睡眠时间
    private static final long POLL_INTERVAL = 100;

    // module smt
    private SolverOption smtSolver = SolverOption.Z3;

//    private String z3Bin;

//    @Value("${tool.file.path}")
    private String FILE_PATH = "./file/test.lus";

    private String OUTPUT_FORMAT = "-json";

    public String getCommand() {
        return ApiUtil.getQuotedCommand(getKind2ProcessBuilder().command());
    }

    public String execute(String program) throws JsonProcessingException {
        return call(program);
    }



    public String call(String program) throws JsonProcessingException {
        StringBuilder output = new StringBuilder();
        saveKind2Program(program);

        try {
            // 创建一个新的进程
            Process process = getKind2ProcessBuilder().start();
            System.out.println(ApiUtil.getQuotedCommand(getKind2ProcessBuilder().command()));

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

        return OutputUtil.JsonOutputInit(output.toString().trim());
//        return output.toString().trim();
    }

    /**
     * 格式化 kind2 输出
     */
    private static String removeAnsiEscapeCodes(String input) {

        return input.replaceAll("\u001B\\[[;\\d]*m", "");

    }

    /**
     * 保存传入的lustre模型
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
            Thread.sleep(Api2.POLL_INTERVAL);
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
        options.add(TOOL);
//        options.add("/usr/local/kind2/kind2");
        options.add(FILE_PATH);
        options.add("--smt_solver");
        options.add(smtSolver.toString());
//		options.add("--z3_bin");
        options.add(OUTPUT_FORMAT);
        ProcessBuilder builder = new ProcessBuilder(options);
        builder.redirectErrorStream(true);
        return builder;
    }

}
