package Lab_6;

import java.util.Scanner;
import java.util.Random;
// ALPEREN GÖKBAK --> 21070006205
public class BattleShipGame {
    private final char[][] board;
    private final int numShips;
    private final int boardSize;
    private boolean gameOver;

    public BattleShipGame() {
        boardSize = 5;
        numShips = 3;
        gameOver = false;
        board = new char[boardSize][boardSize];
        initializeBoard(boardSize, numShips);
        placeShips();
    }

    private void initializeBoard(int boardSize, int numShips) {
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                board[i][j] = '-';
            }
        }
    }

    private void placeShips() {
        Random rand = new Random();
        int shipsPlaced = 0;
        while (shipsPlaced < numShips) {
            int x = rand.nextInt(boardSize);
            int y = rand.nextInt(boardSize);
            if (board[x][y] != 's') {
                board[x][y] = 's';
                shipsPlaced++;
            }
        }
    }

    private boolean isGameOver() {
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                if (board[i][j] == 's') {
                    return false;
                }
            }
        }
        return true;
    }

    private void printBoard() {
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void play() {
        Scanner input = new Scanner(System.in);
        int turns = 0;
        while (!gameOver) {
            System.out.println("Current board:");
            printBoard();
            System.out.print("Enter x coordinate: ");
            int x = input.nextInt();
            System.out.print("Enter y coordinate: ");
            int y = input.nextInt();
            if (board[x][y] == 's') {
                board[x][y] = 'x';
                System.out.println("Hit!");
                if (isGameOver()) {
                    gameOver = true;
                }
            } else {
                board[x][y] = 'o';
                System.out.println("Miss!");
            }
            turns++;
        }
        System.out.println("Game over! You sank all the ships in " + turns + " turns.");
        input.close();
    }
    public static void main(String[] args) {
        BattleShipGame game = new BattleShipGame();
        game.play();
    }
}

