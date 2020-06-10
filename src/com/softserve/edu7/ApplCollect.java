package com.softserve.edu7;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ApplCollect {
	public static void main(String[] args) {
		//List<String> list = new ArrayList<>();
		List<String> list = new LinkedList<>();
		list.add("abc");
		list.add("qwerty");
		list.add("123");
		//System.out.println("list = " + list);
		//
//		for (String current : list) {
//			System.out.println("current = " + current);
//		}
		//
		list.add(1, "000");
		list.add(2, "000");
		//list.add(5, "000");
		//
		for (int i = 0; i < list.size(); i++) {
			System.out.println("i = " + i + "  Element = " + list.get(i));
		}
		//
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			String current = iter.next();
			System.out.println("iter: current = " + current);
		}
		//
		//((ArrayList<String>)list).ensureCapacity(1000);
		//
		/*-
		// Runtime Error
//		for (String current : list) {
//			System.out.println("current = " + current);
//			if (current.equals("000")) {
//				list.remove(current);
//			}
//		}
		//
		// Architecture (Logical) Error
		System.out.println("Delete");
		//int n = list.size();  // Runtime Error
		for (int i = 0; i < list.size(); i++) {
		//for (int i = 0; i < n; i++) {
			System.out.println("i = " + i + "  Element = " + list.get(i));
			if (list.get(i).equals("000")) {
				list.remove(i);
			}
		}
		System.out.println("list = " + list);
		*/
		iter = list.iterator();
		while (iter.hasNext()) {
			String current = iter.next();
			System.out.println("Delete: current = " + current);
			if (current.equals("000")) {
				iter.remove();
			}
		}
		System.out.println("list = " + list);
	}
}
