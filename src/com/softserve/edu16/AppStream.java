package com.softserve.edu16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AppStream {
	public static void main(String[] args) {
//		String[] arr = new String[] { "abc", "", "bc", "abcd", "", "jkl", "1" };
//		List<String> strings = Arrays.asList(arr);
		List<String> strings = Arrays.asList("abc", "", "bc", "abcd", "", "jkl", "1", "ad");
		System.out.println("Origin = " + strings);
		/*-
		//		List<String> filtered = strings.stream()
		//				.filter(string -> !string.isEmpty())
		//				.collect(Collectors.toList());
		//System.out.println("filtered = " + filtered);
		//
		Stream<String> st = strings.stream()
				.filter(string -> !string.isEmpty())
				.peek(System.out::println);
		System.out.println("---------------------");
		List<String> filtered = st
			.filter(string -> string.length() > 1)
			.collect(Collectors.toList());
			//.forEach(System.out::println);
		System.out.println("filtered = " + filtered);
		//
		//		st = strings.stream()
		//				.filter(string -> !string.isEmpty());
		//		st.forEach(System.out::println);
		//
		strings.stream()
			.filter(string -> !string.isEmpty())
			.sorted(Comparator.
					<String, String>comparing(x -> x, (p1, p2) -> -p1.length() + p2.length())
						.thenComparing((p1, p2) -> -p1.compareTo(p2)))
			.forEach(System.out::println);
		//
		new Random().ints()
			.limit(4)
			.sorted()
			.forEach(System.out::println);
		//
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		// get list of unique squares
		List<String> squaresList = numbers.stream()
			.distinct()
			.map(i -> String.valueOf(i * i) + "_")
			.collect(Collectors.toList());
		System.out.println("squaresList = " + squaresList);
		//
		strings.stream()
			.reduce((p1, p2) -> p1.length() > p2.length() ? p1 : p2)
			.ifPresent(System.out::println);
		strings.stream()
			.max((p1, p2) -> p1.length() - p2.length())
			.ifPresent(System.out::println);
		//
		int res = Arrays.asList(3, 2, 2, 3, 7, 3, 5).stream()
        	.reduce(0, (sum, p) -> sum = sum + p);
		System.out.println("res = " + res);
		*/
		long count = strings.parallelStream()
				.filter(string -> !string.isEmpty())
				.filter(string -> string.length() > 2)
				.peek(System.out::println)
				.count();
		System.out.println("count = "+ count);
		//
	}
}
