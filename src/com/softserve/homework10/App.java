package com.softserve.homework10;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.*;

public class App {
    public static Map<String, String> parse(String input) {
        Map<String, String> result = new HashMap<>();
        String pattern = "\\{\"id\":\"(\\d+)\",\"name\":\"(\\w+)\",\"email\":\"([\\w@.]+)\"(,\"city\":\"(\\w+)\")?}";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(input);

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
        String input = "{\"id\":\"123\",\"name\":\"Ivan\",\"email\":\"ivan@gmail.com\",\"city\":\"Lviv\"}";

        System.out.println(input);
        System.out.println(parse(input));
    }
}
