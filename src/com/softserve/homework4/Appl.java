package com.softserve.homework4;

public class Appl {
	
	private static double totalSum;
	
	public static void main(String[] args) {

		Employee emp1 = new Employee ("Ivan", 50, 40);
		Employee emp2 = new Employee ("Petro", 60, 41);
		Employee emp3 = new Employee ("Stepan", 55, 42);
		
		System.out.println(emp1);
		emp1.changeRate(100);
		System.out.println(emp1.getName() + "'s bonus = " + emp1.getBonus());
		System.out.println(emp2);
		System.out.println(emp2.getSalary());
		System.out.println(emp2.getName() + "'s bonus = " + emp2.getBonus());
		System.out.println(emp3);
		System.out.println(emp3.getSalary());
		System.out.println(emp3.getName() + "'s bonus = " + emp3.getBonus());

		totalSum = emp1.getSalary()+ emp1.getBonus()+ emp2.getSalary()+ emp2.getBonus()+emp3.getSalary()+emp3.getBonus();

		System.out.println("Total = " + totalSum);
					
	}

}
