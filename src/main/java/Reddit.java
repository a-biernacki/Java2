/*
 * Arianna Biernacki
 * Student ID: 991270882
 * SYST10199 - Web Programming
 */

public class Reddit {
    public static void main(String[] args){
    
        int[] arr = {4, 2, 20, 8};
        int x = 0;
        for (int i=1; i<arr.length; i++){
            int y = arr[i] - arr[0];
            if (y > x)
                x = y;
        }
        System.out.println(x);
    
    }
}
