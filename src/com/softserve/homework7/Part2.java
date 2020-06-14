package com.softserve.homework7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Part2 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list1.add(34);
        list1.add(2);
        list1.add(1);
        list1.add(12);

        list2.add(2);
        list2.add(34);
        list2.add(12);
        list2.add(1);
        list2.add(156);

        System.out.println(checkIfContentIsEqual(list1, list2));
    }

    private static boolean checkIfContentIsEqual(List<Integer> list1, List<Integer> list2) {
        Collections.sort(list1);
        Collections.sort(list2);
        boolean b = false;
        int it;
        if (list1.size()<list2.size()) {
            it = list1.size();
        } else {
            it = list2.size();
        }

        for (int i=0; i<it; i++) {
            if (!list1.get(i).equals(list2.get(i))) {
                b =  false;
                break;
            } else {
                b = true;
            }
        }
        return b;
    }
}
