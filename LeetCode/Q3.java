// #136 - Single Number
import java.util.*;

public class Q3 {

    public static int singleNo(int nums[]) {
        int result = 0;
        for(int i=0 ; i<nums.length ; i++) {
            result = result ^ nums[i];
        }
        return result;
    }
    public static void main(String args[]) {
        int nums[] = {2, 2, 1};
        System.out.println(singleNo(nums));
    }
}