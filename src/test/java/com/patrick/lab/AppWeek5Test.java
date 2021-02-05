package com.patrick.lab;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;
public class AppWeek5Test {

    @Test
    public void shouldReturnAverage() {
        AppWeek5 nAppWeek5 = new AppWeek5();
        assertEquals(4, nAppWeek5.getAverage(2, 4, 6));
        
    }

    @Test
    public void returnTrueFalse() {
        AppWeek5 nAppweek5 = new AppWeek5();
        ArrayList<Integer> testList = new ArrayList<>();
        testList.add(6);
        testList.add(3);
        testList.add(27);
        testList.add(2);
        testList.add(0); 
        testList.add(6);

        assertEquals(true, nAppweek5.sumUpTarget(testList, 6));
        
    }

    @Test
    public void returnIntersection() {
        AppWeek5 nAppWeek5 = new AppWeek5();
        ArrayList<Integer> testListA = new ArrayList<>();
        testListA.add(1);
        testListA.add(2);
        testListA.add(3);
        testListA.add(2); 
        testListA.add(5);
        testListA.add(6);
        
        ArrayList<Integer> testListB = new ArrayList<>();
        testListB.add(1);
        testListB.add(3);
        testListB.add(5);
        testListB.add(7); 
        testListB.add(2);
        testListB.add(10);

        ArrayList<Integer> resultExpected = new ArrayList<>();
        resultExpected.add(1);
        resultExpected.add(2);
        resultExpected.add(3);
        resultExpected.add(5);

        ArrayList<Integer> resultActual = new ArrayList<>();
        resultActual = nAppWeek5.getIntersection(testListA, testListB);

        assertEquals(resultExpected,resultActual);
    }
}
