package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DatesOfWeekTest {
    DatesOfWeek datesOfWeek;

    @Before
    public void setUp() {
        datesOfWeek = new DatesOfWeek();
    }

    @After
    public void tearDown() {
        datesOfWeek = null;
    }

    @Test
    public void testStartDate() {

        String expectedValue = "Mon 01/07/2019";
        String actualValue = datesOfWeek.startDate();

        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void testEndDate() {
        String expectedValue1 = "Sun 07/07/2019";
        String actualValue1 = datesOfWeek.endDate();
        assertEquals(expectedValue1, actualValue1);

    }
}