package com.patrick.lab;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest {

    @Test
    public void shouldReturnDay() {
        App nApp = new App();
        String day = nApp.dayInWord(4);
        assertTrue(day == "Thursday");
    }

    @Test
    public void shouldReturnSum() {
    App nApp = new App();
    int sum = nApp.sumAverageRunningInt();
    assertTrue(sum == 5050);
        
    }
}
