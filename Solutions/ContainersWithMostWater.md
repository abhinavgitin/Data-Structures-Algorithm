## Code
[View Code Here](../src/ContainersWithMostWater.java)

# Problem:  ContainersWithMostWater
**Platform:** LeetCode
**Problem link:** [Leetcode](https://leetcode.com/problems/container-with-most-water/)
**Date solved: 2025-11-23**  
**Tags:** Two Pointers , math functions!

---
## What this shows and what this can be used for!
- To reduce the time complexity from O(n^2) to O(n);
- use of Math.max and min which shows that you dont havr to use the conditional statements for finding the max and the min values as required
- use of math.abs for the return use it incase you dont want to throw any negative values 
---
# 💧 Container With Most Water | Two Pointer Approach

## Problem Statement
Given an integer array `height` of length `n`, find two lines that together with the x-axis form a container that can hold the maximum amount of water.

**Return:** Maximum water the container can store.

---

## 🧠 Intuition

The key insight is understanding what determines the water capacity:
- **Width:** Distance between two lines (end - start)
- **Height:** Minimum of the two line heights (water can't exceed the shorter line)
- **Area = Width × Height**

**Why Two Pointers?**
- Start with the widest container (maximum width)
- The only way to potentially increase area is by finding taller lines
- Move the pointer at the shorter height—because keeping it won't help us find a better solution
- This greedy approach guarantees we don't miss the optimal solution

---

## ⚡ Approach

1. **Initialize two pointers:** `start` at the beginning, `end` at the end
2. **Calculate current area:** `width × min(height[start], height[end])`
3. **Track maximum area** found so far
4. **Move the pointer strategically:**
   - If `height[start] < height[end]` → move `start` forward (we need a taller left line)
   - Otherwise → move `end` backward (we need a taller right line)
5. **Repeat** until pointers meet

**Why this works:** Moving the shorter side gives us a chance to find a taller line. Moving the taller side would only decrease width without potential height gain.

---

## 💻 Java Solution

```java
class Solution {
    public int maxArea(int[] height) {
        int start = 1;                    // Left pointer (1-indexed)
        int end = height.length;          // Right pointer (1-indexed)
        int res = 0;                      // Maximum area found
        
        while (start < end) {
            // Find the limiting height (shorter of the two lines)
            int minHeight = Math.min(height[start-1], height[end-1]);
            
            // Calculate current area and update maximum
            res = Math.max((end - start) * minHeight, res);
            
            // Move the pointer at the shorter height
            if (minHeight == height[start-1]) {
                start++;                  // Left line is shorter, move right
            } else {
                end--;                    // Right line is shorter, move left
            }
        }
        
        return Math.abs(res);             // Return maximum area
    }
}
```

---

## 📊 Complexity Analysis

**Time Complexity:** `O(n)`
- Single pass through the array with two pointers
- Each element is visited at most once
- Linear time makes this optimal

**Space Complexity:** `O(1)`
- Only using a few variables (start, end, res, minHeight)
- No extra data structures needed
- Constant space regardless of input size

---

## 🔍 Dry Run Example

**Input:** `height = [1, 8, 6, 2, 5, 4, 8, 3, 7]`

```
Iteration 1:
  start=1, end=9 → heights: 1, 7
  minHeight = 1, width = 8
  area = 8 × 1 = 8, res = 8
  Move start (1 < 7) → start=2

Iteration 2:
  start=2, end=9 → heights: 8, 7
  minHeight = 7, width = 7
  area = 7 × 7 = 49, res = 49
  Move end (7 ≤ 8) → end=8

Iteration 3:
  start=2, end=8 → heights: 8, 3
  minHeight = 3, width = 6
  area = 6 × 3 = 18, res = 49
  Move end (3 < 8) → end=7

... continues until start meets end

Final Answer: 49
```

**Visual Representation:**
```
Height:  1  8  6  2  5  4  8  3  7
Index:   0  1  2  3  4  5  6  7  8
         ^                       ^
       start                    end
         
Best container: indices 1 and 8
Height = min(8, 7) = 7
Width = 8 - 1 = 7
Area = 7 × 7 = 49
```

---

## 💡 Key Insights

1. **Greedy Choice:** Always move the pointer at the shorter height—this is safe because keeping the shorter height with reduced width will never give a better result.

2. **Why not check all pairs?** Brute force would be O(n²). The two-pointer approach intelligently prunes the search space.

3. **Edge Case Handling:** Works perfectly for minimum constraint (n=2) and handles equal heights correctly.

4. **Alternative indexing:** This solution uses 1-indexed pointers but accesses 0-indexed array. You could also use 0-indexed pointers directly:
   ```java
   int start = 0, end = height.length - 1;
   // Then use height[start] and height[end] directly
   ```

---

## 🎯 Test Cases

```
Test 1: height = [1, 8, 6, 2, 5, 4, 8, 3, 7]
Output: 49 ✓

Test 2: height = [1, 1]
Output: 1 ✓

Test 3: height = [4, 3, 2, 1, 4]
Output: 16 (indices 0 and 4, width=4, height=4)

Test 4: height = [1, 2, 1]
Output: 2 (indices 0 and 2, width=2, height=1)

Test 5: height = [2, 3, 4, 5, 18, 17, 6]
Output: 17 (indices 4 and 5, width=1, height=17)
```

---

## 🚀 Optimization Notes

- The solution is already optimal in terms of time complexity
- Space complexity is minimal (O(1))
- The two-pointer technique is the most efficient approach for this problem
- No further optimization needed—this is the gold standard solution!

---

**Tags:** `Two Pointers` `Greedy` `Array` `Medium`

**Similar Problems:** Trapping Rain Water, 3Sum