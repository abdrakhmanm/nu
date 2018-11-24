package Task1Package;

import java.util.Scanner;

public class Main {

	
	public static boolean checkWinner(String[][] board, int x, int y, String player){

        int diagonal = 0;
        int horizontal = 0;
        int vertical = 0;

        x--;
        y--;

        for (int i = 0; i < 3; i++) {
            if (board[x][i] == player)
                horizontal += 1;
            if (board[i][y] == player)
                vertical += 1;
        }
        if (vertical == 3 || horizontal == 3) return true;


        for (int i = 0; i < board.length; i++)
            if (board[i][i] == player)
                diagonal += 1;
        if (diagonal == 3) return true;
        diagonal = 0;


        for (int i = 0; i < board.length; i++)
            if (board[i][board.length - 1 - i] == player)
                diagonal += 1;
        if (diagonal == 3) return true;


        return false;


    }

    public static void main(String[] args) {
	// write your code here

        int x, y;
        int move = 0;
        String player = "X";
        Scanner in = new Scanner(System.in);

        Position aPos = new Position();   //Class objects to implement encapsulation
        Grid aGrid = new Grid();
      

        while(true){

            System.out.println(player + "\'s turn to make a move. Enter x and y: ");
            x = in.nextInt();
            y = in.nextInt();
            move++;
            if(aPos.changePosition(x, y, player)){    //checks whether the coordinates are correct
                aGrid.printBoard(aPos.board);

                if(checkWinner(aPos.board, x, y, player)){     //If true, player won
                    System.out.println("Player '" + player + "' won!");
                    break;
                }
                if(move==9) {
                	System.out.println("draw");
                }
                if(player.equals("X"))   //
                    player = "O";

                else if(player.equals("O"))
                    player = "X";
            }

            else
                System.out.println("This move at (" + x + "," + y + ") is not valid. Try again...");  
        }
    }
}

