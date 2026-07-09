// Day 12 
// Date - 09/07/2026

import java.util.*;

public class Q4 {
    public static boolean isPalindrome(int x) {
        int rev = 0, rem = 0;
        int temp = x;
        while(x > 0) {
            rem = x % 10;
            rev = (rev * 10) + rem;
            x = x / 10;
        } 
        if(temp == rev) {
            return true;
        }
        return false;
    }

    public static void main(String args[]) {
        int x = 121;
        System.out.println(isPalindrome(x));
    }
}