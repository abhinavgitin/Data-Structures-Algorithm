# Problem:  LawnMower
**Platform:** Codeforces
**Problem link:** 
**Date solved: 2026-02-08**  
**Tags:** math, greedy

---
## What this shows and what this can be used for!

This problem demonstrates how to maximize the number of removable elements (boards) from a sequence while ensuring no consecutive segment of a certain length (w) is removed, which could allow an object (lawn mower) to pass through. It can be used in scenarios involving resource allocation with constraints on consecutive removals, such as scheduling or optimization problems.

---
## Intuition

To prevent the lawn mower from exiting through the fence, we must avoid creating a gap of w or more consecutive removed boards. The key insight is that for every w boards, we can safely remove w-1 boards, leaving at least one to break any potential w-consecutive removal sequence. This maximizes the removals while satisfying the constraint.

---

## Approach (step-by-step)s
1. Read the number of test cases t.
2. For each test case:
   - Read the integers n (number of boards) and w (width of the lawn mower).
   - Compute the maximum number of boards that can be removed as n - (n / w), where / is integer division (floor division).
   - Output the computed value.
3. Repeat for all test cases.

---

## Alternate Approaches / Methods
- Dynamic programming could be used for smaller n, but since n can be up to 10^9, the mathematical formula is efficient.
- Brute force simulation is not feasible for large n.

---

## Complexity
- Time: O(t), where t is the number of test cases (up to 10^4), as each test case involves constant-time operations.
- Space: O(1), using only a few variables.

---

## Code
```java
import java.util.*;

public class LawnMower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for ( int i = 0 ; i < n ; i++ ){
            long a = sc.nextLong(); // the number of the boards 
            long b = sc.nextLong(); // this is the width 
            // the values can be large so we take the input as large;
            long removed = a - ( a / b );
            System.out.println(removed);
        }
        sc.close();
    }
}
```