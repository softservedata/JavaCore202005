package com.softserve.homework4;

public class Employee {
    private final String name;
    private final int hours;
    private int rate;
    private boolean active = true;
    private static double totalSum;

    public Employee(String name, int rate) {
        this(name, rate, 0);
    }

    public Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum += getSalary();
    }

    public String getName() {
        return name;
    }

    public int getRate() {
        return rate;
    }

    public void changeRate(int rate) {
        double currentSalary = getSalary();
        totalSum -= currentSalary;
        this.rate = rate;
        totalSum += getSalary();
    }

    public int getHours() {
        return hours;
    }

    public double getSalary() {
        return rate * hours;
    }

    public double getBonuses() {
        return getSalary() * 0.1;
    }

    public void removeEmployee() {
        if (active) {
            totalSum -= getSalary();
            active = false;
        }
    }

    public static double getTotalSalary() {
        return totalSum;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }
}
