package com.softserve.homework4;

import java.time.LocalDate;
import java.util.Scanner;

public class Person {
    private String firstName = "";
    private String lastName = "";
    private int birthYear = 0;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }

    public int getAge() {
        return LocalDate.now().getYear() - this.birthYear;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Set person's first name: ");
        setFirstName(scanner.nextLine());
        System.out.print("Set person's last name: ");
        setLastName(scanner.nextLine());
        System.out.print("Set person's birth year: ");
        setBirthYear(scanner.nextInt());
        //scanner.close();
        // Closing causes an exception because it also closes System.in source.
        // Global scanner implementation needs separate method to close it and scanner
        // will be created with every Person object even if we don't use input() method at all.
        // So I decided just not to close it.
    }

    public void output() {
        System.out.println("Person info:\n" + this.firstName + " " + this.lastName);
        if (this.birthYear != 0) {
            System.out.println("Birth Year: " + this.getBirthYear() + " Age: " + this.getAge());
        }
        System.out.println("############");
    }

    public void changeName(String fn) {
        setFirstName(fn);
    }

    public void changeName(String fn, String ln) {
        setFirstName(fn);
        setLastName(ln);
    }
}
