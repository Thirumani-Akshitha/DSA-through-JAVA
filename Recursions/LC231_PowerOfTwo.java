package Recursions;
/*
    🔹 Problem: 231. Power of Two

    Given an integer n, return true if it is a power of two. Otherwise, return false.

    A number is a power of two if there exists an integer x such that n == 2^x.

    🧪 Example 1:
    Input: n = 1
    Output: true  // 2^0 = 1

    🧪 Example 2:
    Input: n = 16
    Output: true  // 2^4 = 16

    🧪 Example 3:
    Input: n = 3
    Output: false

    💡 Constraints:
    - -2^31 <= n <= 2^31 - 1
*/

import java.util.Scanner;

public class LC231_PowerOfTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();

        System.out.println("Is Power of Two: " + isPowerOfTwo(n));
    }

    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        if (n == 1) return true;
        if (n % 2 != 0) return false;
        return isPowerOfTwo(n / 2);
    }
}

