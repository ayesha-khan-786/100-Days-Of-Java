// Day 15 - 2D Arrays - Spiral Matrix
// Date - 12/07/2026
import java.util.*;

public class Q1 {
    public static void printSpiral(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while(startRow <= endRow && startCol <= endCol) {
            // Print Top
            for(int j=startCol ; j<=endCol ; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            // Print Right
            for(int i=startRow+1 ; i<=endRow ; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            // Print Bottom
            for(int j=endCol-1 ; j>=startCol ; j--) {
                if(startRow == endRow) {
                    return;
                }
                System.out.print(matrix[endRow][j] + " ");
            }

            // Print left
            for(int i=endRow-1 ; i>=startRow+1 ; i--) {
                if(startCol == endCol) {
                    return;
                }
                System.out.print(matrix[i][startCol] + " ");
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
            System.out.println();
    }
    public static void main(String args[]) {
        int matrix[][] = {{1, 2, 3, 4},
                            {5, 6, 7, 8},
                            {9, 10, 11, 12},
                            {13, 14, 15, 16}};

        printSpiral(matrix);
    }
}