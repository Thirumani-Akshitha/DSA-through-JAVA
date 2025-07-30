

// Question: Compute the sum of absolute differences between adjacent elements in the array
// Sample Input: 3 → 1 3 5
// Sample Output: 4

import java.io.*;
import java.util.*;

public class sumAbsDifference {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int diff = 0;
        for (int i = 0; i < n - 1; i++) {
            diff += Math.abs(a[i] - a[i + 1]);
        }

        System.out.println(diff);
    }
}

