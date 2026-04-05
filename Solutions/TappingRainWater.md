# Problem: Trapping Rain Water
**Platform:** LeetCode
**Problem link:** https://leetcode.com/problems/trapping-rain-water/
**Date solved: 2026-04-03**  
**Tags:** Array, Two Pointers, Dynamic Programming, Stack

---
## What this shows and what this can be used for!

This solution demonstrates how to calculate the amount of rainwater that can be trapped between bars of different heights in a 2D elevation map. It uses a dynamic programming approach by precomputing the maximum heights to the left and right of each position, which is useful for problems involving finding trapped areas or maximum boundaries in arrays.

---
## Intuition

For each position in the array, the amount of water that can be trapped is determined by the minimum of the maximum heights to the left and right of that position, minus the height at that position. This ensures that water doesn't spill over the shorter boundary.

---

## Approach (step-by-step)
1. Initialize two arrays, `leftMax` and `rightMax`, to store the maximum heights to the left and right of each index.
2. Compute `leftMax` by iterating from left to right, where `leftMax[i]` is the maximum of `leftMax[i-1]` and `arr[i]`.
3. Compute `rightMax` by iterating from right to left, where `rightMax[i]` is the maximum of `rightMax[i+1]` and `arr[i]`.
4. Iterate through the array, and for each index `i`, add `Math.min(leftMax[i], rightMax[i]) - arr[i]` to the total trapped water.

---

## Alternate Approaches / Methods
- **Two Pointers Approach:** Use two pointers starting from both ends, tracking the maximum heights on left and right, moving the pointer with the smaller maximum height inward.
- **Stack-Based Approach:** Use a stack to keep track of indices with decreasing heights, popping when a taller bar is found to calculate trapped water.

---

## Complexity
- Time: O(n)
- Space: O(n)

---

## Code
```java
public class TappingRainWater {
    public static void main(String[] args) {
       TappingRainWater obj = new TappingRainWater();
       System.out.println(obj.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1})); 
    }
    public int trap(int[] arr) {
        // we set the left ad the right max for each of the ith index
        int length = arr.length;
        int[] leftMax = new int[length];
        int[] rightMax = new int[length];
        leftMax[0] = arr[0];
        for ( int i = 1 ; i < length ; i++ ) {
            leftMax[i] = Math.max(leftMax[i-1], arr[i]);
        }
        rightMax[length-1] = arr[length-1]; // the last is already the highest for that ith index
        for ( int i = length-2 ; i >= 0 ; i-- ) {
            rightMax[i] = Math.max(rightMax[i+1], arr[i]); // is my last index greater or the second last from the arr!?
        }
        int trappedWater = 0; 
        for ( int i = 0 ; i < length ; i++ ) {
            trappedWater += Math.min(leftMax[i],rightMax[i]) - arr[i];
        }
        return trappedWater;
    }
}
```