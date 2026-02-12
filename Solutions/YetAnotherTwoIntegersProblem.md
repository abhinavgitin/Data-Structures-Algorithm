## Code
[View Code Here](../src/YetAnotherTwoIntegersProblem.java)

# Problem:  YetAnotherTwoIntegersProblem
**Platform:** Codeforces
**Problem link:** https://codeforces.com/contest/1409/problem/A
**Date solved: 2026-02-12**  
**Tags:** math, greedy, implementation

---
## What this shows and what this can be used for!

This solution demonstrates the use of ceiling division to calculate the minimum number of operations required to make two numbers equal by adding or subtracting 10 in each step. It can be used in scenarios where you need to find the minimum steps to reach a target value with fixed increment/decrement operations.

---
## Intuition

To minimize the number of operations to make two numbers equal, we need to cover the absolute difference between them using steps of 10. Since we can only add or subtract 10, the minimum operations is the ceiling of the difference divided by 10.

---

## Approach (step-by-step)s
1. Read the number of test cases, t.
2. For each test case:
   a. Read the current number (currNum) and the target number (finalNum).
   b. If currNum equals finalNum, the answer is 0.
   c. Otherwise, calculate the absolute difference: diff = |finalNum - currNum|.
   d. The minimum operations is ceil(diff / 10), which can be computed as (diff + 9) / 10 in integer arithmetic.
3. Output the result for each test case.

---

## Alternate Approaches / Methods
- Using floating point division and Math.ceil, as shown in the code.
- The optimized integer version: (diff + 9) / 10, which avoids floating point operations.

---

## Complexity
- Time: O(t) where t is the number of test cases, since each test case takes constant time.
- Space: O(1), as we use only a few variables.

---

## Code
```java
import java.util.*;

public class YetAnotherTwoIntegersProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        int t = sc.nextInt();
        while ( t-- > 0 ) {
            int currNum = sc.nextInt();
            int finalNum = sc.nextInt();
            if ( currNum == finalNum ) {
                System.out.println(0);
                continue;
            }
            double diff = Math.abs(finalNum-currNum);
            double count = diff/10d;
            System.out.println((int)Math.ceil(count));
            // or more optimised :
            //System.out.println((int)(diff + 10 - 1 ) / 10);
        }
        sc.close();
    }
}
```