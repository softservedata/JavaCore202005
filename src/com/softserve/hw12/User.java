package com.softserve.hw12;

import java.util.ArrayList;
import java.util.List;

public class User {
	private String firstName;
	private String lastName;
	private String email;
	private String address;
	private String password;

	public User(String firstName, String lastName, String email, String address, String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.address = address;
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public String getAddress() {
		return address;
	}

	public String getPassword() {
		return password;
	}
	
	@Override
	public String toString() {
		return "User [firstName=" + firstName
				+ ", lastName=" + lastName
				+ ", email=" + email
				+ ", address=" + address
				+ ", password=" + password
				+ "]";
	}

	public static User getByList(List<String> row) {
		return new User(row.get(0), row.get(1),
				row.get(2), row.get(3), row.get(4));
	}

	public static List<User> getByLists(List<List<String>> rows) {
		List<User> result = new ArrayList<>();
		if (!rows.get(0).get(2).contains("@")) {
			rows.remove(0);
		}
		for (List<String> currentRow : rows) {
			result.add(getByList(currentRow));
		}
		return result;
	}
}
