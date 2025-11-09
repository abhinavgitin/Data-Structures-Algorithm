# Problem:  Find the First Letter That Appears Twice
**Platform:** LeetCode
**Problem link:** [Leetcode](https://leetcode.com/problems/first-letter-to-appear-twice/description/)
**Date solved:**  2025-11-09
**Tags:** HashSet, char, how to handel the duplicate

---
## What this shows and what this can be used for!
This problem demonstrates:
- **HashSet for duplicate detection** - The classic "seen before" pattern using sets
- **Early termination** - Returning immediately when condition is met (efficient!)
- **Character handling in Java** - Working with `char` data type and `charAt()`
- **Practical application** - Duplicate detection in streams, form validation, finding repeated entries in logs/data

---
## Intuition
The key insight is to **track what we've seen**. As we traverse the string left-to-right, we need to remember which characters we've encountered. The moment we see a character that's **already in our "seen" set**, we've found our answer - that's the first character to appear twice! A HashSet is perfect because it offers O(1) lookup to check "have I seen this before?"

---

## Approach (step-by-step)
1. **Create a HashSet** to store characters we've encountered
2. **Iterate through the string** character by character using index `i`
3. **Check if current character is already in the set** using `set.contains(s.charAt(i))`
   - If **YES** (duplicate found): Return this character immediately - it's the first to appear twice!
   - If **NO** (first occurrence): Add the character to the set using `set.add()`
4. **Return null character** `'\0'` if no duplicate found (though problem guarantees at least one exists)

---

## Alternate Approaches / Methods
- **Boolean array (26 letters)**: Use `boolean[] seen = new boolean[26]` where index represents 'a' to 'z'. Check/set `seen[ch - 'a']`. Time: O(n), Space: O(1) - **Most efficient for lowercase English only!**
- **Bit manipulation**: Use an integer as a 26-bit bitmask. Check/set bits for each letter. Time: O(n), Space: O(1) - Very space efficient.
- **Nested loops (brute force)**: For each character, check all previous characters for duplicates. Time: O(n²), Space: O(1) - Not recommended, too slow.
- **HashMap with count**: Track frequency of each character. Time: O(n), Space: O(26) - Overkill since we only need presence/absence.

---

## Complexity
- Time: O(n) - Single pass through the string where n is the length. HashSet operations (contains, add) are O(1) average.
- Space: O(min(n, 26)) - HashSet stores at most 26 characters (English lowercase alphabet), or fewer if string is shorter. Effectively O(1) for alphabet constraint.

---

## Code
```java
import java.util.HashSet;

public class firstLetterTwoAppearTwice {
    public char repeatedCharacter(String s) {
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                return s.charAt(i);  // Found first duplicate!
            }
            set.add(s.charAt(i));  // Mark as seen
        }
        return '\0';  // Null character (problem guarantees we find duplicate)
    }
}
```