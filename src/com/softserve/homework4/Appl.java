package com.softserve.homework4;

import java.sql.Time;

public class Appl {
    public static void main(String[] args) {
        //Employee class homework part
        System.out.println("'Employee' class homework:");
        Employee employee1 = new Employee("Ivan", 2);
        Employee employee2 = new Employee();
        Employee employee3 = new Employee("Oleh", 4, 1.5);
        System.out.println("Total sum = " + Employee.getTotalSum());
        employee1.changeHours(2.5);
        employee2.setName("Petya");
        employee2.changeRate(3);
        employee2.changeHours(1);
        employee3.changeRate(5);
        System.out.println("Total sum = " + Employee.getTotalSum());

        //Person class homework part
        System.out.println("\n'Person' class homework:");
        Person person1 = new Person();
        Person person2 = new Person("Kolya", "Pavlov");
        Person person3 = new Person();
        Person person4 = new Person("Tanya", "Stecyuk");
        Person person5 = new Person("Serhiy", "Korolenko");
        person1.changeName("Madonna");
        person3.changeName("Stepan", "Trolyan");
        person2.setBirthYear(1992);
        person1.output();
        person2.output();
        person4.setBirthYear(1973);
        person3.output();
        person4.output();
        person5.output();
        person5.input();
        person5.output();
        person4.input();
        person4.output();
    }
}

