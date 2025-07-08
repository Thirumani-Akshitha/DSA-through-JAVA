// LeetCode #1295 – Find Numbers with Even Number of Digits
/*
Problem Statement:
Given an array nums of integers, return how many of them contain an even number of digits.

Example 1:
Input: nums = [12,345,2,6,7896]
Output: 2

Example 2:
Input: nums = [555,901,482,1771]
Output: 1

Constraints:
- 1 <= nums.length <= 500
- 1 <= nums[i] <= 10^5
*/

public class LC1295_FindEvenDigitNumbers {
    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            int digits = 0;
            while (num > 0) {
                num = num / 10;
                digits++;
            }
            if (digits % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println("Even digit numbers count: " + findNumbers(nums)); // Output: 2
    }
}
