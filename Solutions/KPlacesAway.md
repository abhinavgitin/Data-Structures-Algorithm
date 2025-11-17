## Code
[View Java Code](../src/KPlacesAway.java)

# Problem: Check if all 1's are at least k places away
**Platform:** LeetCode  
**Problem link:** https://leetcode.com/problems/check-if-all-1s-are-at-least-length-k-places-away/  
**Date solved:**  
**Tags:** array, greedy, two-pointers

---

## What this shows and what this can be used for!
Simple greedy scan that verifies spacing between 1s in a binary array. Useful pattern: track last-seen index and check distance to current index.

---

## Intuition
Keep the index of the previous 1. For each new 1, compute the number of zeros between it and the previous 1 as (currentIndex - previousIndex - 1). If that number is less than k, spacing requirement is violated. If no previous 1 exists, just record the index.

---

## Approach (step-by-step)s
1. Initialize previousIdx = -1 (means no 1 seen yet).  
2. Iterate i from 0 to nums.length-1:
   - If nums[i] == 1:
     - If previousIdx != -1 and (i - previousIdx - 1) < k, return false.
     - Set previousIdx = i.
3. If loop finishes, return true.

Edge cases:
- No 1s or only one 1 -> return true.
- k = 0 -> always true (algorithm covers this).

---

## Alternate Approaches / Methods
- Use a sliding window or count consecutive zeros between ones; equivalent in complexity.
- Transform indices of ones into a list and check adjacent differences (uses O(m) extra space where m = number of ones).

---

## Complexity
- Time: O(n) where n = nums.length (single pass).  
- Space: O(1) extra space.

---

## Code
```java
// Example Java solution (also available at ../src/KPlacesAway.java)
public class KPlacesAway {
    public static void main(String[] args) {
        KPlacesAway kpa = new KPlacesAway();
        int[] nums = {1,0,0,1,0,1};
        int k = 2;
        boolean result = kpa.kLengthApart(nums, k);
        System.out.println(result); // false
    }

    public boolean kLengthApart(int[] nums, int k) {
        int previousIdx = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                if (previousIdx != -1) {
                    if (i - previousIdx - 1 < k) return false;
                }
                previousIdx = i;
            }
        }
        return true;
    }
}