## Code
[View Java Code](../src/findTargetIndicesAfterSortingArray.java)

# Problem:  Find Target Indices After Sorting Array
**Platform:** LeetCode
**Problem link:** [Leetcode](https://leetcode.com/problems/find-target-indices-after-sorting-array/description/)
**Date solved:**  2025-11-08
**Tags:** 

---
## What this shows and what this can be used for!
This problem demonstrates:
- **Sorting fundamentals** - Understanding how sorting changes array indices
- **Linear search on sorted arrays** - Finding all occurrences of a target
- **ArrayList usage** - Dynamic list manipulation in Java
- **Practical application** - Useful for finding positions of elements after reordering data (e.g., ranking systems, search result positioning)

---
## Intuition
The key insight is that we need indices **after sorting**, not before. Once we sort the array, all occurrences of the target will be grouped together. We can then iterate through the sorted array and collect all indices where the value equals the target. Since the array is sorted and we iterate left-to-right, the indices we collect will automatically be in increasing order.

---

## Approach (step-by-step)
1. **Sort the input array** using `Arrays.sort()` to arrange elements in non-decreasing order
2. **Create an ArrayList** to store the target indices
3. **Iterate through the sorted array** with index `i` from 0 to `nums.length - 1`
4. **Check if current element equals target** - if `nums[i] == target`, add index `i` to the list
5. **Return the list** containing all target indices (already sorted because we iterate sequentially)

---

## Alternate Approaches / Methods
- **Counting approach (without sorting array)**: Count elements less than target and equal to target. Indices will be from `countLess` to `countLess + countEqual - 1`. Time: O(n), Space: O(1), but still need to create result list.
- **Binary search (after sorting)**: Use binary search to find first and last occurrence of target, then generate indices in that range. Time: O(n log n + k) where k is occurrences, more efficient if target appears many times.
- **Stream API (Java 8+)**: Use `IntStream` with filter and boxed collector for a functional approach, though similar complexity.

---

## Complexity
- Time: O(n log n) - dominated by `Arrays.sort()`, where n is the length of nums. The linear scan is O(n).
- Space: O(1) auxiliary space for sorting (Arrays.sort uses dual-pivot quicksort), O(k) for output list where k is number of target occurrences

---

## Code
```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findTargetIndicesAfterSortingArray {
    public List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums);  // Sort array in non-decreasing order
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                list.add(i);  // Add matching index
            }
        }
        return list;
    }
}
```