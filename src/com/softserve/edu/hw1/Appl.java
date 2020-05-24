package com.softserve.edu.hw1;

public class Appl {
    public static void main(String[] args) {
        int k = 16;
        int a = 50;
        System.out.printf("'k++'=%d\n'++k'=%d\n'k+++k'=%d\n'50---k'=%d\n'k*k'=%d\n'k/3'=%d\n" +
                "'k%%3'=%d\n'k++<++k'=%b\n", k++, ++k, k+++k, a---k, k*k, k/3, k%3, k++<++k);
    }
}