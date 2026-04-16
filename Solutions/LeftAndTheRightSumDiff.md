# Problem: Left and Right Sum Differences
**Platform:** Leetcode
**Problem link:** https://leetcode.com/problems/left-and-right-sum-differences/
**Date solved: 2026-04-13**  
**Tags:** Array, Prefix Sum

---
## What this shows and what this can be used for!

This problem demonstrates how to compute the absolute difference between the sum of elements to the left and right of each element in an array. It can be used in scenarios where you need to analyze symmetry or balance in array elements relative to their positions.

---
## Intuition

For each element in the array, we need to find the sum of all elements before it (left sum) and after it (right sum), then compute the absolute difference between these two sums.

---

## Approach (step-by-step)
1. Initialize an array `diff` of the same length as `nums` to store the results.
2. For each index `i` from 0 to `nums.length - 1`:
   - Calculate `leftSum` by summing all elements from index 0 to `i-1`.
   - Calculate `rightSum` by summing all elements from index `i+1` to `nums.length - 1`.
   - Compute the difference as `rightSum - leftSum`.
   - Store the absolute value of this difference in `diff[i]`.
3. Return the `diff` array.

---

## Alternate Approaches / Methods
- **Prefix Sum Approach**: Compute the total sum of the array first. Then, maintain a running left sum as you iterate through the array. For each position, right sum can be calculated as total sum minus left sum minus current element. This reduces time complexity to O(n).
- **Two-Pass Approach**: First pass to compute prefix sums, second pass to compute suffix sums, then compute differences.

---

## Complexity
- Time: O(n²) due to nested loops for each element
- Space: O(1) extra space (excluding the output array)

---

## Code
```java
public int[] leftRightDifference(int[] nums) {
    int leftSum = 0;
    int rightSum = 0;
    int length = nums.length;
    int[] diff = new int[length];
    for (int i = 0; i < length; i++) {
        for (int j = 0; j < i; j++) {
            leftSum += nums[j];
        }
        for (int j = i + 1; j < length; j++) {
            rightSum += nums[j];
        }
        int sum = rightSum - leftSum;
        diff[i] = (sum >= 0) ? sum : sum * -1;
        rightSum = 0;
        leftSum = 0;
    }
    return diff;
}
```