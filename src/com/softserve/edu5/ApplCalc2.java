package com.softserve.edu5;

import java.util.Scanner;

public class ApplCalc2 {
public static void main(String[] args) {
	double arg0 = 2;
	double arg1 = 2;
	//
	Scanner sc = new Scanner(System.in);
	System.out.print("double arg0 = ");
	arg0 = sc.nextDouble();
	System.out.print("double arg1 = ");
	arg1 = sc.nextDouble();
	sc.close();
	//
	double result = arg0 + arg1;
	System.out.println("result = " + result);
}
}
