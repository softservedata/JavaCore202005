package com.softserve.homework3;

import java.util.Arrays;
import java.util.Scanner;

public class Appl {
    public static void main(String[] args) {
        float[] numbers_array = new float[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter your " + (i + 1) + " number: ");
            numbers_array[i] = scanner.nextFloat();
        }
        Arrays.sort(numbers_array);
        System.out.println("\nSorted numbers in ASC order:");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%s\n", numbers_array[i]);
        }
        scanner.close();
    }
}