/*
    LeetCode Problem 9: Palindrome Number
    Difficulty: Easy

    Given an integer x, return true if x is a palindrome, and false otherwise.

    A palindrome is a number that reads the same forward and backward.

    Constraints:
    -2^31 <= x <= 2^31 - 1
    Time Limit: 1 sec

    Sample Input 1:
    x = 121

    Sample Output 1:
    true

    Sample Input 2:
    x = -121

    Sample Output 2:
    false

    Sample Input 3:
    x = 10

    Sample Output 3:
    false
*/

import java.util.Scanner;

public class LC7_PalindromeNumber {
    public boolean isPalindrome(int x) {
        int revNo = 0;
        int num = x;

        // Edge case: negative numbers and ending in 0 (but not 0 itself)
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        while (x > 0) {
            int rem = x % 10;
            x = x / 10;
            revNo = (revNo * 10) + rem;
        }

        return num == revNo;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = in.nextInt();

        LC7_PalindromeNumber obj = new LC7_PalindromeNumber();
        boolean result = obj.isPalindrome(x);

        System.out.println("Is Palindrome? " + result);
    }
}
