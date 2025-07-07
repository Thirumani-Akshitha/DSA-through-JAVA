/*
    Problem: N-Binary Number Triangle

    Aryan and his friends are very fond of patterns. For a given integer ‘N’,
    they want to make the N-Binary Number Triangle.

    You are required to print the pattern as shown below.

    Constraints:
    1 <= N <= 20
    Time Limit: 1 sec

    Sample Input 1:
    3

    Sample Output 1:
    1
    0 1
    1 0 1

    Explanation:
    - Row 1 starts with 1
    - Row 2 starts with 0, alternates with 1
    - Row 3 starts with 1, then 0, then 1, and so on
    - Each row alternates between 0 and 1
*/

import java.util.Scanner;

public class BinaryNumberTriangle {
    public static void nBinaryTriangle(int n) {
        int start;
        for (int i = 0; i < n; i++) {
            // Set starting value based on row index (even/odd)
            start = (i % 2 == 0) ? 1 : 0;

            for (int j = 0; j <= i; j++) {
                System.out.print(start + " ");
                start = 1 - start; // Toggle between 0 and 1
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        nBinaryTriangle(n);
    }
}
