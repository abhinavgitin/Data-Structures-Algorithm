## Code
[View Code Here](../src/MinimumCutsToDivTheCake.java)

# Problem:  MinimumCutsToDivTheCake
**Platform:** Leetcode
**Problem link:** 
**Date solved: 2026-02-03**  
**Tags:** math, conditional

---
## What this shows and what this can be used for!

This problem demonstrates a simple mathematical formula to calculate the minimum cuts needed to divide a cake into n pieces, based on the parity of n. It can be used in scenarios involving division problems with different rules for even and odd numbers.

---
## Intuition

The minimum number of cuts to divide a cake into n pieces follows a pattern: for even n, it's n/2 cuts; for odd n, it's n cuts (with a special case for n=1).

---

## Approach (step-by-step)s
1. Check if n is even or odd using n % 2.
2. If n is even, return n / 2.
3. If n is odd, return n if n > 1, otherwise return 1.

---
## Alternate Approaches / Methods
- Use if-else statements instead of ternary operator for better readability.
- Precompute the result using a switch case for small n.

---
## Complexity
- Time: O(1)
- Space: O(1)

---

## Code
```[java]
public class MinimumCutsToDivTheCake {
    public static void main(String[] args) {
        MinimumCutsToDivTheCake obj = new MinimumCutsToDivTheCake();
        int n = 4; // Example input
        int result = obj.MinimumCuts(n);
        System.out.println("Minimum cuts needed to divide the cake into " + n + " pieces: " + result);
    }
    
    int MinimumCuts( int n ) {
        return ( n % 2 != 0 )? (( n > 1 )? n : 1 ) : n / 2;
    }
}
```