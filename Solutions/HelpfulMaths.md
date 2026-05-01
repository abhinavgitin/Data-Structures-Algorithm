## Code
[View Code Here](../src/HelpfulMaths.java)

# Problem:  HelpfulMaths
**Platform:** codeforces
**Problem link:** https://codeforces.com/problemset/problem/339/A
**Date solved: 2026-04-29**  
**Tags:** String, Sorting

---
## What this shows and what this can be used for!

This solution demonstrates how to rearrange numbers in a sum expression string in ascending order. It can be used for string manipulation problems involving parsing and sorting numerical values.

---
## Intuition

The problem requires rearranging the numbers in a string like "3+2+1" to "1+2+3" by sorting them in ascending order. Since the numbers are only 1, 2, or 3, we can count their occurrences and reconstruct the string.

---

## Approach (step-by-step)s
1. Read the input string using Scanner.
2. Initialize counters for 1, 2, and 3.
3. Iterate through each character in the string, skipping '+' and incrementing the respective counter for '1', '2', or '3'.
4. Use StringBuilder to append the numbers in order: first all '1's with '+', then '2's, then '3's.
5. Remove the trailing '+' at the end.
6. Print the resulting string.

---

## Alternate Approaches / Methods
- Parse the string into an ArrayList of integers, sort the list, and rebuild the string with '+' separators.

---

## Complexity
- Time: O(n)
- Space: O(1)

---

## Code
```java
import java.util.*;
public class HelpfulMaths {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();
        // sc.close();
        // int length = str.length();
        // ArrayList<Integer> list = new ArrayList<>();
        // for ( int i = 0 ; i < length ; i++ ) {
        //     char digit = str.charAt(i);
        //     if ( digit != '+' ) {
        //         list.add(digit - '0');
        //     }
        // }
        // Collections.sort(list);
        // StringBuilder sb = new StringBuilder();
        // for ( int i : list ) {
        //     sb.append(i);
        //     sb.append("+");
        // }
        // if ( sb.charAt(sb.length()-1) == '+' ) {
        //     sb.deleteCharAt(sb.length()-1);
        // }
        // System.out.println(sb);

        // ------- other way ------ 
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        int countOf1 = 0;
        int countOf2 = 0;
        int countOf3 = 0;     
        int length = str.length();   
        for ( int i = 0 ; i < length ; i++ ) {
            char digits = str.charAt(i);
            if ( digits != '+' ){
                if ( digits == '1' ) countOf1++;
                else if ( digits == '2' ) countOf2++;
                else countOf3++;
            }
        }
        StringBuilder sb = new StringBuilder();
        while ( countOf1-- > 0 ) sb.append("1+");
        while ( countOf2-- > 0 ) sb.append("2+");
        while ( countOf3-- > 0 ) sb.append("3+");
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb);
    }
}
```