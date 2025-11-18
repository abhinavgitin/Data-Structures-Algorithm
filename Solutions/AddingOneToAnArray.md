## Code
[View Code Here](../src/AddingOneToAnArray.java)

# Problem:  AddingOneToAnArray
**Platform:** GFG
**Problem link:** [GFG](https://www.geeksforgeeks.org/problems/adding-one2529/1?page=1&difficulty=Easy&sortBy=difficulty)
**Date solved: 2025-11-19**  
**Tags:** Add one

---
## What this shows and what this can be used for!

- **Adds 1 to a number represented as an array of digits (most significant digit first).**
- **Shows carry propagation when adding to the least-significant digit.**

---
## Intuition

- Start from the least-significant digit, add 1 and propagate any carry leftwards. If a carry remains after processing all digits, prepend it to the result.

---
## Approach (step-by-step)
1. Initialize a `Vector<Integer>` for the result and a `carry = 1` (the +1 we need to add).
2. Iterate the input `digits` array from right to left: compute `sum = digits[i] + carry`, append `sum % 10` to the result, and set `carry = sum / 10`.
3. After the loop, if `carry == 1` add it to the result.
4. Reverse the `Vector` to restore most-significant-first order and return it.

---
## Alternate Approaches / Methods
- Modify the input array in-place and handle expansion when all digits are 9s (requires shifting / creating a new array only in that case).
- Convert digits to a string/BigInteger, add 1, and convert back (simpler but less space/time efficient and overkill for this problem).

---
## Complexity
- Time: O(n) where `n` is `digits.length` (single pass right-to-left).
- Space: O(n) for the returned `Vector`. In-place variants can achieve O(1) additional space except for the possible resize when all digits are 9.

---
## Code
```java
import java.util.Collections;
import java.util.Vector;

public class AddingOneToAnArray {
	public static void main(String[] args) {
		AddingOneToAnArray obj = new AddingOneToAnArray();
		int[] digits = {9, 9, 9};
		Vector<Integer> result = obj.addOne(digits);
		System.out.println(result); // Output: [1, 0, 0, 0]
	}
	Vector<Integer> addOne(int[] digits) {
		// code here
		Vector<Integer> ans = new Vector<>();
		int carry = 1;

		for (int i = digits.length - 1; i >= 0; i--) {
			int sum = digits[i] + carry;
			ans.add(sum % 10); // this will give us the last digit if its more than ones
			carry = sum / 10; // removes the last digit eg : 10 -> 0 removed and 1 is the new carry
		}
		if (carry == 1) ans.add(1);
		Collections.reverse(ans);
		return ans;
	}
}
```