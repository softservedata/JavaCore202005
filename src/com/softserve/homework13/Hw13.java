package com.softserve.homework13;

import java.util.ArrayList;
import java.util.List;

public class Hw13 {
    public static void main(String[] args) {

        SortList<String> sortList = ((list) -> {
            List<String> newList = new ArrayList<>();
            for (int i = 2; i <= list.size(); i = i+2) {
                list.remove(i);
            }
            return list;
        });

        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("3ccc");
        list.add("ddd");
        list.add("eee");
        list.add("3fff");
        list.add("iii");
        list.add("hhh");
        list.add("3ggg");

        System.out.println(deleteFromString(sortList, list));

    }

    public static List<String> deleteFromString(SortList sortList, List<String> list) {
        return sortList.deleteEveryThird(list);
    }
}
