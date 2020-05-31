package com.softserve.edu4;

public class App {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Ivan Petrov", 2, 2);
        Employee employee2 = new Employee("Petr Petrov", 2, 8);
        Employee employee3 = new Employee("Sergey Petrov", 3, 4);
        System.out.println("Total saraly : "
                + (employee1.getSalary() + employee2.getSalary() + employee3.getSalary()));
    }
}
