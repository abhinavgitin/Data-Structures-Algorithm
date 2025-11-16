# Problem: Max Consecutive Ones
**Platform:** LeetCode
**Problem link:** [Leetcode](https://leetcode.com/problems/max-consecutive-ones/)
**Date solved:** November 17, 2025
**Tags:** Array, Counting, Sliding Window

---
## What this shows and what this can be used for!
This problem demonstrates tracking consecutive elements in an array and finding the maximum streak. It's useful for understanding basic array traversal, state management, and optimization techniques for counting problems.

---
## Intuition
To find the maximum number of consecutive 1's, we need to count continuous sequences of 1's and track the longest sequence. When we encounter a 0, we know the current sequence has ended, so we need to reset our counter and start fresh.

---

## Approach (step-by-step)s
1. Iterate through the array and count consecutive 1's
2. When a 1 is found, increment the counter
3. When a 0 is found, store the current count and reset the counter
4. After the loop, find the maximum count from all sequences
5. Return the maximum value

---

## Alternate Approaches / Methods
- **Optimized approach (commented in code)**: Instead of storing all counts in a list, maintain a running maximum using `Math.max()` - This saves space by avoiding the ArrayList
- **Two-pass vs One-pass**: The current implementation uses two passes (one to collect counts, one to find max), while the alternate approach does it in a single pass

---

## Complexity
- Time: O(n) - where n is the length of the array (single pass through the array)
- Space: O(n) - in worst case, the ArrayList stores n elements if array alternates between 0 and 1

**Note:** The optimized approach (commented in code) has O(1) space complexity.

---

## Code
```java
import java.util.ArrayList;

public class maxConsecutivesOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int max = 0;
        for ( int i : nums ){
            if ( i == 1 ) {
                max++;
            } else {
                list.add(max);
                max = 0;
            } 
        }
        list.add(max);
        for ( int i : list ){
            if ( i > max ){
                max = i;
            }
        }
        /* or do this 
        int element = 0;
        int max = 0;

        for (int i : nums) {
            if (i == 1) {
                element++;
                max = Math.max(max, element);
            } else {
                element = 0;
            }
        }

        return max; */
        return max;
    }
}
```