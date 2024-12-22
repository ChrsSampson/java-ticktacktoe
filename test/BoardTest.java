package test;

import org.junit.Test;
import org.junit.Assert.*;
import board.Board;


public class BoardTest {

    static Board testBoard = new Board();

    @Test
    public void testSize() {
        // make sure the 2d array is 3x3
        assert(testBoard.board.length == 3);
        assert(testBoard.board[0].length == 3);       
    }


    @Test
    public void placePieces() {
        testBoard.place(0,0, 'X');
        char topLeft = testBoard.board[0][0];
        assert(topLeft == 'X');        

        boolean w1 = testBoard.checkForWin();

        assert(w1 == false);

        testBoard.place(0,1, 'X');
        testBoard.place(0,2, 'X');
        
        // should win now
        boolean w2 = testBoard.checkForWin();
        assert(w2 == true);
    }
    



}