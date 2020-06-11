package com.softserve.homework7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("1)");

        HashSet<String> obj1 = new HashSet<>();
        HashSet<String> obj2 = new HashSet<>();

        obj1.add("a");
        obj1.add("b");
        obj1.add("c");
        obj1.add("d");
        obj1.add("e");
        obj1.add("f");
        obj1.add("g");
        obj1.add("h");
        obj1.add("i");
        obj1.add("j");

        obj2.add("a");
        obj2.add("bb");
        obj2.add("c");
        obj2.add("dd");
        obj2.add("e");
        obj2.add("ff");
        obj2.add("g");
        obj2.add("hh");
        obj2.add("i");
        obj2.add("jj");

        System.out.println("obj1 = " + obj1);
        System.out.println("obj2 = " + obj2);

        obj1.retainAll(obj2);
        List<String> intersect = new ArrayList<>(obj1);

        System.out.println("intersection = " + intersect);

        System.out.println("\n2)");

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(2);
        list1.add(3);
        list1.add(1);

        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(1);

        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);

        HashSet<Integer> set1 = new HashSet<>(list1);
        HashSet<Integer> set2 = new HashSet<>(list2);

        if(set1.containsAll(set2) && set2.containsAll(set1)) {
            System.out.println("Lists content is equal.");
        }
        else {
            System.out.println("Lists content is not equal.");
        }
    }
}
