/*
 * Arianna Biernacki
 * Student ID: 991270882
 */
package Week4;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {

    public static void main(String[] args) {
        int sum = 0;
        Scanner input = new Scanner(System.in);
        ArrayList arrList = new ArrayList();
//      ArrayList<int> arrList = new ArrayList<int>();
        System.out.println("Please enter 5 numbers");
        for (int i = 0; i < 5; i++) {
            arrList.add(input.nextInt());
        }
        for (int j = 0; j < arrList.size(); j++) {
            sum += (int) arrList.get(j);
        }
        System.out.println("The sum is: " + sum);
    }
}
