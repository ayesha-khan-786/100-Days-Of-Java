// Day 01 - Pattern Question 1
// Topic : Loops & Patterns
// Date : June 28, 2026

public class Q1 {
    public static void main(String args[]) {
        int n = 4;
        for(int i=1 ; i<=n ; i++) {
            for(int j=i ; j<=n; j++) {
                System.out.print(" * ");
            }
           System.out.println();
        }
    }
}