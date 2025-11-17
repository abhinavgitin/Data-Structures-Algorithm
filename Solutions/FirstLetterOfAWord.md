## Code
[View Java Code](../src/FirstLetterOfAWord.java)

# Problem:  First letter of the word in java
**Platform:** GFG
**Problem link:** [GFG](https://www.geeksforgeeks.org/problems/print-first-letter-of-every-word-in-the-string3632/1?page=8&sortBy=difficulty)
**Date solved:**  2025-11-03
**Tags:** strings ,stringbuilder

---
## What this shows and what this can be used for!

- Extracting the first letter of every word in a sentence while handling extra spaces.
- Useful for building acronyms, initials, or compact representations of phrases.
---
## Intuition

We need the first character of each word in a string but the input can contain leading, trailing and multiple intermediate spaces. The simplest robust approach is to trim the string (remove leading/trailing spaces) and then scan characters: whenever we see a space followed by a non-space character, that next character is the start of a new word.

This avoids allocating extra arrays or using heavy regex when a simple linear scan suffices.

---

## Approach (step-by-step)s
1. Trim the input to remove leading/trailing spaces. (Important: assign the result back, e.g. S = S.trim();)
2. If the trimmed string is empty, return an empty result.
3. Append the first character (S.charAt(0)) to the result — it's the first word's initial.
4. Iterate i from 1 to S.length()-2 (so we can safely examine i+1):
   - If S.charAt(i) is a space and S.charAt(i+1) is not a space, append S.charAt(i+1).
5. Return the aggregated initials string.

Notes:
- We iterate once over the string -> linear time.
- We avoid creating intermediate arrays (split) which helps when memory matters.

### Edge cases to consider
- Empty or all-space input -> return empty string.
- Multiple spaces between words -> handled by checking i and i+1.
- Single-character words and punctuation -> algorithm picks the character after a space; punctuation attached to words will be included.

---

## Alternate Approaches / Methods
- Brute-force using nested checks (current method): linear scan with O(1) extra space.
- Using String.split("\\s+"):
  - Trim the string, split on one-or-more whitespace, then take the first character of each token and join. Simpler to write but allocates an array of tokens.
- Using a regex matcher to find word boundaries (\b\w): concise but slightly heavier and may include non-letter characters depending on definition.
- Using a Stream (Java 8+): split into tokens and map to first chars, then collect — clean but allocates intermediate objects.

---

## Complexity
- Time: O(n) where n is S.length() — each character is visited a constant number of times.
- Space: O(k) where k is the number of words (for the result). Extra auxiliary space is O(1) for the scanning approach; split/stream approaches use O(n) extra for tokens.

---

## Code (original scanning approach)
```java
public class FirstLetterOfAWord {
	public static void main(String[] args) {
		FirstLetterOfAWord obj = new FirstLetterOfAWord();
		String S = "  Hello   World  From  Java  ";
		System.out.println(obj.firstAlphabet(S));
	}
	String firstAlphabet(String S) {
		S = S.trim();  // must assign the trimmed value back to S
		if (S.length() == 0) return ""; // handle empty / all-space input
		StringBuilder str = new StringBuilder();
		str.append(S.charAt(0));

		for (int i = 1; i < S.length() - 1; i++) {
			if (S.charAt(i) == ' ' && S.charAt(i + 1) != ' ') {
				str.append(S.charAt(i + 1));
			}
		}
		return str.toString();
	}
}
```

## Code (alternative 1 — split)
```java
String firstAlphabetSplit(String S) {
	S = S.trim();
	if (S.isEmpty()) return "";
	String[] parts = S.split("\\s+"); // one or more whitespace
	StringBuilder sb = new StringBuilder();
	for (String p : parts) {
		if (!p.isEmpty()) sb.append(p.charAt(0));
	}
	return sb.toString();
}
```

## Code (alternative 2 — regex matcher for word starts)
```java
import java.util.regex.*;

String firstAlphabetRegex(String S) {
	StringBuilder sb = new StringBuilder();
	Matcher m = Pattern.compile("\\b\\w").matcher(S);
	while (m.find()) {
		sb.append(m.group());
	}
	return sb.toString();
}
```

---