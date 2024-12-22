package board;

import java.lang.StringBuilder;
import java.util.Arrays;

public class Board {
    // define a 3x3 2d array of characters;
    static public char[][] board = new char[3][3];
    // rerensets empty
    static public char _null = '\u0000';

    public static void clear() {
        // reset board to empty array
        board = new char[3][3];
    }

    public static void place(int x, int y, char v){
        board[x][y] = v;
    }

    public static void print() {
        System.out.println('\n');
        // looping over the rows to print the board
        for(int rowIndex = 0; rowIndex < board.length; rowIndex++ ) {
            StringBuilder str = new StringBuilder();
            // format each cell
            for(int cellIndex = 0; cellIndex < board[rowIndex].length; cellIndex++){
                char cell = board[rowIndex][cellIndex];

                // check for unused cell
                if(cell == _null) {
                    str.append(" * ");
                }

                // dont print a wall on the last cell
                if(cellIndex < 2) {
                    str.append("|");
                }

            }
            System.out.println(str);

            // print the horizantal lines lines
            if (rowIndex < 2){
                System.out.println("------------");
            }
        }       
        System.out.println('\n');

    }

    public static boolean checkForWin() {
        boolean[] states = {checkHorizantalWin(), checkVerticalWin()};


        return Arrays.asList(states).contains(states);

    }


    // check if the entire row is 
    public static boolean checkHorizantalWin() {
        boolean hasWon  = false;

        for(int r = 0; r < board.length; r++) {
            int c = 0;
            int cc = c +1;
            int ccc = c + 2;

            if (board[r][c] == _null) {
                break;
            }

            // pretty dirty way to do this
            if(board[r][c] == board[r][cc] && board[r][cc] == board[r][ccc]){
                hasWon = true;
            }
        }

        return hasWon;
    }

    public static boolean checkVerticalWin () {
        boolean hasWon = false;




        return hasWon;
    }

}
