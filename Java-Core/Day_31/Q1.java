// Day 31 -> Count number of vowels
// Date -> 29/07/2026
import java.util.*;

public class Q1 {

    public static int countVowels(String s) {
        int count = 0;
        for(int i=0 ; i<s.length(); i++) {
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String args[]) {
        String s = "Aisha";

        System.out.println("Number of vowls in given input are : " + countVowels(s));

    }
}