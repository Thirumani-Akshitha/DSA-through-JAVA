
//# Day 7 - Frequency of an Element in Array

//🧠 Problem:
//Given an array of integers and a target integer x, determine how many times x appears in the array.

//## 🧪 Sample Input:
//5
//1 2 2 3 1
//1



//## ✅ Sample Output:
//2


// 🔍 Approach:
//- Use a loop to count occurrences of the target.
//- For large input ranges, use a `HashMap` instead of array-based frequency counting.

// 📌 Java Code:

import java.util.*;

public class freqArray
 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int x = in.nextInt();
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(a[i] == x) count++;
        }

        System.out.println(count);
    }
}
