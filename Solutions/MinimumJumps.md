## Code
[View Code Here](../src/MinimumJumps.java)

# Problem:  MinimumJumps
**Platform:** gfg
**Problem link:** https://practice.geeksforgeeks.org/problems/minimum-number-of-jumps-1587115620/1
**Date solved: 2026-04-28**  
**Tags:** Array, Greedy

---
## What this shows and what this can be used for!

This solution demonstrates the greedy algorithm for finding the minimum number of jumps to reach the end of an array. It can be used in problems involving array traversal with constraints, like jump games or pathfinding with limited steps.

---
## Intuition

To minimize jumps, we need to always choose the position that allows reaching the farthest. We track the maximum reachable index and increment jumps when we reach the end of the current jump range.

---

## Approach (step-by-step)s
1. Initialize jumps to 0, maxReach to 0, and currentEnd to 0.
2. Handle base cases: if array length is 1, return 0; if first element is 0, return -1.
3. Iterate from 0 to n-2:
   - Update maxReach with the maximum of current maxReach and i + arr[i].
   - If i equals currentEnd, increment jumps and set currentEnd to maxReach.
   - If currentEnd <= i, return -1 (can't proceed).
4. Return the total jumps.

---

## Alternate Approaches / Methods
- Dynamic Programming: Use an array to store minimum jumps to each index, but less efficient.
- BFS: Treat as a graph where each index connects to reachable indices.

---

## Complexity
- Time: O(n)
- Space: O(1)

---

## Code
```java
public class MinimumJumps {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5,6,7,8,9 };
        System.out.println(new MinimumJumps().minJumps(arr));
    }

    public int minJumps(int[] arr) {
        int n = arr.length;

        if (n == 1) return 0;
        if (arr[0] == 0) return -1;

        int jumps = 0;
        int maxReach = 0;
        int currentEnd = 0;

        for (int i = 0; i < n - 1; i++) {
            maxReach = Math.max(maxReach, i + arr[i]);

            if (i == currentEnd) {
                jumps++;
                currentEnd = maxReach;

                if (currentEnd <= i) return -1;
            }
        }

        return jumps;
    }
}
```