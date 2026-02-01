## Code
[View Code Here](../src/Team.java)

# Problem:  Team
**Platform:** CodeForces
**Problem link:** https://codeforces.com/problemset/problem/231/A
**Date solved: 2026-02-01**  
**Tags:** implementation, math

---
## What this shows and what this can be used for!

This problem demonstrates counting scenarios where a majority or specific condition (at least two out of three) is met in a set of binary decisions. It can be used in voting systems, consensus checking, or any situation requiring threshold-based counting.

---
## Intuition

For each problem, we have three binary opinions (1 for sure, 0 for no). We need to count how many problems have at least two "sure" votes, indicating the team can solve it.

---

## Approach (step-by-step)s
1. Read the integer n, representing the number of problems.
2. Initialize a counter variable to 0.
3. For each of the n problems:
   - Read three integers a, b, c.
   - Check if at least two of them are equal to 1.
   - If the condition is true, increment the counter.
4. Print the final count.

---

## Alternate Approaches / Methods
- Instead of checking pairs, sum the three values (a + b + c) and check if the sum >= 2.
- Use bitwise operations or other logical checks, but the current approach is straightforward.

---

## Complexity
- Time: O(n)
- Space: O(1)

---

## Code
```java
import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        int n = sc.nextInt();
        int a ,b , c, count = 0;
        for ( int i = 1 ; i <= n ; i++ ){
            a = sc.nextInt();
            
            b = sc.nextInt();
            
            c = sc.nextInt();
            if ( a == 1 && b == 1 || c == 1 && b == 1 || c == 1 && a == 1 ){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
```