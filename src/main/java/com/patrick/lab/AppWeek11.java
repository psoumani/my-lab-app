package com.patrick.lab;

import java.util.HashMap;

public class AppWeek11 {

    public static void main(String[] args) {

        //List the days of the weeks using Enum
        for (DaysOfTheWeek days : DaysOfTheWeek.values()) {
    	    System.out.println(days);
        }
        
        //Display the corresponding letter to the number
        AppWeek11 nAppWeek11 = new AppWeek11();
        String letter = nAppWeek11.numberToLetter(4);
        System.out.println("The letter value of the number submmited is: " +letter);
        
    }

    public enum DaysOfTheWeek{
        MONDAY, 
        TUESDAY, 
        WEDNESDAY, 
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }

    public String numberToLetter(int num) {

      //Declare a Hashmap of numbers and letter
      HashMap<Integer, String> hmap = new HashMap<Integer, String>();

      //Adding elements to the map
      hmap.put(0, "Zero");
      hmap.put(1, "One");
      hmap.put(2, "Two");
      hmap.put(3, "Three");
      hmap.put(4, "Four");
      hmap.put(5, "Five");
      hmap.put(6, "Six");
      hmap.put(7, "Seven");
      hmap.put(8, "Eight");
      hmap.put(9, "Nine"); 

      //Return the value corresponding to the parameter
      return hmap.get(num);

    }


    
}
