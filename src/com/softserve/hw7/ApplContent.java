package com.softserve.hw7;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ApplContent {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(2, 1, 4, 5, 3, 2, 5, 1, 2);
		List<Integer> list2 = Arrays.asList(5, 4, 3, 2, 1, 5);
		Set<Integer> st1 = new HashSet<>(list1);
		Set<Integer> st2 = new HashSet<>(list2);
		System.out.println("st1 = " + st1);
		System.out.println("st2 = " + st2);
		if ((st1.size() != st2.size())
				|| (!st1.equals(st1))) {
			System.out.println("content not equals");
		} else {
			System.out.println("content equals");
		}
	}
}
