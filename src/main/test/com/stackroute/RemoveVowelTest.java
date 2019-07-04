package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveVowelTest {
RemoveVowel removeVowel;
    @Before
    public void setUp() throws Exception
    {
        removeVowel=new RemoveVowel();
    }

    @After
    public void tearDown() throws Exception
    {
      removeVowel=null;
    }
    @Test
    public void testcheck() {
        String[] expected = {"nd", "ntd Stts", "Grmny", "gypt", "czchslvk"};
        String[] str = {"India", "United States", "Germany", "Egypt", "czechoslovakia"};
        String[] actual = removeVowel.checkVowel(str);
        assertArrayEquals(expected, actual);
    }
    @Test
    public void testCheckWithOnlyConsonants()//test case for only consonants
    {
        String[] str={"lymphs","rhythms","fly","fry"};
        String[] expected={"lymphs","rhythms","fly","fry"};
        String[] actual=removeVowel.checkVowel(str);
        assertArrayEquals(expected,actual);
    }

    @Test
    public void testCheckWithOnlyVowels()
    {
        String[] str={"AIEEE","OU"};
        String[] expected={"",""};
        String[] actual=removeVowel.checkVowel(str);
        assertArrayEquals(expected,actual);
    }
}