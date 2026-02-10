# Problem:  Square
**Platform:** Codeforces
**Problem link:** https://codeforces.com/contest/122/problem/A
**Date solved: 2026-02-11**  
**Tags:** geometry, simple

---
## What this shows and what this can be used for!

This solution demonstrates basic input handling in C, reading multiple test cases and performing simple equality checks. It can be used as a template for problems requiring multiple test cases with array input and conditional output.

---
## Intuition

To determine if four given side lengths can form a square, all four sides must be of equal length.

---

## Approach (step-by-step)s
1. Read the number of test cases `t`.
2. For each test case:
   - Read four integers representing the side lengths into an array `a`.
   - Check if all four elements are equal (`a[0] == a[1] && a[1] == a[2] && a[2] == a[3]`).
   - Print "YES" if equal, otherwise "NO".

---

## Alternate Approaches / Methods
- Use a loop to check equality instead of chained conditions, but the current approach is efficient and clear.
- Read inputs directly without array, but array makes it cleaner for four values.

---

## Complexity
- Time: O(t) where t is the number of test cases, as each test case involves constant-time operations.
- Space: O(1) as only a fixed-size array is used.

---

## Code
```c
#include <stdio.h>
int main() {
    int t;
    scanf("%d", &t);

    while (t-- > 0) {
        int a[4];
        for (int i = 0; i < 4; i++) {
            scanf("%d", &a[i]);
        }

        printf(
            a[0]==a[1] && a[1]==a[2] && a[2]==a[3]
            ? "YES\n"
            : "NO\n"
        );
    }
    return 0;
}
```