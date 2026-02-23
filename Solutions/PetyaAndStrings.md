## Code
[View Code Here](../src/PetyaAndStrings.java)

# Problem:  PetyaAndStrings
**Platform:** Codeforces
**Problem link:** https://codeforces.com/problemset/problem/112/A
**Date solved: 2026-02-05**  
**Tags:** string, comparison, case-insensitive

---
## What this shows and what this can be used for!

This solution demonstrates how to perform case-insensitive string comparison in Java, which is useful for comparing strings where case differences should be ignored.

---
## Intuition

The problem requires comparing two strings lexicographically while ignoring case differences, returning 1 if the first string is greater, -1 if smaller, and 0 if equal.

---

## Approach (step-by-step)s
1. Read two strings from input using Scanner.
2. Convert both strings to lowercase using toLowerCase().
3. Use compareTo() method on StringBuilder (or String) to compare the lowercase versions.
4. Return 1 if the first string is lexicographically greater, -1 if smaller, 0 if equal.

---

## Alternate Approaches / Methods
- Use str1.toLowerCase().compareTo(str2.toLowerCase()) directly on Strings instead of StringBuilder.
- Use Collator with case-insensitive comparison for locale-specific ordering.

---

## Complexity
- Time: O(n) where n is the length of the strings
- Space: O(n) due to creating lowercase copies of the strings

---

## Code
```java
import java.util.*;

public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        PetyaAndStrings objcet = new PetyaAndStrings();
        System.out.println(objcet.checkStringForHer(str1, str2));
        sc.close();
    }
    int checkStringForHer( String str1, String str2 ) {
        StringBuilder sb1 = new StringBuilder(str1.toLowerCase());
        StringBuilder sb2 = new StringBuilder(str2.toLowerCase());
        int result = sb1.compareTo(sb2);
        if ( result > 0 ) return 1;
        else if ( result < 0 )return -1;
        return 0;
    }
}
```