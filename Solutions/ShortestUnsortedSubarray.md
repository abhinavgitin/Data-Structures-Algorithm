## Code
[View Code Here](../src/ShortestUnsortedSubarray.java)

# Problem:  ShortestUnsortedSubarray
**Platform:** Gfg
**Problem link:** 
**Date solved: 2026-06-16**  
**Tags:** array, sorting, subarray

---
## What this shows and what this can be used for!

This solution checks whether an array already looks sorted except for a small local dip or peak. It is useful for understanding a quick pattern-based check on neighboring elements, although the commented code in the file shows the more standard boundary-expansion approach for the shortest unsorted subarray problem.

---
## Intuition

If an array is already sorted, the answer is `0`. The active code in the Java file looks for a middle element that is either greater than both neighbors or smaller than both neighbors. If such a local extremum is found, it assumes the unsorted segment has length `3`.

---

## Approach (step-by-step)s
1. Read the array length and return `0` immediately if the array has fewer than `3` elements.
2. Scan from index `1` to `len - 2` so every checked element has both a left and right neighbor.
3. If the current element is a local peak or local valley, return `3`.
4. If no such pattern is found, return `0`.

---

## Alternate Approaches / Methods
- The commented code in the Java file finds the first disorder from the left and the first disorder from the right, then expands the window using the minimum and maximum inside that window.
- That boundary-based method is the usual way to compute the exact shortest unsorted subarray length.

---

## Complexity
- Time: O(n)
- Space: O(1)

---

## Code
```java
class Solution {
	public int shortestUnorderedSubarray(int arr[]) {
		int len = arr.length;

		if (len < 3) return 0;

		for (int i = 1; i < len - 1; i++) {
			if (
				(arr[i] > arr[i + 1] && arr[i] > arr[i - 1]) ||
				(arr[i] < arr[i + 1] && arr[i] < arr[i - 1])
			) {
				return 3;
			}
		}
		return 0;
	}
}
```