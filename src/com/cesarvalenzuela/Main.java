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

    }

    public void play() {
        ConsoleUI playGame = new ConsoleUI();
        playGame.drawBoard();
    }
}
