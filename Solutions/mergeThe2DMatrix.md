## Code
[View Java Code](../src/mergeThe2DMatrix.java)


# Problem:  To merge two 2D arrays into a single sorted array.
**Platform:** GFG
**Problem link:** [GFG](https://www.geeksforgeeks.org/problems/merge-k-sorted-arrays/1?page=1&sprint=f52dd1d37978bc37959bef394c7cce1d&sortBy=difficulty)
**Date solved:**  2025-11-15
**Tags:** matrix, merge, 2D matrix, sorting

---
## What this shows and what this can be used for!
This solution demonstrates how to flatten a 2D integer matrix into a single sorted list of integers. It is useful when you need a linear, sorted view of matrix elements (for example, merging rows of sorted arrays, building combined results, or preparing values for binary search/aggregation).
---
## Intuition

Collect all elements from the matrix into a single list and then sort the list. If each row is already sorted, an alternative is to merge the rows using a k-way merge for better performance.
---

## Approach (step-by-step)s
1. Create an empty `ArrayList<Integer>` to hold all elements.
2. Iterate over every row and every column in the 2D matrix and add each element to the list.
3. Sort the list using `Collections.sort()`.
4. Return the sorted list.

---

## Alternate Approaches / Methods

- If each row is already sorted, use a k-way merge (min-heap) to merge the rows in O(R*C log R) time where R is number of rows.
- If the value range is small, use counting sort to achieve near-linear time.
- If in-place modification is allowed and memory is tight, consider writing results into a pre-allocated array and sorting that array.

---

## Complexity

- Time: O(R*C log(R*C)) where R is number of rows and C is number of columns (dominant cost is sorting the flattened list). If using a k-way merge with sorted rows, time becomes O(R*C log R).
- Space: O(R*C) for the output list that stores all elements.

---

## Code
```[java]
```[java]
import java.util.ArrayList;
import java.util.Collections;
public class mergeThe2DMatrix {
	public static void main(String[] args) {
		// Example usage
		mergeThe2DMatrix obj = new mergeThe2DMatrix();
		int[][] matrix = {
			{1, 3, 5},
			{2, 4, 6},
			{7, 8, 9}
		};
		ArrayList<Integer> result = obj.mergeArrays(matrix);
		System.out.println(result); // Output: [1, 2, 3, 4, 5, 6, 7, 8, 9]
	}
	public ArrayList<Integer> mergeArrays(int[][] mat) {
		// Code here
		ArrayList<Integer> list = new ArrayList<>();
		for ( int i = 0 ; i < mat.length ; i++ ){
			for ( int j = 0 ; j < mat[i].length ; j++ ){
				list.add(mat[i][j]);
			}
		}
		Collections.sort(list);
		return list;
	}
}
```
