package Sorting;

/*
LeetCode 75. Sort Colors

Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

Example 1:
Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]

Example 2:
Input: nums = [2,0,1]
Output: [0,1,2]

Constraints:
- n == nums.length
- 1 <= n <= 300
- nums[i] is either 0, 1, or 2
*/


// Bubble Sort approach
class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        // Print result
        System.out.print("Bubble Sort Output: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}


// Selection Sort approach
class SelectionSortSolution {
    public void sortColors(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }

            // swap
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }

        // Print result
        System.out.print("Selection Sort Output: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

