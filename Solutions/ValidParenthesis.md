# Problem: Valid Parentheses
**Platform:** LeetCode
**Problem link:** https://leetcode.com/problems/valid-parentheses/
**Date solved: 2026-03-15**  
**Tags:** Stack, String

---
## What this shows and what this can be used for!

This problem demonstrates the use of a stack data structure to validate balanced parentheses in a string. It's useful for parsing expressions, checking syntax in programming languages, and validating input formats.

---
## Intuition

To determine if a string of parentheses is valid, we need to ensure that every opening bracket has a corresponding closing bracket of the same type, and they are properly nested. A stack is ideal for this because it allows us to keep track of the most recent opening brackets and match them with closing ones as we encounter them.

---

## Approach (step-by-step)
1. Initialize an empty stack to store opening brackets.
2. Iterate through each character in the input string:
   - If the character is an opening bracket ('(', '[', '{'), push it onto the stack.
   - If the character is a closing bracket (')', ']', '}'):
     - If the stack is empty, return false (no matching opening bracket).
     - Pop the top element from the stack.
     - Check if the popped element matches the current closing bracket:
       - ')' should match '('
       - ']' should match '['
       - '}' should match '{'
     - If it doesn't match, return false.
3. After processing all characters, check if the stack is empty:
   - If empty, all brackets were properly matched, return true.
   - If not empty, there are unmatched opening brackets, return false.

---

## Alternate Approaches / Methods
- **Counter-based approach**: For strings with only one type of parentheses, a simple counter can work (increment for '(', decrement for ')'), but it doesn't handle nesting or multiple types.
- **Replace pairs**: Iteratively replace "()" with empty string until no more replacements, then check if result is empty. This works but is less efficient.

---

## Complexity
- Time: O(n) - We traverse the string once.
- Space: O(n) - In the worst case, all characters are opening brackets, filling the stack.

---

## Code
```java
import java.util.*;

class ValidParenthesis {
    public static void main(String[] args) {
        System.out.println(isValid("(}"));
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '[' || c == '(' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char isItClosing = stack.pop();
                if (c == ')' && isItClosing != '(') return false;
                if (c == ']' && isItClosing != '[') return false;
                if (c == '}' && isItClosing != '{') return false;
            }
        }
        return stack.isEmpty();
    }
}
```