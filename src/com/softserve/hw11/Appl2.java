package com.softserve.hw11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

class MySort implements Runnable {
	private List<Integer> list;

	public MySort(List<Integer> list) {
		this.list = list;
	}
	
	public void run() {
		//System.out.println("Thread Origin list = " + list);
		Collections.sort(list);
		//System.out.println("Thread Sorted list = " + list);
	}
}

public class Appl2 {
	public static void main(String[] args) throws Exception {
		int max = 1000;
		int maxElement = 10000;
		int n = 10;
		@SuppressWarnings("unchecked")
		List<Integer>[] arr = new ArrayList[n];
		// Object[] arr = new Object[n];
		Random random = new Random();
		for (int i = 0; i < arr.length; i++) {
			List<Integer> list = new ArrayList<>();
			for (int j = 0; j < maxElement; j++) {
				list.add(random.nextInt(max));
			}
			arr[i] = list;
		}
		System.out.println("Origin");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		//
		long startTime = System.currentTimeMillis();
		/*-
		// Parallel Thread
		Thread[] t = new Thread[arr.length];
		for (int i = 0; i < arr.length; i++) {
			t[i] = new Thread(new MySort(arr[i]));
			t[i].start();
		}
		//
		for (int i = 0; i < arr.length; i++) {
			t[i].join();
		}
		// Single Thread
		for (int i = 0; i < arr.length; i++) {
			Collections.sort(arr[i]);
		}
		//
		System.out.println("Sorted");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		*/
		// Use Stream
		List<List<Integer>> res = Arrays.asList(arr)
			.parallelStream()
			.peek(e->Collections.sort(e))
			.collect(Collectors.toList());
		long endTime = System.currentTimeMillis();
		//
//		System.out.println("Sorted");
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		System.out.println("Sorted");
		res.forEach(System.out::println);
		System.out.println("Time: " + (endTime - startTime)/1000.0);
	}
}
