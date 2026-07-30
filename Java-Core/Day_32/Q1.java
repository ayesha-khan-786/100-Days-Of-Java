// Day - 32 -> Reverse words in a String
// Date -> 30/07/2026
import java.util.*;

public class Q1 {

    public static String reverseWords(String s) {
        // 1. Trim
        String arr[] = s.trim().split("\\s+");

        // 2. Initialize 2 pointers
        int i = 0 , j = arr.length-1;

        // 3. Swap
        while(i < j) {
            String t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j--;
        }

        // 4. Join
        return String.join(" ", arr);
    }

    public static void main(String args[]) {
        String s = "the sky is blue";

        System.out.println(reverseWords(s));
    }
}