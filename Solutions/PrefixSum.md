# Problem:  PrefixSum
**Platform:** Codeforces
**Problem link:** https://codeforces.com/contest/918/problem/B
**Date solved: 2026-02-10**  
**Tags:** arrays, prefix sum, brute force

---
## What this shows and what this can be used for!

This solution demonstrates a brute force approach to maximize the sum of prefix maximums by trying all possible single swaps. It can be used for problems requiring optimization through element rearrangement with limited operations.

---
## Intuition

The sum of prefix maximums is maximized when the largest element is placed at the beginning of the array, making all prefix maximums equal to that value.

---

## Approach (step-by-step)s
1. Read the number of test cases.
2. For each test case:
   - Read the array length `n` and the array elements.
   - Compute the sum of prefix maximums for the original array using `calcMax`.
   - Iterate over all pairs `(i, j)` where `i < j`:
     - Swap elements at `i` and `j`.
     - Compute the sum of prefix maximums for the swapped array.
     - Update the maximum sum if this is larger.
     - Swap back to restore the array.
   - Output the maximum sum found.

---

## Alternate Approaches / Methods
- Directly compute the maximum as `n * max_element` since placing the maximum at index 0 achieves the optimal sum, and check if it's already there or swap once if needed. This is more efficient but the brute force works for small n.

---

## Complexity
- Time: O(t * n^2) where t is the number of test cases and n is the array size, due to O(n^2) swaps and O(n) computation per swap.
- Space: O(n) for storing the array.

---

## Code
```java
import java.util.Scanner;

public class PrefixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfTestCases = sc.nextInt();
        // it is said that we need to calcculate the maximum sum of the array my taking the maximum value from the prefix sum that we have
        // also being said that we can do one swap that will increase the max sum of the array but it has to be just one swap
        while (noOfTestCases > 0) {
            // so we take the no of test cases
            int len = sc.nextInt();
            int[] arr = new int[len]; // store in array
            for (int in = 0; in < len; in++) {
                arr[in] = sc.nextInt(); // input all of them
            }
            int ans = calcMax(arr); // calculate the default max that can go
            for (int i = 0; i < len; i++) {
                for (int j = i + 1; j < len; j++) {
                    // now we swap exactly one time for each interval in the array to see that can the array with just one universal swap in it will give the more then the default max?
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    ans = Math.max(ans, calcMax(arr) ); // we pass the swaped array
                    // if it gave more then the previous max valure it will get stored and then will be ready to see that does there exist any value more then the current maximum value
                    // then we swap to the original formation
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(ans);
            noOfTestCases--;
        }
        sc.close();
    }

    static int calcMax(int[] arr) {
        int sum = 0;
        int max = 0;
        for (int i : arr) {
            max = Math.max(max, i);
            sum += max; // sum of the default max here for the first time called
        }
        return sum;
    }
}
```