/*
    Problem: Check if a Number is Prime

    You are given an integer `n`. Return true if it is a prime number, otherwise return false.

    ➤ A prime number is a number greater than 1 that is not divisible by any other numbers except 1 and itself.

    Sample Input 1:
    7
    Output:
    true

    Sample Input 2:
    9
    Output:
    false

    Constraints:
    0 <= n <= 10^6
*/

import java.util.Scanner;

public class checkPrime {
    public boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        checkPrime sol = new checkPrime();
        System.out.println(sol.isPrime(n));
    }
}
