// Dat 21 - Find GCD of Array (#1979)
import java.util.*;

    public class Q1 {

        public static int findGCD(int nums[]) {
            int min = nums[0];
            int max = nums[0];
            
            for(int i=0 ; i<nums.length ; i++) {
                if(nums[i] < min)   min = nums[i];
                if(nums[i] > max)   max = nums[i];
            }

            while(min != 0) {
                int temp = min;
                min = max % min;
                max = temp;
            }

            return max;
        }

        public static void main(String args[]) {
            int nums[] = {2, 5, 6, 9, 10};
            System.out.println(findGCD(nums));
        }
    }
