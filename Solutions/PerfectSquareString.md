## Code
[View Code Here](../src/PerfectSquareString.java)

# Problem:  PerfectSquareString
**Platform:** GFG
**Problem link:** https://www.geeksforgeeks.org/perfect-square-string/
**Date solved: 2026-02-23**  
**Tags:** string, ascii, perfect-square

---
## What this shows and what this can be used for!

This solution demonstrates how to check if the sum of ASCII values of characters in a string forms a perfect square, which can be used in string validation or mathematical checks on text data.

---
## Intuition

The problem requires determining if the sum of the ASCII values of all characters in the string is a perfect square.

---

## Approach (step-by-step)s
1. Convert the input string to a character array.
2. Initialize a sum variable to 0.
3. Iterate through each character in the array and add its ASCII value to the sum.
4. Compute the square root of the sum using Math.sqrt().
5. Check if the square of the integer part of the root equals the sum.
6. Return 1 if it is a perfect square, otherwise return 0.

---

## Alternate Approaches / Methods
- Use a loop to check from 1 to sqrt(sum) if any integer i satisfies i*i == sum.
- Use BigInteger for larger sums if needed, but not necessary here.

---

## Complexity
- Time: O(n) where n is the length of the string
- Space: O(n) due to the character array

---

## Code
```java
import java.util.*;

public class PerfectSquareString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isSquare(str));
        sc.close();
    }

    static int isSquare(String S)
    {
        char[] ch = S.toCharArray();
        long sum = 0;
        for ( int i = 0 ; i < ch.length ; i++ ) {
            sum += ch[i];
        }
        // System.out.println(sum);
        long root = (long)Math.sqrt(sum);
        if (  root*root == sum ) return 1;
        return 0;
    }
}
```