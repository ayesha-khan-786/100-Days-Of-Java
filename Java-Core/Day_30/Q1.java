// Day 30 - Anagrams
import java.util.*;

public class Q1 {

    public static void main(String args[]) {
        String str1 = "race";
        String str2 = "care";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length() == str2.length()) {
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();

            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);

            boolean result = Arrays.equals(str1charArray, str2charArray);
            
            if(result) {
                System.out.println(str1 + " and " + str2 + " are Anagrams");
            } else {
                System.out.println(str1 + " and " + str2 + " are Anagrams");
            }
        }
    }
}