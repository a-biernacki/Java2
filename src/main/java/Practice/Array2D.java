/*
 * Arianna Biernacki
 * Student ID: 991270882
 * SYST10199 - Web Programming
 */
package Practice;

import java.util.Scanner;

public class Array2D {

    public static void main(String[] args) {

        int[][] arr2D = new int[3][3];
        Scanner input = new Scanner(System.in);

        //Initialize board
        System.out.println("Please enter 9 numbers");
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D.length; j++) {
                arr2D[i][j] = input.nextInt();
            }
        }

        //Display Board
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr2D[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");

        //Calculate Sum
        int sum = 0;

        for (int k = 0; k < arr2D.length; k++) {
            for (int l = 0; l < arr2D.length; l++) {
                sum += arr2D[k][l];
            }
        }
        System.out.println("The sum is: " + sum);

        //Find Max
        int max = 0;
        for (int m = 0; m < arr2D.length; m++) {
            for (int n = 0; n < arr2D.length; n++) {
                if (arr2D[m][n] > max) {
                    max = arr2D[m][n];
                }
            }
        }
        System.out.println("The max number is: " + max);

        //Find Min
        int min = max;
        for (int o = 0; o < arr2D.length; o++) {
            for (int p = 0; p < arr2D.length; p++) {
                if (arr2D[o][p] < min) {
                    min = arr2D[o][p];
                }
            }
        }
        System.out.println("The min is: " + min);

        //Print in reverse
        System.out.println("The array in reverse is");
        for (int q = arr2D.length - 1; q > -1; q--) {
            for (int r = arr2D.length - 1; r > -1; r--) {
                System.out.print(arr2D[q][r]);
            }
            System.out.println("");
        }

    }
}
