## Code
[View Java Code](../src/XOR_Operation_In_An_Array.java)

# Problem: XOR Operation In An Array
**Platform:** LeetCode
**Problem link:** [Leetcode](https://leetcode.com/problems/xor-operation-in-an-array/description/) 
**Date solved:** 2025-10-24 


---
## What this shows and what this can be used for!
- to make out the difference in the data 
---
## Intuition
- use loop to add the data in the array 
- use xor to perform the required operation
---

## Approach (step-by-step)s
1. use loop to add the data in the array 
2. use xor to perform the required operation 

---

## Complexity
- Time: O(n)
- Space: O(1)

---

## Code
```[java]
public int xorOperation(int n, int start) {
        int[] nums = new int[n];
        for ( int i = 0 ; i < n ; i++ ){
            nums[i] = start + 2 * i ;
        }
        int xor = 0;
        for ( int num : nums ) {
            xor ^= num;
        }
        return xor;
    }
```