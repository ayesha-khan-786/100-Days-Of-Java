// Day 14 - 2D Arrays
// Date- 11/07/2026
import java.util.*;

public class Q5 {
    public static boolean search(int matrix[][], int key) {
        for(int i=0 ; i<matrix.length ; i++) {
            for(int j=0 ; j<matrix[0].length ; j++) {
                if(matrix[i][j] == key) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String args[]) {
        int matrix[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int key = 8;
        System.out.println(search(matrix, key));
    }
}