// Day 23 - Valid Palindrome (#125)
import java.util.*;

public class Q1 {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int i = 0;
        int j = s.length() - 1;

        while(j > i) {
            if(s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
          return true;
    }
    public static void main(String args[]) {
        String s = "race a car";
        System.out.println(isPalindrome(s));
    }
}