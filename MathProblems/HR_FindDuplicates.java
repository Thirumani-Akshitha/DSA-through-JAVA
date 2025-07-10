
// HackerRank – Print Duplicate Elements in Order of First Appearance
/*
Problem Statement:
You are given an array of n integers. Print all elements that appear more than once,
only once each, and in the order of their first appearance.

If no element appears more than once, print nothing.

Input Format:
First line: Integer n (number of elements)
Second line: n space-separated integers

Constraints:
1 ≤ n ≤ 1000
-10^5 ≤ a[i] ≤ 10^5

Sample Input:
7
1 2 2 3 3 1 2

Sample Output:
1 2 3
*/

import java.util.*;

public class HR_FindDuplicates {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = in.nextInt();

        int[] a = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

        for (int num : a) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.print("Duplicate elements: ");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.print(entry.getKey() + " ");
            }
        }

        in.close();
    }
}
