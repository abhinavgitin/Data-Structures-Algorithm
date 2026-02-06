## Code
[View Code Here](../src/Football.java)

# Problem:  Football
**Platform:** Codeforces
**Problem link:** https://codeforces.com/problemset/problem/96/A
**Date solved: 2026-02-06**  
**Tags:** strings, implementation

---
## What this shows and what this can be used for!
This problem demonstrates how to detect consecutive identical elements in a string, which is useful for pattern recognition, sequence analysis, and validating constraints in various applications like game states, data validation, or signal processing.

---
## Intuition
The problem requires determining if there's a "dangerous" situation in football where 7 or more consecutive players are in the same position. This can be checked by iterating through the string and counting consecutive identical characters.

---

## Approach (step-by-step)
1. Read the input string representing the positions of football players.
2. Initialize a counter to 1 and set the previous character to the first character of the string.
3. Iterate through each character in the string starting from the second character.
4. If the current character matches the previous character, increment the counter.
5. If the counter reaches 7, return true (dangerous situation).
6. If the characters don't match, reset the counter to 1 and update the previous character.
7. After iterating through the string, if no 7 consecutive characters were found, return false.

---

## Alternate Approaches / Methods
- Use regular expressions to search for 7 or more consecutive identical characters.
- Implement a sliding window approach to check for runs of identical characters.
- Use string splitting or grouping to count consecutive elements.

---

## Complexity
- Time: O(n)
- Space: O(1)

---

## Code
```java
import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        String players = sc.nextLine();
        Football ft = new Football();
        if ( ft.positionSituation(players) ) {
            System.out.println("YES"); // the players are in a dangerous Situation
        } else {
            System.out.println("NO"); // the players position are safe
        }
        sc.close();
    }

    boolean positionSituation( String players ) {
        int count = 0; // safe at first and the count the current situation
        char previousPosition = players.charAt(0);
        for ( char ch : players.toCharArray() ) {
            char currentPosition = ch;
            if ( currentPosition == previousPosition ) {
                count++;
                previousPosition = currentPosition;
                if ( count >= 7 ) return true;
            } else {
                previousPosition = currentPosition;
                count = 1;
            }
        }
        return false;
    }
}
```