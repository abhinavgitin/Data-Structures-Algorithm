## Code
[View Java Code](../src/monotonicArray.java)

# Problem:  Monotonic Array either increasing or decreasing
**Platform:** LeetCode
**Problem link:** [Leetcode](https://leetcode.com/problems/monotonic-array/description/)
**Date solved:** 2025-11-10
**Tags:** Array, One-pass

---
## What this shows and what this can be used for!
This solution demonstrates a concise one-pass property check: track two opposing conditions (ever increased, ever decreased) simultaneously to decide a global array characteristic. Instead of determining monotonicity with multiple passes or complex branching, we accumulate evidence in two booleans.

Reusable pattern:
- Global property via local adjacent comparisons (sorted/non-decreasing/non-increasing, strictly increasing, constant segments).
- Using flags or counters as lightweight state to avoid storing full auxiliary structures.
- Opportunity for early exit (short-circuit) once a contradiction appears (both increase and decrease observed).

You can extend the idea: detect “mountain array” by first building up and then down flags; detect stability windows; or combine with counting to classify array trends.
---
## Intuition
An array is monotonic if it never both goes up and goes down. While scanning adjacent pairs, any `nums[i] < nums[i+1]` means there is an increasing step; any `nums[i] > nums[i+1]` means a decreasing step. If both types of steps occur, monotonicity is violated. Equal neighbors are neutral and ignored.
---

## Approach (step-by-step)s
1. Initialize two booleans: `increasing=false`, `decreasing=false`.
2. Loop i from 0 to n-2:
	- If `nums[i] < nums[i+1]`, set `increasing=true`.
	- If `nums[i] > nums[i+1]`, set `decreasing=true`.
	- (Optional optimization) If both are true, return `false` immediately.
3. After loop, return `!(increasing && decreasing)`.

---

## Alternate Approaches / Methods
- Trend-first approach: Skip initial equal elements to find the first non-equal pair and decide expected direction (increase or decrease), then verify the rest matches.
- Two-pass approach: Check non-decreasing in one pass; if it fails, check non-increasing in another pass.
- Early-exit variant of current solution (add a break / return when both flags set).

---

## Complexity
- Time: O(n) — single pass through adjacent pairs.
- Space: O(1) — only two booleans (output is a single boolean).

---

## Code
```[java]
public class monotonicArray {
	public static void main(String[] args) {
		monotonicArray obj = new monotonicArray();
		int[] nums = {1,2,2,3};
		boolean result = obj.isMonotonic(nums);
		System.out.println(result); // Output: true
	}
	public boolean isMonotonic(int[] nums) {
		boolean decreasing = false;
		boolean increasing = false;

		for (int i = 0; i + 1 < nums.length; i++) {
			if (nums[i] < nums[i+1]) {
				increasing = true;
			}
			if (nums[i] > nums[i+1]) {
				decreasing = true;
			}
			// Optional: if (increasing && decreasing) return false; // early exit
		}

		if (increasing && decreasing) return false;
		return true;
	}
}
```