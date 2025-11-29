## Code
[View Code Here](../src/MaxSumOfAnArrayDivisibleByK.java)

# Problem:  MaxSumOfAnArrayDivisibleByK
**Platform:** leetcode
**Problem link:** [Leetcode](https://leetcode.com/problems/minimum-operations-to-make-array-sum-divisible-by-k/description/)
**Date solved: 2025-11-29**  
**Tags:** Sum of and array;

---
## What this shows and what this can be used for!
- to calculate the sum 

---
# 🎯 Minimum Operations to Make Sum Divisible by K

## 📌 Problem Overview
Given an integer array and a divisor `k`, we can decrease any element by 1 in one operation. Our goal: find the **minimum operations** needed to make the total sum divisible by `k`.

---

## 💡 Intuition
The key insight is beautifully simple: **we don't care which specific elements we decrease**—only the total reduction matters!

Think of it this way:
- If `sum % k == 0` → Already divisible, we're done! ✅
- If `sum % k == r` (remainder `r`) → We need exactly `k - r` operations to reach the next multiple of `k`

**Why?** Decreasing *any* element by 1 reduces the sum by 1. So instead of tracking individual elements, we just need to find how far our sum is from the nearest divisible number.

---

## 🔍 Approach

### The Strategy:
1. **Calculate the total sum** of all array elements
2. **Check divisibility**: If `sum % k == 0`, return 0 (no operations needed)
3. **Find the gap**: The remainder `sum % k` tells us how many steps away we are
4. **The answer**: We need exactly `(k - sum % k) % k` operations

### Visual Example:
```
nums = [3, 9, 7], k = 5
sum = 19

19 % 5 = 4 (remainder)
Next multiple: 20 (divisible by 5)
Gap: 20 - 19 = 1? ❌

Wait! We're DECREASING, so:
Previous multiple: 15 (divisible by 5)
Gap: 19 - 15 = 4 ✅

Operations needed: 4
```

---

## 💻 Solution Code

```java
class Solution {
    public int minOperations(int[] nums, int k) {
        // Calculate the total sum of the array
        int sum = 0;
        int operations = 0;
        
        for (int i : nums) {
            sum += i;
        }
        
        // Keep decrementing until divisible by k
        while (sum % k != 0) {
            sum--;
            operations++;
        }
        
        return operations;
    }
}
```

### 🔥 Optimized One-Liner Logic:
```java
// After calculating sum:
return (k - sum % k) % k;
```
*(The outer `% k` handles the case when sum is already divisible)*

---

## 📊 Complexity Analysis

### ⏱️ Time Complexity: **O(n + k)**
- **O(n)**: Calculating the sum by iterating through the array
- **O(k)**: Worst case, the while loop runs at most `k-1` times (when remainder is 1)
- **Optimized version**: O(n) by using direct formula

### 💾 Space Complexity: **O(1)**
- Only using a few integer variables (`sum`, `operations`)
- No extra data structures needed

---

## 🎓 Key Takeaways

1. **Greedy works here**: Any element can be decreased—it all affects the sum equally
2. **Modular arithmetic is powerful**: The remainder tells us exactly how far we are from divisibility
3. **Sometimes simulation works**: The while loop approach is intuitive and correct
4. **Mathematical optimization exists**: `(k - sum % k) % k` gives instant answer

---

## 🧪 Test Cases Walkthrough

### Example 1:
```
Input: nums = [3, 9, 7], k = 5
Sum = 19, remainder = 4
Operations needed = 4
Result: [3, 5, 7] → sum = 15 ✅
```

### Example 2:
```
Input: nums = [4, 1, 3], k = 4
Sum = 8, remainder = 0
Operations needed = 0
Already divisible! ✅
```

### Example 3:
```
Input: nums = [3, 2], k = 6
Sum = 5, remainder = 5
Operations needed = 5
Result: [0, 0] → sum = 0 ✅
```

---

## 🚀 What I Learned
- Sometimes the **brute force simulation** is the clearest solution
- **Modular arithmetic** can often replace iterative loops
- **Understanding the problem deeply** > memorizing patterns
- Every operation affects the **global state** (sum), not just local elements

---

### 💭 *"In mathematics, elegance is not optional—it's inevitable when you understand the structure beneath."*

**#LeetCode #Java #ProblemSolving #DSA #CodingJourney**