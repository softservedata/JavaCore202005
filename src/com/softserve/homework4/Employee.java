package com.softserve.homework4;

public class Employee {
	
	private String name;
	private int rate;
	private int hours;
	private int salary;
	private int bonus;
	
	public Employee() {
	}
	
	public Employee(String name, int rate) {
		super();
		this.name = name;
		this.rate = rate;
	}

	public Employee(String name, int rate, int hours) {
		super();
		this.name = name;
		this.rate = rate;
		this.hours = hours;
	}
		
	public int getSalary() {
		return salary = rate * hours;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getBonus() {
		return bonus = rate * hours/10;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	public void changeRate(int rate) {
		this.rate = rate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", rate=" + rate + ", hours=" + hours + " Salary= " + salary + " Bonus= " + bonus +"]";
	}

}
