package com.softserve.homework3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter three numbers below: ");
            for (int i = 0; i < 3; i++)
                list.add(scanner.nextInt());
        } catch (Exception ex) {
            System.out.println("Please, try again.");
        }

        Collections.sort(list);
        System.out.println("Your numbers after sorting: " + list);

    }
}
