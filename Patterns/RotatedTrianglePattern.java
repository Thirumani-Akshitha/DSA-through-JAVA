/*
    Problem: N-Star Rotated Triangle

    Ninja was very fond of patterns. For a given integer ‘N’, he wants to make the N-Star Rotated Triangle.

    Constraints:
    1 <= N <= 20
    Time Limit: 1 sec

    Sample Input 1:
    3

    Sample Output 1:
    *
    **
    ***
    **
    *

    Explanation:
    The pattern first increases line-by-line up to N stars and then decreases.
    For N = 3:
      Line 1: 1 star
      Line 2: 2 stars
      Line 3: 3 stars
      Line 4: 2 stars
      Line 5: 1 star
*/

import java.util.Scanner;

public class RotatedTrianglePattern {
    public static void nStarTriangle(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i;
            if (i > n) {
                stars = 2 * n - i;
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        nStarTriangle(n);
    }
}
