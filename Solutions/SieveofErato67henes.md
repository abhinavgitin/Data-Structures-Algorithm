# Problem: SieveofErato67henes
**Platform:** Codeforces
**Problem link:** 
**Date solved: 2026-02-15**  
**Tags:** array, search, competitive-programming

---
## What this shows and what this can be used for!

This code demonstrates handling multiple test cases in competitive programming, reading input arrays from standard input, and performing a linear search to check for the presence of a specific value (67) in the array.

---
## Intuition

The problem requires checking if the number 67 is present in the given array for each test case. If 67 is found, output "YES"; otherwise, output "NO".

---

## Approach (step-by-step)s
1. Read the number of test cases `t`.
2. For each test case:
   a. Read the array length `l`.
   b. Read `l` integers into an array `a`.
   c. Initialize a boolean flag `found` to `false`.
   d. Iterate through the array: if any element equals 67, set `found` to `true`.
   e. Print "YES" if `found` is `true`, otherwise print "NO".
   f. Reset `found` to `false` for the next test case.

---

## Alternate Approaches / Methods
- Use a `HashSet` to store the array elements while reading them, then check if the set contains 67. This provides O(1) lookup time but uses O(n) space.
- For small array sizes, the linear search approach is efficient and simple.

---

## Complexity
- Time: O(t * l) where t is the number of test cases and l is the array length
- Space: O(l) for storing the array

---

## Code
```java
import java.util.*;

public class SieveofErato67henes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while ( t-- > 0 ) {
            int l = sc.nextInt();
            int a[] = new int[l];
            boolean found = false;
            for ( int i = 0 ; i < l ; i++ ) {
                // what i have to do is that i have to find two numbers into the array that can product up to 67 
                // if  so then its sout YES and if not then NO
                a[i] = sc.nextInt();
                if ( a[i] == 67 ) found = true;
            }
            if ( found ) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            found = false;
        }
        sc.close();
    }
}
```