package com.softserve.edu.hw8;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Map<String, String> mapA = new HashMap<>();
        mapA.put("Bohdan", "971787549");
        mapA.put("Sam", "171784564");
        mapA.put("Mike", "947561238");

        Map<String, Set<String>> mapB = new HashMap<>();

        for (Map.Entry<String, String> entry : mapA.entrySet()) {
            String value = entry.getValue().trim();
            Set<String> setNums = mapB.get(value);
            if (setNums == null) {
                setNums = new HashSet<>();
                mapB.put(value, setNums);
                {
                    setNums.add(entry.getKey()
                            .replace("-", " ")
                            .replace(" ", " ")
                            .replace(")", " ")
                            .replace("(", " ")
                            .trim());

                }

            }

        } System.out.println(mapB);
    }
}

