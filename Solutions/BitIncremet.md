## Code
[View Code Here](../src/BitIncrement.java)

# Problem:  BitIncrement
**Platform:** Codeforces
**Problem link:** https://codeforces.com/problemset/problem/282/A
**Date solved: 2026-02-02**  
**Tags:** Simulation, String, Input/Output

---
## What this shows and what this can be used for!

This problem demonstrates reading input from the console, processing strings to simulate increment and decrement operations, and handling user input in Java. It can be used to understand basic I/O operations and conditional logic based on string content.

---
## Intuition

The problem requires simulating a variable's value changes based on a series of increment ("++") or decrement ("--") operations provided as strings.

---

## Approach (step-by-step)s
1. Read the number of operations n from the input.
2. Initialize a variable x to 0.
3. For each of the n operations:
   a. Read the operation string.
   b. If the string contains "++", increment x by 1.
   c. Otherwise, decrement x by 1.
4. After processing all operations, print the final value of x.

---

## Alternate Approaches / Methods
- Use exact string matching with if-else or switch statements for specific operations like "++X", "X++", "--X", "X--".
- Use a map or array to define the effect (+1 or -1) of each possible operation string.

---

## Complexity
- Time: O(n)
- Space: O(1)

---

## Code
```[java]
import java.util.Scanner;

public class BitIncremet {
    public static void main(String[] args) {
        // we take the no of inputs form the user and see each string that 
        // waht should be done with the x increent or decrement
        Scanner sc = new Scanner( System.in );
        int x = 0;
        int n = sc.nextInt();
        while ( n > 0 ) {
            String str = sc.next();
            // new string object is created evertime the loop run but the last string which was make that looses then connection in the
            // memory and thus the java garbage collection handels it for no memory loss and too much accumalation of the same varable again and again
            // why is this neccessary is because the nextLine creates a buffer and then one count of the loop  decrements thus
            // for 2 no of the loop run we get to see that the input takes is only one time
            // Using next() instead of nextLine() to avoid issues with leftover newline after nextInt()
            if ( str.contains("++") ) {
                x++;
            } else {
                x--;
            }
            n--;
        }
        System.out.println(x);
        sc.close();
    }
}
```