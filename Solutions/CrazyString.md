## Code
[View Code Here](../src/CrazyString.java)

# Problem:  CrazyString
**Platform:** GFG
**Problem link:** 
**Date solved: 2026-02-11**  
**Tags:** String Manipulation, Case Conversion

---
## What this shows and what this can be used for!

This code demonstrates string manipulation by alternating the case of characters in a string based on the case of the first character. It can be used for text formatting, creating stylized strings, or solving problems involving case transformations.
## Intuition

The problem requires transforming a string where the case of characters alternates starting from the second character, depending on whether the first character is lowercase or uppercase. If the first character is lowercase, subsequent characters alternate with odd positions (1-based) in uppercase and even in lowercase. If uppercase, odd positions are lowercase and even are uppercase.

## Approach (step-by-step)s
1. Check if the first character of the string is lowercase (between 'a' and 'z').
2. If lowercase, append the first character as is, then for each subsequent character (starting from index 1), if the index is odd (1-based), convert to uppercase; if even, convert to lowercase.
3. If the first character is uppercase, append it as is, then for subsequent characters, if index is odd, convert to lowercase; if even, convert to uppercase.
4. Use a StringBuilder to construct the new string and return it.

## Alternate Approaches / Methods
- Use a single loop with a ternary operator to decide the case based on the first character and index.
- Convert the entire string to char array, modify in place, then convert back to string.

## Complexity
- Time: O(n)
- Space: O(n)

## Code
```java
public class CrazyString {
    public static void main(String[] args) {
        System.out.println(getCrazy("geeksforgeeks"));
    }

    static String getCrazy(String s) {
        // Your code here
        char firstCharacter = s.charAt(0);
        StringBuilder sb = new StringBuilder();
        if (firstCharacter <= 'z' && firstCharacter >= 'a') {
            sb.append(s.charAt(0));
            for (int i = 1; i < s.length(); i++) {
                if (i % 2 == 1) {
                    sb.append(Character.toUpperCase(s.charAt(i)));
                } else {
                    sb.append(Character.toLowerCase(s.charAt(i)));
                }
            }
        } else {
            sb.append(s.charAt(0));
            for (int i = 1; i < s.length(); i++) {
                if (i % 2 == 1) {
                    sb.append(Character.toLowerCase(s.charAt(i)));
                } else {
                    sb.append(Character.toUpperCase(s.charAt(i)));
                }
            }
        }
        return sb.toString();
    }
}
```