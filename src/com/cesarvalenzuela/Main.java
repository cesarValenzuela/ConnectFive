package com.cesarvalenzuela;
/**
 * Author: Cesar Valenzuela
 * Date: 6/11/2018
 * Course:
 * Assignment:
 * Instructor:
 * T.A:
 */
public class Main {
    public static void main(String[] args) {
        new Main().play();

//        ConsoleUI test = new ConsoleUI();
//        //test.drawBoard();
//        test.board.placePiece(10,10,"O");
//        test.board.placePiece(11,11,"O");
//        test.board.placePiece(12,12,"O");
//        test.board.placePiece(13,13,"O");
//        test.board.placePiece(14,14,"O");
//        test.board.placePiece(1,14,"X");
//        test.board.placePiece(11,14,"X");
//        test.board.placePiece(12,14,"X");
//
//        test.drawBoard();
//        System.out.print(test.checkWin("O", test.board));
    }


    public void play() {
        ConsoleUI playGame = new ConsoleUI();
        playGame.startGame();
    }
}
