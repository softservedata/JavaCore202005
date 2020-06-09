package com.softserve.homework5enum;
import java.lang.Enum;

public class Dog {
	
	private String name;
	private int age;
	private enum Breed {
				BULLDOG, SHEPHERDS, LABRADOR
		};
	
		public Dog() {
	}

		public Dog(String name, int age) {
			this.name = name;
			this.age = age;
		}
	

	
	
	

}
