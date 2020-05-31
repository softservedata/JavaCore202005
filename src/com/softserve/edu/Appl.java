package com.softserve.edu;

import com.softserve.homework4.Employee;

public class Appl {
    public static void main(String[] args) {
        Employee bob = new Employee("Bob", 10, 100);
        Employee mary = new Employee("Mary", 20, 50);
        Employee john = new Employee("John", 25, 40);
        System.out.println(bob);
        System.out.println("----");
        System.out.println(mary);
        System.out.println("----");
        System.out.println(john);
        System.out.println("----");
        System.out.println("Total salary: " + Employee.getTotalSalary());
        john.changeRate(10);
        System.out.println("Changed total salary: " + Employee.getTotalSalary());
        john.removeEmployee();
        System.out.println("Total salary after Johns removal: " + Employee.getTotalSalary());
    }
}
