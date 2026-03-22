# Problem:  Arranging Coins
**Platform:** leetcode
**Problem link:** 
**Date solved: 2026-03-14**  
**Tags:** Math, Simulation

---
## What this shows and what this can be used for!

This problem demonstrates how to find the maximum number of complete rows that can be formed with a given number of coins, where each row i contains exactly i coins.

---
## Intuition

The problem involves arranging coins into rows where the k-th row has exactly k coins. We need to find the largest k such that the total coins used (sum from 1 to k) is less than or equal to n. This can be solved by simulating the process of building rows one by one.

## Approach (step-by-step)s
1. Initialize `steps` to 1, representing the number of coins needed for the first row.
2. While `n` is greater than 0:
   - Subtract `steps` from `n`.
   - If `n` is less than or equal to `steps`, return `steps` as the maximum complete rows.
   - Otherwise, increment `steps` to prepare for the next row.
3. If the loop exits without returning, return -1 (though this shouldn't happen for valid inputs).

## Alternate Approaches / Methods
- **Mathematical Formula:** Use the quadratic formula to solve for k in k*(k+1)/2 <= n. The solution is k = floor((-1 + sqrt(1 + 8*n)) / 2).
- **Binary Search:** Perform binary search on the possible values of k from 1 to n to find the maximum k where k*(k+1)/2 <= n.

---

## Complexity
- Time: O(sqrt(n)) - The loop runs until steps reaches approximately sqrt(2*n).
- Space: O(1) - Only a few variables are used.

---

## Code
```java
class ArrangingCoins {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(5));
    }
    public static int arrangeCoins(int n) {
        int steps = 1;
        while ( n > 0 ) {
            n -= steps;
            if ( n <= steps ) return steps;
            steps++;
        }
        return -1;
    }
}
```
