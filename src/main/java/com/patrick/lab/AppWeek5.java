package com.patrick.lab;

import java.util.ArrayList;

public class AppWeek5 {

    public static void main(String[] args) {
        
        int a = 2;
        int b = 4;
        int c = 10;

        AppWeek5 nAppWeek5 = new AppWeek5();
        nAppWeek5.getAverage(a,b,c);

        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(5);
        numList.add(7);
        numList.add(4);
        numList.add(9); 
        numList.add(13);
        numList.add(3);
        numList.add(5);
        numList.add(5); 

        int goal = 10;

        nAppWeek5.sumUpTarget(numList, goal);
    }

    public int getAverage(int num1, int num2, int num3) {

        int avg;

        avg = ((num1 + num2 + num3) / 3);
        System.out.println("The average of the sum of " +num1 + " , "+num2 + " and " +num3 + 
        " is: " +avg );

        return avg;
    }

    public boolean sumUpTarget(ArrayList<Integer>numberList, int target) {
        int sum = target;
        boolean result = false;

        for (int i = 0; i < numberList.size(); i++) {
            for (int j = 0; j < numberList.size(); j++ ){
                if (((numberList.get(i) + numberList.get(j)) == sum) && (i != j)) {
                    result = true;
                }
            }
        }
        System.out.println("There are two numbers in the array that sum up to " +target +" : " +result);
        return result;
        
    }
}