## Code
[View Code Here](../src/NthTribonachiNumber.java)

# Problem:  NthTribonachiNumber
**Platform:** Leetcode
**Problem link:** https://leetcode.com/problems/n-th-tribonacci-number/
**Date solved: 2026-02-21**  
**Tags:** Dynamic Programming, Math

---
## What this shows and what this can be used for!

This solution demonstrates an efficient way to compute the N-th Tribonacci number using dynamic programming. It can be used in problems involving sequences where each term depends on the previous three terms, such as in mathematical computations or algorithmic challenges.

---
## Intuition

The Tribonacci sequence is a generalization of the Fibonacci sequence where each number is the sum of the three preceding ones. Specifically, T(0) = 0, T(1) = 1, T(2) = 1, and T(n) = T(n-1) + T(n-2) + T(n-3) for n > 2. To compute the nth term efficiently without recursion, we can use an iterative dynamic programming approach that builds the sequence step by step.

---

## Approach (step-by-step)s
1. Initialize an array `triFibo` of size 38 to store the Tribonacci sequence values, accommodating the constraint that n can be up to 37.
2. Set the base cases: `triFibo[0] = 0`, `triFibo[1] = 1`, `triFibo[2] = 1`.
3. Initialize variables `prevToPrev`, `prev`, and `curr` to track the last three computed values for efficient summation.
4. Loop from i = 3 to n (inclusive), calculating `triFibo[i]` as the sum of `prevToPrev + prev + curr`, then update the tracking variables.
5. Return `triFibo[n]` as the result.

---

## Alternate Approaches / Methods
- Recursive approach: Define a function that recursively computes T(n) = T(n-1) + T(n-2) + T(n-3) with base cases. However, this is inefficient for large n due to exponential time complexity from overlapping subproblems.
- Space-optimized iterative: Instead of storing the entire array, maintain only the last three values in variables, achieving O(1) space complexity while keeping O(n) time.
- Matrix exponentiation: Represent the Tribonacci recurrence as a matrix multiplication and use fast exponentiation to compute T(n) in O(log n) time and O(1) space, suitable for very large n.

---

## Complexity
- Time: O(n) - We iterate from 3 to n, performing constant-time operations in each iteration.
- Space: O(n) - We use an array of size up to 38 to store the sequence, but this can be optimized to O(1) by using only a few variables.

---

## Code
```[java]
public class NthTribonachiNumber {
    public static void main(String[] args) {
        NthTribonachiNumber nthTribonachiNumber = new NthTribonachiNumber();
        System.out.println(nthTribonachiNumber.tribonacci(4));
    }
    public int tribonacci(int n) {
        int[] triFibo = new int[38];
        triFibo[0] = 0;
        triFibo[1] = 1;
        triFibo[2] = 1;
        int prevToPrev = triFibo[0];
        int prev = triFibo[1];
        int curr = triFibo[2];
        int sum = 0;
        for ( int i = 3 ; i < n+1 ; i++ ) {
            sum += prevToPrev+prev+curr;
            triFibo[i] = sum;
            sum = 0;
            prevToPrev = prev;
            prev = curr;
            curr = triFibo[i];
        }
        return triFibo[n];
    }
}
```