## Code
[View Code Here](../src/QueueattheSchool.java)

# Problem:  QueueattheSchool
**Platform:** Codeforces
**Problem link:** https://codeforces.com/problemset/problem/266/B
**Date solved: 2026-02-21**  
**Tags:** Simulation, Strings

---
## What this shows and what this can be used for!

This solution demonstrates a simulation of queue movement where elements (boys and girls) swap positions based on rules. It can be used in problems involving sequential updates or state changes over time in arrays or strings.

---
## Intuition

In this problem, boys ('B') and girls ('G') are in a queue. Each second, every boy moves past the girl immediately in front of him by swapping positions. We need to simulate this process for t seconds and output the final arrangement.

---

## Approach (step-by-step)s
1. Read the number of children n, time t, and the initial arrangement string.
2. Convert the string to a character array for mutable operations.
3. For each of t seconds:
   - Iterate through the array from left to right.
   - If a 'B' is followed by a 'G', swap them and skip the next position to avoid double swaps.
4. Convert the array back to a string and print it.

---

## Alternate Approaches / Methods
- StringBuilder: Use StringBuilder for the string and perform swaps, but char array is more efficient for multiple modifications.
- Bubble sort like: Since 'B' moves right past 'G', it's similar to sorting with 'G' as smaller, but simulation is straightforward.

---

## Complexity
- Time: O(t * n) - For each of t time units, we iterate through the array of size n.
- Space: O(n) - For the character array.

---

## Code
```[java]
import java.util.*;

public class QueueattheSchool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfChildren = sc.nextInt();
        int time = sc.nextInt();
        String arrangement = sc.next();
        char[] posOfBAndG = arrangement.toCharArray();
        while (time-- > 0) {
            int i = 0;
            while ( i < noOfChildren ) {
                if ( i == noOfChildren-1 ) break;
                if (posOfBAndG[i] == 'B' && posOfBAndG[i + 1] == 'G') {
                    // we swap them
                    posOfBAndG[i + 1] = 'B';
                    posOfBAndG[i] = 'G';
                    i += 2;
                    continue;
                }
                i++;
            }
        }
        String newArr = new String(posOfBAndG);
        System.out.println(newArr);
        sc.close();
    }
}
```