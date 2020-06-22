package com.softserve.edu13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ApplRead {
	public static void main(String[] args) {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = -1;
		System.out.print("Input number: ");
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			x = Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e) {
			System.out.println("I/O Error.");
		}
		/*-
		if (br != null) {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		*/
		System.out.println("Number is " + x);
		//
		/*-
		System.out.print("Input second number: ");
		br = new BufferedReader(new InputStreamReader(System.in));
		try {
			x = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch 
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-blockgenerated catch block
			e.printStackTrace();
		}
		*/
		/*-
		System.out.print("Input second: ");
		Scanner sc = new Scanner(System.in);
		System.out.print("int num = ");
		String s = sc.next();
		System.out.println("s = " + s);
		sc.close();
		*/
	}

}
