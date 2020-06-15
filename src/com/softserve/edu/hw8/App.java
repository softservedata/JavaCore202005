package com.softserve.edu.hw8;

import java.util.Map;
import java.util.HashMap;
import java.util.SortedMap;

public class App {
    public static void main(String[] args) {
        Map <String, Integer> mapA = new HashMap <String, Integer>();
        mapA.put("Bohdan", 971787549);
        mapA.put("Sam", 171784564);
        mapA.put("Mike", 947561238);

        Map <Integer, String> mapB = new HashMap <Integer,String>();

        for (Map.Entry <String, Integer> entry : mapA.entrySet()) {
        mapB.put((entry.getValue()),(entry.getKey()));

            System.out.println(mapB);
            // mapB.put((mapA.getOrDefault()));
        }

    }
}

