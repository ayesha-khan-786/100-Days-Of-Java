// Day 05 - Print Subarrays
// Date - 02/07/2026
import java.util.*;

public class Q1 {
    public static void subarray(int numbers[]) {
        int totalSubarray = 0;
        for(int i=0 ; i<numbers.length ; i++) {
            int start = i;
            for(int j=i ; j<numbers.length ; j++) {
                int end = j;
                for(int k=start ; k<=end ; k++) {
                    System.out.print(numbers[k] + " ");
                }
                totalSubarray++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarray : " + totalSubarray);
    }
    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10};
        subarray(numbers);
    }
}