/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week1;
//1. Ask the user for 5 numbers (2, 5, 6, 4, 3)
//2. print out the sum of the numbers (20)
//3. print out the biggest number (6)
//4. Print the squence in reversed order (3,4,6,5,2)

import java.util.Scanner;

public class PrintSum {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int sum;
        sum = 0;
        System.out.println("Please enter 5 numbers");
        int[] nums = new int[5];
//        nums[0] = input.nextInt();
//        nums[1] = input.nextInt();
//        nums[2] = input.nextInt();
//        nums[3] = input.nextInt();
//        nums[4] = input.nextInt();

//for-loop to enter numbers in array
        for(int i = 0; i < nums.length; i++){
            nums[i] = input.nextInt();
        }
        
        
        //print array in reverse
        for(int i = 4; i > -1; i--){
            System.out.print(nums[i]);
        }
        
        //print the largest number from the array
        int max;
        max = nums[0];
//        if (nums[1] > max){
//            max = nums[1];
//        } 
//        if (nums[2] > max){
//            max = nums[2];
//        }
//        ...... etc etc....
        for(int i= 1; i < 5; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        System.out.println("The max number is: " + max);
        
    }

}
