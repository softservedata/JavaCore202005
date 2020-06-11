package com.softserve.edu.hw7_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        a.add("aa");
        a.add("b");
        a.add("c");
        a.add("ff");
        List<String> b = new ArrayList<>();
        b.add("aa");
        b.add("b");
        b.add("c");
        List<String> intersection = new LinkedList<String>(a);
        intersection.retainAll(b);
        int min = Math.min(a.size(), b.size());
        if (intersection.size() == min ) {
            System.out.println("The content of the collection is match");
        }
        else {
            System.out.println("The content of collection is different");
        }
    }
}
