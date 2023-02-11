package com.bridgelabz;

import java.util.*;

public class TicTacToeGame {
    static Scanner sc = new Scanner(System.in);
    static String[] board = new String[10];

    public static void main(String[] args) {
        createBoard();
        playerInput();
        showBoard();
    }

    public static void createBoard() {
        for (int i = 1; i < board.length; i++) {
            board[i] = String.valueOf(i);
        }
    }

    public static void playerInput() {
        System.out.println("Please choose your letter for playing (x or o) \ntype letter & press enter");
        String playLetter = sc.next();
        if (playLetter.equals("x")) {
            System.out.println("You choose X \nnow computer will play with o");
        } else if (playLetter.equals("o")) {
            System.out.println("You choose O \nnow computer will play with x");
        } else {
            System.out.println("Invalid Input \n");
            playerInput();
        }
    }

    public static void showBoard() {
        System.out.println("| " + board[1] + " | " + board[2] + " | " + board[3] + " |\n-------------");
        System.out.println("| " + board[4] + " | " + board[5] + " | " + board[6] + " |\n-------------");
        System.out.println("| " + board[7] + " | " + board[8] + " | " + board[9] + " |\n-------------");
    }
}