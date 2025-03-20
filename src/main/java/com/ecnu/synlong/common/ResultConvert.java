package com.ecnu.synlong.common;

import edu.uiowa.cs.clc.kind2.results.Property;
import edu.uiowa.cs.clc.kind2.results.Result;

import java.util.Iterator;
import java.util.Set;

public class ResultConvert {
    public static String convertToString(Result result) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("通过的性质:\n");
        Set<Property> validProperties = result.getValidProperties();
        printProperties(stringBuilder, validProperties);
        stringBuilder.append("\n不通过的性质:\n");
        Set<Property> falsifiedProperties = result.getFalsifiedProperties();
        printProperties(stringBuilder, falsifiedProperties);
//        stringBuilder.append("\n未知的性质:\n");
//        Set<Property> unknownProperties = result.getUnknownProperties();
//        printProperties(stringBuilder, unknownProperties);
//        stringBuilder.append("\n可达的性质:\n");
//        Set<Property> reachableProperties = result.getReachableProperties();
//        printProperties(stringBuilder, reachableProperties);
//        stringBuilder.append("\n不可达的性质:\n");
//        Set<Property> unreachableProperties = result.getUnreachableProperties();
//        printProperties(stringBuilder, unreachableProperties);
        return stringBuilder.toString();
//        return result.getRoot().printVerificationSummary();
    }

    private static void printProperties(StringBuilder stringBuilder, Set<Property> properties) {
        if (properties.isEmpty()) {
            stringBuilder.append("无.\n");
        } else {
            for(Iterator var3 = properties.iterator(); var3.hasNext(); stringBuilder.append("\n")) {
                Property property = (Property)var3.next();
                stringBuilder.append(property.getSource() + "类型: ");
//                stringBuilder.append(property.getQualifiedName());
                String nodeName = property.getAnalysis().getNodeName();
                // 去除外面的括号
                stringBuilder.append("节点【" + nodeName.substring(2, nodeName.length() - 2) + "】-- ");
                stringBuilder.append("名称【" + property.getJsonName() + "】-- ");

                stringBuilder.append("第" + property.getLine() + "行");
            }
        }

    }
}
