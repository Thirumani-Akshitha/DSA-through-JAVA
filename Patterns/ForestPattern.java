/*
    Problem: N-dimensional Forest

    Sam is making a forest visualizer. An N-dimensional forest is represented by an NxN pattern filled with '*'.
    For every value of ‘N’, help Sam to print the corresponding forest.

    Constraints:
    1 <= N <= 25
    Time Limit: 1 sec

    Sample Input 1:
    3

    Sample Output 1:
    * * *
    * * *
    * * *

    Sample Input 2:
    1

    Sample Output 2:
    *

    Sample Input 3:
    4

    Sample Output 3:
    * * * *
    * * * *
    * * * *
    * * * *

    Explanation:
    For N = 3, fill all rows and columns in a 3x3 matrix with '*'.
*/

import java.util.Scanner;

public class ForestPattern {
    public static void nForest(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to next line after each row
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        nForest(n);
    }
}
