package com.bridgelabz;

public class TicTacToeGame {
    public static void main(String[] args) {
        TicTacToeGame obj = new TicTacToeGame();
        obj.createBoard();

    }

    void createBoard() {
        String[] board = new String[10];
        for (int i = 1; i < board.length; i++) {
            board[i] = String.valueOf(i);
        }
    }
}
