/*
    🔹 Problem: 509. Fibonacci Number

    The Fibonacci numbers, commonly denoted F(n), form a sequence such that:
    F(0) = 0, F(1) = 1
    F(n) = F(n - 1) + F(n - 2) for n > 1

    🧪 Example 1:
    Input: n = 2
    Output: 1

    🧪 Example 2:
    Input: n = 3
    Output: 2

    🧪 Example 3:
    Input: n = 4
    Output: 3

    💡 Constraints:
    - 0 <= n <= 30
*/

import java.util.Scanner;

public class LC509_FibonacciNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = in.nextInt();

        System.out.println("Fibonacci Number is: " + fib(n));
    }

    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
