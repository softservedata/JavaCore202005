package com.softserve.edu16;

import java.util.ArrayList;
import java.util.List;

public class ApplRef {
   public static void main(String args[]) {
      List<String> names = new ArrayList<>();
      names.add("Mahesh");
      names.add("Suresh");
      names.add("Ramesh");
      names.add("Naresh");
      names.add("Kalpesh");
      System.out.println("Origin = " + names);
      //
      //names.forEach(System.out::println);
      names.forEach(x->System.out.println("Name = " + x));
   }
}
