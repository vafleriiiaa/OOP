import java.util.Scanner;

public class task20 {
    static class Game {
        char[][] board = { {' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '} };
        char currentPlayer = 'X';
        void makeMove(int row, int col) {
            if (board[row][col] == ' ') {
                board[row][col] = currentPlayer;
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
        }
        void printBoard() {
            for (char[] row : board) {
                for (char cell : row) System.out.print(cell + " ");
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        Game game = new Game();
        game.makeMove(0, 0);
        game.printBoard();
    }
}
