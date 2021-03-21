package com.patrick.lab;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppWeek11Test {

    @Test
    public void numberToLetterTest() {
        AppWeek11 nAppWeek11 = new AppWeek11();
        assertEquals("Eight", nAppWeek11.numberToLetter(8));
    }
    
}
