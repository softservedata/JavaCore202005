package com.softserve.homework4new;

public class App {

    public static void main (String []args){
        Person p1= new Person("Bohdan", "Roik",1993);
        Person p2= new Person("Taras", "Vin");
        Person p3= new Person("Bob", "Smith",2005);
        Person p4= new Person("Mia", "Lee",2000);
        Person p5= new Person("Sam", "Samson");

        p1.output();
        System.out.println(p1.getAge());
        System.out.println(p2);
        p2.changeName("nod", "don");
        System.out.println(p2);
        System.out.println(p3);
        p3.changeFn("Ben");
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
    }
}
