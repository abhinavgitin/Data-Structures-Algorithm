## Code
[View Code Here](../src/IsItACat.java)

# Problem:  IsItACat
**Platform:** Codeforces
**Problem link:** 
**Date solved: 2026-03-31**  
**Tags:** <tag1, tag2>

---
## What this shows and what this can be used for!
This solution demonstrates string validation using a state machine approach to enforce character sequences. It's useful for problems requiring strict pattern matching and sequence validation in strings.

---
## Intuition
The problem requires validating if a string represents "meow" with specific constraints: only 'm', 'e', 'o', 'w' characters, must start with 'm', follow a specific sequence pattern, and end with 'w'. We can model this as a state machine where each character transition must be valid based on the previous character.

---

## Approach (step-by-step)s
1. Read the number of test cases and process each one
2. Skip the length input and read the string
3. Convert the string to lowercase for case-insensitive comparison
4. Initialize a previous character tracker and validity flag
5. Iterate through each character in the string:
   - Check if character is one of 'm', 'e', 'o', 'w' (invalid otherwise)
   - Validate the transition based on the previous character state
   - Update the previous character
6. After iteration, check if the string ends with 'w' and is still valid
7. Output "YES" if valid, "NO" otherwise

---

## Alternate Approaches / Methods
- Use regular expressions to match the pattern "^m+e*o+w+$"
- Use string methods like startsWith(), contains(), and endsWith() with additional checks
- Implement as a finite state automaton with explicit states

---

## Complexity
- Time: O(n) where n is the length of the input string
- Space: O(1) excluding the input string storage

---

## Code
```java
import java.util.Scanner;

public class IsItACat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            sc.nextInt();
            sc.nextLine();
            String str = sc.nextLine();

            str = str.toLowerCase(); // FIX 1

            char prev = ' '; // track previous valid char
            boolean valid = true;

            for (char c : str.toCharArray()) {

                // FIX 2: only allow m, e, o, w
                if (c != 'm' && c != 'e' && c != 'o' && c != 'w') {
                    valid = false;
                    break;
                }

                // FIX 3: enforce order
                if (prev == ' ' && c != 'm') {
                    valid = false;
                    break;
                }

                if (prev == 'm' && (c != 'm' && c != 'e')) {
                    valid = false;
                    break;
                }

                if (prev == 'e' && (c != 'e' && c != 'o')) {
                    valid = false;
                    break;
                }

                if (prev == 'o' && (c != 'o' && c != 'w')) {
                    valid = false;
                    break;
                }

                if (prev == 'w' && c != 'w') {
                    valid = false;
                    break;
                }

                prev = c;
            }

            // final check: must end at 'w'
            if (valid && prev == 'w') {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
```