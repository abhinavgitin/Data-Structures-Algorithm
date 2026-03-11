## Code
[View Code Here](../src/YourName.java)

# Problem:  YourName
**Platform:** codeforces
**Problem link:** 
**Date solved: 2026-03-02**  
**Tags:** strings, anagram, frequency

---
## What this shows and what this can be used for!

This code demonstrates how to check if two strings are anagrams by comparing the frequency of characters.

---
## Intuition

Anagrams are strings that contain the same characters with the same frequencies, regardless of order. To determine if two strings are anagrams, we can count the occurrences of each character in both strings and check if the counts match.

---

## Approach (step-by-step)s
1. Read the number of test cases, t.
2. For each test case:
   a. Read the integer n (representing the length, though not strictly necessary).
   b. Read the two strings, str1 and str2.
   c. If the lengths of str1 and str2 are not equal, output "NO" and skip to the next test case.
   d. Initialize an array freq of size 26 to count frequencies of lowercase letters.
   e. Iterate through each character in str1 and increment the corresponding frequency.
   f. Iterate through each character in str2 and decrement the corresponding frequency.
   g. Check if all values in freq are zero. If yes, output "Yes"; otherwise, output "NO".

---

## Alternate Approaches / Methods
- Sort both strings and compare them directly.
- Use a HashMap to count frequencies instead of an array.

---

## Complexity
- Time: O(t * n) where t is the number of test cases and n is the string length.
- Space: O(1) since the frequency array is of fixed size 26.

---

## Code
```java
import java.util.*;

public class YourName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while ( t-- > 0 ) {
            int[] freq = new int[26]; // cause there are 26 letters
            int n = sc.nextInt();
            String str1 = sc.next();
            String str2 = sc.next();
            if ( str1.length() != str2.length() ) {
                System.out.println("NO");
                continue;
            }
            for ( int i = 0 ; i < n ; i++ ) {
                freq[str1.charAt(i) - 'a']++;
                freq[str2.charAt(i) - 'a']--;
            }
            boolean printedFalse = false;
            for ( int i : freq ) {
                if ( i != 0 ) {
                    System.out.println("NO");
                    printedFalse = true;
                    break;
                }
            }
            if ( !printedFalse ) System.out.println("Yes");
        }
        sc.close();
    }
}
```