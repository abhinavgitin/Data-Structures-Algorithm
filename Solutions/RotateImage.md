## Code
[View Code Here](../src/RotateImage.java)

# Problem:  RotateImage
**Platform:** Leetcode
**Problem link:** 
**Date solved: 2026-04-17**  
**Tags:** matrix, array, rotation

## What this shows and what this can be used for!

This solution demonstrates how to rotate a square matrix 90 degrees clockwise by using a temporary matrix to store the rotated values before copying them back to the original matrix.

It can be used when you need a clear and straightforward implementation of matrix rotation, prioritizing readability over memory efficiency.
## Intuition

To rotate a matrix 90 degrees clockwise, each element at position [i][j] in the original matrix moves to position [j][n-1-i] in the rotated matrix, where n is the size of the matrix.

Using a temporary matrix simplifies this transformation by allowing direct placement of elements in their new positions.

## Approach (step-by-step)s
1. Determine the dimensions of the matrix (rows and columns).
2. Create a new matrix of the same size to hold the rotated values.
3. Iterate through each element of the original matrix and place it in the corresponding rotated position in the new matrix using the formula result[j][row-1-i] = matrix[i][j].
4. Copy the values from the new matrix back to the original matrix to complete the rotation.

## Alternate Approaches / Methods
- Transpose the matrix and then reverse each row to achieve clockwise rotation in-place.
- Perform layer-by-layer rotation by swapping elements in cycles without using extra space.

## Complexity
- Time: O(n^2)
- Space: O(n^2)

## Code
```java
public class RotateImage {
    public static void main(String[] args) {
        RotateImage rotateImage = new RotateImage();
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotateImage.rotate(matrix);
    }
    public void rotate(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int result[][] = new int[row][col];
        for ( int i = 0 ; i < row ; i++ ) {
            for ( int j = 0 ; j < col ; j++ ) {
                result[j][row-1-i] = matrix[i][j];
            }
        }
        for ( int i = 0 ; i < row ; i++ ) {
            for ( int j = 0 ; j < col ; j++ ) {
                matrix[i][j] = result[i][j];
            }
        }
    }
}
/*
The initial matrix looks like :
1 2 3
4 5 6
7 8 9

and after the rotation it looks like :
7 4 1
8 5 2
9 6 3
*/
```