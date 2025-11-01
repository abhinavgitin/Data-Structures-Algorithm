# Problem:  Search In a 2d sorted matrix using binary search
**Platform:** LeetCode
**Problem link:** [LeetCode](https://leetcode.com/problems/search-a-2d-matrix/discription)
**Date solved:**  2025-11-01
**Tags:** Binary Search , Buret Force

---
## What this shows and what this can be used for!
- how to search in a 2d matrix and 
- how to implement the rows using the mid / length of the col 
- how to implement the col using the mid % length of the col 
---
## Intuition

The matrix is sorted in row-major order: each row is sorted left-to-right and the first integer of each row is greater than the last integer of the previous row. This lets us treat the entire 2D matrix as a single sorted 1D array (flattened row-by-row) and apply binary search over indices 0..(m * n - 1).

Instead of actually creating a flattened array (which would use extra memory), we map a 1D index "idx" back to 2D coordinates (row, col) using integer division and modulus:
- row = idx / numberOfColumns
- col  = idx % numberOfColumns

## Approach (step-by-step)s
1. Let m = number of rows, n = number of columns. Consider the flattened index range start = 0, end = m*n - 1.
2. While start <= end:
   - Compute mid = start + (end - start) / 2.
   - Map mid to 2D coordinates: row = mid / n, col = mid % n.
   - Compare matrix[row][col] with target:
	 - If equal: return true.
	 - If matrix[row][col] > target: move left by setting end = mid - 1.
	 - If matrix[row][col] < target: move right by setting start = mid + 1.
3. If loop finishes without finding target, return false.

This uses O(1) extra space and O(log(m*n)) time.

### Example mapping (how division & modulus work)
Given matrix (m = 3 rows, n = 4 cols):

[[1, 3, 5, 7],
 [10,11,16,20],
 [23,30,34,60]]

Flattened indices (row-major) map as:
- idx 0 -> row = 0 / 4 = 0, col = 0 % 4 = 0 -> matrix[0][0] = 1
- idx 1 -> row = 1 / 4 = 0, col = 1 % 4 = 1 -> matrix[0][1] = 3
- idx 4 -> row = 4 / 4 = 1, col = 4 % 4 = 0 -> matrix[1][0] = 10
- idx 5 -> row = 5 / 4 = 1, col = 5 % 4 = 1 -> matrix[1][1] = 11
- idx 11 -> row = 11 / 4 = 2, col = 11 % 4 = 3 -> matrix[2][3] = 60

So when binary search picks a mid of 5, we test matrix[1][1] (value 11).

---

## Alternate Approaches / Methods
- Brute Force / Linear search: iterate over every element in the matrix (nested loops) and check equality with the target. This is the commented approach in the Java file. It's simple and sometimes acceptable for very small matrices.
- (Not implemented here) Another variant is doing binary search per row: first find the candidate row by comparing first/last elements of each row (binary search over rows), then binary search inside that row. That approach gives O(log m + log n) time.

---

## Complexity
- Binary-search-over-flattened-matrix (implemented):
  - Time: O(log(m * n)) — binary search over m*n elements.
  - Space: O(1) — constant extra space.
- Brute force / Linear search (commented in code):
  - Time: O(m * n) — you may check every element.
  - Space: O(1).

---

## Code
```java
public class SearchInA2DSortedMatrix {
public static void main(String[] args) {
	SearchInA2DSortedMatrix obj = new SearchInA2DSortedMatrix();
	int[][] matrix = {
		{1, 3, 5, 7},
		{10, 11, 16, 20},
		{23, 30, 34, 60}
	};
	int target = 3;
	boolean result = obj.searchMatrix(matrix, target);
	System.out.println("Target " + target + " found in matrix: " + result);
}
public boolean searchMatrix(int[][] matrix, int target) {
		// Brute-force (commented): check every element
		// int rows = matrix.length;
		// int cols = matrix[0].length;
		// boolean found = false;
		// for ( int i = 0 ; i < rows ; i++ ){
		//     for ( int j = 0 ; j < cols ; j++ ){
		//         if ( matrix[i][j] == target ){
		//             found = true;
		//             return found;
		//         }
		//     }
		// }
		// return found;
		// The matrix is sorted; apply binary search over the implicit flattened array.
		int noOfRow = matrix.length;
		int noOfCol = matrix[0].length;
		int start = 0;
		int end = noOfRow * noOfCol - 1;
		while ( start <= end ){
			int mid = start + ( end - start ) / 2;
			int thatRow = mid / noOfCol; // division gives row index
			int thatCol = mid % noOfCol; // modulus gives column index
			if ( matrix[thatRow][thatCol] == target ){
				return true;
			} else if ( matrix[thatRow][thatCol] > target ){
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return false;
	}
}
```