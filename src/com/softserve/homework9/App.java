package com.softserve.homework9;

import java.util.regex.*;

public class App {
    public static void main(String[] args) {
        System.out.println("1)");
        String test = "asd fghhls rtwrtwer sfgdf sf ojndtfs sdfghhg";
        String[] needles = {"ghh", "jnd"};
        String patternTemplate = "\\b\\w*%s\\w*\\b";

        System.out.println("test string = " + test);
        System.out.println("---");

        for (String needle : needles) {
            String pattern = String.format(patternTemplate, needle);
            Pattern p = Pattern.compile(pattern);
            Matcher m = p.matcher(test);
            System.out.println("needle = " + needle);
            while (m.find()) {
                System.out.println("word = " + test.substring(m.start(), m.end()));
            }
            System.out.println("---");
        }

        System.out.println("\n2)");
        String[] users = {"gsethsethg", "df", "asdfghjklzxcvbnm", "rkn#kf@", "kjsfbw"};
        String pattern = "^[\\w]{3,15}$";
        String result;
        Pattern p = Pattern.compile(pattern);
        for (String user : users) {
            Matcher m = p.matcher(user);
            if (m.matches()) {
                result = "valid";
            }
            else {
                result = "invalid";
            }
            System.out.println("User " + user + " is " + result);
        }
    }
}
