// Day 25 - Max Subarray Product
import java.util.*;

public class Q1 {
    public static int maxProduct(int nums[]) {
        int currMax = nums[0];
        int currMin = nums[0];
        int maxPro = nums[0];

        for(int i=1 ; i<nums.length ; i++) {
            if(nums[i] < 0) {
                int temp = currMax;
                currMax = currMin;
                currMin = temp;
            }

            currMax = Math.max(nums[i], currMax * nums[i]);
            currMin = Math.min(nums[i], currMin * nums[i]);

            maxPro = Math.max(maxPro, currMax);
        }
        return maxPro;
    }

    public static void main(String args[]) {
        int nums[] = {2, 3, -2, 4};
        System.out.println(maxProduct(nums));
    }
}