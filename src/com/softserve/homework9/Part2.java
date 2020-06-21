package com.softserve.homework9;

import java.util.ArrayList;
import java.util.List;

public class Part2 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("User1");
        names.add("John_45");
        names.add("G_Bill");
        names.add("K2");
        names.add("13Bill_09123323232");
        names.add("Kenny/07");

        for (String s : names) {
            if (!(isTrue(s))) {
                System.out.println("User login - '" + s + "' is invalid.");
            }
        }

    }

    public static boolean isTrue(String s) {
        return s.matches("[a-zA-Z0-9_]{3,15}");
    }
}
