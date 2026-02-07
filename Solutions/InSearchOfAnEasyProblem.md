## Code
[View Code Here](../src/InSearchOfAnEasyProblem.java)

# Problem:  InSearchOfAnEasyProblem
**Platform:** Codeforces
**Problem link:** https://codeforces.com/problemset/problem/1030/A
**Date solved: 2026-02-07**  
**Tags:** array, simple, conditional

---
## What this shows and what this can be used for!
This solution demonstrates basic input handling, looping through an array, and making a decision based on conditions in Java. It can be used as a template for problems requiring scanning inputs and checking for specific values.

---
## Intuition
The problem requires determining if a problem is 'HARD' or 'EASY' based on participants' opinions. If any participant thinks it's hard (represented by 1), the problem is considered hard; otherwise, it's easy.

---

## Approach (step-by-step)s
1. Read the number of opinions, n, from the input.
2. Initialize a boolean flag `itsHard` to false.
3. Loop through the next n integers; for each integer x, if x is 1, set `itsHard` to true and break out of the loop.
4. After the loop, if `itsHard` is true, print "HARD"; otherwise, print "EASY".
5. Close the scanner.

---

## Alternate Approaches / Methods
- Use an array to store all opinions and then iterate to check for 1, but this uses more space.
- Use Java streams to check if any element is 1, e.g., Arrays.stream(arr).anyMatch(x -> x == 1).

---

## Complexity
- Time: O(n)
- Space: O(1)

---

## Code
```java
import java.util.Scanner;

public class InSearchOfAnEasyProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        int n = sc.nextInt();
        boolean itsHard = false;
        for ( int i = 0 ; i < n ; i++ ) {
            int x = sc.nextInt();
            if ( x == 1 ) {
                itsHard = true;
                break;
            }
        }
        if ( itsHard ) System.out.println("HARD");
        else System.out.println("EASY");
        sc.close();
    }
}
```