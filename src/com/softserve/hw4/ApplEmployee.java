package com.softserve.hw4;

public class ApplEmployee {
	public static void main(String[] args) {
		Employee emp1 = new Employee("Ivan", 10, 40);
		Employee emp2 = new Employee("Petro", 40);
		Employee emp3 = new Employee("Ira", 12, 40);
		//
		emp2.changeRate(8);
		System.out.println(emp1.getName() + " Slary = " + emp1.getSalary());
		System.out.println(emp2.getName() + " Slary = " + emp2.getSalary());
		System.out.println(emp3.getName() + " Slary = " + emp3.getSalary());
		System.out.println(emp3.getName() + " Bonus = " + emp3.getBonuses());
		//
		System.out.println("Total Sum = " + Employee.getTotalSum());
		System.out.println(emp3);
	}
}
