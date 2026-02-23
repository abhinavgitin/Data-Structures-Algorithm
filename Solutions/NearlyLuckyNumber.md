## Code
[View Code Here](../src/NearlyLuckyNumber.java)

# Problem:  NearlyLuckyNumber
**Platform:** Codeforces
**Problem link:** https://codeforces.com/problemset/problem/110/A
**Date solved: 2026-02-23**  
**Tags:** number, lucky-digits, count

---
## What this shows and what this can be used for!

This solution demonstrates how to determine if a number is nearly lucky by checking if the count of lucky digits (4 and 7) in the number is itself composed only of lucky digits.

---
## Intuition

A number is nearly lucky if the number of lucky digits (4 and 7) in its decimal representation is a lucky number itself, meaning it consists only of 4s and 7s.

---

## Approach (step-by-step)s
1. Read the input number as a string.
2. Convert the string to a character array.
3. Count the number of '4' and '7' characters in the array.
4. If the count is 0, return "NO".
5. While the count is greater than 0, check each digit (count % 10) to ensure it's 4 or 7; if not, return "NO".
6. Divide count by 10 to move to the next digit.
7. If all digits are 4 or 7, return "YES".

---

## Alternate Approaches / Methods
- Convert the count to a string and check each character is '4' or '7'.
- Use recursion to check the digits of the count.

---

## Complexity
- Time: O(n + log c) where n is the length of the string and c is the count
- Space: O(n) for the character array

---

## Code
```java
import java.util.*;

public class NearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        String n = sc.nextLine();
        System.out.println(luckyNum(n));
        sc.close();
        
    }
    public static String luckyNum ( String str ) {
        int count = 0;
        char[] ch = str.toCharArray();
        for ( char c : ch ) {
            if ( c == '4' || c == '7' ) count++;
        }
        if ( count == 0 ) return "NO";
        while ( count > 0 ) {
            int digits = count % 10;
            if ( digits != 4 && digits != 7 ) {
                return "NO";
            }
            count /= 10;
        }
        return "YES";
    }
}
```