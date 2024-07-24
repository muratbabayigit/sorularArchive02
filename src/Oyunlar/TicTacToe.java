package Oyunlar;

import java.util.Scanner;

public class TicTacToe {
    static char[][] board = new char[3][3];
    static char currentPlayer = 'X';

    public static void main(String[] args) {
        initializeBoard();
        printBoard();

        while (!gameOver()) {
            makeMove();
            printBoard();
            switchPlayer();
        }

        System.out.println("Game over!");
    }

    public static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    public static void printBoard() {
        System.out.println("-------------");

        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    public static void makeMove() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("It's " + currentPlayer + "'s turn.");
        System.out.print("Enter row (0-2): ");
        int row = scanner.nextInt();
        System.out.print("Enter column (0-2): ");
        int col = scanner.nextInt();

        if (board[row][col] != '-') {
            System.out.println("That spot is already taken. Try again.");
            makeMove();
        } else {
            board[row][col] = currentPlayer;
        }
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }

    public static boolean gameOver() {
        if (checkRows() || checkColumns() || checkDiagonals()) {
            System.out.println(currentPlayer + " wins!");
            return true;
        } else if (boardFull()) {
            System.out.println("It's a tie!");
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkRows() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != '-') {
                return true;
            }
        }
        return false;
    }

    public static boolean checkColumns() {
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != '-') {
                return true;
            }
        }
        return false;
    }

    public static boolean checkDiagonals() {
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != '-') {
            return true;
        } else if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != '-') {
            return true;
        } else {
            return false;
        }
    }

    public static boolean boardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
}