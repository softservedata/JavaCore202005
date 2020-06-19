package com.softserve.edu.hw10;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App10 {
    public static void main (String [] args){

           Scanner s = new Scanner(System.in);
           String json = s.nextLine();
           int index = json.indexOf("email");
           System.out.println(json);
           System.out.println(index);

        Pattern p = Pattern.compile("email");
        Matcher m = p.matcher(json);
        while (m.find()) {
            System.out.print(json.substring(m.start(), m.end()));
        }


    }
}
