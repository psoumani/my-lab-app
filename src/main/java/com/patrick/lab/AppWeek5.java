package com.patrick.lab;

import java.util.ArrayList;

public class AppWeek5 {

    public static void main(String[] args) {
        
        //Execution of the method getAverage
        int a = 2;
        int b = 4;
        int c = 10;

        AppWeek5 nAppWeek5 = new AppWeek5();
        nAppWeek5.getAverage(a,b,c);

        //Execution of the method sumUpTarget
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

        //Execution of the method returnIntersection
        ArrayList<Integer> firstList = new ArrayList<>();
        firstList.add(1);
        firstList.add(2);
        firstList.add(3);
        firstList.add(2); 
        firstList.add(5);
        firstList.add(6);
        
        ArrayList<Integer> secondList = new ArrayList<>();
        secondList.add(0);
        secondList.add(2);
        secondList.add(4);
        secondList.add(6); 
        secondList.add(8);
        secondList.add(10);

        nAppWeek5.getIntersection(firstList, secondList);


    }

    public int getAverage(int num1, int num2, int num3) {

        int avg;

        avg = ((num1 + num2 + num3) / 3);
        System.out.println("The average of the sum of " +num1 + " , "+num2 + " and " +num3 + 
        " is: " +avg );

        return avg;
    }

    public boolean sumUpTarget(ArrayList<Integer> numberList, int target) {
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

    public ArrayList<Integer> getIntersection(ArrayList<Integer> listA, ArrayList<Integer> listB) {
        int temp;
        ArrayList<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < listA.size(); i++){
            temp = listA.get(i);
            if ((listB.contains(temp) == true) && (resultList.contains(temp) == false)) {
                resultList.add(temp);
            }
        }
        if (resultList.isEmpty() == true) {
            System.out.println("There is no intersection between both lists");
        } else {
            System.out.println("The intersection between the two initial lists is " +resultList);
        }
    return resultList;
    }
}