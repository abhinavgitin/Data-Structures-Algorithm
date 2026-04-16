## Code
[View Code Here](../src/Marks.java)

# Problem:  Marks
**Platform:** Codeforces
**Problem link:** 
**Date solved: 2026-04-16**  
**Tags:** <array, matrix, max>

---
## What this shows and what this can be used for!

This code demonstrates how to process a 2D matrix of student marks to identify students who scored the maximum marks in at least one subject. It can be used in scenarios involving matrix traversal, finding maximum values per column, and tracking eligibility based on conditions.

---
## Intuition

The problem requires finding students who are top performers in at least one subject. By iterating through each subject (column), finding the maximum score, and marking all students who achieved that score as eligible, we can efficiently determine the count of such students.

---

## Approach (step-by-step)s
1. Read the number of students (rows) and subjects (columns) from input.
2. Read the matrix of marks, where each row represents a student's marks in all subjects.
3. Initialize a boolean array to track eligible students.
4. For each subject (column):
   - Find the maximum mark in that column.
   - Mark all students who have that maximum mark as eligible.
5. Count the number of eligible students by iterating through the boolean array.
6. Output the count.

---

## Alternate Approaches / Methods
- Use a list or set to store eligible student indices instead of a boolean array, but boolean array is more memory-efficient for this purpose.
- Instead of marking eligibility per column, maintain a count of max scores per student, but the current approach is straightforward.

---

## Complexity
- Time: O(row * col) - iterating through the matrix twice (once for input, once for processing).
- Space: O(row * col) for the matrix + O(row) for the boolean array.

---

## Code
```java
import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        sc.nextLine();
        int mat[][] = new int[row][col];
        for ( int i = 0 ; i < row ; i++ ) {
            String str = sc.nextLine();
            for ( int j = 0 ; j < col ; j++ ) {
                mat[i][j] = str.charAt(j)-'0'; // just keep in mind that we are storing the numbers not the integers so type cast that implicit
            }
        }
        sc.close();
        boolean eligibleStudents[] = new boolean[row];
        for ( int i = 0 ; i < col ; i++ ) {
            int max = 0 ;
            for ( int j = 0 ; j < row ; j++ ) {
                // now we see what is the max marks for the row students
                max = Math.max(max,mat[j][i]);
            }
            for ( int k = 0 ; k < row ; k++ ) {
                if ( max == mat[k][i] ) {
                    eligibleStudents[k] = true;
                }
            }
        }
        int noOfStudnets = 0;
        for ( boolean eligibility : eligibleStudents ) {
            if ( eligibility ) noOfStudnets++;
        }
        System.out.println(noOfStudnets);
    }
}
```