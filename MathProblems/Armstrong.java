/*
    LeetCode-style Problem: Check if the Number is Armstrong
    Difficulty: Easy

    You are given an integer `n`. You need to check whether it is an Armstrong number or not.
    Return true if it is an Armstrong number, otherwise return false.

    ➤ An Armstrong number is a number which is equal to the sum of its digits each raised to the 
      power of the number of digits.

    Examples:

    Input: n = 153
    Output: true
    Explanation:
        Number of digits = 3
        1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153 → Armstrong number ✅

    Input: n = 12
    Output: false
    Explanation:
        Number of digits = 2
        1^2 + 2^2 = 1 + 4 = 5 → Not an Armstrong number ❌

    Constraints:
    0 <= n <= 10^8
    Time Limit: 1 sec
*/

import java.util.Scanner;

public class Armstrong {
    public boolean isArmstrong(int n) {
        int num = n;
        int noOfDigits = 0, result = 0, resultPow;

        int temp = n;
        while (temp > 0) {
            temp = temp / 10;
            noOfDigits++;
        }

        temp = n;
        while (temp > 0) {
            int rem = temp % 10;
            temp = temp / 10;
            resultPow = (int) Math.pow(rem, noOfDigits);
            result += resultPow;
        }

        return result == num;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        Armstrong sol = new Armstrong();
        System.out.println(sol.isArmstrong(n));
    }
}
