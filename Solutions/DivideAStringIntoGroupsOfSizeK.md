## Code
[View Code Here](../src/DivideAStringIntoGroupsOfSizeK.java)

# Problem:  DivideAStringIntoGroupsOfSizeK
**Platform:** Leetcode
**Problem link:** https://leetcode.com/problems/divide-a-string-into-groups-of-size-k/
**Date solved: 2026-03-03**  
**Tags:** string, array, simulation

---
## What this shows and what this can be used for!

This code demonstrates how to divide a string into groups of a fixed size k, padding the last group with a specified character if the string length is not divisible by k. It can be used for string processing tasks involving chunking, formatting, or preparing data for fixed-width operations.

---
## Intuition

The problem requires splitting a string into substrings of length k, and if the last substring is shorter, pad it with a fill character to make it length k. By calculating the total number of groups needed (using ceiling division), we can iterate through the string and build the groups accordingly.

---

## Approach (step-by-step)s
1. Calculate the number of parts needed: `parts = (s.length() + k - 1) / k;`
2. Initialize an ArrayList to store the resulting strings.
3. Use a loop to process each part:
   a. If the remaining string length is less than k, take the remaining substring and pad it with the fill character to reach length k.
   b. Otherwise, take a substring of length k starting from the current index.
   c. Add the resulting string to the list.
4. Convert the ArrayList to a String array and return it.

---

## Alternate Approaches / Methods
- Use a for loop with index incrementing by k, and handle padding in the last iteration.
- Use StringBuilder to build the entire result and split it into groups.
- Use Java 8 streams to process the string in chunks.

---

## Complexity
- Time: O(n) where n is the length of the string.
- Space: O(n) for storing the result array.

---

## Code
```java
import java.util.*;

class DivideAStringIntoGroupsOfSizeK {
    public static void main(String[] args) {
        DivideAStringIntoGroupsOfSizeK obj = new DivideAStringIntoGroupsOfSizeK();
        String s = "abcdefghijk";
        int k = 3;
        char fill = 'x';
        String[] str = obj.divideString(s, k, fill);
        for (String st : str) {
            System.out.print(st+" ");
        }
    }
    public String[] divideString(String s, int k, char fill) {
        ArrayList<String> list = new ArrayList<>();
        int strLen = s.length();
        //here we can know that in how many parts we can cut the string by 
        int parts = ( strLen + ( k - 1 ) ) / k;
        int val = k;
        int i = 0;
        while ( parts-- > 0 ) {
            if ( k > strLen ) {
                // int strToAdd = k - i - 1;
                // int strToAdd = strLen - i;
                int strToAdd = k - strLen;
                StringBuilder strAdd = new StringBuilder(s.substring(i));
                while ( strToAdd-- > 0 ) {
                    strAdd.append(Character.toString(fill));
                }
                list.add(strAdd.toString());
                break;
            }
            list.add(s.substring(i,k));
            i = k;
            k += val;
        }
        String[] str = list.toArray(new String[0]);
        return str;
    }
}
```