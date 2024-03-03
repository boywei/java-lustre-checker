package com.ecnu.synlong.api;

import com.ecnu.synlong.common.Output;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class OutputUtil {

    // TODO
    private static List<String> getCheckedNodes(List<String> output) {
        return null;
    }

    // TODO
    private static List<String> getResults(List<String> output) {
        return null;
    }

    /**
     * 将kind2输出的结果按行处理
     * @param multiLineString
     * @return
     */
    private static List<String> readStringByLine(String multiLineString) {
        // 按照换行符分割字符串
        String[] lines = multiLineString.split("\\n");

        return Arrays.stream(lines)
                .filter(line -> !line.isEmpty() && !line.startsWith(" ") &&
                        !line.contains("Property") &&
                        !line.contains("subsystems") &&
                        !line.contains("concrete")&&
                        !line.startsWith("-"))
                .collect(Collectors.toList());
    }

    // TODO
    /*
    result: kind2 v2.1.1
    Analyzing check_CruiseController2
    Accelerating: valid (k=9)
    Bounded speed: valid (k=9)
    Sprinting: valid (k=11)
     */
    public static List<String> OutputInitialize(String output) {

        return readStringByLine(output);
    }
}
