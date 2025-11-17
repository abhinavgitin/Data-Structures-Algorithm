## Code
[View Java Code](../src/toLowerCase.java)

# Problem:  Two Lower Case
**Platform:** LeetCode
**Problem link:** [Leetcode](https://leetcode.com/problems/to-lower-case/)
**Date solved:** 2025-11-06

---
## What this shows and what this can be used for!
This solution demonstrates manual character manipulation using ASCII values to convert uppercase letters to lowercase. It shows how to work with character codes and build strings using StringBuilder. This technique is useful for understanding low-level string manipulation and ASCII character encoding.

---
## Intuition
The problem requires converting uppercase letters to lowercase. Since uppercase letters (A-Z) have ASCII values 65-90 and lowercase letters (a-z) have ASCII values 97-122, there's a constant difference of 32 between corresponding uppercase and lowercase letters. By checking if a character is uppercase and adding 32 to its ASCII value, we can convert it to lowercase.

---

## Approach (step-by-step)
1. Create a `StringBuilder` to efficiently build the result string
2. Iterate through each character in the input string
3. For each character, check if its ASCII value is between 65 and 90 (uppercase A-Z)
4. If uppercase: add 32 to the ASCII value and append the resulting lowercase character
5. If not uppercase: append the character as-is (handles lowercase, spaces, and other characters)
6. Return the final string built by the StringBuilder

---

## Alternate Approaches / Methods
- Use the built-in `String.toLowerCase()` method for a simpler one-line solution
- Use `Character.toLowerCase()` for individual character conversion
- Use bitwise operations: for uppercase letters, setting the 6th bit (OR with 32) converts to lowercase

---

## Complexity
- Time: O(n) - where n is the length of the string, as we iterate through each character once
- Space: O(n) - StringBuilder stores the result string of length n

---

## Code
```java
public String toLowerCaseString(String s) {
    StringBuilder str = new StringBuilder();
    int num = 0;
    int digit = 0;
    for (int i = 0 ; i < s.length() ; i++ ){
        if ( (int)s.charAt(i) >= 65 && (int)s.charAt(i) <= 90 ){
            num = (int)s.charAt(i);
            digit = num + 32;
            str.append(String.valueOf((char)digit));
        } else {
            str.append(String.valueOf(s.charAt(i)));
        }
    }
    return str.toString();
}
```