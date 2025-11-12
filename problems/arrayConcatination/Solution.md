# Problem: Concatenation of Array
**Platform:** LeetCode
**Problem link:** https://leetcode.com/problems/concatenation-of-array/
**Date solved:** November 13, 2025
**Tags:** Array, Simulation

---
## What this shows and what this can be used for!
Demonstrates array manipulation and index mapping. Shows how to create a new array by concatenating an array with itself. Useful for understanding array operations and do-while loop usage.

---
## Intuition
Given an array `nums` of length `n`, we need to create a new array `ans` of length `2n` where `ans[i] = nums[i]` and `ans[i + n] = nums[i]` for all valid indices. Essentially, we're appending the array to itself.

---

## Approach (step-by-step)s
1. Get the length `n` of the input array `nums`
2. Create a result array of size `2 * n`
3. Use a do-while loop to iterate through indices from 0 to n-1
4. For each index `i`, assign `nums[i]` to both `result[i]` (first half) and `result[i + n]` (second half)
5. Return the result array

---

## Alternate Approaches / Methods
- Use a regular for loop instead of do-while
- Use System.arraycopy() to copy the array twice

---

## Complexity
- Time: O(n) where n is the length of the input array
- Space: O(n) for the result array (output space not counted in auxiliary space)

---

## Code
```java
public int[] getConcatenation(int[] nums) {
    int n = nums.length;
    int[] result = new int[2 * n];
    int i = 0;
    do {
        result[i] = nums[i];
        result[i + n] = nums[i];
        i++;
    } while (i < n);
    return result;
}
```