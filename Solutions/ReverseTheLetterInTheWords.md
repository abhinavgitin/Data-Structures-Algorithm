## Code
[View Java Code](../src/ReverseTheLetterInTheWords.java)

# Problem:  To Reverse the letters in the words of a sentence
**Platform:** LeetCode
**Problem link:** [Leetcode](https://leetcode.com/problems/reverse-words-in-a-string-iii/)
**Date solved:** 2025-11-03
**Tags:** String, StringBuilder

---
## What this shows and what this can be used for!

---
## Intuition

We need to reverse the letters of each word in a sentence while keeping the words in their original order and preserving whitespace separation. Splitting the input into words, reversing each word independently, and joining them back is straightforward and easy to reason about.

The provided solution uses String.split(" ") to separate on single spaces, reverses each token using StringBuilder.reverse(), appends a space, and finally trims the result to remove any trailing space. This is simple and efficient for typical inputs.

---

## Approach (step-by-step)s
1. Split the input string by the single-space delimiter: String[] words = s.split(" ");
2. Create a StringBuilder to build the output.
3. For each word in the words array:
   - Reverse the word using new StringBuilder(word).reverse().
   - Append the reversed word and a single space to the result.
4. After the loop, trim the result to remove the extra trailing space and return it.

Notes:
- Using split(" ") preserves empty tokens when there are consecutive spaces; depending on the desired behavior you may prefer split("\\s+") to collapse multiple spaces. The current implementation will treat multiple spaces as producing empty strings, and reversing an empty string keeps spaces in place after trimming.

---

## Alternate Approaches / Methods
- (none required) The split-and-reverse method is clear and idiomatic. An in-place approach using two-pointer reversal over each word without split would avoid allocating the words array and may be slightly more memory efficient; include it if you need an alternative.

---

## Complexity
- Time: O(n) where n is the length of the string — splitting and reversing each character once overall.
- Space: O(n) for the output and for temporary objects created by split and StringBuilder.reverse(). An in-place two-pointer approach can reduce extra allocations.

---

## Code
```java
public class ReverseTheLetterInTheWords {
	public static void main(String[] args) {
		ReverseTheLetterInTheWords obj = new ReverseTheLetterInTheWords();
		String s = "Let's take LeetCode contest";
		System.out.println(obj.reverseWords(s)); // prints: "s'teL ekat edoCteeL tsetnoc"
	}
	public String reverseWords(String s) {
		String[] words = s.split(" "); 
		StringBuilder result = new StringBuilder();
		for (String word : words) {
			result.append(new StringBuilder(word).reverse()).append(" ");
		}
		return result.toString().trim();
	}
}
```