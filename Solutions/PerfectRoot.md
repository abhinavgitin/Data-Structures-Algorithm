## Code
[View Code Here](../src/PerfectRoot.c)

# Problem:  PerfectRoot
**Platform:** codeforces
**Problem link:** 
**Date solved: 2026-02-20**  
**Tags:** Math, Implementation

---
## What this shows and what this can be used for!

This solution demonstrates how to handle multiple test cases in competitive programming and generate perfect squares for a given range. It can be used in problems requiring output of mathematical sequences or computations for each test case.

---
## Intuition

The problem involves processing multiple test cases where for each test case, we need to output the perfect squares (i*i) for integers i from 1 to x. A straightforward approach is to iterate through each number and compute its square.

---

## Approach (step-by-step)s
1. Read the number of test cases n from input.
2. For each test case (loop n times):
   a. Read the value x.
   b. Loop from i = 1 to x, compute i*i and print it followed by a space.
3. After printing all squares for a test case, print a newline.

---

## Alternate Approaches / Methods
- Using math library: Instead of i*i, use pow(i, 2) from <math.h>, but multiplication is more efficient.
- Precompute squares: If x is large and multiple queries, precompute squares up to max x, but here it's per test case.

---

## Complexity
- Time: O(sum of x over all test cases) - For each test case, we loop up to x.
- Space: O(1) - No extra space used beyond variables.

---

## Code
```[c]
#include <stdio.h>
#include <math.h>
int main(){
    int n;
    scanf("%d",&n);
    while ( n-- ) {
        int x;
        scanf("%d",&x);
        for ( int i = 1; i <= x ; i++ ) {
            printf("%d ", i*i);
        }
        printf("\n");
    }
    return 0;
}
```