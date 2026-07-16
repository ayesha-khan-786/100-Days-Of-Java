// Print number of 7's in 2D Array

import java.util.*;

public class Q2 {
    public static int search(int array[][]) {
        int count = 0;
        for(int i=0 ; i<array.length ; i++) {
            for(int j=0 ; j<array[0].length ; j++) {
                if(array[i][j] == 7) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String args[]) {
        int[][] array = {{4, 7, 8},
                        {8, 8, 7}};

        System.out.println(search(array));
    }
}