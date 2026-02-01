## Code
[View Code Here](../src/IndexesOfSubArraySumIMP.java)

# Problem:  IndexesOfSubArraySumIMP
**Platform:** GFG
**Problem link:** https://www.geeksforgeeks.org/find-subarray-with-given-sum/
**Date solved: 2026-02-01**  
**Tags:** Array, Sliding Window, Subarray Sum

---
## What this shows and what this can be used for!

This solution demonstrates the sliding window technique for efficiently finding a contiguous subarray whose elements sum to a given target value. It's particularly useful for problems involving subarray sums where the array contains only positive numbers, allowing for O(n) time complexity without additional space for prefix sums.

---
## Intuition

The sliding window technique is ideal here because the array consists of positive integers. We maintain a window of elements and adjust it by expanding from the right and contracting from the left to keep the sum as close as possible to the target without exceeding it unnecessarily.

---

## Approach (step-by-step)s
1. Initialize `start` to 0 and `sum` to 0.
2. Iterate `end` from 0 to `arr.length - 1`.
3. Add `arr[end]` to `sum`.
4. While `sum > target` and `start <= end`, subtract `arr[start]` from `sum` and increment `start`.
5. If `sum == target`, return the 1-based indices `[start + 1, end + 1]`.
6. If no such subarray is found after the loop, return `[-1]`.

---
## Alternate Approaches / Methods
- Brute Force: Use nested loops to check all possible subarrays, resulting in O(n^2) time complexity.
- Prefix Sum with HashMap: Compute prefix sums and use a hashmap to store sums and their indices, achieving O(n) time and O(n) space, suitable for arrays with negative numbers.

---

## Complexity
- Time: O(n)
- Space: O(1)

---

## Code
```java
import java.util.ArrayList;
class IndexesOfSubArraySumIMP {
    public static void main(String[] args) {
        int[] arr = {1,2,3,7,5};
        int target = 12;
        ArrayList<Integer> result = subarraySum(arr, target);
        System.out.println(result);
    }
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        int start = 0;
        int sum = 0;
        for ( int end = 0 ; end < arr.length ; end++ ) {
            sum += arr[end];
            while( sum > target && start <= end ){
                sum -= arr[start];
                start++;
            }
            if ( sum == target ){
                list.add(start+1);
                list.add(end+1);
                return list;
            }
        }
        list.add(-1);
        return list;
    }
}
```