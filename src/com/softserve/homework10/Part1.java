package com.softserve.homework10;

import java.util.*;

public class Part1 {
    public static void main(String[] args) {
        String json = "{\"id\":\"123\",\"name\":\"Ivan\",\"email\":\"ivan@gmail.com\",\"city\":\"Lviv\"}";

        List<String> list0 = Arrays.asList(json.replaceAll("^.|.$", ""));
        List<String> list = Arrays.asList(list0.get(0).replaceAll("\"", ""));
        String ss = list.get(0);
        Map<String, String> map = new HashMap<>();
        List<String> list1 = new ArrayList<>();

        String[] arr = ss.split("[(,)]");
        String[] arr2;
        for (String s : arr) {
            arr2 = s.split("[(:)]");
            for (String s1 : arr2) {
                list1.add(s1);
            }
        }

        for (int i = 0; i < list1.size(); i++) {
            map.put(list1.get(i), list1.get(++i));
        }
        System.out.println(map);
    }

}
