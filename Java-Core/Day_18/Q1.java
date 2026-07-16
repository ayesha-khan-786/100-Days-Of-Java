// Day 18 - LeetCode
import java.util.*;

public class Q1 {
    public static double myPow(double x, int n) {
        long N = n;
        if(N < 0) {
            x = 1/x;
            N = -N;
        }
        return fastPow(x, N);
    }

    static double fastPow(double x, long n) {
        if(n == 0) return 1.0;

        if(n % 2 == 0) {
            double half = fastPow(x, n/2);
            return half * half;
        } else {
            return x * fastPow(x, n-1);
        }
    }

    public static void main(String args[]) {
        double x = 2.00000;
        int n = 10;

        System.out.println(myPow(x, n));
    }
}