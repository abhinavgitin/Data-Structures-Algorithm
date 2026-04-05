## Code
[View Code Here](../src/AddStrings.java)

# Problem:  AddStrings
**Platform:** leetcode
**Problem link:** 
**Date solved: 2026-04-04**  
**Tags:** <tag1, tag2>

---
## What this shows and what this can be used for!
This solution demonstrates how to add two numbers represented as strings without converting them to integers. It's useful for handling very large numbers that exceed standard integer limits.

---
## Intuition
We can simulate the addition process we do by hand - process digits from right to left, maintaining a carry value that gets added to the next pair of digits.

---

## Approach (step-by-step)
1. Start from the last index of both strings
2. Iterate while either string still has characters
3. Extract the current digit from each string (or 0 if we've reached the end)
4. Calculate the sum of both digits plus the carry
5. Store the ones place of the sum in the result array and update carry
6. Handle any remaining carry after the loop
7. Convert the result array to a string, skipping leading zeros

---

## Alternate Approaches / Methods
- Use recursion to process digits from right to left
- Process strings left to right and reverse the result at the end

---

## Complexity
- Time: O(max(n, m)) where n and m are the lengths of the two input strings
- Space: O(max(n, m)) for the result array and StringBuilder output

---

## Code
```java
class AddStrings {
    public static void main(String[] args) {
        System.out.println( new AddStrings().addStrings("11", "123"));
    }
    public String addStrings(String num1, String num2) {
        int i = num1.length()-1;
        int j = num2.length()-1;
        int[] arr = new int[i+j+2]; // just as we be safe
        int carry = 0;
        int idx = i+j+1;
        while ( i >= 0 || j >= 0 ) {
            int dig1 = ( i >= 0 )? num1.charAt(i) - '0' : 0;
            int dig2 = ( j >= 0 )? num2.charAt(j) - '0' : 0;

            int sum = dig1 + dig2 + carry;

            int toAdd = sum%10;
            carry = sum/10;
            arr[idx--] = toAdd;
            i--;
            j--;
        }
        if (carry > 0) arr[idx] = carry;
        StringBuilder sb = new StringBuilder();
        for ( int num : arr ) {
            if ( !(sb.length() == 0 && num == 0 ) ) sb.append(num);
        }
        return ( sb.length() == 0 )? "0" : sb.toString();
    }
}
```