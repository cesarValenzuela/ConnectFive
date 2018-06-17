package com.cesarvalenzuela;

/**
 * Author: Cesar Valenzuela
 * Date: 6/11/2018
 * Course: SUMMER CS3331
 * Assignment: HW1a
 * Instructor:
 * T.A:
 *
 * The Board for a connect 5 game that is 15x15
 *
 */
public class Board {
    // Coordinates to manipulate board
    private int x, y;

    // holds placement of game pieces
    private String[][] board;

    public Board() {
        board = new String[15][15];
    }


    public void placePiece(int x, int y, String piece) {
        board[x][y] = piece;
    }

    public String[][] getBoard() {
        return this.board;
    }

}
