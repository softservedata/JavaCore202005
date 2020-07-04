package com.softserve.edu.hw11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

class Sort implements Runnable {
    private List<Integer> list;

    public Sort(List<Integer> list) {
        this.list = list;
    }

    public void run() {
        Collections.sort(list);
    }
}

public class App11threads {
    public static void main(String[] args) throws InterruptedException {

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

        Thread[] t = new Thread[all.length];
        for (int i = 0; i < all.length; i++) {
            t[i] = new Thread(new Sort(all[i]));
            t[i].start();
        }

        for (int i = 0; i < all.length; i++) {
            t[i].join();
        }

        endTime= System.currentTimeMillis();

        for (int i = 0; i < all.length; i++) {
            System.out.println(all[i]);
        }

        System.out.println("Sorting time is: " + (endTime-startTime));
    }
}


