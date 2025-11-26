## Code
[View Code Here](../src/MeanOfAnArrayUsingPer.java)

# Problem:  MeanOfAnArrayUsingPer
**Platform:** LeetCode
**Problem link:** [LeetCode](https://leetcode.com/problems/mean-of-array-after-removing-some-elements/description/)
**Date solved: 2025-11-26**  
**Tags:** percentage, use of mean in the array

---
## What this shows and what this can be used for!
- helps to find the percentage 
- how to exclude the first and the last 5 percent or any of the array or data set
- handle mean with double
---
## 🧠 Intuition

When we remove the smallest 5% and largest 5% of a sorted array, the remaining values represent the central portion of the data. The problem simply asks for the average of these remaining elements.

Sorting ensures that all the smallest values come first and the largest values come last, so trimming becomes just skipping the first and last fixed number of elements.

---

## 🔍 Approach

1. **Sort the array** so that removing extremes becomes easy.
2. Compute how many elements make up **5%** of the array:
   `k = (n * 5) / 100`
3. Sum all elements from index `k` to `n - k - 1`.
4. Divide the sum by the count of the remaining elements → `n - 2k`.

This yields the trimmed mean.

---

## ⏱️ Time Complexity

**O(n log n)** — due to sorting.

## 📦 Space Complexity

**O(1)** — no extra space used apart from variables.

**➡️ If this solution helped, please consider upvoting! 😊**

---

## 💻 Code

```java
class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        double sum = 0;
        int smallest5per = (arr.length * 5) / 100;
        for (int i = smallest5per; i < arr.length - smallest5per; i++) {
            sum += arr[i];
        }
        return sum / (arr.length - 2 * smallest5per);
    }
}
```
