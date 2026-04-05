## Code
[View Code Here](../src/Div7.java)

# Problem:  Div7
**Platform:** codeforces
**Problem link:** 
**Date solved: 2026-04-01**  
**Tags:** <tag1, tag2>

---
## What this shows and what this can be used for!
This problem demonstrates how to find the smallest number divisible by 7 that can be obtained by changing at most one digit of a given number. It showcases brute force digit manipulation and early termination optimization.

---
## Intuition
We can iterate through each position in the number and try replacing that digit with every possible digit (0-9). The first valid replacement that results in a number divisible by 7 is our answer. We also handle the edge case of leading zeros.

---

## Approach (step-by-step)
1. Check if the original number is already divisible by 7; if yes, return it
2. Convert the number string to a character array for digit manipulation
3. For each position in the array, try replacing the digit with all possible digits (0-9)
4. Skip leading zeros (if at position 0, don't try digit 0)
5. For each replacement, check if the resulting number is divisible by 7
6. When a valid number is found, output it and move to the next test case
7. Restore the original digit after each attempt to maintain state

---

## Alternate Approaches / Methods
- Generate all numbers with one digit changed and filter for divisibility
- Use modular arithmetic optimizations for faster divisibility checks

---

## Complexity
- Time: O(n * 10) = O(n) per test case, where n is the number of digits (at most 10 tries per position)
- Space: O(n) for the character array

---

## Code
```java
import java.util.Scanner;

public class Div7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String n = sc.next();

            int num = Integer.parseInt(n);

            // Step 1: already divisible
            if (num % 7 == 0) {
                System.out.println(n);
                continue;
            }

            char[] arr = n.toCharArray();
            boolean found = false;
            // Step 2: try changing one digit
            for (int i = 0; i < arr.length; i++) {
                char original = arr[i];

                for (char d = '0'; d <= '9'; d++) {

                    // no leading zero
                    if (i == 0 && d == '0')
                        continue;

                    arr[i] = d;

                    int newNum = Integer.parseInt(new String(arr));

                    if (newNum % 7 == 0) {
                        System.out.println(newNum);
                        found = true;
                        break;
                    }
                }

                arr[i] = original;

                // break outer loop if found
                if (found)
                    break;
            }
        }
        sc.close();
    }
}
```