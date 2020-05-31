package com.softserve.homework3;

import java.util.Scanner;
import java.util.Arrays;

public class Hw3{
    public static void main(String[] args) {
        int[] num = new int[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("first num = ");
        num[1] =  sc.nextInt();
        System.out.println("second number = ");
        num[2] = sc.nextInt();
        System.out.println("third number = ");
        num[3] = sc.nextInt();
        Arrays.sort(num);
        System.out.println("order is next " + num[1] + " " + num[2] + " " + num[3]);
        sc.close();
    }
}
