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
    public String[][] board = new String[15][15];

    public Board() {
        setBoard(new String[15][15]);
    }

    public boolean isEmpty() {
        if (board[x][y].equals("")) {
            return true;
        } else return false;
    }

    public void placePiece(int x, int y, String piece) {
        getBoard()[x][y] = piece;
    }

    public String[][] getBoard() {
        return this.board;
    }

    public void setBoard(String[][] board) {
        this.board = board;
    }
}
