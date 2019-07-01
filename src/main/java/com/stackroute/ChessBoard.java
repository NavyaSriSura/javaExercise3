package com.stackroute;

public class ChessBoard
{
    public String[][] show(int row, int column) {
        {
            String result[][] = new String[row][column];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    if (((i + j) % 2) == 0) {
                        result[i][j] = "WW";
                    } else {
                        result[i][j] = "BB";
                    }

                }


            }

            return result;
        }
    }

}