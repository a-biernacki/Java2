/*
 * Arianna Biernacki
 * Student ID: 991270882
 */
package Week2;

import java.util.Scanner;

public class TicTacToeScratch {

    int[][] board = new int[3][3];

    public void play() {
        //Beginning of game
        System.out.println();
        System.out.println("********* Welcome to TicTacToe! ********");
        System.out.println();
        displayBoard();
        gameRules();
        //Users take turns playing
        initializeBoard();
        displayBoard();
        initializeBoard();
        displayBoard();
        initializeBoard();
        displayBoard();
        //Computer checks for winner
        checkRowForWinner();
        checkColumnForWinner();
        checkDiagonalLeftToRightForWinner();
        checkDiagonalRightToLeftForWinner();
    }

    private void displayBoard() {
        int r = 0;
        int c = 0;
        System.out.println("          Column 0  Column 1  Column 2");
        for (int i = 0; i < 3; i++) {
            System.out.print("Row " + r++ + "   ");
            for (int j = 0; j < 3; j++) {
//                System.out.print("Column " + c++);
                System.out.print("|");
                System.out.print("    " + board[i][j] + "    ");
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println();
        System.out.println("----------------------------------------");
    }

    private void gameRules() {
        System.out.println("              GAME RULES:              ");
        System.out.println("                 X = 1                 ");
        System.out.println("                 O = -1                 ");
        System.out.println("               NULL = 1                 ");
        System.out.println("----------------------------------------");
    }

    private void initializeBoard() {
        int u = 0;
        Scanner input = new Scanner(System.in);
//        for (int p = 0; p < board.length; p++) {
        for (int i = 0; i < 1; i++) {
            System.out.println("User " + u + ": Enter a row number");
            int r = input.nextInt();
            for (int j = 0; j < 1; j++) {
                System.out.println("User " + u + ": Enter a column number");
                int c = input.nextInt();
                for (int k = 0; k < 1; k++) {
                    System.out.println("User " + u + ": Make your move");
                    board[r][c] = input.nextInt();
                }
            }

        }
//        }

    }

//    private void user1() {
//        Scanner input = new Scanner(System.in);
//        for (int i = 0; i < board.length; i++) {
//            for (int j = 0; j < board.length; j++) {
//                System.out.println("User 1: Enter one number:");
//                board[i][j] = input.nextInt();
//            }
//        }
//        System.out.println("----------------------------------------");
//    }
//
//    private void user2() {
//        Scanner input = new Scanner(System.in);
//        for (int i = 0; i < board.length; i++) {
//            for (int j = 0; j < board.length; j++) {
//                System.out.println("User 2: Enter one number:");
//                board[i][j] = input.nextInt();
//            }
//        }
//        System.out.println("----------------------------------------");
//    }
    private void checkRowForWinner() {

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

    private void checkColumnForWinner() {
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
