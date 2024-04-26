package com.ecnu.synlong.api;

import com.ecnu.synlong.common.Output;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

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
    public static String JsonOutputInit(String output) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        JsonNode root = mapper.readTree(output);

        JsonNode propertyEntry = null;

        for (JsonNode entry : root) {

            if ("property".equals(entry.get("objectType").asText())) {

                propertyEntry = entry;

                break;

            }

        }
        assert propertyEntry != null;
        System.out.println(propertyEntry);
        return propertyEntry.toString();
    }
}
