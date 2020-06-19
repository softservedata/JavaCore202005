package com.softserve.edu.hw9;

import java.util.regex.*;
import java.util.Scanner;

public class App9 {

    public static void main(String[] args) {

            System.out.println("Enter the proverb");
            Scanner scanner = new Scanner(System.in);
            String proverb = scanner.nextLine();
            String[] lookingFor = {"you", "me"};
        String patternTemplate = "\\b\\w*%s\\w*\\b";

        System.out.println("Your proverb is : " + proverb);

        for (String needle : lookingFor) {
            String pattern = String.format(patternTemplate, needle);
            Pattern p = Pattern.compile(pattern);
            Matcher m = p.matcher(proverb);
            System.out.println("needle = " + needle);
            while (m.find()) {
                System.out.println("word = " + proverb.substring(m.start(), m.end()));
            }
        }


        for (int i = 0; i < 5; i++){

            String pattern = "\\w{3,15}+";
            System.out.println("Enter the nickname #" + (i + 1));
            Scanner scanner2 = new Scanner(System.in);
            String text = scanner2.nextLine();

            Pattern p2 = Pattern.compile(pattern);
            Matcher m2 = p2.matcher(text);

            if (m2.matches()) {
                System.out.println("Pass");
            } else {
                System.out.println("Invalid nickname");
            }

            while (m2.find()) {
                System.out.print(text.substring(m2.start(), m2.end()));
            }
        }
    }
}
