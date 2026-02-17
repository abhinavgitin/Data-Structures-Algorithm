## Code
[View Code Here](../src/SquareYear.c)

# Problem:  SquareYear
**Platform:** Codeforces
**Problem link:** 
**Date solved: 2026-02-17**  
**Tags:** math, perfect-square

---
## What this shows and what this can be used for!
This code demonstrates how to check if a given number (year) is a perfect square using the square root function. It can be used in scenarios where you need to validate if a number is a perfect square efficiently.

---
## Intuition
The problem requires determining if a given year is a perfect square. If it is, output 0 and the square root; otherwise, output -1. This involves computing the square root and checking if squaring it back gives the original number.

---

## Approach (step-by-step)s
1. Read the number of test cases `t`.
2. For each test case:
   a. Read the year as a string `s` (assuming 4 characters).
   b. Convert the string to an integer `year` using `atoi`.
   c. Compute the integer square root `r` by casting `sqrt(year)` to int.
   d. Check if `r * r == year`.
   e. If true, print "0 " followed by `r`.
   f. If false, print "-1".

---

## Alternate Approaches / Methods
- Use binary search to find the square root without using the math library's sqrt function.
- Iterate from 1 to sqrt(year) to find if any number squares to year, but this is less efficient.

---

## Complexity
- Time: O(t) where t is the number of test cases, as sqrt operation is O(1) for practical purposes.
- Space: O(1), using constant extra space.

---

## Code
```c
#include <stdio.h>
#include <math.h>
#include <stdlib.h>

int main() {
    int t;
    scanf("%d", &t);

    while (t--) {
        char s[5];
        scanf("%s", s);

        int year = atoi(s);   // convert string to integer

        int r = (int)sqrt(year);

        if (r * r == year) {
            // valid perfect square
            printf("0 %d\n", r);
        } else {
            // impossible
            printf("-1\n");
        }
    }

    return 0;
}
```