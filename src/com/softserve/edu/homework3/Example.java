package com.softserve.edu.homework3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Example {
    import java.io.BufferedReader;
import java.io.InputStreamReader;

//import com.My;

    /**
     * @author JavaCore202005.
     * <br>Version 0.1.
     */
    public class Appl {

        /**
         * Main <font color="red">Method</font>
         * @param args form <b>CommnadLine</b>
         * @throws <i>Exception</i>
         */
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            //
            System.out.print("Hello. What is your name? ");
            String name = br.readLine();
            //
            System.out.print("How old are you? ");
            int age = Integer.parseInt(br.readLine());
            //
            System.out.println("Hello " + name);
            System.out.println("You are " + age);
            br.close();
		/*
		byte b = 49;
		System.out.println("b = " + b + "  b as Char = " + (char) b);
		*/
            System.out.print("0123456789");
            Thread.sleep(4000);
            //System.out.print("ab" + 13 + "cd");
            System.out.print("ab" + ((char)13) + "cd");
            //
            //My m = new My();
        }

    }
}
