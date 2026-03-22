# Problem: X Axis
**Platform:** Codeforces
**Problem link:** 
**Date solved: 2026-03-15**  
**Tags:** Math, Sorting, Median

---
## What this shows and what this can be used for!

This problem demonstrates the concept of using the median to minimize the sum of absolute deviations. It's useful in optimization problems where you need to find a central point that minimizes the total distance to a set of points, such as in facility location or data analysis.

---
## Intuition

To minimize the sum of absolute differences between a set of points and a target point on the x-axis, the optimal point is the median of the points. For three points, sorting them and choosing the middle value as the meeting point achieves this.

---

## Approach (step-by-step)
1. Read the number of test cases `t`.
2. For each test case:
   - Read three integers into an array.
   - Sort the array in ascending order.
   - The median is the middle element (index 1 in 0-based indexing).
   - Calculate the sum of absolute differences: |arr[0] - median| + |arr[1] - median| + |arr[2] - median|.
   - Print the result.

---

## Alternate Approaches / Methods
- **Brute force**: Try each of the three points as the meeting point, compute the sum of absolute differences for each, and choose the minimum. This works for small n but is less efficient for larger sets.
- **Mathematical formula**: Since the median minimizes the sum, it's the direct approach.

---

## Complexity
- Time: O(t) - Sorting 3 elements is constant time, and t is the number of test cases.
- Space: O(1) - Only a fixed-size array is used.

---

## Code
```java
import java.util.*;

public class XAxis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int[] arr = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
            Arrays.sort(arr);
            int median = arr[1];
            int ans = Math.abs(arr[0] - median) + Math.abs(arr[1] - median) + Math.abs(arr[2] - median);
            System.out.println(ans);
        }
        sc.close();
    }
}
```