## Code
[View Code Here](../src/StringWithoutAAAOrBBB.java)

# Problem:  StringWithoutAAAOrBBB
**Platform:** leetcode
**Problem link:** https://leetcode.com/problems/string-without-aaa-or-bbb/
**Date solved: 2026-03-30**  
**Tags:** String, Greedy

---
## What this shows and what this can be used for!

This problem demonstrates a greedy algorithm for constructing strings with constraints on consecutive identical characters. It can be used in scenarios where we need to generate sequences with specific counts and repetition limits, such as in data encoding or pattern generation.

---
## Intuition

The task is to create a string consisting of exactly 'a' number of 'a's and 'b' number of 'b's, without having three identical characters in a row. A greedy approach works by always preferring to append the character with the higher remaining count, while ensuring we don't create three consecutive same characters.

---

## Approach (step-by-step)s
1. Initialize a StringBuilder to build the result string and an index counter.
2. While there are remaining 'a's or 'b's:
   - If the last two characters are the same, append the opposite character to avoid three in a row.
   - Otherwise, append the character that has more remaining count (prefer 'a' if a > b, else 'b').
   - Decrement the count of the appended character and increment the index.
3. Return the constructed string.

---

## Alternate Approaches / Methods
- Use a priority queue to always pick the character with the highest count, but this might be overkill for two characters.
- Calculate the maximum allowed consecutive characters and build in batches.

---

## Complexity
- Time: O(a + b)
- Space: O(a + b)

---

## Code
```java
class StringWithoutAAAOrBBB {
    public static void main(String[] args) {
        StringWithoutAAAOrBBB obj = new StringWithoutAAAOrBBB();
        System.out.println(obj.strWithout3a3b(1, 3));
    }

    public String strWithout3a3b(int a, int b) {
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        while (a > 0 || b > 0) {
            if (idx > 1 && sb.charAt(idx - 1) == sb.charAt(idx - 2)) {
                if (sb.charAt(idx - 1) == 'a') {
                    sb.append("b");
                    b--;
                } else {
                    sb.append("a");
                    a--;
                }
                idx++;
                continue;
            }
            if (a > b) {
                sb.append("a");
                a--;
            } else {
                sb.append("b");
                b--;
            }
            idx++;
        }
        return sb.toString();
    }
}
```