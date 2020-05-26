package com.softserve.homework4;

public class App {
	
	private static int totalSum;
	
	public static void main(String[] args) {

		Employee emp1 = new Employee ("Ivan", 50, 40);
		Employee emp2 = new Employee ("Petro", 60, 41);
		Employee emp3 = new Employee ("Stepan", 55, 42);
		
		totalSum = emp1.getSalary()+emp2.getSalary()+emp3.getSalary();
		
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		
		System.out.println("Total = " + totalSum);
		
		System.out.println(emp1.getBonus());
				
	}

}
