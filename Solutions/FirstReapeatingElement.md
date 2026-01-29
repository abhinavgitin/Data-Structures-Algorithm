## Code
[View Code Here](../src/FirstReapeatingElement.java)

# Problem:  FirstReapeatingElement
**Platform:** GFG
**Problem link:** [GFG](https://www.geeksforgeeks.org/problems/first-repeating-element4018/1?page=6&sortBy=submissions)
**Date solved: 2026-01-29**  
**Tags:** Missing element , frequency count, hash map

---
## What this shows and what this can be used for!
- strongly denotes that how do we count the frequency of the each element and the perform operation on the same 

---
## Intuition
To find the first repeating element, we need to identify which element appears more than once and whose first occurrence is at the smallest index. Using a frequency map helps us efficiently count occurrences and then find the earliest such element.

---

## Approach (step-by-step)s
1. Traverse the array and store the frequency of each element in a hash map.
2. Traverse the array again, and for each element, check if its frequency is more than 1.
3. Return the 1-based index of the first such element. If no element repeats, return -1.

---

## Alternate Approaches / Methods
- Use a HashSet to track seen elements and return the first index where an element is already in the set.
- Brute force: For each element, check all subsequent elements for a repeat (inefficient for large arrays).

---

## Complexity
- Time: O(n), where n is the length of the array (two passes over the array).
- Space: O(n), for the hash map storing frequencies.

---

## Code
```java
import java.util.HashMap;

class Solution {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 3, 5, 6, 1};
		System.out.println(firstRepeated(arr)); // Output: 3
	}
	public static int firstRepeated(int[] arr) {
		HashMap<Integer,Integer> map = new HashMap<>();
		for (int i : arr) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}
		for (int i = 0; i < arr.length; i++) {
			if (map.get(arr[i]) > 1) {
				return i + 1; // 1-based index
			}
		}
		return -1;
	}
}
```