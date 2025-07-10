// LeetCode #7 – Reverse Integer
/*
Problem Statement:
Given a signed 32-bit integer x, return x with its digits reversed.
If reversing x causes the value to go outside the signed 32-bit integer range [-2^31, 2^31 - 1], then return 0.

Example 1:
Input: x = 123
Output: 321

Example 2:
Input: x = -123
Output: -321

Example 3:
Input: x = 120
Output: 21
*/

public class LC7_ReverseInteger {
    public static int reverse(int x) {
        int revNo = 0;
        while (x != 0) {
            int lastDigit = x % 10;

            // Check for overflow
            if (revNo > Integer.MAX_VALUE / 10 || revNo < Integer.MIN_VALUE / 10) {
                return 0;
            }

            revNo = revNo * 10 + lastDigit;
            x = x / 10;
        }
        return revNo;
    }

    public static void main(String[] args) {
        int input = 1534236469;
        System.out.println("Reversed Integer: " + reverse(input)); // Output: 0 (overflow)

        input = -456;
        System.out.println("Reversed Integer: " + reverse(input)); // Output: -654

        input = 120;
        System.out.println("Reversed Integer: " + reverse(input)); // Output: 21
    }
}
