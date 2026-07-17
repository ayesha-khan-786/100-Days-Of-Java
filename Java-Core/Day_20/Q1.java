// Day - 20 -> Print sum of numbers in second row
// Date - 17/07/2026
import java.util.*;

public class Q1 {
    public static int sumInSecond(int nums[][]) {
        int sum = 0;
       for(int j=0 ; j<nums[0].length ; j++) {
        sum += nums[1][j];
       }
       return sum;
    }

    public static void main(String args[]) {
        int nums[][] = {{1, 4, 9},
                        {11, 4, 3},
                        {2, 2, 3}};
        System.out.println(sumInSecond(nums));
    }
}