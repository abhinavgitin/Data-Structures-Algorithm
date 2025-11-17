# Problem:  Shuffle string 
**Platform:** LeetCode
**Problem link:** [Leetcode](https://leetcode.com/problems/shuffle-string/description/)
**Date solved:** 2025-10-27


---
## What this shows and what this can be used for!
- how to handel the string indices and the use fo the char array
---
## Intuition
- i was to shuffle the string as per the indices in the array the each character should be in the position as the indices are given in the arr
---

## Approach (step-by-step)s
1. use a char array to store the specific char at that position given in the arr
2. i will be done using that we go to that position in the arr by arr[indices] and the store the string.charat(i) simply 
3. then convert and return the arr using the new String (arr);

---

## Complexity
- Time: O(n)
- Space: O(n)

---

## Code
```[java]
public String restoreString(String s, int[] indices) {
        char[] arr = new char[indices.length];
        int j = 0;
        for ( int i : indices ){
            arr[i] = s.charAt(j);
            j++;
        }
        return new String(arr);
    }
```