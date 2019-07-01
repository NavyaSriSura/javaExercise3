package com.stackroute;

public class AdditionOfMatrices
{
    public int[][] checkSum(int rows, int columns, int a1[][], int a2[][]) {
        int sum[][] = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum[i][j] = a1[i][j] + a2[i][j];
            }
        }
        return sum;
    }
}
