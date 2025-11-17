## Code
[View Java Code](../src/Power_Of_Two.java)

# Problem: Power Of Two
**Platform:** LeetCode
**Problem link:** [Leetcode](https://leetcode.com/problems/power-of-two/)
**Date solved:**  2025-10-26

---
## What this shows and what this can be used for!
- Understanding bitwise operations
- Using bit manipulation for efficient solutions
- Working with powers of two in binary form
---
## Intuition
In binary representation, powers of 2 have exactly one '1' bit and all other bits are '0'. For example:
- 2^0 = 1 = (0001)₂
- 2^1 = 2 = (0010)₂
- 2^2 = 4 = (0100)₂
- 2^3 = 8 = (1000)₂

---
## Approach (step-by-step)
1. Check if n > 0 to handle negative numbers and zero
2. Use n & (n-1) to check if n has exactly one set bit
3. If n & (n-1) is zero and n > 0, then n is a power of 2

---
## Alternate Approaches / Methods
- Using logarithm: check if log₂(n) is an integer
```java
if (n <= 0) return false;
return (Math.log(n) / Math.log(2)) % 1 == 0;
```
- Using bit count: count number of set bits (should be exactly 1)
```java
return n > 0 && Integer.bitCount(n) == 1;
```

---
## Complexity
- Time: O(1)
- Space: O(1)

---
## Code
```java
class Solution {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n-1)) == 0;
    }
}
```