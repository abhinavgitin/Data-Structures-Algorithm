# Problem:  to find the max consecutive numbers
**Platform:** GFG
**Problem link:** [GFG](https://www.geeksforgeeks.org/problems/longest-consecutive-subsequence2449/1)
**Date solved:** 2025-11-16 
**Tags:**   Array, Hashing, Sorting

---
## What this shows and what this can be used for!
Demonstrates an O(n) HashSet-based technique to find the length of the longest run of consecutive integers. This "detect starts, then expand" pattern is broadly useful when you can:
- Store all values in a set for O(1) membership checks.
- Identify sequence starts by the absence of a predecessor (x - 1 not present).
- Walk forward to count streak length without revisiting elements.

---
## Intuition
Sorting to find consecutive runs works, but costs O(n log n) and needs extra care for duplicates. With a set, we can detect the beginning of each consecutive streak in O(1) average time: a number x is a start if (x - 1) is not present. From each start, we count x, x+1, x+2, ... until the streak ends, tracking the maximum length as we go.

---

## Approach (step-by-step)s
1. Insert all numbers into a `HashSet<Integer>` for O(1) average lookups.
2. Iterate each unique number `x` in the set; if `set` does not contain `x - 1`, treat `x` as a start of a streak.
3. From each start, increment a counter while `set` contains `x + count`.
4. Maintain `maxCount` as the maximum streak length observed; return it at the end.

---


## Alternate Approaches / Methods
- Sorting + linear scan: sort the array, then count consecutive runs while skipping duplicates (O(n log n) time, O(1) extra space if sorting in place).
- HashMap boundary merging: store streak lengths at boundaries and merge when inserting numbers (useful when also needing to return the sequence, but more complex than needed here).

---

## Complexity
- Time: O(n) on average, where n is the number of elements (hash operations are O(1) average). Sorting approach would be O(n log n).
- Space: O(n) for the HashSet.

---

## Code
```java
import java.util.HashSet;

public class maxConsecutives {
	public static void main(String[] args) {
		// You can add quick tests here if desired.
	}

	// Function to return length of longest subsequence of consecutive integers.
	public int longestConsecutive(int[] arr) {
		HashSet<Integer> set = new HashSet<>();
		for (int i : arr) {
			set.add(i);
		}

		int maxCount = 0;
		for (int i : set) {
			if (!set.contains(i - 1)) {
				// i is the start of a streak
				int count = 0;
				while (set.contains(i + count)) {
					count++;
				}
				maxCount = Math.max(maxCount, count);
			}
		}
		return maxCount;
	}
}
```