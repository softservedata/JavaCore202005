package com.softserve.hw3;

import java.util.Scanner;

public class ApplNum1 {
	public static void main(String[] args) {
		int a, b, c;
		//
		Scanner sc = new Scanner(System.in);
		System.out.print("int a = ");
		a = sc.nextInt();
		System.out.print("int b = ");
		b = sc.nextInt();
		System.out.print("int c = ");
		c = sc.nextInt();
		sc.close();
		//
		System.out.println("Origin = " + a + "  " + b + "  " + c);
		if (a > b) {
			if (c > b) {
				if (a > c) {
					System.out.println("Sorted = " + b + "  " + c + "  " + a);
				} else {
					System.out.println("Sorted = " + b + "  " + a + "  " + c);
				}
			} else {
				System.out.println("Sorted = " + c + "  " + b + "  " + a);
			}
		} else {
			if (b > c) {
				if (a < c) {
					System.out.println("Sorted = " + a + "  " + c + "  " + b);
				} else {
					System.out.println("Sorted = " + c + "  " + a + "  " + b);
				}
			} else {
				System.out.println("Sorted = " + a + "  " + b + "  " + c);
			}
		}
	}
}
