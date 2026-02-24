## Code
[View Code Here](../src/CountOddNumbersInAnIntervalRange.c)

# Problem:  CountOddNumbersInAnIntervalRange
**Platform:** leetcode
**Problem link:** https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/
**Date solved: 2026-02-24**  
**Tags:** Math, Easy

---
## What this shows and what this can be used for!

This solution demonstrates an efficient mathematical approach to count odd numbers in a given range without iterating through each number, which is useful for large ranges where O(1) time complexity is preferred over O(n).

---
## Intuition

The number of odd numbers in a range [low, high] can be calculated using simple arithmetic. Since odd numbers alternate with even numbers, the count depends on the total numbers in the range and whether the starting number is odd or even.

---

## Approach (step-by-step)s
1. Calculate the total number of integers in the range: `count = high - low + 1`
2. If the count is even, the number of odd numbers is exactly `count / 2`
3. If the count is odd, check if `low` is odd:
   - If `low` is odd, add 1 to `count / 2`
   - If `low` is even, the number is `count / 2`

---

## Alternate Approaches / Methods
- Brute force: Iterate from `low` to `high` and count numbers where `num % 2 != 0`. This is O(n) time complexity.
- Mathematical formula: Use `(high + 1) / 2 - low / 2` to directly calculate the count.

---

## Complexity
- Time: O(1)
- Space: O(1)

---

## Code
```c
#include <stdio.h>

int main() {
    // take the input
    // i want it to be for int only
    printf("Enter the low and high values: ");
    int low, high;
    scanf("%d %d",&low,&high);
    int count = high - low + 1;
    if ( count % 2 == 0 ) {
        printf("%d",count/2);
    } else {
        int addOrNot = ( low % 2 != 0 )? 1 : 0;
        printf("%d",(count/2)+addOrNot);
    }
    return 0;
}
```