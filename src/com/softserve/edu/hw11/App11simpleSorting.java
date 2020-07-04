package com.softserve.edu.hw11;

import java.util.*;

public class App11simpleSorting {
    public static void main(String[] args) {

        int numbersQuantity = 1000;
        int max = 100;
        long startTime;
        long endTime;

        Random random = new Random();

        List<Integer>[] all = new ArrayList[10];

        for (int i = 0; i < all.length; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < numbersQuantity; j++) {
                list.add(random.nextInt(max));
            }

            all[i] = list;
        }

        startTime = System.currentTimeMillis();

        for (int i = 0; i < 10; i++) {
            Collections.sort(all[i]);
            System.out.println(all[i]);
        }

        endTime = System.currentTimeMillis();

        System.out.println("Execution time is " + (endTime - startTime));
    }

}
