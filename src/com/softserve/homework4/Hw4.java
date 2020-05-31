package com.softserve.homework4;

import java.awt.*;

public class Hw4 {

    public class Employee {
        private String name;
        private int rate;
        private double hours;
        static double totalSum;

        public Employee(){
        }

        public Employee(String name, int rate) {
            this.name = name;
            this.rate = rate;
        }

        public Employee(String name, int rate, double hours) {
            this.name = name;
            this.rate = rate;
            this.hours = hours;
        }

        static double getTotalSum() {
            return totalSum;
        }
    }

    public class Employee{
        private String name = null;
        private int rate = 0;
        private double hours = 0.0;
        private static double totalSum = 0.0;

        public double getSalary() {
            return (rate * hours);
        }

        public double getBonuses() {
            return getSalary() * 0.1;//to calculate 10% from salary
        }

        public void changeRate (int rate){
            this.rate = rate;
        }

        private double getSalary() {
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
            Employee e1 = new Employee ("Jack", 1);
            Employee e2 = new Employee ("Doug", 2);
            Employee e3 = new Employee ("Hanna", 3);

            System.out.println(//"Total sum - " + Employee.getTotalSum());
            e1.changeRate(2);
            e2.changeRate(2);
            e3.changeRate(2);
            System.out.println(//"Total sum - " + Employee.getTotalSum());
        }



