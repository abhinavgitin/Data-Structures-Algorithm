## Code
[View Code Here](../src/GameWithSticks.java)

# Problem:  GameWithSticks
**Platform:** Codeforces
**Problem link:** 
**Date solved: 2026-02-20**  
**Tags:** game-theory, math, parity

---
## What this shows and what this can be used for!

This problem illustrates a basic game theory concept where the winner of a game can be determined by the parity (even/odd) of the minimum value in a two-dimensional grid or stick arrangement. It demonstrates how mathematical properties can simplify complex game scenarios.

---
## Intuition

In games where players take turns removing objects from a grid (like sticks arranged in rows and columns), the player who faces an even minimum dimension can force a win, while an odd minimum leads to a loss for the current player. This is because the game reduces to the minimum dimension determining the number of moves.

---

## Approach (step-by-step)s
1. Read two integers a and b, representing the dimensions of the stick grid.
2. Compute the minimum value between a and b.
3. Check if the minimum value is even:
   - If even, output "Malvika" (she wins).
   - If odd, output "Akshat" (he wins).
4. Close the scanner.

---

## Alternate Approaches / Methods
- Simulate the game by iteratively reducing the dimensions, but this is inefficient and unnecessary given the mathematical insight.

---

## Complexity
- Time: O(1), as it involves only constant-time operations.
- Space: O(1), using only a few variables.

---

## Code
```java
import java.util.*;

public class GameWithSticks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if ( Math.min(a, b) % 2 == 0 ) System.out.println("Malvika");
        else System.out.println("Akshat");
        sc.close();
    }
}
```