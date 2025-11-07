# Problem: Find the Unique Element
**Platform:** GFG
**Problem link:** [GFG](https://www.geeksforgeeks.org/problems/find-unique-element2632/1?page=2&sortBy=difficulty)
**Date solved:**  2025-11-07
**Tags:** Hashing, Arrays, Counting, KeySet(), getOrDefault(), frequency 

---
## What this shows and what this can be used for!
This solution demonstrates how to use a frequency map (`HashMap`) to count occurrences of elements in an array efficiently and then filter based on a threshold (here: find an element whose frequency is strictly less than `k`). The same pattern generalizes to: finding elements appearing exactly once, detecting majority/minority elements, or validating constraints like "all others appear k times".

---
## Intuition

If we know how many times each number appears, the problem reduces to a simple lookup: return any number whose count is below the given threshold `k`. A hash map gives O(1) average insertion and retrieval, so a single linear pass builds the frequency table. A second pass inspects the counts to locate the desired element.

Key idea: Separate concerns — first aggregate (count), then select (filter by count < k). This keeps code readable and adaptable (e.g. change condition to `== 1`, `> k`, `== k`, etc.).

---
## Approach (step-by-step)s
1. Initialize an empty `HashMap<Integer, Integer>` to hold (value -> frequency).
2. Iterate over the array; for each value `v`, increment its stored count using `map.getOrDefault(v, 0) + 1`.
3. After counting, iterate over the map's key set and return the first key whose stored frequency is `< k`.
4. If no such key exists, return `0` (current fallback). Optionally, this could be changed to throw an exception or return a sentinel like `-1` if better signaling is desired.

Edge Case Notes:
- Empty array: map stays empty; returns 0 (could refine behavior if needed).
- All elements meet or exceed `k`: returns 0 (fallback path).
- Multiple elements with frequency < `k`: returns whichever is encountered first in key iteration order (not guaranteed order). If deterministic behavior or the first occurrence by index is required, you could instead scan the original array after building the map and pick the first value satisfying `count < k`.

---
## Complexity
- Time: O(n) to build the map (n = array length) + O(u) to scan unique keys, where `u ≤ n`. Overall O(n).
- Space: O(u) for the frequency map (u = number of distinct elements in the array).

---
## Code
```[java]
import java.util.HashMap;

public class findTheUniqueElement {
	// Returns any element whose frequency is strictly less than k.
	// If none found, returns 0 (fallback). Adjust sentinel as needed.
	public int findUnique(int k, int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<>();
		// 1. Build frequency map
		for (int value : arr) {
			map.put(value, map.getOrDefault(value, 0) + 1);
		}
		// 2. Find an element with frequency < k
		for (int candidate : map.keySet()) {
			if (map.get(candidate) < k) {
				return candidate;
			}
		}
		// 3. Fallback if none match condition
		return 0;
	}

	public static void main(String[] args) {
		findTheUniqueElement finder = new findTheUniqueElement();
		int[] arr = {2, 2, 3, 2, 4, 4, 4};
		int k = 3;
		int uniqueElement = finder.findUnique(k, arr);
		System.out.println("The unique element is: " + uniqueElement);
	}
}
```

---
### Possible Improvements (Optional)
- Deterministic choice: After counting, re-scan the original array and return the first element whose frequency < k.
- Specific uniqueness (exactly once): Replace condition with `map.get(candidate) == 1`.
- Error signaling: Return `-1` or throw if no element satisfies condition.
