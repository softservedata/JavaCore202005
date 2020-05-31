package com.softserve.homework1;

public class Hw1 {
    public static void main(String[] args) {
        int k;
        k = 16;
        System.out.println(k);
        k++;//k+1
        System.out.println(k);
        ++k;//k+1
        System.out.println(k);
        System.out.println(50 - --k);//50 - (18-1)
        System.out.println(k*k);//17*17
        System.out.println(k/3);// is not showing the remainder of the division because of the int type
        System.out.println(k%3);
        System.out.println(k++ < ++k);
    }

}
