package com.softserve.edu.hw15;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class App15 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Year");
        int youYear = scanner.nextInt();
        System.out.println("Enter the Month");
        int youMonth = scanner.nextInt();
        System.out.println("Enter the Day");
        int yourDay = scanner.nextInt();
        LocalDate date = LocalDate.of(youYear, youMonth, yourDay);
        System.out.println(date.minusMonths(1).with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek());

    }
}
