package com.softserve.homework4;
import java.util.Scanner;

public class Employee {

	private String name;
	private double rate;
	private int hours;

	public Employee() {
	}

    public Employee(String name, double rate) {
        this.name = name;
        this.rate = rate;
    }

    public Employee(String name, double rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public double getSalary() {
		return rate * hours;
	}

	public void changeRate(double rate) {
	    this.rate = rate;
        System.out.println(name + "'s salary = " + rate * hours);
	}

	public double getBonus(){
	    return rate*hours/10;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", rate=" + rate + ", hours=" + hours + "]";
	}

}
