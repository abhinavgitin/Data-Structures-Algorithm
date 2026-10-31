## Code
[View Code Here](../src/DisariumNumber.java)

# Problem: Disarium Number
**Platform:** GFG  
**Problem link:** [Disarium Number - GFG](https://www.geeksforgeeks.org/problems/disarium-number/1)  
**Date solved:** 2026-10-31  
**Tags:** `Number Theory, Mathematics, Digit Manipulation, Implementation`

---

## What this shows and what this can be used for!

A Disarium number is a number whose sum of digits powered by their respective positions equals the original number.

For example:

\(89 = 8^1 + 9^2 = 8 + 81 = 89\)

This problem demonstrates digit extraction, positional power calculations, and number manipulation.

---

## Intuition

Each digit contributes to the sum according to its position from left to right.

Since we extract digits from right to left using `% 10`, we start with the total number of digits and decrement the position after processing each digit.

---

## Approach (step-by-step)

1. Store the original number in `temp` to preserve it for the final comparison.
2. Calculate the number of digits using `getLengthFast()`.
3. Extract the last digit using `n % 10`.
4. Raise the digit to its corresponding position using `Math.pow()` and add it to `sum`.
5. Decrement the position and remove the last digit using `n /= 10`.
6. Return `true` if the calculated sum equals the original number.

---

## Alternate Approaches / Methods

- **String conversion:** Convert the number into a string and iterate from left to right, using the index as the power.
- **Digit counting:** Count digits using a loop or `Math.log10()` instead of using predefined numeric ranges.

---

## Complexity

- Time: \(O(d)\), where \(d\) is the number of digits.
- Space: \(O(1)\), using constant extra space.

---

## Code

```java
class DisariumNumber {

    public static boolean isDisarium(int n) {
        int sum = 0;
        int temp = n;
        int count = getLengthFast(n);

        while (n > 0) {
            int digit = n % 10;
            sum = (int) (sum + Math.pow(digit, count));
            count--;
            n /= 10;
        }

        return sum == temp;
    }

    public static int getLengthFast(int number) {
        if (number < 10) {
            return 1;
        } else if (number < 100) {
            return 2;
        } else if (number < 1000) {
            return 3;
        } else if (number < 10000) {
            return 4;
        } else if (number < 100000) {
            return 5;
        } else if (number < 1000000) {
            return 6;
        } else if (number < 10000000) {
            return 7;
        } else if (number < 100000000) {
            return 8;
        } else {
            return 9;
        }
    }

    static void main() {
        System.out.println(isDisarium(89)); // true
    }
}
```

---