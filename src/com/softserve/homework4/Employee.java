package com.softserve.homework4;

public class Employee {
    private String name;
    private int rate;
    private double hours;
    private static double totalSum;

    public Employee(String name, int rate, double hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public Employee(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }

    public Employee() {
        name = "";
        rate = 0;
        hours = 0.0;
    }

    public double getSalary() {
        return rate * hours;
    }

    public double getBonuses() {
        return getSalary() * 0.1;
    }

    public void changeRate(int rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Employee: " + name + ", rate: " + rate + "hours: " + hours;
    }
}
