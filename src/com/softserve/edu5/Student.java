package com.softserve.edu5;

public class Student {
	private String name;
	private int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if ((obj == null)
				&& (getClass() != obj.getClass())) {
			return false;
		}
		Student other = (Student) obj;
		if ((age != other.age) 
				|| ((name == null) && (other.name != null))
				|| ((name != null) && (other.name == null))) {
			return false;
		}
		return name.equals(other.name);
	}

	@Override
	public String toString() {
		return "Student [name=" + name
				+ ", age=" + age
				+ "]";
	}

	
}
