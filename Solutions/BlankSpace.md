## Code
[View Code Here](../src/BlankSpace.java)

# Problem:  BlankSpace
**Platform:** Codeforces
**Problem link:** https://codeforces.com/contest/977/problem/D
**Date solved: 2026-03-03**  
**Tags:** array, consecutive, zeros

---
## What this shows and what this can be used for!

This code demonstrates how to find the maximum number of consecutive zeros in an array, which can be useful in problems involving streak counting, pattern recognition in sequences, or analyzing binary data for gaps.

---
## Intuition

The problem requires finding the longest sequence of consecutive zeros in a given array. By iterating through the array and maintaining a count of consecutive zeros, we can efficiently track and update the maximum count encountered.

---

## Approach (step-by-step)s
1. Read the number of test cases `t`.
2. For each test case:
   a. Read the size of the array `n`.
   b. Read the array elements into an integer array.
   c. Initialize `count = 0` and `maxCount = 0`.
   d. Iterate through each element in the array:
      i. If the element is 0, increment `count` and update `maxCount` to the maximum of `maxCount` and `count`.
      ii. If the element is not 0, reset `count` to 0.
   e. Output the `maxCount` for the test case.

---

## Alternate Approaches / Methods
- Convert the array to a string and use string splitting or regex to find sequences of zeros, then find the maximum length.
- Use a list to store lengths of zero sequences and find the max.

---

## Complexity
- Time: O(n) where n is the total number of elements across all test cases.
- Space: O(n) for storing the array.

---

## Code
```java
import java.util.*;
// this is using normal convention and one flow!
public class BlankSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while ( t-- > 0 ) {

            int n = sc.nextInt();
            int[] arr = new int[n];
            int count = 0;
            int maxCount = 0;
            for ( int i = 0 ; i < n ; i++ ) {
                arr[i] = sc.nextInt();
                if ( arr[i] == 0 ) {
                    count++;
                    maxCount = Math.max(maxCount, count);
                } else {
                    count = 0;
                }
            }
            System.out.println(maxCount);
        }
        sc.close();
    }
}
```