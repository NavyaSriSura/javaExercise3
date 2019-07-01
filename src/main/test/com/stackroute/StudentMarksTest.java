package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest
{
    StudentMarks studentMarks;
    @Before
public void setUp()
{
    studentMarks=new StudentMarks();
}
@After
    public void tearDown()
{
    studentMarks=null;
}
@Test
    public void TestGivenMarksReturnResult()
{

    int marks[]={56,75,92};
    String  result=studentMarks.checkGrade(marks,3);
    assertEquals(result,"Valid Marks");
}
@Test
    public void TestGivenInValidMarksReturnError()
{
    int marks[]={120,86,22};
    String result=studentMarks.checkGrade(marks,3);
    assertEquals(result,"Invalid Marks");
}
}