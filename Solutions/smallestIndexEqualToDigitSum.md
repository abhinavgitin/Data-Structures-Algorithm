## Code
[View Code Here](../src/smallestIndexEqualToDigitSum.java)

# Problem:  smallestIndexEqualToDigitSum
**Platform:** LeetCode
**Problem link:** 
**Date solved: 2026-01-21**  
**Tags:** <tag1, tag2>

---
## What this shows and what this can be used for!
- how to check the smallest element in the array for specific indexes
- how to use function for arrays specific tasks and return it
- how to check the index and its data similarity
---
## Intuition
Check each index to see if the digit sum of nums[i] matches i. Return the smallest such index.

## Approach (step-by-step)s
1. Loop through the array from i = 0 to n-1.
2. For each i, calculate the digit sum of nums[i].
3. If digit sum equals i, track the smallest such index.
4. Return the smallest index found, or -1 if none.

---

## Alternate Approaches / Methods


---

## Complexity
- Time: O(n * d) — n = array length, d = max digits in nums[i] (at most 4)
- Space: O(1)

---

## Code
```java
public int smallestIndex(int[] nums) {
	int smallest = Integer.MAX_VALUE;
	for (int i = 0; i < nums.length; i++) {
		if (i == digitSum(nums[i])) {
			if (i < smallest) {
				smallest = i;
			}
		}
	}
	if (smallest == Integer.MAX_VALUE) return -1;
	return smallest;
}

int digitSum(int num) {
	int sum = 0;
	while (num > 0) {
		sum += num % 10;
		num /= 10;
	}
	return sum;
}
```