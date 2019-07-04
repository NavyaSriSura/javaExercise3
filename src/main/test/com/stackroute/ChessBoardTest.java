package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardTest
{
    ChessBoard chessBoard;
    @Before
    public  void setUp()
    {
     chessBoard=new ChessBoard();
    }
    @After
    public void tearDown()
    {
        chessBoard=null;
    }
    @Test
    public void testCheckFor8x8() {
        String expected[][]={{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"},{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"},{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"},{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"}};

        String [][] actual = chessBoard.show(8,8);

        assertNotEquals(expected,actual);
    }
    @Test
    public void testCheckFor4x4() {
        String expected[][]={{"WW","BB","WW","BB"},{"BB","WW","BB","WW"},{"WW","BB","WW","BB"},{"BB","WW","BB","WW"}};

        String [][] actual = chessBoard.show(4,4);

        assertNotEquals(expected,actual);
    }

    @Test
    public void testCheckFor2x2() {
        String expected[][]={{"WW","BB"},{"BB","WW"}};

        String [][] actual = chessBoard.show(2,2);

        assertNotEquals(expected,actual);
    }

}