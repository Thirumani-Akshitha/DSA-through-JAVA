/*
📝 LeetCode_Problem: 347. Top K Frequent Elements

📄 Description:
Given an integer array `nums` and an integer `k`, return the `k` most frequent elements.
You may return the answer in **any order**.

📥 Input:
- int[] nums: array of integers
- int k: number of top frequent elements to return

📤 Output:
- int[]: array of top k frequent elements

🔒 Constraints:
- 1 <= nums.length <= 10⁵
- -10⁴ <= nums[i] <= 10⁴
- k is in the range [1, the number of unique elements in the array]
- The answer is guaranteed to be unique

📌 Example 1:
Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]

📌 Example 2:
Input: nums = [1], k = 1
Output: [1]
*/

import java.util.*;

public class LC_347_TopKFrequentElementsHashMap {
    public int[] topKFrequent(int[] nums, int k) {
        // Step 1: Build frequency map
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Step 2: Convert to list and sort by frequency (descending)
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(freq.entrySet());
        entryList.sort((a, b) -> b.getValue() - a.getValue());

        // Step 3: Collect top k elements
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = entryList.get(i).getKey();
        }

        return result;
    }
}
