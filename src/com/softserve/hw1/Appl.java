package com.softserve.hw1;

public class Appl {
	public static void main(String[] args) {
		int k = 5;
		boolean b;
		// System.out.println("1. k = " + k++);
		// System.out.println("1. k = " + ++k);
		// System.out.println("1. k = " + (k++));
		// k = k++ + k;
		//k = k++ + ++k;
		b = k++ < ++k;
		System.out.println("2. k = " + k);
		System.out.println("b = " + b);
		//
		System.out.println("k / 3 = " + k/3);
		System.out.println("k / 3 = " + k%3);
	}
}
