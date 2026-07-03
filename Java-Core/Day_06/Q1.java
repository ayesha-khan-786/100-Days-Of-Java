// Day 06 - Max Subarray Sum
// Date - 03/07/2026
import java.util.*;

// Brute Froce
public class Q1 {
    public static void maxSubarraySum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0 ; i<numbers.length ; i++) {
            int start = i;
            for(int j=i ; j<numbers.length ; j++) {
                int end = j;
                 currSum = 0;
                for(int k=start ; k<=end ; k++){
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.print("Max Sum =" + maxSum);
    }

// Prefix Sum
    public static void maxSubarraySumPrefix(int numbers[]) {
    int currSum = 0;
    int maxSum = Integer.MIN_VALUE;
    int prefix[] = new int[numbers.length];

    prefix[0] = numbers[0];
    for(int i=1 ; i<prefix.length ; i++) {
        prefix[i] = prefix[i-1] + numbers[i];
    }

        for(int i=0 ; i<numbers.length ; i++) {
            int start = i;
            for(int j=i ; j<numbers.length ; j++) {
                int end = j;
                
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                
                if(maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.print("Max Sum =" + maxSum);
    }

// Kadane's Algorithm
    public static void kadane(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i=0 ; i<numbers.length ; i++) {
            currSum = currSum + numbers[i];
            if(currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("Max Sum : " + maxSum);
    }

    public static void main(String args[]) {
        int numbers[] = {1, -2, 6, -1, 3};
        maxSubarraySum(numbers);
        System.out.println("\n Using Prefix Sum : ");
        maxSubarraySumPrefix(numbers);
        System.out.println("\n Using Kadane's Algorithm : ");
        kadane(numbers);
    }
}