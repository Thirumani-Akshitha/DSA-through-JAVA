/*
    Problem: Hollow Square Star Pattern

    Ninja has been given a task to print the required star pattern and he asked your help for the same.
    You must return an ‘N’ x ‘N’ matrix corresponding to the given star pattern.

    Constraints:
    1 <= N <= 100
    Time Limit: 1 sec

    Sample Input 1:
    4

    Sample Output 1:
    ****
    *  *
    *  *
    ****

    Explanation:
    - First and last rows are filled with stars.
    - All middle rows start and end with a star, and have spaces in between.
*/

import java.util.Scanner;

public class HollowSquarePattern {
    public static void getStarPattern(int n) {
        for (int i = 1; i <= n; i++) {
            // First and last rows
            if (i == 1 || i == n) {
                for (int j = 1; j <= n; j++) {
                    System.out.print("*");
                }
            } else {
                // Middle rows: star + spaces + star
                System.out.print("*");
                for (int j = 1; j <= n - 2; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        getStarPattern(n);
    }
}
