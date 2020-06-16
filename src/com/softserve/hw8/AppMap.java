package com.softserve.hw8;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class People { // extends Object

	public static class CompareByName implements Comparator<People> {
		@Override
		public int compare(People p1, People p2) {
			return p1.getName().compareTo(p2.getName());
		}
	}

	private String name;

	public People(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		System.out.println("running hashCode()");
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	// /*-
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		People other = (People) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	// */

	@Override
	public String toString() {
		return "People [name=" + name + "]";
	}

}

public class AppMap {
	public static void main(String[] args) {
		//Map<People, Integer> map1 = new HashMap<>();
		Map<People, Integer> map = new TreeMap<>(new People.CompareByName());
		map.put(new People("Ivan"), 1);
		map.put(new People("Petro"), 2);
		map.put(new People("Ivan"), 3);
		System.out.println("map = " + map);
		//
		for (Map.Entry<People, Integer> entry : map.entrySet()) {
			System.out.println("key = " + entry.getKey() + "  hashCode = " + entry.getKey().hashCode() + "  value = "
					+ entry.getValue());
		}
	}
}
