package com.softserve.edu.hw7_1;

import java.util.*;

public class Appl {
    public static void main(String[] args) {
        // Set a
        Set<String> a = new HashSet<String>();
        a.add("1");
        a.add("3");
        a.add("2");
        a.add("5");
        a.add("4");
        // Set b
        Set<String> b = new HashSet<String>();
        b.add("1");
        b.add("2");
        b.add("3");
        b.add("7");
        b.add("8");
        List<String> intersection = new LinkedList<String>(a);
        intersection.retainAll(b);
        System.out.printf("Union of two Set %s and %s is %s %n",
                a.toString(), b.toString(), intersection.toString());
    }
}
