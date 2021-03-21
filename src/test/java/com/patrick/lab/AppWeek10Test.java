package com.patrick.lab;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class AppWeek10Test {

    @Test
    public void palindromeTest() {
        String str = "Esope reste ici et se repose.";
        Appweek10 nAppweek10 = new Appweek10();
        assertEquals(true, nAppweek10.isPalindrome(str));
    }

    @Test
    public void getMinElement() {
        Appweek10 nAppweek10 = new Appweek10();
        ArrayList<Integer> testList = new ArrayList<>();
        testList.add(6);
        testList.add(3);
        testList.add(27);
        testList.add(2);
        testList.add(0); 
        testList.add(1);
        assertEquals(0, nAppweek10.minimumElement(testList));
    }
    
}