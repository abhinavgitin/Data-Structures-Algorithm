## Code
[View Code Here](../src/MinimumSizeSubArraySum.java)

# Problem:  MinimumSizeSubArraySum
**Platform:** Leetcode
**Problem link:** https://leetcode.com/problems/minimum-size-subarray-sum/
**Date solved: 2026-08-15**  
**Tags:** Sliding Window, Array, Two Pointers, Optimization

---
## What this shows and what this can be used for!
This solution demonstrates the **sliding window** technique to efficiently find the minimum length contiguous subarray with a sum greater than or equal to a target value. This pattern is useful for solving problems involving:
- Finding minimum/maximum length subarrays with specific sum conditions
- Optimizing brute force O(n²) solutions to O(n) linear time

---
## Intuition
Instead of checking every possible subarray (which would be O(n²)), use a two-pointer sliding window approach. Expand the window by moving the right pointer and adding elements. When the sum exceeds the target, shrink from the left while recording the minimum window size. Each element is visited at most twice (once by `end`, once by `start`), making it O(n).

---

## Approach (step-by-step)
1. Use two pointers (`start` and `end`) to maintain a sliding window, with a running `sum` of elements in the window
2. Iterate `end` from 0 to length-1, adding each element to `sum`
3. For optimization, if any single element >= target, return 1 immediately
4. While `sum > target`, calculate the current window length `(end - start + 1)` and update `minLength` if smaller
5. Remove `nums[start]` from sum and increment `start` to shrink the window
6. Return `minLength` if found, otherwise return 0

---

## Alternate Approaches / Methods
- **Prefix Sum + Binary Search**: Compute prefix sums and use binary search to find the minimum length window (O(n log n))
- **Brute Force**: Check all possible subarrays (O(n²)) - less efficient but easier to understand

---

## Complexity
- Time: O(n) - Each element is visited at most twice (once by end pointer, once by start pointer)
- Space: O(1) - Only using a few variables, no extra data structures

---

## Code
```java
class MinimumSizeSubArraySum {
    
    static void main() {
        int target = 15;
        int[] arr = {1,7,1,1,1,7,1};
        System.out.println(minSubArrayLen(target, arr));
    }
    
    public static int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int minLength = Integer.MAX_VALUE;
        int length = nums.length;
        int start = 0;
        int len = 0;
        
        for (int end = 0; end < length; end++) {
            // Optimization: if single element >= target, return 1
            if (nums[end] >= target) return 1;
            
            sum += nums[end];
            
            // Shrink window from left while sum > target
            while (sum > target) {
                len = (end - start) + 1;
                
                if (len < minLength) {
                    minLength = len;
                }
                sum -= nums[start];
                start++;
            }
        }
        
        if (minLength == Integer.MAX_VALUE)
            return 0;
        return minLength;
    }
}
```