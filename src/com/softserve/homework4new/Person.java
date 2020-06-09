package com.softserve.homework4new;

import java.time.LocalDate;
import java.util.Scanner;

public class Person {

    private String firstName;
    private String lastName;
    private int birthYear;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getAge() {
        return (LocalDate.now().getYear() - birthYear);
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first name ");
        setFirstName(scanner.nextLine());
        System.out.println("Enter the last name ");
        setLastName(scanner.nextLine());
        System.out.println("Enter the year of birth ");
        setBirthYear(scanner.nextInt());
    }

    public void output(){
        System.out.println("Information about person: " + firstName + " " + lastName + " " + birthYear);
    }

    public void changeName(String fn, String ln) {

        setFirstName(fn);
        setLastName(ln);
    }

    public void changeFn(String fn) {
        setFirstName(fn);
    }

    public void changeLn(String ln) {
        setLastName(ln);
    }

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
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
}
