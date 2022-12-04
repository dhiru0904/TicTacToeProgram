package com.tictactoeprogram;

public class TicTacToeGame {
    public void createboard(int size) {
        char[] board = new char[size];
        for(int i = 1; i < 10; i++) {
            board[i] = ' ';
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Tic Tac Toe Game Program");
        TicTacToeGame game = new TicTacToeGame();
        game.createboard(10);
    }
}
