package com.softserve.homework12;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Hw12 {
    public static void main(String[] args) {

        List<List<String>> records = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File("1.csv"))) {
            while (scanner.hasNextLine()) {
                records.add(getRecordFromLine(scanner.nextLine()));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        List<User> users = new ArrayList<>();

        for (List<String> list : records) {
            users.add(new User(list.get(0).trim(),
                    list.get(1).trim(),
                    list.get(2).trim(),
                    list.get(3).trim(),
                    list.get(4).trim()));
        }

        System.out.println(users);
    }

    private static List<String> getRecordFromLine(String line) {
        List<String> values = new ArrayList<>();
        try (Scanner rowScanner = new Scanner(line)) {
            rowScanner.useDelimiter(Pattern.compile(","));
            while (rowScanner.hasNext()) {
                values.add(rowScanner.next());
            }
        }
        return values;
    }
}
