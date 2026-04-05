## Code
[View Code Here](../src/APlusB.java)

# Problem:  APlusB
**Platform:** Codeforces
**Problem link:** 
**Date solved: 2026-04-02**  
**Tags:** <tag1, tag2>

---
## What this shows and what this can be used for!
This problem demonstrates string parsing to extract numeric characters from a formatted input string. It's useful for learning how to handle input parsing in competitive programming and working with character-to-digit conversions.

---
## Intuition
The input follows a specific format: "a+b" where a and b are single digits separated by a plus sign. We can directly access the digit characters at fixed positions (index 0 and index 2) and convert them to integers.

---

## Approach (step-by-step)
1. Read the number of test cases
2. For each test case, read the input string in format "a+b"
3. Extract character at index 0 and convert to digit (a)
4. Extract character at index 2 and convert to digit (b)
5. Add the two digits and output the result

---

## Alternate Approaches / Methods
- Use the split() method to split by '+' and parse both parts
- Use regular expressions to extract the two digits

---

## Complexity
- Time: O(t) where t is the number of test cases (each test case is O(1))
- Space: O(1) - only storing individual digits

---

## Code
```java
import java.io.*;

public class APlusB {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in)); 
        int t = Integer.parseInt(br.readLine());
        while ( t-- > 0 ) {
            String str = br.readLine();
            int a = str.charAt(0) - '0';
            int b = str.charAt(2) - '0';
            System.out.println(a+b);
        }
    }
}
```