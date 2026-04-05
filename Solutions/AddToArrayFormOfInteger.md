# Problem: Add to Array-Form of Integer
**Platform:** LeetCode
**Problem link:** https://leetcode.com/problems/add-to-array-form-of-integer/
**Date solved: 2026-04-05**  
**Tags:** Array, Math, Simulation

---
## What this shows and what this can be used for!

This solution demonstrates how to handle addition of a large integer (k) to a number represented as an array of digits. It showcases the use of BigInteger in Java for arbitrary-precision arithmetic, which is essential when dealing with numbers that exceed the range of primitive integer types. This approach is useful in scenarios involving large numerical computations where precision is critical, such as in competitive programming or financial calculations.

---
## Intuition

The problem requires adding an integer k to a number represented as an array of digits. Since the array can represent very large numbers (up to 10^4 digits), we cannot convert it directly to a primitive integer type. Instead, we use BigInteger to handle the arithmetic operations accurately.

---

## Approach (step-by-step)
1. Convert the array of digits into a string representation.
2. Create a BigInteger from this string.
3. Add the integer k (converted to BigInteger) to the BigInteger representation.
4. Convert the resulting BigInteger back to a string.
5. Parse each character of the string into integers and store them in a list.

---

## Alternate Approaches / Methods
- Using a manual addition algorithm: Iterate through the array from right to left, adding digits with carry handling, similar to manual addition. This avoids BigInteger but requires more code for carry management.
- Converting to long if constraints allow smaller inputs, but this fails for large arrays as shown in the commented code.

---

## Complexity
- Time: O(n), where n is the length of the input array, due to string building and conversion operations.
- Space: O(n), for storing the string representation and the resulting list.

---

## Code
```java
import java.math.BigInteger;
import java.util.*;

class AddToArrayFormOfInteger {
    public static void main(String[] args) {
        AddToArrayFormOfInteger obj = new AddToArrayFormOfInteger();
        int[] num = {1,2,0,0};
        int k = 34;
        List<Integer> list = obj.addToArrayForm(num, k);
        System.out.println(list);
    }
    public List<Integer> addToArrayForm(int[] num, int k) {
        StringBuilder sb = new StringBuilder();
        for ( int i : num ) sb.append(i);
        BigInteger number = new BigInteger(sb.toString()).add(BigInteger.valueOf(k));
        ArrayList<Integer> list = new ArrayList<>();
        for ( char c : number.toString().toCharArray() ) list.add(c-'0');
        return list;
    }
}
```