package com.softserve.edu.hw12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class App12 {
    public static void main(String[] args) {

        String fileName = "C:/Users/Бодя/workspace/CSV.csv";
        FileReader fr = null;
        BufferedReader br = null;

            List <String> records = new ArrayList<>() ;

        try {
            fr = new FileReader(fileName);
            br = new BufferedReader(fr);
            String s = null;
            int  count = 0;
            System.out.println(fileName);
            while ((s = br.readLine()) != null) {
                System.out.println("Row " + ++count + " Read: " + s);
                records.add(s);
            }
            br.close();

            System.out.println(records);

        } catch (IOException e) {

            System.out.println("Can't open the file " + e);

        }

        List<String> values = new ArrayList<>();

    }
}
