## Code
[View Code Here](../src/MissingKthElement.java)

# Problem:  MissingKthElement
**Platform:** GFG
**Problem link:** https://practice.geeksforgeeks.org/problems/kth-missing-element-1587115620/1
**Date solved: 2026-02-20**  
**Tags:** Array, Math

---
## What this shows and what this can be used for!
This demonstrates how to find the kth missing number in a sorted array by calculating gaps between consecutive elements. It's useful for problems involving missing elements in sequences or arrays.

---
## Intuition
The array is sorted, and missing numbers occur in gaps between non-consecutive elements. By iterating through the array and checking these gaps, we can count the missing numbers and find the kth one.

---

## Approach (step-by-step)s
1. Iterate through the array starting from index 1.
2. For each pair of consecutive elements, check if they are not consecutive (arr[i] != arr[i-1] + 1).
3. If not, calculate the number of missing elements in the gap: `noOfMissingGap = arr[i] - arr[i-1] - 1`.
4. If this gap is greater than or equal to k, return `arr[i-1] + k`.
5. Otherwise, subtract the gap from k and continue to the next pair.
6. If no gap contains the kth missing element, return -1.

---

## Alternate Approaches / Methods
- Use binary search to find the smallest index where the number of missing elements up to that point is at least k, then compute the exact missing number.
- This would improve time complexity to O(log n).

---

## Complexity
- Time: O(n)
- Space: O(1)

---

## Code
```[java]
// User function Template for Java
import java.util.*;

class MissingKthElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(new MissingKthElement().KthMissingElement(arr, k));
        }
        sc.close();
    }

    int KthMissingElement(int arr[], int k) {
        // Complete the function
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1] + 1) {
                int noOfMissingGap = arr[i] - arr[i - 1] - 1;
                // this gives the gap difference between the two numbers!
                if (noOfMissingGap >= k) {
                    return arr[i - 1] + k;
                } else {
                    k -= noOfMissingGap;
                }
            }
        }
        return -1; // when we are outOfThBOunds
    }
}
```