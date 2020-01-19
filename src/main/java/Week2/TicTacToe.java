/*
 * Arianna Biernacki
 * Student ID: 991270882
 */
package Week2;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        int[][] board = new int[3][3];

        //Ask user for numbers
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 9 numbers: 0 for blank, 1 for x, 2 for 0.");
        for (int n = 0; n < board.length; n++) {
            for (int m = 0; m < board.length; m++) {
                board[n][m] = input.nextInt();
            }
        }
        System.out.println();

        //Print out the values inside array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("|");
                System.out.print(board[i][j]);
//                System.out.println(Arrays.deepToString(board));
            }
            System.out.print("|");
            System.out.println();
        }

        //Check sum1 (top row)
        int sum1 = 0;
        for (int value : board[sum1]) {
            sum1 += value;
        }
        System.out.println("Sum of top row = " + sum1);

        //Check sum2 (middle row)
        int sum2 = 1;
        for (int value2 : board[sum2]) {
            sum2 += value2;
        }
        System.out.println("Sum of middle row = " + (sum2 - 1));

        //Check sum3 (bottom row)
        int sum3 = 2;
        for (int value3 : board[sum3]) {
            sum3 += value3;
        }
        System.out.println("Sum of bottom row = " + (sum3 - 2));

        //Check sum4 (column 1)
        int sum4 = 0;
        for (int b = 0; b < 3; b++) {
            sum4 += board[b][0];
        }
        System.out.println("Sum of left column = " + sum4);

        //Check sum5 (column 2)
        int sum5 = 0;
        for (int c = 0; c < 3; c++) {
            sum5 += board[c][1];
        }
        System.out.println("Sum of the middle column = " + sum5);

        //Check sum6 (column 3)
        int sum6 = 0;
        for (int d = 0; d < 3; d++) {
            sum6 += board[d][2];
        }
        System.out.println("Sum of the right column = " + sum6);

        //Check diagonal (left to right)
        int sum7 = 0;
        for (int e = 0; e < 3; e++) {
            sum7 += board[e][e];
        }
        System.out.println("Sum of diagonal (left to right) = " + sum7);

        //Check diagonal (right to left)
        int sum8 = 0;
        int g = 2;
        for (int f = 0; f < 3; f++) {
            sum8 += board[f][g - f];
        }
        System.out.println("Sum of diagonal (right to left) = " + sum8);

        
    }
}
