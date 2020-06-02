package com.softserve.hw3;

import java.util.Scanner;

public class ApplNum2 {
	public static void main(String[] args) {
		int a, b, c, t;
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
			t = a;
			a = b;
			b = t;
		}
		if (b > c) {
			t = b;
			b = c;
			c = t;
		}
		if (a > b) {
			t = a;
			a = b;
			b = t;
		}
		System.out.println("Sorted = " + a + "  " + b + "  " + c);
	}
}
