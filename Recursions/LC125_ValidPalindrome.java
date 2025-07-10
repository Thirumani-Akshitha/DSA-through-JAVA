package Recursions;
/*
    🔹 Problem: 125. Valid Palindrome

    A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and 
    removing all non-alphanumeric characters, it reads the same forward and backward.

    Given a string s, return true if it is a palindrome, or false otherwise.

    🧪 Example 1:
    Input: s = "A man, a plan, a canal: Panama"
    Output: true

    🧪 Example 2:
    Input: s = "race a car"
    Output: false

    🧪 Example 3:
    Input: s = " "
    Output: true

    💡 Constraints:
    - 1 <= s.length <= 2 * 10^5
    - s consists only of printable ASCII characters.
*/

import java.util.Scanner;

public class LC125_ValidPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = in.nextLine();

        System.out.println("Is Valid Palindrome: " + isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        return check(s, 0, s.length() - 1);
    }

    public static boolean check(String s, int left, int right) {
        if (left >= right) return true;

        char l = s.charAt(left), r = s.charAt(right);

        if (!Character.isLetterOrDigit(l)) {
            return check(s, left + 1, right);
        } else if (!Character.isLetterOrDigit(r)) {
            return check(s, left, right - 1);
        } else if (Character.toLowerCase(l) != Character.toLowerCase(r)) {
            return false;
        } else {
            return check(s, left + 1, right - 1);
        }
    }
}
