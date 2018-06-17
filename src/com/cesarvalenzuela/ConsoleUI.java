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

    public ConsoleUI() {
        board = new Board();
    }

    public void startGame() {
        Scanner scnr = new Scanner(System.in);
        int x, y;
        try {

            while (true) {
                drawBoard();
                System.out.println("Player 1 type where to place: x y");
                x = scnr.nextInt();
                y = scnr.nextInt();

                System.out.print(x + " " + y);
            }

        } catch (Exception e) {
            System.out.println("something went wrong");
        }
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
