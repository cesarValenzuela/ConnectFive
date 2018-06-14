package com.cesarvalenzuela;

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

    public ConsoleUI() {
        board = new Board();
    }

    public void drawBoard() {
        String top = "+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+";
        System.out.print("y,x   1   2   3   4   5   6   7   8   9   10  11  12  13  14  15");
        for (int j = 0; j < 15 ; j++) {
            System.out.println();
            System.out.printf("    %s%n", top);
            System.out.printf("%-3d", j+1);
            for (int k = 0; k < 15 ; k++) {
                if (board.getBoard()[j][k] == null) {
                    System.out.print(" |  ");
                } else {
                    System.out.print(" | "+board.getBoard()[j][k]+"");
                }
            }
            System.out.print(" |");
        }
        System.out.println();
        System.out.println("    -------------------------------------------------------------");
    }

}
