## Code
[View Java Code](../src/Atleast_Two_Greater_Elements.java)

# Problem: Atleast Two Greater Elements In Java
**Platform:** GFG
**Problem link:** [GFG](https://www.geeksforgeeks.org/problems/at-least-two-greater-elements4625/1?page=4&sortBy=difficulty) 
**Date solved:** 2025-10-25 


---
## What this shows and what this can be used for!
- use of streams in java 
- remove elemnts of an array and return 
---
## Intuition
Any element that has at least two strictly greater elements cannot be one of the two largest elements. So the answer is: all elements except the two largest.
---

## Approach (step-by-step)s
1. If array length <= 2 return an empty array.
2. Sort the array in ascending order.
3. Return the first n-2 elements (these have at least two greater elements).

---

## Alternate Approaches / Methods
1. Arrays.sort + manual copy
	- Sort the primitive array with `Arrays.sort(arr)` and copy the first `n-2` elements into result.
2. (Linear) Find top two maximums in one pass and collect elements smaller than the 2nd max — avoids full sort.

---

## Complexity
Time: O(n log n) — dominated by sorting.
Space: O(n) — output array; sorting of primitive long[] is in-place but streams/toArray allocate the result.

---

## Code
```[java]
import java.util.Arrays;

class Solution {
	public static void main(String[] args) {
		Solution sol = new Solution();
		long[] arr = {5, 1, 3, 4, 2};
		long[] result = sol.findElements(arr);
		System.out.println(Arrays.toString(result)); // Output: [1, 2, 3]
	}

	public long[] findElements(long arr[]) {
		return Arrays.stream(arr)
				.sorted()
				.limit(arr.length - 2)
				.toArray();
	}
}

// Alternate (commented) implementation — Arrays.sort + manual copy:
// Arrays.sort(arr);
// int len = arr.length - 2;
// long[] nums = new long[len];
// for (int i = 0; i < len; i++) nums[i] = arr[i];
// return nums;
```