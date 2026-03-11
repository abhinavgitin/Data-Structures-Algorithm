## Code
[View Code Here](../src/HQ9Plus.java)

# Problem:  HQ9Plus
**Platform:** codeforces
**Problem link:** 
**Date solved: 2026-03-10**  
**Tags:** string, contains

---
## What this shows and what this can be used for!

This problem demonstrates how to check for the presence of specific characters in a string using Java's String.contains() method. It can be used for understanding basic string operations and conditional logic in programming contests or simple text processing tasks.

---
## Intuition

HQ9+ is a joke programming language with only four commands: 'H' (prints "Hello, World!"), 'Q' (prints the program's source code), '9' (prints the lyrics to "99 Bottles of Beer"), and '+' (increments an accumulator). The task is to determine if a given program in HQ9+ actually does something, i.e., contains at least one of the meaningful commands 'H', 'Q', or '9'.

---

## Approach (step-by-step)s
1. Read the input string using Scanner.
2. Check if the string contains 'H', 'Q', or '9' using the contains() method.
3. If any of these characters are present, print "YES"; otherwise, print "NO".
4. Close the scanner.

---

## Alternate Approaches / Methods
- Use a loop to iterate through each character and check if it matches 'H', 'Q', or '9'.
- Use regular expressions with Pattern and Matcher to search for the characters.
- Use indexOf() method to check for each character individually.

---

## Complexity
- Time: O(n) where n is the length of the input string (due to string searching)
- Space: O(1) additional space (excluding the input string)

---

## Code
```java
import java.util.Scanner;

public class HQ9Plus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if ( str.contains("H") || str.contains("Q") || str.contains("9")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}
```