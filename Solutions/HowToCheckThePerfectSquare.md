## Code
[View Code Here](../src/HowToCheckThePerfectSquare.java)

# Problem:  HowToCheckThePerfectSquare
**Platform:** LeetCode
**Problem link:** [LeetCode](https://leetcode.com/problems/valid-perfect-square/)
**Date solved: 2025-11-19**  
**Tags:** Sqrt();

---
## What this shows and what this can be used for!

- **Checks if a given integer is a perfect square (i.e., the square of some integer).**
- **Demonstrates efficient use of built-in math functions for numerical checks.**

---
## Intuition

- Compute the square root of the number, then square it back and check if it equals the original number. Use long to avoid overflow for large numbers.

---
## Approach (step-by-step)
1. Compute the integer square root using Math.sqrt(num).
2. Cast to long and square it back.
3. Check if the squared value equals the original num.

---

## Alternate Approaches / Methods
- **Binary Search Approach:** Use binary search to find if there exists an integer whose square equals num.
  ```java
  public boolean isPerfectSquareBinary(int num) {
      if (num < 0) return false;
      long left = 0, right = num;
      while (left <= right) {
          long mid = left + (right - left) / 2;
          long square = mid * mid;
          if (square == num) return true;
          else if (square < num) left = mid + 1;
          else right = mid - 1;
      }
      return false;
  }
  ```
- **Newton's Method:** Iteratively approximate the square root using Newton's method and check.
  ```java
  public boolean isPerfectSquareNewton(int num) {
      if (num < 0) return false;
      if (num == 0 || num == 1) return true;
      long x = num / 2;
      while (x * x > num) {
          x = (x + num / x) / 2;
      }
      return x * x == num;
  }
  ```
- **Linear Search:** Loop from 1 to sqrt(num) and check squares.
  ```java
  public boolean isPerfectSquareLinear(int num) {
      if (num < 0) return false;
      for (long i = 1; i * i <= num; i++) {
          if (i * i == num) return true;
      }
      return false;
  }
  ```

---

## Complexity
- Time: O(1) for the main approach (Math.sqrt is constant time).
- Space: O(1)

---

## Code
```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class HowToCheckThePerfectSquare {
    public static void main(String[] args) throws IOException {
        HowToCheckThePerfectSquare obj = new HowToCheckThePerfectSquare();
        //taking number as input from the user using BufferedReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        boolean result = obj.isPerfectSquare(number);
        System.out.println(result); // Output: true
    }
    public boolean isPerfectSquare(int num) {
        return (long) Math.sqrt(num) * (long) Math.sqrt(num) == num;
    }
}
```