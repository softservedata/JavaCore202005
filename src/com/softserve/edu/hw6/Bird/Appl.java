package com.softserve.edu.hw6.Bird;
import java.lang.ArithmeticException;

public class Appl {

	public static void main(String[] args) {

		Bird [] birds = {
				new Eagle(),
				new Swallow(),
				new Penguin(),
				new Chicken()};
		for (Bird current: birds){
			System.out.println(current.toString() );
		}

	}

}
