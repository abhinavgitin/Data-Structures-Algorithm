## Code
[View Code Here](../src/ReversePrefixOfWord.java)

# Problem: Reverse Prefix of Word
**Platform:** LeetCode  
**Problem link:** https://leetcode.com/problems/reverse-prefix-of-word/  
**Date solved:** 2026-10-31  
**Tags:** `String, Two Pointers, StringBuilder`

---

## What this shows and what this can be used for!

This problem demonstrates string manipulation, prefix reversal, and the use of Java's `StringBuilder` for efficient string modifications.

Prefix reversal is useful in problems involving partial string transformations, character rearrangement, and in-place reversal techniques.

---

## Intuition

Find the first occurrence of `ch`. Reverse the substring starting from index `0` and ending at that occurrence, while keeping the remaining string unchanged.

If `ch` does not exist, return the original string.

---

## Approach (step-by-step)

1. Use `indexOf(ch)` to find the first occurrence of the given character.
2. If the character is absent (`indexOf()` returns `-1`), return the original string.
3. Extract the prefix using `substring()` and reverse it using `StringBuilder.reverse()`.
4. Replace the original prefix with the reversed string using `StringBuilder.replace()`.
5. Convert the modified `StringBuilder` back to a `String` and return it.

---

## Alternate Approaches / Methods

- **Two Pointers:** Use `left` and `right` pointers to swap characters in a `StringBuilder` until they meet. Avoids creating an intermediate reversed string.
- **Character Array:** Convert the string into a character array, reverse the required prefix using two pointers, and construct a new string.

---

## Complexity

- Time: \(O(n)\), for searching, extracting, reversing, and replacing the prefix.
- Space: \(O(n)\), for the intermediate string and `StringBuilder`.

---

## Code

```java
public class ReversePrefixOfWord {

    public String reversePrefix(String word, char ch) {
        if (word.indexOf(ch) == -1) return word;

        String str = String.valueOf(
                new StringBuilder(word.substring(0, word.indexOf(ch))).reverse()
        );

        StringBuilder newStr = new StringBuilder(word)
                .replace(0, word.indexOf(ch), str);

        return newStr.toString();
    }

    static void main() {
        ReversePrefixOfWord obj = new ReversePrefixOfWord();

        System.out.println(obj.reversePrefix("abcdefd", 'd')); // dcbaefd
        System.out.println(obj.reversePrefix("xyxzxe", 'z'));  // zxyxxe
        System.out.println(obj.reversePrefix("abcd", 'z'));    // abcd
    }
}
```

---