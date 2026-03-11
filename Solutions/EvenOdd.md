## Code
[View Code Here](../src/EvenOdd.c)

# Problem:  EvenOdd
**Platform:** Codeforces
**Problem link:** https://codeforces.com/problemset/problem/318/A
**Date solved: 2026-03-07**  
**Tags:** math, sequence, odd, even

---
## What this shows and what this can be used for!

This problem demonstrates how to find the k-th number in a sequence where all odd numbers appear before all even numbers. It can be used in scenarios involving ordered sequences based on parity.

---
## Intuition

The sequence is arranged with all odd numbers first, followed by all even numbers. To find the k-th element, we need to determine if k is within the odd numbers or the even numbers, and then compute the corresponding value.

---

## Approach (step-by-step)s
1. Read the values of n and k from input.
2. Calculate the number of odd numbers up to n: oddCount = (n + 1) / 2.
3. If k is less than or equal to oddCount, the k-th number is the k-th odd number: 2 * k - 1.
4. Otherwise, the k-th number is the (k - oddCount)-th even number: 2 * (k - oddCount).

---

## Alternate Approaches / Methods
- Generate the sequence by iterating through numbers from 1 to n, collecting odds first then evens, but this is less efficient for large n.
- Use mathematical formulas directly without calculating oddCount separately.

---

## Complexity
- Time: O(1)
- Space: O(1)

---

## Code
```c
#include <stdio.h>
int main() {
    long long n, k, oddCount;
    scanf("%lld",&n);
    scanf("%lld",&k);
    oddCount = (n+1)/2;
    if ( k <= oddCount ) {
        printf("%lld",2*k-1);
    } else {
        printf("%lld",2*(k-oddCount));
    }
    return 0;
}
```