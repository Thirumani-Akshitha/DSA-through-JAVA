/*
Problem: Print the element that appears most frequently in the array.
If a tie exists, print the smaller element.

Input Format:
- First line: Integer n (size of array)
- Second line: n space-separated integers

Constraints:
- 1 ≤ n ≤ 1000
- -10^5 ≤ a[i] ≤ 10^5

Output Format:
- A single integer (most frequent element)

Sample Input:
5
1 2 2 3 1

Sample Output:
1
*/

import java.io.*;
import java.util.*;

public class MostFrequentElement {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = in.nextInt();
        }

        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int num : a){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int max_freq = 0;
        int result = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();

            if(count > max_freq){
                result = num;
                max_freq = count;
            }
            else if(count == max_freq && num < result){
                result = num;
            }
        }

        System.out.println(result);
    }
}
