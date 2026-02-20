## Code
[View Code Here](../src/SumOfTwoIntegers.java)

# Problem:  SumOfTwoIntegers
**Platform:** Leetcode
**Problem link:** https://leetcode.com/problems/sum-of-two-integers/
**Date solved: 2026-02-20**  
**Tags:** Bit Manipulation, Math

---
## What this shows and what this can be used for!
This demonstrates how to perform integer addition using bitwise operations, specifically XOR for addition without carry and AND with shift for carry propagation. This is useful in scenarios where arithmetic operators are not allowed or for understanding low-level binary arithmetic.

---
## Intuition
The intuition is to mimic the process of binary addition where we handle the sum bits and carry bits separately using bitwise operations. XOR gives us the sum without carry, while AND and shift give us the carry to propagate.

---

## Approach (step-by-step)s
1. Use a loop to handle carry propagation until no carry remains (b == 0).
2. In each iteration, calculate the carry using bitwise AND of a and b, then left shift by 1: `carry = (a & b) << 1`.
3. Compute the sum without carry using bitwise XOR: `a = a ^ b`.
4. Update b to the carry value for the next iteration.
5. When the loop exits, a contains the final sum.

---

## Alternate Approaches / Methods
- The straightforward approach would be `a + b`, but since the problem constraints prohibit using arithmetic operators (+, -, etc.), this bitwise method is necessary.
- A recursive approach could be implemented, but the iterative version is more efficient and avoids stack overflow for large inputs.

---

## Complexity
- Time: O(1)
- Space: O(1)

---

## Code
```[java]
class Solution {
    public int getSum(int a, int b) {
        while (b != 0) {
            int carry = (a & b) << 1;
            a = a ^ b;
            b = carry;
        }
        return a;
    }

    /*
     Our aim is to add integers and then return the sum.

     We follow the same idea as basic mathematics done by hand:
     focusing on addition and carry generation separately.

     The carrying part of addition is handled using bit manipulation.

     We use a loop because carry generated in one step
     may create another carry in the next step.

     (a & b) detects positions where carry is generated.
     << 1 shifts that carry to the left just like we shift carry
     while doing paper-based addition.

     a ^ b performs partial addition (addition without carry).

     We assign carry back into b and repeat the process
     until carry becomes 0.

     Once carry is 0, the addition is complete and 'a'
     contains the final result.
    */
}
```