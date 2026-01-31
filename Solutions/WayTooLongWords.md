## Code
[View Code Here](../src/WayTooLongWords.java)

# Problem:  WayTooLongWords
**Platform:** <Codeforces>
**Problem link:** [CodeForces](https://codeforces.com/problemset/problem/71/A)
**Date solved: 2026-01-31**  
**Tags:** String manipulation

---
## What this shows and what this can be used for!
- Demonstrates string input handling and conditional abbreviation of long words
- Shows how to manipulate strings by accessing characters and computing lengths
- Illustrates basic input/output operations in Java using Scanner
---
## Intuition
The problem requires processing multiple words and abbreviating those that are too long (more than 10 characters) to make them shorter while preserving the essential information. For long words, we keep the first and last letters and indicate the number of letters in between.

## Approach (step-by-step)s
1. Read the number of test cases (words) n from the input.
2. For each of the n words:
   - Read the word as a string.
   - Check if the length of the word is greater than 10.
   - If yes, abbreviate it by taking the first character, the count of characters in the middle (length - 2), and the last character.
   - If no, print the word as is.
3. Close the scanner to free resources.

## Alternate Approaches / Methods
- Use StringBuilder for building the abbreviated string to avoid string concatenation overhead, though for this simple case it's not necessary.
- Read all input at once using nextLine() and process line by line, but Scanner with next() works fine here.

## Complexity
- Time: O(n * m) where n is the number of words and m is the maximum word length (due to string operations)
- Space: O(m) for storing each word during processing

## Code
```java
import java.util.*;

public class WayTooLongWords {
    public static void main(String[] args) {
        // if the length of the string is more then 10 letters then we short it by writing the 
        // first and the last letter and then putting the remaining number of letters into the middle of the first and the last letter
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            // now i read each string and the give the output one by one for them
            String str = sc.next();
            if (str.length() > 10) {
                // we make the abbreviation
                System.out.println(str.charAt(0) + "" + (str.length() - 2) + "" + str.charAt(str.length() - 1));
            } else {
                System.out.println(str);
            }
        }
        sc.close();
    }
}
```