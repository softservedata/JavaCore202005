package com.softserve.edu8;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class Student implements Comparable<Student> {
	
	public static class CompareByName implements Comparator<Student> {
		@Override
		public int compare(Student st1, Student st2) {
			return st1.getName().compareTo(st2.getName());
		}
	}
	
	public static class CompareById implements Comparator<Student> {
		@Override
		public int compare(Student st1, Student st2) {
			System.out.println("\tCompareById done");
			return st1.getId() - st2.getId();
		}
	}
	
	public static class CompareByIdDesc implements Comparator<Student> {
		@Override
		public int compare(Student st1, Student st2) {
			return -(st1.getId() - st2.getId());
		}
	}
	
	private int id;
	private String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		System.out.println("\tStudent.hashCode() = " + toString());
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if ((obj == null) || (getClass() != obj.getClass())) {
			return false;
		}
		Student other = (Student) obj;
		if ((id != other.id)
				|| ((name == null) && (other.name != null))
				|| ((name != null) && (other.name == null))) {
			return false;
		}
		return name.equals(other.name);
	}

	@Override
	public int compareTo(Student student) {
		//return getId() - student.getId();
		//System.out.println("\tCurrent name = " + getName() + "  compare name = " + student.getName());
		return getName().compareTo(student.getName());
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

}

public class ApplSet {
	public static void main(String[] args) {
		/*-
		Set<String> s = new HashSet<>();
		//Set<String> s = new TreeSet<>();
		for (int i = 0; i < args.length; i++) {
			if (!s.add(args[i]))
				System.out.println("Duplicate detected: " + args[i]);
		}
		System.out.println("Set = " + s);
		//
		List<String> s = new ArrayList<>();
		for (int i = 0; i < args.length; i++) {
			if (!s.add(args[i]))
				System.out.println("Duplicate detected: " + args[i]);
		}
		System.out.println("Set = " + s);
		//
		Set<Student> s = new HashSet<>();
		s.add(new Student(212, "Ivan"));
		s.add(new Student(123, "Petro"));
		s.add(new Student(212, "Ivan"));
		for (Student student : s) {
			System.out.println("Object = " + student + " student.hashCode() = " + student.hashCode());
		}
		System.out.println("Set = " + s);
		*/
		/*-
		List<Student> list = new ArrayList<>();
		list.add(new Student(212, "Ivan"));
		list.add(new Student(123, "Petro"));
		list.add(new Student(212, "Ivan"));
		Set<Student> s0 = new HashSet<>();
		Set<Student> s1 = new TreeSet<>();
		Set<Student> s = new TreeSet<>(new Student.CompareById());
		for (Student student : list) {
			System.out.println("Object = " + student + " student.hashCode() = " + student.hashCode());
			if (!s.add(student))
				System.out.println("Duplicate detected: " + student);
		}
		System.out.println("Set = " + s);
		/*/
		/*-
		int[] arr = { 7, 3, 6, 4, 9, 2, 1, 8 };
		System.out.println("Origin = " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Sorted = " + Arrays.toString(arr));
		/
		Student[] arr = { new Student(212, "Ivan"), new Student(157, "Stepan"), new Student(123, "Petro") };
		System.out.println("Origin = " + Arrays.toString(arr));
		//Arrays.sort(arr);
		Arrays.sort(arr, new Student.CompareByName());
		System.out.println("Sorted = " + Arrays.toString(arr));
		//
		List<Student> list = new ArrayList<>();
		list.add(new Student(212, "Ivan"));
		list.add(new Student(123, "Petro"));
		list.add(new Student(201, "Ira"));
		System.out.println("Origin = " + list);
		//Collections.sort(list, new Student.CompareById());
		list.sort(new Student.CompareByIdDesc());
		System.out.println("Sorted = " + list);
		//
		Map<String, String> map = new HashMap<>();
		map.put("first", "Ivan");
		map.put("second", "Petro");
		for (Map.Entry<String, String> entry : map.entrySet()) {
		    System.out.println("key = " + entry.getKey() + "  value = " + entry.getValue());
		}
		//
		Map<Object, Student> map = new HashMap<>();
		//Map<Object, Student> map = new TreeMap<>(); // Error
		map.put("first", new Student(212, "Ivan"));
		map.put(555, new Student(201, "Ira"));
		map.put(new Object(), new Student(123, "Petro"));
		map.put(new Student(1000, "****"), new Student(123, "Stepan"));
		for (Map.Entry<Object, Student> entry : map.entrySet()) {
		    System.out.println("key = " + entry.getKey() + "  value = " + entry.getValue());
		}
		*/
		Map<Student, Student> map = new TreeMap<>(new Student.CompareById());
		map.put(new Student(10, "****"), new Student(212, "Ivan"));
		map.put(new Student(101, "****"), new Student(201, "Ira"));
		map.put(new Student(111, "****"), new Student(123, "Petro"));
		map.put(new Student(1000, "****"), new Student(123, "Stepan"));
		for (Map.Entry<Student, Student> entry : map.entrySet()) {
		    System.out.println("key = " + entry.getKey() + "  value = " + entry.getValue());
		}
	}

}
