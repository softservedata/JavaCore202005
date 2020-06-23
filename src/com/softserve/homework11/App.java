package com.softserve.homework11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {
    public static void main(String[] args) {
        List<List<Integer>> outList = new ArrayList<>(10);
        Random random = new Random();
        int max = 100;

        for (int i = 0; i < 10; i++) {
            List<Integer> inList = new ArrayList<>(1000000);
            for (int j = 0; j < 1000000; j ++) {
                inList.add(random.nextInt(max));
            }
            outList.add(i, inList);
        }
        long startMs = System.currentTimeMillis();
        for (List<Integer> curr : outList) {
            Collections.sort(curr);
        }
        long finishMs = System.currentTimeMillis();
        System.out.println("Run time in single thread = " + (finishMs - startMs) + "ms");

        startMs = System.currentTimeMillis();
        ExecutorService executor = Executors.newFixedThreadPool(10);
        for (List<Integer> curr : outList) {
            Runnable r = new Sorter(curr);
            Thread t = new Thread(r);
            executor.execute(t);
        }
        executor.shutdown();
        while (!executor.isTerminated()) {
        }

        finishMs = System.currentTimeMillis();
        System.out.println("Run time in multithread = " + (finishMs - startMs) + "ms");
    }
}
