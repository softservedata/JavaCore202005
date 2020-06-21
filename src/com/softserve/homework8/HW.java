package com.softserve.homework8;

import java.util.*;

public class HW {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        map1.put("01234", "John");
        map1.put("00234", "George");
        map1.put("00456", "Ben");
        map1.put("00876", "John");

        Map<String, String> map2 = reverseMap(map1);
        System.out.println(map2);

    }

    public static <K, V> HashMap<V, K> reverseMap(Map<K, V> map) {
        HashMap<V, K> rev = new HashMap<V, K>();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            rev.put(entry.getValue(), entry.getKey());
        }
        return rev;
    }
}
