package com.softserve.edu15;

import java.util.Arrays;
import java.util.List;

public class ApplPrn {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Mahesh", "Suresh", "Ramesh");
		names.forEach(System.out::println);

	}
}
