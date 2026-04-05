# Problem: Count 1s in Binary Array
**Platform:** gfg
**Problem link:** 
**Date solved: 2026-03-24**  
**Tags:** binary search, array

---
## What this shows and what this can be used for!

This solution demonstrates an efficient way to count the number of 1s in a sorted binary array where all 1s appear before 0s. It uses binary search to find the transition point, which is useful for problems requiring O(log n) time complexity on sorted arrays.

---
## Intuition

In a sorted binary array with 1s followed by 0s, the number of 1s equals the index of the first 0. If there are no 0s, all elements are 1s, so the count is the array length.

---

## Approach (step-by-step)
1. Initialize start = 0, end = arr.length - 1, and index = -1
2. While start <= end:
   - Calculate mid = start + (end - start) / 2
   - If arr[mid] == 0, set index = mid and search left (end = mid - 1)
   - Else, search right (start = mid + 1)
3. Return index if found (>=0), else arr.length

---

## Alternate Approaches / Methods
- Linear search: Iterate through the array and count 1s - O(n) time
- Use built-in functions if available, but this is a manual implementation

---

## Complexity
- Time: O(log n)
- Space: O(1)

---

## Code
```java
class Cout1InBinaryArray {
    public static void main(String[] args) {
        Cout1InBinaryArray obj = new Cout1InBinaryArray();
        System.out.println(obj.countOnes(new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1}));
    }
    public int countOnes(int[] arr) {
        // code here
        // what we do is we find the first 0 and then from that index we do
        // return that position of the 0 cause the 1 counts till there
        int start = 0;
        int end = arr.length-1;
        int mid = 0;
        int index = -1;
        while ( start <= end ) {
            mid = start + ( end - start ) / 2;
            if ( arr[mid] == 0 ) {
                index = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ( index >= 0 )? index : arr.length;
    }
}
```