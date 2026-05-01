## Code
[View Code Here](../src/HappyNumber.java)

# Problem:  HappyNumber
**Platform:** leetcode
**Problem link:** https://leetcode.com/problems/happy-number/
**Date solved: 2026-03-17**  
**Tags:** Math, Hash Table

---
## What this shows and what this can be used for!

This solution demonstrates how to determine if a number is a "happy number" by repeatedly summing the squares of its digits until reaching 1 or detecting a cycle. It can be used in problems involving cycle detection in numerical sequences or mathematical computations.

---
## Intuition

A happy number is defined as a number which eventually reaches 1 when replaced by the sum of the square of each digit. If the process loops endlessly in a cycle that does not include 1, it is not a happy number. The key insight is to perform this transformation repeatedly and check for the happy condition (reaching 1).

---

## Approach (step-by-step)s
1. Initialize sum to 0.
2. While n > 0 and sum != 10:
   - Set num to n.
   - While num > 0:
     - Extract the last digit (num % 10).
     - Add the square of the digit to sum.
     - Remove the last digit (num /= 10).
   - Set n to the current sum.
   - If sum == 1, return true (happy number).
   - Else, reset sum to 0.
3. If the loop exits without returning true, return false.

---

## Alternate Approaches / Methods
- Use a HashSet to store seen numbers and detect cycles properly, avoiding infinite loops.
- Floyd's Cycle Detection Algorithm (tortoise and hare) to detect cycles without extra space.

---

## Complexity
- Time: O(log n) per iteration, but may loop indefinitely without proper cycle detection.
- Space: O(1)

---

## Code
```java
class HappyNumber {
    public static void main(String[] args) {
        HappyNumber happyNumber = new HappyNumber();
        System.out.println(happyNumber.isHappy(1111111));
    }
    public boolean isHappy(int n) {
        int sum = 0;
        while (n > 0 && sum != 10) {
            int num = n;
            while ( num > 0 ) {
                int digits = num % 10;
                sum += digits*digits;
                num /= 10;
            }
            n = sum;
            if ( sum == 1 ) return true;
            else sum = 0;
        }
        return false;
    }
}
```