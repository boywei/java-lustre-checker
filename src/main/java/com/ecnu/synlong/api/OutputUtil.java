package com.ecnu.synlong.api;

import com.ecnu.synlong.common.Output;

import java.util.Arrays;
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

    public static Output OutputInitialize(String output) {
        List<String> strings = readStringByLine(output);
        String result = String.join("\n", strings);

        return new Output(result);
    }
}
