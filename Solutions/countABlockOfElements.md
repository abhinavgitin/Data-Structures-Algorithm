## Code
[View Java Code](../src/countABlockOfElements.java)

# Problem: count the block of elements | find the distance between the two arrays
**Platform:** LeetCode  
**Problem link:** [Find the Distance Value Between Two Arrays](https://leetcode.com/problems/find-the-distance-value-between-two-arrays/)  
**Date solved:** 2025-11-16  
**Tags:** Array, Sorting, Binary Search, Counting

---
## What this shows and what this can be used for!
- Binary search on a sorted array to find the nearest neighbor to a target.
- How to reduce a naive O(n·m) pairwise check to O(n log m) by sorting one array and probing with binary search.
- A common pattern for “is every element farther than d?” using insertion points from `Arrays.binarySearch`.

---
## Intuition
If `arr2` is sorted, then for any `x` in `arr1`, the only candidates in `arr2` that can be closest to `x` are the two neighbors around the position where `x` would be inserted. If both neighbors (if they exist) are farther than `d`, then all elements in `arr2` are farther than `d` as well.

---
## Approach (step-by-step)
1. Sort `arr2` once.
2. For each `x` in `arr1`, use `Arrays.binarySearch(arr2, x)` to find the insertion point:
   - If exact match found, distance is `0` (≤ d) → do not count this `x`.
   - Otherwise, check the two neighbors around the insertion point (left and right) if they exist.
3. If both neighbors are at a distance strictly greater than `d`, increment the answer.

---
## Alternate Approaches / Methods
- Two-pointer after sorting both arrays: sweep to find, for each `x` in `arr1`, whether any `y` in `arr2` lies within `[x-d, x+d]`. Complexity also `O(n log n + m log m)` for the initial sorts, then `O(n + m)` sweep.
- Naive double loop: for each `x` in `arr1`, scan all `y` in `arr2` and break early when `|x - y| <= d`. Complexity `O(n·m)`; simpler but slower for large inputs.

---
## Complexity
- Time: `O(m log m + n log m)` where `m = arr2.length` and `n = arr1.length` (sort `arr2` once, then binary search for each `arr1` element).
- Space: `O(1)` extra (in-place sort if allowed by environment; otherwise `O(m)` depending on sort implementation).

---
## Code
```[java]
import java.util.Arrays;

public class countABlockOfElements {
    public static void main(String[] args) {
        // Example usage
        countABlockOfElements obj = new countABlockOfElements();
        int[] arr1 = {4,5,8};
        int[] arr2 = {10,9,1,8};
        int d = 2;
        int result = obj.findTheDistanceValue(arr1, arr2, d);
        System.out.println(result); // Output: 2
    }
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int eval = 0;
        int count = 0;
        boolean isGreater = false;
        for ( int i : arr1 ){
            for ( int j : arr2 ){
                eval = Math.abs(i-j);
                if ( eval > d ){
                    isGreater = true;
                } else {
                    isGreater = false;
                    break;
                }
            }
            if ( isGreater ) count++;
            isGreater = false;
        }
        return count;
    }
}
```