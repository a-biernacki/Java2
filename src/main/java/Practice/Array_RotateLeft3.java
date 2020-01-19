/*
 * Arianna Biernacki
 * Student ID: 991270882
 * SYST10199 - Web Programming
 */
package Practice;

public class Array_RotateLeft3 {

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5, 6};
        int[] reordered = new int[original.length];
        int shift = 1;

        for (int i = 0; i < original.length; i++) {
            reordered[i] = original[(shift + i) % original.length];
        }
        System.out.println(original);
        System.out.println(reordered);
    }
}

