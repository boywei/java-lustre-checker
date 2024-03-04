package com.ecnu.synlong;

import com.ecnu.synlong.api.OutputUtil;
import com.ecnu.synlong.common.Output;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;


@SpringBootTest
public class OutputUtilTests {
    @Test
    void testOutputInit (){
        String filePath = "/home/jiang/Documents/ECNU/synlong/synlong/file/test.lus"; // replace with your file path
        StringBuilder output = new StringBuilder();


        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

            String line;

            while ((line = reader.readLine()) != null) {

                output.append(removeAnsiEscapeCodes(line));

                output.append("\n"); // 如果需要在每行之间添加换行符

            }

        } catch (IOException e) {

            System.err.format("IOException: %s%n", e);

        }

        Output<String, Map<String, String>> mapOutput = OutputUtil.OutputInit(output.toString().trim());
        System.out.println(mapOutput);
    }
    private static String removeAnsiEscapeCodes(String input) {

        return input.replaceAll("\u001B\\[[;\\d]*m", "");

    }
}
