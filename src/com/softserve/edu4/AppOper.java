package com.softserve.edu4;

public class AppOper {
	public static void main(String[] args) {
		/*-
		int x = 5;
		int a, b;
		a = x++; // a = 5 x = 6
		System.out.println("a = " + a + "  x = " + x);
		x = x - 1;
		b = ++x; // b = 6 x = 6
		System.out.println("b = " + b + "  x = " + x);
		//
		int y = 5;
		System.out.println(x == y); // false
		System.out.println(x != y); // true
		System.out.println(x >= y); // true
		//
		int t = 5, s = 4, v = 7;
		boolean b1 = t > s && t > v || s < v;
		boolean b2 = (t < v || s > v) && t < s;
		System.out.println(b1);
		System.out.println(b2);
		//
		int i = 1, j = 2;
		System.out.println(i | j);
		System.out.println(i & j);
		System.out.println(i << 1);
		//
		int t = 5, s = 4;
		//		String str1;
		//		if (t >= ++s) {
		//			str1 = "yes";
		//		} else {
		//			str1 = "no";
		//		}
		String str1 = t >= ++s ? "yes" : "no";
		System.out.println(str1);
		*/
		String result = "";
		int value = 4;
//		if (value == 2) {
//			result = "two";
//		} else if (value == 3) {
//			result = "three";
//		} else if (value == 4) {
//			result = "four";
//		} else if (value == 5) {
//			result = "five";
//		}
		//
		switch (value) {
		case 2:
			result = "two";
			break;
		case 3:
			result = "three";
			break;
		case 4:
			result = "four";
			break;
		case 5:
			result = "five";
			break;
		default:
			result = "error";
			break;
		}
		System.out.println("result = " + result);
	}
}
