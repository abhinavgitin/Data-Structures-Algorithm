## Code
[View Code Here](../src/SortFirstHalfinAscendingAndSecondHalfIndescending.java)

# Problem:  SortFirstHalfinAscendingAndSecondHalfIndescending
**Platform:** geeksforgeeks
**Problem link:** https://www.geeksforgeeks.org/sort-first-half-in-ascending-and-second-half-in-descending-order/
**Date solved: 2026-03-30**  
**Tags:** Array, Sorting

---
## What this shows and what this can be used for!

This demonstrates how to apply different sorting orders to different parts of an array. It can be used in scenarios where data needs to be organized with varying sort criteria across segments, such as in data processing or custom array manipulations.

---
## Intuition

To sort the first half of the array in ascending order and the second half in descending order, we can sort each half separately and then combine them in the required order.

---

## Approach (step-by-step)s
1. Calculate the midpoint of the array.
2. Sort the first half (from index 0 to mid-1) in ascending order using Arrays.sort.
3. Sort the second half (from index mid to end) in ascending order.
4. Create an ArrayList and add elements from the sorted first half.
5. Add elements from the sorted second half in reverse order (from end to mid) to achieve descending order.
6. Return the ArrayList.

---

## Alternate Approaches / Methods
- Sort the entire array and then reverse the second half.
- Use custom comparators or manual sorting for each half.

---

## Complexity
- Time: O(n log n) due to sorting
- Space: O(n) for the output ArrayList

---

## Code
```java
// User function Template for Java
import java.util.*;
class SortFirstHalfinAscendingAndSecondHalfIndescending {
    public static void main(String[] args) {
        SortFirstHalfinAscendingAndSecondHalfIndescending obj = new SortFirstHalfinAscendingAndSecondHalfIndescending();
        int[] arr = {5, 4, 6, 2, 3, 8, 9, 7};
        System.out.println(obj.customSort(arr));
    }
    public ArrayList<Integer> customSort(int[] arr) {
        // your code
        ArrayList<Integer> list = new ArrayList<>();
        int mid = arr.length/2;
        int start = 0;
        int end = arr.length-1;
        Arrays.sort(arr, 0, mid);
        Arrays.sort(arr, mid, arr.length);
        while( start < mid ) list.add(arr[start++]);
        while ( end >= mid ) list.add(arr[end--]);
        return list;
    }
}
```