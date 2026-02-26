## Code
[View Code Here](../src/TowersOfBoxes.java)

# Problem:  TowersOfBoxes
**Platform:** Codeforces
**Problem link:** 
**Date solved: 2026-02-25**  
**Tags:** math, greedy

---
## What this shows and what this can be used for!

This problem demonstrates how to calculate the minimum number of towers needed to stack all boxes, ensuring that the total weight above each box does not exceed its durability. It showcases the use of integer division and ceiling calculation in competitive programming.

---
## Intuition

Each box has a durability limit, and each box above it adds weight. The maximum number of boxes that can be stacked above a single box is determined by how many times the weight per box fits into the durability. To minimize towers, we maximize the height of each tower and distribute the boxes accordingly.

---

## Approach (step-by-step)s
1. Read the number of test cases t.
2. For each test case:
   - Read n (number of boxes), m (weight per box), d (durability per box).
   - Calculate k = d / m (integer division), which is the maximum number of boxes that can be placed above one box.
   - The maximum height of a tower is k + 1 (including the base box).
   - To find the minimum number of towers, use ceiling division: (n + maxHeight - 1) / maxHeight.
3. Print the minimum number of towers for each test case.

---

## Alternate Approaches / Methods
- Sort the boxes by durability in descending order and try to build towers greedily, but this may be overkill for this problem as the calculation is straightforward.
- Use dynamic programming to optimize tower heights, but unnecessary here.

---

## Complexity
- Time: O(t) where t is the number of test cases, as each test case performs constant-time operations.
- Space: O(1) as only a few variables are used.

---

## Code
```java
import java.util.*;

public class TowersOfBoxes {
    // said that the no of boxes is n | then weight of each box is m | and tthe durabilaty of each of the boxes is d
    // they want to stack the boxes on top of each other
    // also being said that the total weight of the boxes should not exceed the durability of the boxes
    // we have to return the minimum no of towers that he can achieve given that all the n boxes must be used
    // what is actually said is that the weight of the box above the each box must not exceed the durability of that box
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while ( t-- > 0 ) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int d = sc.nextInt();
            // we know that one box can hold k * m boxes above it
            // where k is the no of boxes above it and the m is the mass of the boxes such that the k * m should not exceed the durability
            // so it becomes like k*m <= d then we can make the tower
            // to get the no of boxes ( k ) above the box we can do simple maths k*m <= d | k <= d/m;
            int k = d/m;
            // so the maxx height that we can reach is 
            int  maxHeight = k+1; // includeing the box below it too
            // so if there are n number of boxes how many towers can we make from the maxheight
            // cause the each one hight is a one box | so we divide the total no of boxes by the maxHeight boxes reached to distribute the no of towers
            int minTowersThatCanBeMade = ( n + maxHeight - 1 ) / maxHeight; // works same as ceil;
            System.out.println(minTowersThatCanBeMade); 
        }
        sc.close();
    }
}
```