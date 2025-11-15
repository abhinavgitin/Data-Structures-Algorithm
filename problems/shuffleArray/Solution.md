
# Problem:  Merge the 2D Matrix
**Platform:** LeetCode
**Problem link:** [Leetcode](https://leetcode.com/problems/shuffle-the-array/description/)
**Date solved:** 2025-11-15
**Tags:** array, shuffle, simulation

---
## What this shows and what this can be used for!
Demonstrates interleaving two halves of an array to form a sequence `x1, y1, x2, y2, ...`. Useful for problems requiring structured reordering, pairing elements from two lists, or preparing inputs for alternating processing.
---
## Intuition
Use two pointers: one starting at the beginning of the array (`left = 0`) and another at the midpoint (`right = n`). Write elements alternately from each half into a new array.
---

## Approach (step-by-step)s
1. Initialize a result array `arr` of size `nums.length`.
2. Set `left = 0` and `right = n`.
3. Loop `i` in steps of 2 while `i + 1 < nums.length`:
	- Set `arr[i] = nums[left++]`.
	- Set `arr[i + 1] = nums[right++]`.
4. Return `arr`.

---

## Alternate Approaches / Methods
- In-place encoding (when constraints allow, e.g., small value range): encode two values into one integer and decode later to achieve O(1) extra space.
- Stream/functional approaches (Java Streams) for readability, though typically less efficient than a simple loop.

---

## Complexity
- Time: O(n) — single pass to build the result.
- Space: O(n) — result array. With in-place encoding: O(1) extra.

---

## Code
```[java]
public class shuffleArray {
	public static void main(String[] args) {
		// Example usage
		shuffleArray obj = new shuffleArray();
		int[] nums = {2, 5, 1, 3, 4, 7};
		int n = 3;
		int[] result = obj.shuffle(nums, n);
		for (int num : result) {
			System.out.print(num + " "); // Output: 2 3 5 4 1 7
		}
	}
	public int[] shuffle(int[] nums, int n) {
		// so i need to shuffle and make it like x1 y1 x2 y2 
		int[] arr = new int[nums.length];
		int left = 0;
		int right = n;
		for ( int i = 0 ; i+1 < nums.length ; i+=2 ) {
			arr[i] = nums[left];
			arr[i+1] = nums[right];
			left++;
			right++;
		}
		return arr;
	}
}
```



