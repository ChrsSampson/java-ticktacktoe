package board;

import java.lang.StringBuilder;

public class Board {
    // define a 3x3 2d array of characters;
    static public char[][] board = new char[3][3];

    public static void clear() {
        // reset board to empty array
        board = new char[3][3];
    }

    public static void place(int x, int y, char v){
        board[x][y] = v;
    }

    public static void print() {
        // looping over the rows to print the board
        for(int rowIndex = 0; rowIndex < board.length; rowIndex++ ) {
            StringBuilder str = new StringBuilder();
            // format each cell
            for(int cellIndex = 0; cellIndex < board[rowIndex].length; cellIndex++){
                char cell = board[rowIndex][cellIndex];

                // check for unused cell
                if(cell == '\u0000') {
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
    }

}
