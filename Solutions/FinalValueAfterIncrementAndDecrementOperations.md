## Code
[View Code Here](../src/FinalValueAfterIncrementAndDecrementOperations.java)

# Problem:  FinalValueAfterIncrementAndDecrementOperations
**Platform:** LeetCode
**Problem link:** https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
**Date solved: 2026-02-02**  
**Tags:** Array, String, Simulation

---
## What this shows and what this can be used for!

This problem demonstrates basic string manipulation and simulation of increment/decrement operations in Java. It can be used to understand how to process arrays of strings and perform conditional updates on variables.

---
## Intuition

The problem involves simulating a series of increment and decrement operations on a variable starting from zero. Each operation string contains either "++" or "--" to indicate whether to increment or decrement the variable.

---

## Approach (step-by-step)s
1. Initialize a variable x to 0 to represent the starting value.
2. Iterate through each operation in the operations array.
3. For each operation, check if it contains "++"; if yes, increment x by 1, otherwise decrement x by 1.
4. After processing all operations, return the final value of x.

---

## Alternate Approaches / Methods
- Use a switch statement or if-else based on the exact operation strings ("++X", "X++", "--X", "X--").
- Use a map to associate operations with their effects (+1 or -1).

---

## Complexity
- Time: O(n)
- Space: O(1)

---

## Code
```[java]
class FinalValueAfterIncrementAndDecrementOperations {
    public static void main(String[] args) {
        FinalValueAfterIncrementAndDecrementOperations solution = new FinalValueAfterIncrementAndDecrementOperations();
        String[] operations = {"--X", "X++", "X++"};
        int result = solution.finalValueAfterOperations(operations);
        System.out.println(result);
    }
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        int n = operations.length;
        while ( n > 0 ) {
            if ( operations[ operations.length - n ].contains("++") ){
                x++;
            } else {
                x--;
            }
            n--;
        }
        return x;
    }
}
```