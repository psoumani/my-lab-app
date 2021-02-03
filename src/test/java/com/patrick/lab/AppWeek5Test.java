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
}
