package com.softserve.homework3;
import java.util.Arrays;
import java.util.Scanner;

public class homework3 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		double [] numbers = new double[3] ;
				
		for (int i = 0; i < numbers.length; i++) {
			
		System.out.println("Enter the number " + (1+i));
		Scanner scanner = new Scanner(System.in);
		numbers [i] = scanner.nextDouble();
		System.out.println("You number " +numbers[i]);
		
		}	
		
		Arrays.sort(numbers);
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		
	}
}
