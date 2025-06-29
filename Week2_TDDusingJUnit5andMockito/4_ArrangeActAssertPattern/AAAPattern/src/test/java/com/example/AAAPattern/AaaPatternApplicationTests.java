package com.example.AAAPattern;

import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AaaPatternApplicationTests {

    private AaaPatternApplication calc;

    @Before
    public void setUp() {
        calc = new AaaPatternApplication();
    }

    @After
    public void tearDown() {
        calc = null;
    }

    @Test
    public void testAdd() {
        int result = calc.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void testSubtract() {
        int result = calc.subtract(10, 4);
        assertEquals(6, result);
    }
}
