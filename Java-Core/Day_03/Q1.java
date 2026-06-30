// Day 03 - Binary Search
// Date - 30/06/2026
import java.util.*;

public class Q1 {
    public static int binarySearch(int numbers[], int key) {
    
    int start = 0, end = numbers.length-1;

    while(start <= end) {
        int mid = (start + end) / 2;

        if(key == numbers[mid]) {
            return mid;
        }
        if(key > numbers[mid]) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }
    }
    return -1;
}

public static void main(String args[]) {
    int numbers[] = {2, 4, 6, 8, 10, 12, 14};
    int key = 10;

    System.out.print(binarySearch(numbers, key));
    }
}