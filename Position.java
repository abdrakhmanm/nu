package Task1Package;

public class Position {

    private int x, y;

    public String[][] board = new String[3][3];

    public Position(){   //board filling constructor
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++)
                board[i][j] = " ";
        }

        x = 0;
        y = 0;
    }

    public boolean changePosition(int newX, int newY, String player){  //Добавляет координаты
        x = newX - 1;
        y = newY - 1;
        if(checkPosition(newX, newY)){
            board[x][y] = player;
            return true;
        }

        return false;
    }

    public boolean checkPosition(int x, int y){    //Method for checking coordinates
    
        if (x > 3 || x < 1 || y > 3 || y < 1) {
            return false;
        }
        if (!board[x - 1][y - 1].equals(" ")) {
            return false;
        }

        return true;
    }

}
