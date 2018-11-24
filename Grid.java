package Task1Package;

public class Grid {

    public void printBoard(String[][] board ){
        for (int i = 0; i < board.length; i++) {
            System.out.println(" " + board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
            if (i != 2) System.out.println("-----------");
        }
    }

}
