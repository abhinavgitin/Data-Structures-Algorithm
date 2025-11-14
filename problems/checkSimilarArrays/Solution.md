# Problem: Check The Similar Array
**Platform:** GFG
**Problem link:** [GFG](https://www.geeksforgeeks.org/problems/the-problem-of-identical-arrays3229/1?page=2&sortBy=difficulty)
**Date solved:** 2025-11-15
**Tags:** lists arrays hashing

---
## What this shows and what this can be used for!
Checks if two arrays/lists are identical as multisets (order doesn't matter) using a frequency map. Useful for equality checks where only element counts matter (anagrams, inventory comparisons, bag/multiset equality).

---
## Intuition
If sizes differ, they can't be identical. Count occurrences of each value from the first list, then decrement using the second list. If any value is missing or goes negative, the two lists differ; otherwise they're identical.

---

## Approach (step-by-step)s
1. If sizes differ, return false immediately
2. Build a HashMap<Integer,Integer> of frequencies from the first list `a`
3. Iterate the second list `b`: for each value, ensure it exists in the map and decrement its count; if missing or count goes negative, return false
4. If all elements in `b` are consumed without issues, return true

---

## Alternate Approaches / Methods
- Sort both lists/arrays and compare element-by-element (O(n log n) time)
- Use two frequency maps and compare maps for equality

---

## Complexity
- Time: O(n) where n is the number of elements (single pass builds + checks)
- Space: O(k) for the frequency map, where k is number of distinct elements

---

## Code
```java
public boolean isIdentical(List<Integer> a, List<Integer> b) {
	if (a.size() != b.size()) return false;

	Map<Integer, Integer> freq = new HashMap<>();

	for (int num : a) {
		freq.put(num, freq.getOrDefault(num, 0) + 1);
	}

	for (int num : b) {
		if (!freq.containsKey(num)) return false;
		freq.put(num, freq.get(num) - 1);
		if (freq.get(num) < 0) return false;
	}

	return true;
}
```