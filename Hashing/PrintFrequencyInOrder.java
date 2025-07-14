/*
📝 Question:
Given an array, print each element and its frequency in the order of appearance.

📥 Input Format:
- First line: Integer n
- Second line: n space-separated integers

📌 Constraints:
- 1 ≤ n ≤ 1000
- -10⁵ ≤ a[i] ≤ 10⁵

📤 Output Format:
- Each element and frequency in a new line.

📌 Sample Input 0:
5
1 2 2 3 1

📌 Sample Output 0:
1 2
2 2
3 1
*/

import java.io.*;
import java.util.*;

public class PrintFrequencyInOrder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input reading
        int n = in.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        // Use LinkedHashMap to preserve order of appearance
        LinkedHashMap<Integer, Integer> freq = new LinkedHashMap<>();

        // Frequency calculation
        for (int num : a) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Output result
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
