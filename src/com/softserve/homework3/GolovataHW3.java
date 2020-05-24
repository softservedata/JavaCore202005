package com.softserve.homework3;

import java.util.Arrays;
import java.util.Scanner;

public class GolovataHW3 {

    public static void printNumbers() {
        int[] numbers = new int[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Введіть число №" + (i + 1));
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }
        Arrays.sort(numbers);
        System.out.println("Ваші числа: " + Arrays.toString(numbers));
    }
}
