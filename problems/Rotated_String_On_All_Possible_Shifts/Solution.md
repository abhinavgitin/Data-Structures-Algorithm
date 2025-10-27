# Problem: Rotate the string on all possible shifts
**Platform:** LeetCode
**Problem link:** [LeetCode](https://leetcode.com/problems/rotate-string/description/)  
**Date solved:** 2025-10-23


---
## What this shows and what this can be used for!
- This shows how to handel the string with respect to other string 
---
## Intuition
- if the length of the string s and the goal was not equal then the rotation was impossible and it would straight return false
- the goal should contain all the characters as of the string s

- a more simple way to understand the s+s concatination :
s = "abcde"
s + s = "abcde" + "abcde" = "abcdeabcde"

### When i rotate a string you're moving characters from the **left to the right**. Let's see all possible rotations:
```Original:  "abcde"
Rotate 1:  "bcdea"  (moved 'a' to end)
Rotate 2:  "cdeab"  (moved 'ab' to end)
Rotate 3:  "deabc"  (moved 'abc' to end)
Rotate 4:  "eabcd"  (moved 'abcd' to end)
Rotate 5:  "abcde"  (back to original)
```
### Now look at `s + s = "abcdeabcde"`:
```
"abcdeabcde"
 ^^^^^        → "abcde" (0 rotations)
  ^^^^^       → "bcdea" (1 rotation)
   ^^^^^      → "cdeab" (2 rotations)
    ^^^^^     → "deabc" (3 rotations)
     ^^^^^    → "eabcd" (4 rotations)
```
---

## Approach (step-by-step)s
1. check the length 
2. when we combine the string s with itself then we get the total of whole solution or say the characters in the same order that the goal string can have
3. so we check that if anyone of the sequence of the characters in s+s concatination matches with the goal if yes return true if not false

---

## Alternate Approaches / Methods
- use subset with loop for then shift the each letter to te right and on each step check 
- does ot match with the goal if yes then return true at that point itself

---

## Complexity
- Time: O(n)
- Space: O(n) -> here s+s creates a extra space 

---

## Code
```[java]
class Solution {
    public boolean rotateString(String s, String goal) {
        // If lengths don't match, rotation is impossible
        return s.length() == goal.length() && (s + s).contains(goal);
    }
}
```