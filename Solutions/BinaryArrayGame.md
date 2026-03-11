## Code
[View Code Here](../src/BinaryArrayGame.c)

# Problem:  BinaryArrayGame
**Platform:** Codeforces
**Problem link:** 
**Date solved: 2026-03-09**  
**Tags:** array, game theory

---
## What this shows and what this can be used for!

This problem demonstrates a simple game theory scenario where the outcome depends on the positions of zeros in a binary array. It can be used to understand decision-making in games based on array boundaries and basic conditional logic in C programming.

---
## Intuition

In this game between Alice and Bob with a binary array, Bob wins only if both the first and last elements are 0. Otherwise, Alice wins. This is because the game mechanics favor Alice unless the array is "closed" with zeros at both ends.

---

## Approach (step-by-step)s
1. Read the number of test cases (t).
2. For each test case:
   - Read the size of the array (n).
   - Read the array elements into an array.
   - Check if the first element (a[0]) and the last element (a[n-1]) are both 0.
   - If both are 0, print "Bob"; otherwise, print "Alice".

---

## Alternate Approaches / Methods
- The commented code in the file checks for any zero in the array, but that's incorrect as per the problem logic.
- Use dynamic arrays or vectors if n can be larger, but for small n (up to 105), a fixed-size array is fine.

---

## Complexity
- Time: O(t * n) where t is the number of test cases and n is the array size
- Space: O(n) for the array storage

---

## Code
```c
#include <stdio.h>

int main() {
    int t;
    scanf("%d", &t);
    while (t--) {
        int n;
        scanf("%d", &n);
        int a[105];
        for (int i = 0; i < n; i++) scanf("%d", &a[i]);

        // Bob wins ONLY if both first and last elements are 0
        if (a[0] == 0 && a[n-1] == 0) {
            printf("Bob\n");
        } else {
            printf("Alice\n");
        }
    }
    return 0;
}
```