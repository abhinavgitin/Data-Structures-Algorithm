# Problem:  BeautifulYear
**Platform:** CodeForces
**Problem link:** 
**Date solved: 2026-02-08**  
**Tags:** brute force, digits

---
## What this shows and what this can be used for!

This problem shows how to find the next year after a given year that has all distinct digits. It can be used in scenarios involving date validation, uniqueness checks in numerical sequences, or calendar-related computations.

---
## Intuition

A beautiful year is one where all four digits are unique (no repeats). We need to increment the year until we find one that satisfies this condition.

---

## Approach (step-by-step)s
1. Read the input year from the user.
2. Start a loop from `year + 1` onwards.
3. For each year `i` in the loop:
   - Initialize a boolean array `seen[10]` to track digits 0-9.
   - Set `thisYear = i`.
   - While `thisYear > 0`:
     - Extract the last digit: `digit = thisYear % 10`.
     - If `seen[digit]` is already true, break (digit repeated).
     - Otherwise, set `seen[digit] = true`.
     - Remove the last digit: `thisYear /= 10`.
   - If `thisYear == 0` (all digits processed without repeats), return `i`.
4. Output the beautiful year found.

---

## Alternate Approaches / Methods
- Convert the year to a string and use a HashSet to check for unique characters.
- Use modulo and division to extract digits and check against a set or another data structure.

---

## Complexity
- Time: O(1), as the loop runs at most 9000 times (from year 1000 to 9999), and each check is O(1).
- Space: O(1), using a fixed-size boolean array.

---

## Code
```java
import java.util.Scanner;

public class BeautifulYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        BeautifulYear object = new BeautifulYear();
        System.out.println(object.chcekBeautifulYear(year));
        sc.close();
    }
    int chcekBeautifulYear( int year ) {
        for ( int i = year+1 ; ; i++ ) {
            int thisYear = i;
            boolean[] seen = new boolean[10];
            while ( thisYear > 0 ) {
                int digits = thisYear%10;
                if ( seen[digits] ) {
                    break;
                } else {
                   seen[digits] = true;
                   thisYear /= 10; 
                }
                if ( thisYear == 0 ) return i;
            }
        }
    }
}
```