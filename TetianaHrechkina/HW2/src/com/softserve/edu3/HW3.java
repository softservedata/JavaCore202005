package com.softserve.edu3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class HW3 {
    public static void main(String[] args) {
        BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter three numbers : ");
        int[] array = new int[3];
        for (int i = 0; i < 3; i++) {
            try {
                array[i] = Integer.parseInt(d.readLine());
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (NumberFormatException ex) {
                System.out.println("You should enter number");
                System.exit(1);
            }
        }
        Arrays.sort(array);
        System.out.println("Sorted numbers : " + Arrays.toString(array));
    }
}
