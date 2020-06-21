package com.softserve.homework11;

import java.util.*;

public class Part1 {
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

        List<Integer>[] arr = new ArrayList[10];
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
            for (int i = 0; i < 1000; i++) {
                list.add(random.nextInt(max));
            }
        }

        System.out.println(oneThreadTime(arr));

    }

    public static long oneThreadTime(List<Integer>[] array) {
        Date date = new Date();
        long start = date.getTime();
        for (List<Integer> list : array) {
            Collections.sort(list);
        }
        return ((new Date().getTime() - start));
    }
}
