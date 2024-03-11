package com.ecnu.synlong;

import com.ecnu.synlong.api.ApiUtil;
import com.ecnu.synlong.api.Kind2Api4Synlong;
import com.ecnu.synlong.api.OutputUtil;
import com.ecnu.synlong.common.Output;
import com.ecnu.synlong.common.SolverOption;
import edu.uiowa.cs.clc.kind2.Kind2Exception;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.*;
import java.util.Map;


@SpringBootTest
public class OutputUtilTests {
    @Test
    void testOutputInit (){
        String filePath = "/home/jiang/Documents/ECNU/synlong/synlong/file/test.lus"; // replace with your file path
        Kind2Api4Synlong kpi = new Kind2Api4Synlong();
        kpi.setSmtSolver(SolverOption.Z3);


        StringBuilder output = new StringBuilder();


        try {
            // 创建一个新的进程
            Process process = kpi.getKind2ProcessBuilder().start();

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
//        System.out.println(output);
        Output<String, Map<String, String>> mapOutput = OutputUtil.OutputInit(output.toString().trim());
        System.out.println(mapOutput);
    }
    private static String removeAnsiEscapeCodes(String input) {

        return input.replaceAll("\u001B\\[[;\\d]*m", "");

    }
}
