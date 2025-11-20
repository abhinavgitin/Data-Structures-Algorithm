## Code
[View Code Here](../src/SpecialArrayEvenOdd.java)

# Problem:  SpecialArrayEvenOdd
**Platform:** Leetcode
**Problem link:** [LeetCode](https://leetcode.com/problems/special-array-i/)
**Date solved: 2025-11-21**  
**Tags:** Array, Parity

---
## What this shows and what this can be used for!
Checks if array elements alternate between even and odd.

---
## Intuition
An array is special if it strictly alternates between even and odd numbers.

---

## Approach (step-by-step)s
1. Determine initial parity from first element.
2. For each subsequent element, check if it alternates from previous.
3. Toggle expected parity after each check.
4. Return false if any mismatch, else true.

---

## Complexity
- Time: O(n)
- Space: O(1)

---

## Code
```java
public boolean isArraySpecial(int[] nums) {
    if (nums.length == 0) return true;
    boolean isEven = (nums[0] % 2 == 0);
    for (int i = 1; i < nums.length; i++) {
        if (isEven == (nums[i] % 2 == 0)) return false;
        isEven = !isEven;
    }
    return true;
}
```