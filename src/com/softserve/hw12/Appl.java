package com.softserve.hw12;

import java.util.List;

public class Appl {
	public static void main(String[] args) {
		CSVReader r = new CSVReader();
		List<User> users = User.getByLists(r.getAllCells("users.csv"));
		//System.out.println(users);
		users.forEach(System.out::println);
	}
}
