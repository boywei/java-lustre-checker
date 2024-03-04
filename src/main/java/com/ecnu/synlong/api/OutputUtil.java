package com.ecnu.synlong.api;

import com.ecnu.synlong.common.Output;

import java.util.*;
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
                        !line.contains("<Success>") &&
                        !line.contains("<Failure>") &&
                        !line.contains("subsystems") &&
                        !line.contains("concrete")&&
                        !line.startsWith("-"))
                .collect(Collectors.toList());
    }


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

    // TODO 处理 kind2 输出
    public static Output<String, Map<String, String>> OutputInit(String output) {
        String[] lines = output.split("\\n");
        List<String> out = Arrays.stream(lines)
                .filter(line -> !line.isEmpty() && !line.startsWith(" ") &&
                        !line.contains("kind2") &&
                        !line.contains("<Success>") &&
                        !line.contains("<Failure>") &&
                        !line.contains("properties") &&
                        !line.startsWith("=") &&
                        !line.startsWith("-"))
                .collect(Collectors.toList());

//        out.forEach(System.out::println);
        /**
            处理完后的数据
            Analyzing check_CruiseController2
            Accelerating: valid (k=9)
            Bounded speed: valid (k=9)
            Sprinting: valid (k=11)
         */
        Output<String, Map<String, String>> result = new Output<>();

        String key = "";
        Map<String, String> value = new HashMap<>();
        String marker = "Analyzing";
        for(String o:out) {
            if(o.contains(marker)) {
                key = o.substring(marker.length()).trim();
                if(!value.isEmpty()) {
                    result.put(key, new HashMap<>(value));
                }
                value.clear();
            } else {
                String[] temp = o.split(":");
                value.put(temp[0].trim(), temp[1].contains("invalid") ? "invalid" : "valid");
            }

        }
        if(!value.isEmpty()) {
            result.put(key, new HashMap<>(value));
        }
        System.out.println(result.entrySet());

        return result;
    }
}
