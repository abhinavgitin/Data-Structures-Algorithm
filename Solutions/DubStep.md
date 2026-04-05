## Code
[View Code Here](../src/DubStep.java)

# Problem:  DubStep
**Platform:** Codeforces
**Problem link:** 
**Date solved: 2026-04-03**  
**Tags:** <tag1, tag2>

---
## What this shows and what this can be used for!
This solution demonstrates string manipulation using regular expressions to replace separators and clean up whitespace. It's useful for parsing formatted text where specific substrings act as delimiters.

---
## Intuition
The "WUB" substring serves as a word separator in the input string. By replacing all "WUB" with spaces and trimming, we can extract the original words that were separated.

---

## Approach (step-by-step)s
1. Read the input string from standard input
2. Use replaceAll() to replace all occurrences of "WUB" with a single space
3. Trim any leading or trailing whitespace from the result
4. Output the cleaned string

---

## Alternate Approaches / Methods
- Use string splitting with "WUB" as delimiter and join with spaces
- Manually iterate through the string and build the result character by character

---

## Complexity
- Time: O(n) where n is the length of the input string
- Space: O(n) for storing the modified string

---

## Code
```java
import java.io.*;
public class DubStep {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        str = str.replaceAll("WUB", " ");
        str = str.trim();
        System.out.println(str);
    }
}
```