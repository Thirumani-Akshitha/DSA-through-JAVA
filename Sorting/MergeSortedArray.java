package Sorting;
/*
🎯 LeetCode 88: Merge Sorted Array

Problem:
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums2 into nums1 as one sorted array. Modify nums1 in-place.

Example:
Input:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

Output:
[1,2,2,3,5,6]

Constraints:
- nums1.length == m + n
- nums2.length == n
*/

import java.util.*;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int left = 0;
        int right = 0;
        List<Integer> temp = new ArrayList<>();

        while (left < m && right < n) {
            if (nums1[left] <= nums2[right]) {
                temp.add(nums1[left++]);
            } else {
                temp.add(nums2[right++]);
            }
        }

        while (left < m) {
            temp.add(nums1[left++]);
        }

        while (right < n) {
            temp.add(nums2[right++]);
        }

        for (int i = 0; i < m + n; i++) {
            nums1[i] = temp.get(i);
        }
    }
}
