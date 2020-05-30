package com.softserve.homework4;

public class Employee {
    private String name = "";
    private int rate = 0;
    private double hours = 0.0;
    private static double totalSum = 0.0;

    public Employee() {
        totalSum += this.getSalary();
    }

    public Employee(String name, int rate) {
        this.name = name;
        this.rate = rate;
        totalSum += this.getSalary();
    }

    public Employee(String name, int rate, double hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum += this.getSalary();
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

    private void setRate(int rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    private void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }

    public double getSalary() {
        return this.rate * this.hours;
    }

    public void changeRate (int rate) {
        totalSum -= this.getSalary();
        setRate(rate);
        totalSum += this.getSalary();
    }

    public void changeHours (double hours) {
        totalSum -= this.getSalary();
        setHours(hours);
        totalSum += this.getSalary();
    }

    public double getBonuses() {
        return this.getSalary() * 0.1;
    }

    public static double getTotalSum() {
        return totalSum;
    }
}
