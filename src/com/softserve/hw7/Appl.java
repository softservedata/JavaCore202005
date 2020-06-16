package com.softserve.hw7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Appl {
	
	public List<String> buildList(Set<String> st1, Set<String> st2) {
		Set<String> st3 = new HashSet<>(st1);
		st3.addAll(st2);
		return new ArrayList<>(st3);
	}
	
	public static void main(String[] args) {
		Set<String> st1 = new HashSet<>();
		st1.add("aaa");
		st1.add("bbb");
		st1.add("ccc");
		st1.add("ddd");
		Set<String> st2 = new HashSet<>();
		st2.add("aaa");
		st2.add("ddd");
		st2.add("eee");
		st2.add("fff");
		/*-
		Set<String> st3 = new HashSet<>(st1);
		st3.addAll(st2);
		System.out.println("Set = " + st3);
		List<String> list = new ArrayList<>(st3);
		list.add("eee");
		System.out.println("List = " + list);
		*/
		Appl appl = new Appl();
		System.out.println("List = " + appl.buildList(st1, st2));
	}
}
