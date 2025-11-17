## Code
[View Java Code](../src/Reverse_Degree_Of_A_String.java)

# Problem: Reverse Degree Of A String
**Platform:** <LeetCode/GFG>
**Problem link:** 
**Date solved:**  
**Tags:** <tag1, tag2>

---
## What this shows and what this can be used for!
- to operate the character ascii system
---
## Intuition
- it was to convert the c into the ascii and then perform the operation 
- the conversion is done explictily
---

## Approach (step-by-step)s
1. use of for each loop for all values of s char array 
2. stbtract the ascii valur of a which is 97 from z which is 122 and then add 1 to get the excat oeder of the alphabet 
3. then multiply it with the index wich keeps on increasing for the respective positions

---

## Alternate Approaches / Methods
```[java]
for (int i = 0; i < s.length(); i++) {
    char c = s.charAt(i);
    sum += ('z' - c + 1) * (i + 1);
}
```

---

## Complexity
- Time: O(n)
- Space: O(n) cause of charArray();

---

## Code
```[java]
public int reverseDegree(String s) {
        int index = 1;
        int len = s.length();
        int sum = 0;
        for (char c : s.toCharArray()) {
            if (index > len) break;
            sum += ( (int)'z' - (int)c + 1 ) * index;
            index++;
        }
        return sum;
    }
```