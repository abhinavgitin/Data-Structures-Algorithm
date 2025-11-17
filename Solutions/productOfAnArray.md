## Code
[View Java Code](../src/productOfAnArray.java)

# Problem:  Product of an array
**Platform:** LeetCode
**Problem link:** [Leetcode](https://leetcode.com/problems/sign-of-the-product-of-an-array/description/)
**Date solved:**  2025-11-14
**Tags:** arrays, math

---
## What this shows and what this can be used for!
Determining the sign of a product without computing the product. Early exit on zero and counting the parity of negatives avoids overflow and is useful for sign-only checks in numerical algorithms.

---
## Intuition
The product's sign is 0 if any element is 0. Otherwise, the sign is positive if there are an even number of negative values and negative if there are an odd number.

---

## Approach (step-by-step)s
1. Initialize a counter for negatives (`negativeCount = 0`)
2. Iterate the array: if any element is `0`, return `0`; if an element is `< 0`, increment `negativeCount`
3. After the loop, return `1` if `negativeCount` is even, otherwise return `-1`

---

## Alternate Approaches / Methods
- Maintain a running `sign = 1` and flip it (`sign = -sign`) whenever you see a negative; return `0` if any element is `0`
- Avoid multiplying all numbers directly to prevent overflow and unnecessary work

---

## Complexity
- Time: O(n) — single pass over the array
- Space: O(1) — constant extra space

---

## Code
```java
public int arraySign(int[] nums) {
	int negativeCount = 0;

	for (int i : nums) {
		if (i == 0) return 0;
		if (i < 0) negativeCount++;
	}
	return (negativeCount % 2 == 0) ? 1 : -1;
}
```