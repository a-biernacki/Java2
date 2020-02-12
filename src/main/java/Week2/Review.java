/*
 * Arianna Biernacki
 * Student ID: 991270882
 */
package Week2;

import java.util.Scanner;

public class Review {

    int[][] board = new int[3][3];

    public void play() {
        System.out.println("****** Welcome to TicTacToe! *****");
        System.out.println();
        displayBoard();
        initializeBoard();
        displayBoard();
        checkRowForWinner(0);
        checkRowForWinner(1);
        checkRowForWinner(2);
        checkColumnForWinner(0);
        checkColumnForWinner(1);
        checkColumnForWinner(2);
        checkDiagonalLeftToRightForWinner();
        checkDiagonalRightToLeftForWinner();

//        For Assignment 1
//        Please check column for winner
//        Please check diagonal
    }

    private void initializeBoard() {
        //Allow the user a chance to set the board up their own way
        //**FOR ASSIGNMENT 1: This block will need to be modified so that the
        //2 players will take turns playing. 
        //(40%)

        
        Scanner input = new Scanner(System.in);
        System.out.println("Please set up the board by entering 9 numbers.");
        System.out.println("X = 1");
        System.out.println("O = -1");
        System.out.println("-----------------------------------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = input.nextInt();
            }
        }
        System.out.println("-----------------------------------");
    }

    private void displayBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("|");
                System.out.print(board[i][j]);
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println();
        System.out.println("-----------------------------------");
    }

    private void checkRowForWinner(int row) {
//        int sumr = board[row][0] + board[row][1] + board[row][2];
//        if (sumr == 3) {
//            System.out.println("X has won!");
//            System.exit(0);
//        }
//        if (sumr == -3) {
//            System.out.println("O has won!");
//            System.exit(0);
//        }
        //Otherwise, just do nothing.

        //Check sum1 (top row)
        int sum1 = 0;
        for (int value : board[sum1]) {
            sum1 += value;
        }
        if (sum1 == 3) {
            System.out.println("X has won!");
            System.exit(0);
        }
        if (sum1 == -3) {
            System.out.println("O has won!");
            System.exit(0);
        }

        //Check sum2 (middle row)
        int sum2 = 1;
        for (int value2 : board[sum2]) {
            sum2 += value2;
        }
        if (sum2 == 3) {
            System.out.println("X has won!");
            System.exit(0);
        }
        if (sum2 == -3) {
            System.out.println("O has won!");
            System.exit(0);
        }

        //Check sum3 (bottom row)
        int sum3 = 2;
        for (int value3 : board[sum3]) {
            sum3 += value3;
        }
        if (sum3 == 3) {
            System.out.println("X has won!");
            System.exit(0);
        }
        if (sum3 == -3) {
            System.out.println("O has won!");
            System.exit(0);
        }
    }

    private void checkColumnForWinner(int col) {
//        int sumc = board[1][col] + board[2][col] + board[3][col];
//        if (sumc == 3) {
//            System.out.println("X has won!");
//        }
//        if (sumc == -3) {
//            System.out.println("O has won!");
//        }

        int sum4 = 0;
        for (int b = 0; b < 3; b++) {
            sum4 += board[b][0];
        }
        if (sum4 == 3) {
            System.out.println("X has won!");
        }
        if (sum4 == -3) {
            System.out.println("O has won!");
        }

        //Check sum5 (column 2)
        int sum5 = 0;
        for (int c = 0; c < 3; c++) {
            sum5 += board[c][1];
        }
        if (sum5 == 3) {
            System.out.println("X has won!");
        }
        if (sum5 == -3) {
            System.out.println("O has won!");
        }

        //Check sum6 (column 3)
        int sum6 = 0;
        for (int d = 0; d < 3; d++) {
            sum6 += board[d][2];
        }
        if (sum6 == 3) {
            System.out.println("X has won!");
        }
        if (sum6 == -3) {
            System.out.println("O has won!");
        }
    }

    private void checkDiagonalLeftToRightForWinner() {
        int sumLR = 0;
        for (int e = 0; e < 3; e++) {
            sumLR += board[e][e];
        }
        if (sumLR == 3) {
            System.out.println("X has won!");
        }
        if (sumLR == -3) {
            System.out.println("O has won!");
        }
    }

    private void checkDiagonalRightToLeftForWinner() {
        int sumRL = 0;
        int g = 2;
        for (int f = 0; f < 3; f++) {
            sumRL += board[f][g - f];
        }
        if (sumRL == 3) {
            System.out.println("X has won!");
        }
        if (sumRL == -3) {
            System.out.println("O has won!");
        }
    }

}
