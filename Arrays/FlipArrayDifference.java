package Arrays;

// Question: For each element (0 to 9), compute flipped value (9 - a[i]) 
// and print absolute difference of sum(original) and sum(flipped)
// Sample Input: 3 → 1 2 3
// Sample Output: 15

import java.io.*;
import java.util.*;

public class FlipArrayDifference {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int sum = 0, flippedSum = 0;

        for (int i = 0; i < n; i++) {
            sum += a[i];
            flippedSum += 9 - a[i];
        }

        int diff = Math.abs(sum - flippedSum);
        System.out.println(diff);
    }
}

