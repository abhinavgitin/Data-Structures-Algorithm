# Problem:  UltraFastMathematician
**Platform:** Codeforces
**Problem link:** 
**Date solved: 2026-02-08**  
**Tags:** strings, bit manipulation

---
## What this shows and what this can be used for!

This problem shows how to perform a bitwise XOR operation on two binary strings by comparing each character position. It can be used in scenarios involving binary operations, string manipulation, or cryptography where XOR is needed for encryption/decryption.

---
## Intuition

The problem requires computing the XOR of two binary strings. Since XOR outputs 1 when bits differ and 0 when they are the same, we can iterate through each character and compare them directly.

---

## Approach (step-by-step)s
1. Read the two binary strings a and b from input.
2. Determine the length of the strings (assuming they are equal).
3. Iterate through each character position from 0 to length-1:
   - If the characters at position i are the same, output '0'.
   - Otherwise, output '1'.
4. Output a newline character at the end.

---

## Alternate Approaches / Methods
- Convert the binary strings to integers and perform bitwise XOR, then convert back to string. However, this is limited by integer size (e.g., 32-bit or 64-bit), so not suitable for long strings.
- Use string manipulation libraries or functions to achieve the same result.

---

## Complexity
- Time: O(n), where n is the length of the strings (up to 100).
- Space: O(1), as we use fixed-size arrays and no additional data structures.

---

## Code
```c
#include <stdio.h>
#include <string.h>

int main() {
    char a[102], b[102];
    scanf("%s", a);
    scanf("%s", b);
    int length = strlen(a);
    for ( int i = 0 ; i < length ; i++ ){
        if ( a[i] == b[i] ) {
            printf("0");
        } else {
            printf("1");
        }
    }
    printf("\n");
    return 0;
}
```