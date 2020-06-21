package com.softserve.homework11;

import java.util.*;

public class Part2 implements Runnable {
    static List<Integer>[] arr = null;
    @Override
    public void run() {
        for (List<Integer> list : arr) {
            Collections.sort(list);
            System.out.println(list);
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        int max = 100;

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        List<Integer> list4 = new ArrayList<>();
        List<Integer> list5 = new ArrayList<>();
        List<Integer> list6 = new ArrayList<>();
        List<Integer> list7 = new ArrayList<>();
        List<Integer> list8 = new ArrayList<>();
        List<Integer> list9 = new ArrayList<>();
        List<Integer> list10 = new ArrayList<>();

        arr = new ArrayList[10];
        arr[0] = list1;
        arr[1] = list2;
        arr[2] = list3;
        arr[3] = list4;
        arr[4] = list5;
        arr[5] = list6;
        arr[6] = list7;
        arr[7] = list8;
        arr[8] = list9;
        arr[9] = list10;

        for (List<Integer> list : arr) {
            for (int i = 0; i < 10; i++) {
                list.add(random.nextInt(max));
            }
        }



        Thread thread1 = new Thread(new Part2());
        Thread thread2 = new Thread(new Part2());
        Thread thread3 = new Thread(new Part2());
        Thread thread4 = new Thread(new Part2());
        Thread thread5 = new Thread(new Part2());
        Thread thread6 = new Thread(new Part2());
        Thread thread7 = new Thread(new Part2());
        Thread thread8 = new Thread(new Part2());
        Thread thread9 = new Thread(new Part2());
        Thread thread10 = new Thread(new Part2());

        thread1.start();
    }

}

