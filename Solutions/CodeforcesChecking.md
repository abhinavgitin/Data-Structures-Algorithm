## Code
[View Code Here](../src/CodeforcesChecking.java)

# Problem:  CodeforcesChecking
**Platform:** Codeforces
**Problem link:** 
**Date solved: 2026-03-12**  
**Tags:** string, substring, java

---
## What this shows and what this can be used for!

This code demonstrates a simple substring checking problem where we need to determine if a given string is a substring of "codeforces". It can be used for basic string manipulation tasks, input handling in competitive programming, and understanding how to use BufferedReader for reading input in Java.
## Intuition

---

## Approach (step-by-step)s
1. Read the number of test cases `t` from input.
2. For each test case:
   - Read the string `c` to check.
   - Use `str.contains(c)` to check if `c` is a substring of "codeforces".
   - Print "YES" if it is, "NO" otherwise.

## Alternate Approaches / Methods
- 
- 

---

## Complexity
- Time: O(t * n), where t is the number of test cases and n is the length of the string to check (since contains() is O(n)).
- Space: O(1), as we only use a constant amount of extra space.

## Code
```[java]

```