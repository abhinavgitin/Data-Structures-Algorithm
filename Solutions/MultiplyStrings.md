## Code
[View Code Here](../src/MultiplyStrings.java)

# Problem:  MultiplyStrings
**Platform:** Leetcode
**Problem link:** https://leetcode.com/problems/multiply-strings/
**Date solved: 2026-04-04**  
**Tags:** string, math, simulation

---
## What this shows and what this can be used for!
This solution shows how to multiply two very large non-negative integers represented as strings, without converting them into numeric types like `int`, `long`, or `BigInteger`.

This is useful when:
- The input size is larger than primitive numeric limits.
- The problem explicitly restricts built-in big-number libraries.
- You want to practice digit-by-digit arithmetic and carry handling.

---
## Intuition
Manual multiplication (the way we do it on paper) can be simulated using an integer array.

If `num1` has length `n` and `num2` has length `m`, then the product can have at most `n + m` digits. So we create an array of size `n + m` where each position stores one digit of the result.

For each pair of digits from right to left:
- Multiply them.
- Add the product to the correct position.
- Keep the unit digit in the current slot and push carry to the previous slot.

At the end, skip leading zeros and build the final string.

---

## Approach (step-by-step)s
1. Initialize `n = num1.length()`, `m = num2.length()`, and `int[] ans = new int[n + m]`.
2. Traverse both strings from right to left using nested loops.
3. For each pair `(i, j)`, compute:
   - `mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0')`
   - `currentValueIndex = i + j + 1`
   - `carryIndex = i + j`
4. Add current multiplication with the existing value at `ans[currentValueIndex]`.
5. Store:
   - last digit at `ans[currentValueIndex]`
   - carry at `ans[carryIndex]`
6. After loops, build a string by skipping leading zeros from `ans`.
7. If all digits are zero, return `"0"`, otherwise return the built string.

---

## Alternate Approaches / Methods
- Brute-force conversion to numeric types (`int`/`long`): simple but fails for large inputs due to overflow.
- Using `BigInteger`: very clean and practical in real-world Java, but usually disallowed in this specific interview/problem constraint.

---

## Complexity
- Time: O(n * m), where `n` and `m` are lengths of the two input strings.
- Space: O(n + m) for the result array and output builder.

---

## Code
```java
public class MultiplyStrings {
	public String multiply(String num1, String num2) {
		int num1Length = num1.length();
		int num2Length = num2.length();
		int[] ans = new int[num1Length + num2Length];

		for (int i = num1Length - 1; i >= 0; i--) {
			for (int j = num2Length - 1; j >= 0; j--) {
				int firstDigit = num1.charAt(i) - '0';
				int secondDigit = num2.charAt(j) - '0';

				int currentMultiplication = firstDigit * secondDigit;
				int currentValueIndex = i + j + 1;
				int carryIndex = i + j;

				int totalSumForThatIndex = currentMultiplication + ans[currentValueIndex];
				ans[currentValueIndex] = totalSumForThatIndex % 10;
				ans[carryIndex] += totalSumForThatIndex / 10;
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int digit : ans) {
			if (!(sb.length() == 0 && digit == 0)) {
				sb.append(digit);
			}
		}

		return sb.length() == 0 ? "0" : sb.toString();
	}
}

```