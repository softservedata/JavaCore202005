package com.softserve.homework4;

public class Employee {

    private String name;
    private int rate;
    private int hours;
    private static int totalSum;

    public Employee() {};

    public Employee(String name, int rate, int hours) {
        this.name = name;
        this.hours = hours;
        this.rate = rate;
        totalSum+=getSalary();
    }

    public Employee(int rate, int hours) {
        this.rate = rate;
        this.hours = hours;
        totalSum+=getSalary();
    }

    public int getSalary() {
        return rate * hours;
    }

    public double getBonuses() {
        return getSalary() * 0.1;
    }

    public static int getTotalSum() {
        return totalSum;
    }

    public void changeRate(int newRate) {
        totalSum -= this.getSalary();
        this.rate = newRate;
        totalSum += this.getSalary();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate= " + rate +
                ", hours= " + hours +
                '}';
    }
}

class Test {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John", 1, 50);
        Employee employee2 = new Employee("Donald", 1, 10);
        Employee employee3 = new Employee("Jack", 1, 20);

        System.out.println("Total sum before changing the rate - " + Employee.getTotalSum());
        employee1.changeRate(2);
        employee2.changeRate(2);
        employee3.changeRate(2);
        System.out.println("Total sum after changing the rate - " + Employee.getTotalSum());
    }
}
