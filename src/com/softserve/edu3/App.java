package com.softserve.edu3;

//import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
//import java.io.InputStreamReader;

public class App {
	public static void main(String[] args) throws IOException {
		/*-
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("int num = ");
		String text = br.readLine();
		int num = Integer.parseInt(text);
		System.out.print("double number = ");
		text = br.readLine();
		double number = Double.parseDouble(text);
		System.out.println("sum = " + (number + num));
		br.close();
		*/
		//
		Scanner sc = new Scanner(System.in);
		System.out.print("int num = ");
		int num = sc.nextInt();
		System.out.print("double number = ");
		double number = sc.nextDouble();
		System.out.println("sum = " + (number + num));
		sc.close();
	}
}
