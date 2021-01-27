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
}
