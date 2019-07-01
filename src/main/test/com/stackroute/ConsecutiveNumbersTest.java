package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveNumbersTest
{
    ConsecutiveNumbers consecutiveNumbers;
    @Before
    public void setUp()
    {
        consecutiveNumbers=new ConsecutiveNumbers();
    }
    @After
    public void tearDown()
    {
        consecutiveNumbers=null;
    }
    @Test
    public void checkNon() {
        boolean expected = false;

        boolean actual = consecutiveNumbers.checkConsecutive("98,96,95,94,93");

        assertEquals(expected, actual);
    }

    @Test
    public void checkConsOne() {
        boolean expected = true;
        boolean actual = consecutiveNumbers.checkConsecutive("54,53,52,51,50,49,48");

        assertEquals(expected, actual);
    }

    @Test
    public void checknonConsTwo() {
        boolean expected = false;
        boolean actual = consecutiveNumbers.checkConsecutive("1,2,3,4,5,6,6");

        assertEquals(expected, actual);
    }

}