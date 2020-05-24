package com.softserve.edu1;

public class HW1 {
    public static void main(String[] args) {
        int k = 16;
        int l = 50;
        System.out.println("Result of operation k++ : " + k++);
        System.out.println("Result of operation ++k : " + ++k);
        System.out.println("Result of operation k+++k :" + k+++k);
        System.out.println("Result of operation 50---k :" + (l---k));
        System.out.println("Result of operation k*k : " + k*k);
        System.out.println("Result of operation k/3 : " + k/3);
        System.out.println("Result of operation k%3 : " + k%3);
        System.out.println("Result of operation k++<++k :" + (k++<++k));
    }
}
