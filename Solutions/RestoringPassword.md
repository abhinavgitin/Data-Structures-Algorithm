# Problem: Restoring Password
**Platform:** Codeforces
**Problem link:** https://codeforces.com/problemset/problem/94/A
**Date solved: 2026-04-05**  
**Tags:** String, Binary, Decoding

---
## What this shows and what this can be used for!

This solution demonstrates how to decode a password that has been encoded using binary representations of digits. It showcases string manipulation, pattern matching, and substring operations in Java. This approach can be used in scenarios involving decoding binary-encoded data, such as in cryptography, data transmission, or puzzle-solving problems where information is represented in binary form.

---
## Intuition

The password is encoded as a long binary string, divided into 8 segments of 10 bits each, where each segment corresponds to the binary representation of a digit (0-9). By matching each 10-bit chunk against the provided binary patterns for digits, we can reconstruct the original password.

---

## Approach (step-by-step)
1. Read the encoded binary string from input.
2. Read 10 binary strings, each representing the binary form of digits 0 through 9.
3. Initialize a StringBuilder for the password.
4. For each of the 8 positions (0 to 7):
   - Extract a 10-bit substring starting from position i*10.
   - Compare this substring with each of the 10 binary strings.
   - When a match is found, append the corresponding digit (index j) to the password.
5. Output the reconstructed password.

---

## Alternate Approaches / Methods
- Using a Map: Store the binary strings as keys and digits as values in a HashMap for O(1) lookups instead of linear search.
- Bit manipulation: Convert binary strings to integers and use bitwise operations for comparison, but this might be overkill for string-based input.

---

## Complexity
- Time: O(1), since the operations are bounded by fixed sizes (80 bits total, 10 comparisons per chunk).
- Space: O(1), as the input size is constant (10 strings of 10 chars each).

---

## Code
```java
import java.util.*;
public class RestoringPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next(); // the encoded noo will not have the spaces in them
        String[] bString = new String[10];
        for ( int i = 0 ; i < 10 ; i++ ) {
            bString[i] = sc.next();
        }
        // now we check and make the password
        StringBuilder password = new StringBuilder();
        for ( int i = 0 ; i < 8 ; i++ ) {
            String chunk = str.substring(i*10,i*10+10); // that i * 10 is the one which skips the 10 digits part by part!
            for ( int j = 0 ; j < 10 ; j++ ) {
                if (chunk.equals(bString[j])) {
                    password.append(j);
                    break;
                }
            }
        }
        System.out.println(password);
        sc.close();
    }
}
```