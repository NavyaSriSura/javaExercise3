package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdditionOfMatricesTest
{
    AdditionOfMatrices additionOfMatrices;
  @Before
    public void setUp()
  {
      additionOfMatrices=new AdditionOfMatrices();

  }
  @After
    public  void tearDown()
  {
     additionOfMatrices=null;
  }
  @Test
    public void TestGivenMatricesReturnSum()
  {
      int[][] expected = {{8, 9, 6}, {9, 6, 4}, {7, 10, 5}};
      int matrix1[][] = {{3, 2, 3}, {5, 4, 3}, {5, 6, 3}};
      int matrix2[][] = {{5, 7, 3}, {4, 2, 1}, {2, 4, 2}};
      int[][] actual = additionOfMatrices.checkSum(3, 3, matrix1, matrix2);

      assertArrayEquals(expected, actual);
  }
}