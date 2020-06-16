package com.softserve.hw8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Appl {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("093-123-45-67", "Ivan");
		map.put("(067)123 45 67", "Ivan");
		map.put("063-123-45-67", "Petro");
		map.put("050 123 45 67", " Petro");
		map.put("  096 123 45 67", "Ira ");
		System.out.println("map = " + map);
		//
		Map<String, Set<String>> tels = new HashMap<>();
		for (Map.Entry<String, String> entry : map.entrySet()) {
			String value = entry.getValue().trim();
			Set<String> setNums = tels.get(value);
			if (setNums == null) {
				setNums = new HashSet<>();
				tels.put(value, setNums);
			}
			setNums.add(entry.getKey()
					.replace("-", "").replace(" ", "")
					.replace("(", "").replace(")", "").trim());
		}
		System.out.println("tels = " + tels);
	}
}
