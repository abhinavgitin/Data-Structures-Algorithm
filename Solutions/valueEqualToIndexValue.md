## Code
[View Code Here](../src/valueEqualToIndexValue.java)

# Problem:  valueEqualToIndexValue
**Platform:** GFG
**Problem link:** [GFG](https://www.geeksforgeeks.org/problems/value-equal-to-index-value1330/1?page=2&sortBy=difficulty)
**Date solved: 2026-01-21**  
**Tags:** <tag1, tag2>

---
## What this shows and what this can be used for!
- calc according to the index in the arraylist in java 
- calc for the index and the data at that index
---
## Intuition
Find all positions in the array where the value matches its 1-based index.


## Approach (step-by-step)s
1. Loop through the array from index 1 to n (1-based).
2. For each index i, check if arr[i-1] == i.
3. If true, add i to the result list.
4. Return the list of such indices.

---

## Alternate Approaches / Methods


---

## Complexity
- Time: O(n) — single pass through the array
- Space: O(k) — k = number of matching indices (output list)

---

## Code
```java
public List<Integer> valueEqualToIndex(List<Integer> nums) {
	ArrayList<Integer> arrList = new ArrayList<>();
	for (int i = 1; i <= nums.size(); i++) {
		if (i == nums.get(i-1)) {
			arrList.add(i);
		}
	}
	return arrList;
}
```