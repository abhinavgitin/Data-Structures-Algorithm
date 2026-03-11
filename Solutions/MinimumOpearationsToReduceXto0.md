## Code
[View Code Here](../src/MinimumOpearationsToReduceXto0.java)

# Problem:  MinimumOpearationsToReduceXto0
**Platform:** Leetcode
**Problem link:** https://leetcode.com/problems/minimum-operations-to-reduce-x-to-zero/
**Date solved: 2026-03-01**  
**Tags:** Array, Sliding Window

You are given an integer array nums and an integer x. In one operation, you can either remove the leftmost or the rightmost element from the array nums and subtract its value from x. Note that this modifies the array for future operations.

Return the minimum number of operations to reduce x to exactly 0 if it is possible, otherwise, return -1.

 

Example 1:

Input: nums = [1,1,4,2,3], x = 5

Output: 2

Explanation: The optimal solution is to remove the last two elements to reduce x to zero.

Example 2:

Input: nums = [5,6,7,8,9], x = 4

Output: -1

Example 3:

Input: nums = [3,2,20,1,1,3], x = 10

Output: 5

Explanation: The optimal solution is to remove the last three elements and the first two elements (5 operations in total) to reduce x to zero.

 

Constraints:

1 <= nums.length <= 105

1 <= nums[i] <= 104

1 <= x <= 109

---
## What this shows and what this can be used for!

This problem demonstrates the use of the sliding window technique to efficiently find subarrays with specific sums, which is a common pattern in array problems.

---
## Intuition

To minimize the number of operations to reduce x to 0 by removing elements from the ends, we need to maximize the length of the contiguous subarray in the middle that sums to totalSum - x, as the remaining elements will be the ones not removed.

---

## Approach (step-by-step)s
1. Compute the total sum of all elements in the array.
2. If the total sum equals x, return the length of the array since we need to remove all elements.
3. Initialize variables for sliding window: left pointer at 0, current sum at 0, maxLen as -1.
4. Iterate with right pointer from 0 to n-1:
   a. Add nums[right] to current sum.
   b. While current sum > totalSum - x and left <= right, subtract nums[left] and increment left.
   c. If current sum == totalSum - x, update maxLen with right - left + 1.
5. If maxLen != -1, return n - maxLen; else return -1.

---

## Alternate Approaches / Methods
- Brute force: Iterate over all possible subarrays and check if their sum equals totalSum - x, keeping track of the maximum length. Time: O(n^2), Space: O(1).
- Prefix sum with hashmap: Compute prefix sums and use a map to find if prefix[right] - prefix[left] == target, allowing O(n) time with O(n) space.

---

## Complexity
- Time: O(n)
- Space: O(1)

---

## Code
```java
class MinimumOpearationsToReduceXto0 {
    public int minOperations(int[] nums, int x) {
        int totalSum = 0;
        for (int num : nums)
            totalSum += num;
        if (totalSum - x == 0)
            return nums.length;
        int left = 0;
        int maxLen = -1;
        int sum = 0;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (left <= right && sum > totalSum - x) {
                sum -= nums[left++];
            }
            if (sum == totalSum - x) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }
        return (maxLen == -1) ? -1 : nums.length - maxLen;
    }
}
```