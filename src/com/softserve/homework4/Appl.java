package com.softserve.homework4;

public class Appl {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Dan", 33, 12.5);
        Employee employee2 = new Employee("Sam", 12);
        Employee employee3 = new Employee();

        System.out.println("Total Sum: " + (employee1.getSalary() +
                                            employee2.getSalary() +
                                            employee3.getSalary()));
    }
}
