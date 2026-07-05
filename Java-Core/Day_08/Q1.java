// Day 08 - Contains Duplicate(#217)
// Date - 05/07/2026

import java.util.*;

public class Q1 {

    public static boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        for(int i=0 ; i<n-1 ; i++) {
            if(nums[i] == nums[i+1]) {
                return true;
            }
        }

        return false;
    }

    public static void main(String args[]) {
        int nums[] = {1, 2, 3, 1};
        System.out.println(containsDuplicate(nums));
    }
}