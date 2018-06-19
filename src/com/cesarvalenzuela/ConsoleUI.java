package com.cesarvalenzuela;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

/**
 * Author: Cesar Valenzuela
 * Date: 6/11/2018
 * Course:
 * Assignment:
 * Instructor:
 * T.A:
 */
public class ConsoleUI {

    Board board;
    InputStream in;
    OutputStream out;
    String player1 = "X";
    String player2 = "O";

    public ConsoleUI() {
        board = new Board();
    }

    public void startGame() {
        Scanner scnr = new Scanner(System.in);
        int x, y;
        try {

            while (true) {
                drawBoard();

                while (true) {
                    System.out.println("Player 1 type where to place: x y OR -1 to exit");
                    x = scnr.nextInt();
                    y = scnr.nextInt();
                    if (x == -1) {
                        System.exit(0);
                    }
                    if (((x <= board.getBoard().length) && x > 0) && ((y <= board.getBoard().length) && y > 0)) {
                        board.placePiece(y - 1, x - 1, "X");
                        break;
                    } else {
                        System.out.println("incorrect input. Stay within grid TRY AGAIN");
                    }
                }
                // Check for win condition
                // board.checkWin()
                if (checkWin("X", this.board)) {
                    break;
                }
                // BREAK if TRUE - CONGRATULATE
                while (true) {
                    System.out.println("Player 2 type where to place: x y OR -1 to exit");
                    x = scnr.nextInt();
                    y = scnr.nextInt();
                    if (x == -1) {
                        System.exit(0);
                    }
                    if (((x <= board.getBoard().length) && x > 0) && ((y <= board.getBoard().length) && y > 0)) {
                        board.placePiece(y - 1, x - 1, "O");
                        break;
                    } else {
                        System.out.println("incorrect input. Stay within grid TRY AGAIN");
                    }
                }
                if (checkWin("O", this.board)) {
                    break;
                }

            }

        } catch (Exception e) {
            System.out.println("something went wrong");
        }
    }

    public boolean checkWin(String player, Board board) {
        int height = board.board.length;
        int width = board.board.length;

        for (int row = 0; row < height - 3; row++) {
            for (int col = 0; col < width; col++) {
                if (this.board.board[row][col] == player && this.board.board[row][col + 1] == player
                        && this.board.board[row][col + 2] == player && this.board.board[row][col + 3] == player
                        && this.board.board[row][col + 4] == player) {
                    return true;
                }
            }

        }

        for (int row = 0; row < width - 3; row++) {
            for (int col = 0; col < height; col++) {
                if (this.board.getBoard()[row][col] == player && this.board.getBoard()[row + 1][col] == player
                        && this.board.getBoard()[row + 2][col] == player && this.board.getBoard()[row + 3][col] == player
                        && this.board.getBoard()[row + 4][col] == player) {
                    return true;
                }
            }
        }

        for (int row = 4; row < width; row++) {
            for (int col = 0; col < height - 3; col++) {
                if (this.board.board[row][col] == player && this.board.board[row - 1][col + 1] == player
                        && this.board.board[row - 2][col + 2] == player && this.board.board[row - 3][col + 3] == player
                        && this.board.board[row - 4][col + 4] == player) {
                    return true;
                }
            }
        }

        for (int row = 4; row < width; row++) {
            for (int col = 4; col < height; col++) {
                if (this.board.board[row][col] == player && this.board.board[row - 1][col - 1] == player
                        && this.board.board[row - 2][col - 2] == player && this.board.board[row - 3][col - 3] == player
                        && this.board.board[row - 4][col - 4] == player) {
                    return true;
                }
            }
        }


        return false;
    }


    public void drawBoard() {
        String top = "+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+";
        System.out.print("y,x   1   2   3   4   5   6   7   8   9   10  11  12  13  14  15");
        for (int j = 0; j < 15; j++) {
            System.out.println();
            System.out.printf("    %s%n", top);
            System.out.printf("%-3d", j + 1);
            for (int k = 0; k < 15; k++) {
                if (board.getBoard()[j][k] == null) {
                    System.out.print(" |  ");
                } else {
                    System.out.print(" | " + board.getBoard()[j][k] + "");
                }
            }
            System.out.print(" |");
        }
        System.out.println();
        System.out.println("    -------------------------------------------------------------");
    }

}
