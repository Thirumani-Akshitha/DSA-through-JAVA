/*
 
LeetCode que: 414. Third Maximum Number

Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.

Example 1:

Input: nums = [3,2,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2.
The third distinct maximum is 1.

Constraints:

1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1
 
 */

 class LC414_thirdLargestNumber {

    public int thirdMax(int[] nums) {
        Integer l = nums[0];
        Integer sl = null;
        Integer tl = null;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == l || (sl != null && nums[i] == sl) || (tl != null && nums[i] == tl)) {
                continue; 
            }

            if (nums[i] > l) {
                tl = sl;
                sl = l;
                l = nums[i];
            } else if (sl == null || nums[i] > sl) {
                tl = sl;
                sl = nums[i];
            } else if (tl == null || nums[i] > tl) {
                tl = nums[i];
            }
        }

        return tl != null ? tl : l;
    }
}
