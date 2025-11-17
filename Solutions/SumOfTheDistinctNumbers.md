## Code
[View Java Code](../src/SumOfTheDistinctNumbers.java)

# Problem:  Sum Of The Distinct Numbers
**Platform:** GFG 
**Problem link:** [GFG](https://www.geeksforgeeks.org/problems/sum-of-distinct-elements4801/1?page=2&sortBy=difficulty)
**Date solved:**  2025-10-31
**Tags:** HashMap , HashSet

---
## What this shows and what this can be used for!
- How to Handel the duplicates in an array or the set 
- use of the hash map  and hash set 
---
## Intuition

Given an array that may contain duplicate elements, we only want to add each unique value once. A HashSet enforces uniqueness automatically: inserting all elements into a set removes duplicates. After collecting distinct values, summing the set's contents yields the required result.

Key idea: use a set to deduplicate, then sum the elements of the set.

---

## Approach (step-by-step)s
1. Create an empty HashSet<Integer> to store distinct values.
2. Iterate through the input array and add each element to the set. The set ignores duplicates.
3. Iterate through the set and compute the sum of its elements. Use a long accumulator to avoid overflow for large inputs.
4. Return the sum (cast to int if the method signature requires it).

---

## Alternate Approaches / Methods
- Sorting: sort the array (O(n log n)) and then scan, adding a value only the first time it appears. This uses O(1) extra space if you sort in-place but is slower for large n.
- Frequency map: use a HashMap<Integer,Integer> to count occurrences and then sum the keys. This is functionally similar to using a HashSet but slightly heavier.
- Bitset/boolean array: if the value range is small and non-negative (e.g., 0..k), you can use a boolean array to mark seen values (O(k) space) which can be faster and use less overhead than HashSet.

---

## Complexity
- Time: O(n) — we visit each element once to build the set, then iterate over the distinct elements (≤n) to compute the sum.
- Space: O(n) worst-case for the HashSet storing distinct elements.

---

## Code
```java
import java.util.HashSet;

public class SumOfTheDistinctNumbers {
	public static void main(String[] args) {
		SumOfTheDistinctNumbers obj = new SumOfTheDistinctNumbers();
		int arr[] = {1, 2, 2, 3, 4, 4, 5};
		int result = obj.findSum(arr);
		System.out.println("Sum of distinct numbers: " + result);
	}

	/**
	 * Finds the sum of distinct elements in the given array.
	 *
	 * Implementation notes:
	 * - We use a HashSet to automatically deduplicate values.
	 * - Accumulate into a long to avoid overflow for large inputs, then cast
	 *   to int to match the original method signature. Consider returning
	 *   long if very large sums are expected.
	 *
	 * @param arr input array of integers
	 * @return sum of unique elements (as int)
	 */
	int findSum(int arr[]) {
		HashSet<Integer> s = new HashSet<>();
		// Add each element — duplicates will be ignored by the set
		for (int i : arr) {
			s.add(i);
		}

		long sum = 0; // use long to be safe for large sums
		// Sum distinct elements
		for (int j : s) {
			sum += j;
		}

		return (int) sum; // cast back to int to preserve original signature
	}
}
```