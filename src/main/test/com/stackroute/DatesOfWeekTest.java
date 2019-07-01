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
    public void startDate() {

        boolean expectedValue = true;
        boolean actualValue = datesOfWeek.startDate();

        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void endDate() {
        boolean expectedValue1 = true;
        boolean actualValue1 = datesOfWeek.endDate();
        assertEquals(expectedValue1, actualValue1);

    }
}