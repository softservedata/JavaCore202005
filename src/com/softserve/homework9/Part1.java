package com.softserve.homework9;

public class Part1 {

    public static void main(String[] args) {
        String text = "Bingo, Strings for testing, contains one string";

        String[] words = text.split("\\s*(\\s|,|!|\\.)\\s*");

        for(String word : words){
            if (word.contains("ing"))
                System.out.println(word);
        }
    }
}
