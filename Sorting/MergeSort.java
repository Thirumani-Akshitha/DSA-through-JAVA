package Sorting;
/*
🎯 LeetCode 75: Sort Colors

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

n == nums.length
1 <= n <= 300
nums[i] is either 0, 1, or 2.

*/

import java.util.ArrayList;

class MergeSort {
    public void sortColors(int[] nums) {
        int n = nums.length;
        mergeSort(nums, 0, n-1);
        }

        private void mergeSort(int[] nums,int low,int high){
            if(low>=high){
                return;}
             
            int mid = (low+high)/2;
            mergeSort(nums, low, mid);
            mergeSort(nums, mid+1, high);
            merge(nums, low, mid, high);
        }

        private void merge(int[] nums, int low, int mid, int high){
            ArrayList<Integer> temp = new ArrayList<>(); 
        int left = low;     
        int right = mid + 1;  


        while (left <= mid && right <= high) {
            if (nums[left] <= nums[right]) {
                temp.add(nums[left]);
                left++;
            } else {
                temp.add(nums[right]);
                right++;
            }
        }

        while (left <= mid) {
            temp.add(nums[left]);
            left++;
        }

        while (right <= high) {
            temp.add(nums[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            nums[i] = temp.get(i - low);
        }
    }
        
}
