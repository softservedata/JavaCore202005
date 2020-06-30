package com.softserve.edu.hw10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App10 {
    public static Map <String, String> parse(String json) {
        Map<String, String> result = new HashMap<>();
        String patternTemplate = "\\{\"id\":\"(\\d+)\",\"name\":\"(\\w+)\",\"email\":\"([\\w@.]+)\"(,\"city\":\"(\\w+)\")?}";

        Pattern p = Pattern.compile(patternTemplate);
        Matcher m = p.matcher(json);

        if (m.matches()) {
            result.put("id", m.group(1));
            result.put("name", m.group(2));
            result.put("email", m.group(3));
            if (m.group(4) != null) {
                result.put("city", m.group(5));
            }
        }
        else {
            throw new IllegalArgumentException("Input string is malformed!");
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String json = scanner.nextLine();

        System.out.println(json);
        System.out.println(parse(json));
    }
}