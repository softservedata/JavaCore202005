package com.softserve.homework3;

import java.util.InputMismatchException;
import java.util.Arrays;
import java.util.Scanner;

public class Appl {
    public static void main(String[] args) throws InputMismatchException {
        int[] answers = new int[3];

        Scanner sc = new Scanner(System.in);
        System.out.println("first int num: ");
        answers[0] = sc.nextInt();
        System.out.println("second int num: ");
        answers[1] = sc.nextInt();
        System.out.println("third int num: ");
        answers[2] = sc.nextInt();
        Arrays.sort(answers);
        System.out.println("sorted nums: " + answers[0] + " " + answers[1] + " " + answers[2]);
        sc.close();
    }
}
