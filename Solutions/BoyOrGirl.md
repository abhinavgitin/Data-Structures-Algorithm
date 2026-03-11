## Code
[View Code Here](../src/BoyOrGirl.java)

# Problem:  BoyOrGirl
**Platform:** Codeforces
**Problem link:** https://codeforces.com/problemset/problem/236/A
**Date solved: 2026-02-04**  
**Tags:** string, hashset, distinct characters

---
## What this shows and what this can be used for!

This problem demonstrates how to count the number of distinct characters in a string and make a decision based on whether that count is even or odd. It can be used in scenarios where you need to check for unique elements in a string or array.

---
## Intuition

The problem states that if the number of distinct characters in the username is even, it's a girl, otherwise it's a boy. We need to count the unique characters in the string.

---

## Approach (step-by-step)s
1. Read the username string from input.
2. Create a HashSet to store unique characters.
3. Iterate through each character in the string and add it to the set.
4. Get the size of the set, which represents the number of distinct characters.
5. If the size is even, return "CHAT WITH HER!", else return "IGNORE HIM!".

---

## Alternate Approaches / Methods
- Use a boolean array of size 26 (assuming lowercase letters) to mark presence of each character.
- Use a frequency array and count the number of characters that appear at least once.

---

## Complexity
- Time: O(n)
- Space: O(min(n, 26))

---

## Code
```java
import java.util.*;

public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userNmae = sc.nextLine();
        BoyOrGirl object = new BoyOrGirl();;
        System.out.println(object.identify(userNmae));
        sc.close();
    }
    String identify( String str ) {
        // it is mentiond that the no of distinct characters in the username must be even for the girl to be real
        // distinct characters means that each characters should be unique even they appear more than 1 time
        // so if we take the distinct characters which is every unique characters with the help of set 
        // and the chrck that the no of the distinct characters are even then its a girl as other wise its a boy! 
        HashSet<Character> set = new HashSet<>();
        for ( char c : str.toCharArray() ) set.add(c);
        int distinctCharacters = set.size();
        if ( distinctCharacters % 2 == 0 ) {
            // its a girl;
            return "CHAT WITH HER!";
        }
        return "IGNORE HIM!"; // its then a Boy disguised
    }
}
```