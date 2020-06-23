package com.softserve.homework11;

import java.util.Collections;
import java.util.List;

public class Sorter implements Runnable {
    private List<Integer> inList;

    public Sorter(List<Integer> inList) {
        this.inList = inList;
    }

    public void run() {
        Collections.sort(this.inList);
    }
}
