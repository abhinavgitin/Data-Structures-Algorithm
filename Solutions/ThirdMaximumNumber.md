# Problem: Third Maximum Number
**Platform:** leetcode
**Problem link:** [Leetcode](https://leetcode.com/problems/third-maximum-number/solutions/?envType=problem-list-v2&envId=n9l2clom)
**Date solved: 2026-03-25**  
**Tags:** array, linear search

---
## What this shows and what this can be used for!

This solution demonstrates how to find the third maximum number in an array in a single pass, handling duplicates efficiently. It's useful for problems requiring k-th maximum elements without sorting the entire array.

---
## Intuition

To find the third largest distinct number, we can track the top three maximum values as we iterate through the array. If fewer than three distinct numbers exist, return the largest one.
- also we can find the fourth largest bu using the same method as we do have right now!
---

## Approach (step-by-step)
1. Initialize three variables (largest, secondLargest, thirdLargest) to Long.MIN_VALUE
2. Iterate through each element in the array:
   - Skip if it equals any of the current largest values (to handle duplicates)
   - Update the three largest values by shifting them down as needed
3. If thirdLargest is still MIN_VALUE, return largest; otherwise, return thirdLargest

---

## Alternate Approaches / Methods
- Sort the array and find the third distinct element from the end - O(n log n) time
- Use a priority queue or set to track top three - O(n log 3) time

---

## Complexity
- Time: O(n)
- Space: O(1)

---
   
## Code
```java []
class ThirdMaximumNumber {
    public static void main(String[] args) {
        
    }
    public int thirdMax(int[] arr) {
        long largest = Long.MIN_VALUE;
        long secondLargest = Long.MIN_VALUE;
        long thirdLargest = Long.MIN_VALUE;
        for (int i : arr) {
            if ( i == largest || i == secondLargest || i == thirdLargest ) continue; // for the duplicates
            if (largest < i) {
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = i;
            } else if ( secondLargest < i ) {
                thirdLargest = secondLargest;
                secondLargest = i;
            } else if ( thirdLargest < i ) {
                thirdLargest = i;
            }
        }
        return ( thirdLargest == Long.MIN_VALUE )? (int)largest : (int)thirdLargest;
    }
}
```