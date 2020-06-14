package com.softserve.homework8;

import java.util.*;

public class HW {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(123, "John");
        map1.put(234, "George");
        map1.put(456, "Ben");
        map1.put(876, "John");

        Map<String, Integer> map2 = reverseMap(map1);
        System.out.println(map2);
        Map<Object, Object> newMap = new TreeMap(new Comp());
    }

    public static <K, V> HashMap<V, K> reverseMap(Map<K, V> map) {
        HashMap<V, K> rev = new HashMap<>();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            rev.put(entry.getValue(), entry.getKey());
        }
        return rev;
    }

    static class Comp implements Comparator<Map<Object, Object>> {
        @Override
        public int compare(Map<Object, Object> o1, Map<Object, Object> o2) {
            return 0;
        }
    }

}
