// LeetCode 1480 - Running Sum of 1d Array
import java.util.*;

public class Q1 {
    public static int[] runningSum(int nums[]) {
        for(int i=1 ; i<nums.length ; i++) {
           nums[i] = nums[i] + nums[i-1];
        }
        return nums;
    }

public static void main(String args[]) {
    int nums[] = {1, 2, 3, 4};

    int result[] = runningSum(nums);

    for(int i=0 ; i<result.length ; i++) {
        System.out.print(result[i] + " ");
    }
}
}