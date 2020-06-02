package com.softserve.hw4;

public class Employee {
	private String name;
	private double rate;
	private double hours;
	private static double totalSum; // = 0;
	private boolean isAddTotal;

	static {
		totalSum = 0;
		System.out.println("static block done");
	}

	public Employee() {
		name = "";
		rate = 1;
		hours = 0;
		isAddTotal = true;
	}

	public Employee(String name, double hours) {
		this.name = name;
		rate = 1;
		this.hours = hours;
		isAddTotal = true;
		System.out.println("2 param constructor done");
	}

	public Employee(String name, double rate, double hours) {
		this.name = name;
		this.rate = rate;
		this.hours = hours;
		isAddTotal = true;
		System.out.println("3 param. constructor done");
	}

	public String getName() {
		return name;
	}

	public double getRate() {
		return rate;
	}

	public double getHours() {
		return hours;
	}

	public static double getTotalSum() {
		return totalSum;
	}

	public double getSalary() {
		double salary = rate * hours;
		totalSum = totalSum + (isAddTotal ? salary : 0);
		return salary;
	}
	
	public void changeRate(int rate) {
		this.rate = rate;
	}
	
	public double getBonuses() {
		isAddTotal = false;
		double bonus = getSalary() * 0.1;
		isAddTotal = true;
		totalSum = totalSum + bonus;
		return bonus;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name 
				+ ", rate=" + rate 
				+ ", hours=" + hours 
				+ "]";
	}
	
}
