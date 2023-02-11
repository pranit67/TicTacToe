package com.bridgelabz;

import java.util.Scanner;

public class TicTacToeGame {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        TicTacToeGame obj = new TicTacToeGame();
        createBoard();
        playerInput();
    }

    public static void createBoard() {
        String[] board = new String[10];
        for (int i = 1; i < board.length; i++) {
            board[i] = String.valueOf(i);
        }
    }

    public static void playerInput() {
        System.out.println("Please choose your letter for playing (x or o) \ntype letter & press enter");
        String playLetter = scan.next();
        if (playLetter.equals("x")) {
            System.out.println("You choose X \nnow computer will play with O");
        } else if (playLetter.equals("o")) {
            System.out.println("You choose O \nnow computer will play with X");
        } else {
            System.out.println("Invalid Input \n");
            playerInput();
        }
    }
}