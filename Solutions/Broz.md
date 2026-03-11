## Code
[View Code Here](../src/Borze.java)

# Problem:  Borze
**Platform:** Codeforces
**Problem link:** 
**Date solved: 2026-03-03**  
**Tags:** string, decoding

---
## What this shows and what this can be used for!

This problem demonstrates how to decode a custom encoding scheme called Borze, where dots and dashes represent binary digits. It can be used for understanding string parsing and pattern matching in Java.

---
## Intuition

Borze is a simple encoding where:
- A single dot (.) represents 0
- A dash followed by a dot (-.) represents 1  
- Two dashes (--) represent 2

The task is to decode a string of these symbols back to the original digits.

---

## Approach (step-by-step)s
1. Read the input string using Scanner.
2. Initialize a StringBuilder to build the result.
3. Iterate through the string character by character.
4. If current character is '.', append '0' and move to next.
5. If current character is '-', check the next:
   - If next is '.', append '1' and skip both characters.
   - If next is '-', append '2' and skip both characters.
6. Print the resulting string.

---

## Alternate Approaches / Methods
- Use regular expressions to replace patterns: replaceAll("\\.\\.", "0"), etc., but the current approach is more efficient.
- Use a loop with index incrementing based on pattern length.

---

## Complexity
- Time: O(n) where n is the length of the input string
- Space: O(n) for the StringBuilder

---

## Code
```java
import java.util.*;

public class Borze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder num = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            if (str.charAt(i) == '.') {
                num.append("0");
                i++;
            } else {
                if (str.charAt(i) == '-') {
                    // we check that is the nextchar a "." ?
                    if (str.charAt(i + 1) == '.') {
                        num.append("1");
                        i += 2;
                    } else {
                        if (str.charAt(i + 1) == '-') {
                            num.append("2");
                            i += 2;
                        }
                    }
                }
            }
        }
        System.out.println(num.toString());
        sc.close();
    }
}
```