package com.softserve.homework7;

import java.util.*;

public class Part1 {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>(10);
        Set<String> set2 = new HashSet<>(10);
        List<String> list;

        for (int i=0; i<10; i++) {
            set1.add("String" + i);
        }
        for (int i=5; i<15; i++) {
            set2.add("String" + i);
        }

        list = getListWithEqualElements(set1, set2);
        System.out.println(list);

    }

    private static List<String> getListWithEqualElements(Set<String> set1, Set<String> set2) {
        List<String> list1 = new ArrayList<>();
        String s;
        Iterator<String> iterator = set1.iterator();
        while (iterator.hasNext()) {
            s = iterator.next();
            if (set2.contains(s)) {
                list1.add(s);
            }
        }
        return list1;
    }
}
