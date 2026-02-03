## Code
[View Code Here](../src/UniqueNumIMPORTNAT.java)

# Problem:  Numbers with Unique Digits
**Platform:** GFG
**Problem link:** [GFG](https://www.geeksforgeeks.org/problems/unique-numbers3019/1?page=1&sprint=f52dd1d37978bc37959bef394c7cce1d&sortBy=difficulty)
**Date solved: 2026-02-03**  
**Tags:** Digits, Unique, Range

---
## What this shows and what this can be used for!

This code demonstrates how to handle numbers within a given range and simultaneously check the uniqueness of digits for each number. It shows the use of a boolean array to efficiently track seen digits and handle edge cases like zero.

---
## Intuition

The problem requires finding all numbers between L and R (inclusive) that have no repeating digits. For each number, we need to check if all its digits are unique.

---

## Approach (step-by-step)s
1. Initialize an ArrayList to store the result numbers.
2. Loop through each number from L to R inclusive.
3. If the number is 0, add it to the list and continue (0 has unique digits).
4. For other numbers, initialize a boolean array of size 10 to track seen digits.
5. While the number is greater than 0, extract the last digit using modulo 10.
6. Check if this digit has been seen before; if yes, mark the number as not unique and break.
7. If not seen, mark it as seen and divide the number by 10.
8. After processing all digits, if the number is still marked as unique, add it to the list.
9. Return the list of unique digit numbers.

---

## Alternate Approaches / Methods
- Use a HashSet to store digits instead of a boolean array. This is more flexible if digits could be more than 10, but uses more space.
- Convert the number to string and check for unique characters using a set.
- Precompute all numbers with unique digits up to a certain limit if R is large.

---

## Complexity
- Time: O((R-L+1) * log R) where log R is the number of digits (up to 10 for R <= 10^9)
- Space: O(R-L) for the result list, O(1) auxiliary space per number

---

## Code
```[java]
import java.util.ArrayList;

public class UniqueNumIMPORTNAT {
    // THIS SHOWS THAT HOW DO WE HANDEL THE NUMBERS THAR ARE IN THE RANGE AND THEN WE HANDEL THE DIGITS OF THE NUMBERS ITSELF FOR EACH NUMBER
    // AGAIN TO HANDEL EACH NUMBER AND SIMULTANEOUSLY THE DIGITS OF THE SAME NUMBER
    public static void main(String[] args) {
        int L = 0, R = 20;
        ArrayList<Integer> result = uniqueNumbers(L, R);
        System.out.println("Unique digit numbers between " + L + " and " + R + ":\n" + result);
    }

    static ArrayList<Integer> uniqueNumbers(int L, int R) {
        ArrayList<Integer> list = new ArrayList<>();
        for ( int i = L ; i <= R ; i++ ){ // we loop all the way to the right limit
            boolean isUnique = true; // to chcek that the current number is unique or not we make a flag and set initially it to true that yes the number is unique FOR NOW!
            boolean[] seen = new boolean[10]; // for each new entity Number we make a fresh new digits checker that chceks that was the number seen?
            // as initial the seen is set to false that nothing was seen 
            if ( i == 0 ) { // for the 0 Case handeling that if the range has 0 in that then we add it and the continue to the next number directly from here
                list.add(i);
                continue;
            }
            int num = i; // now we perform the operation for each current number
            while ( num > 0 ) { // until and unless the num is greater then 0 peel the number
                int digit = num % 10; // last digit extraced
                if ( seen[digit] ) { 
                    // importnat : if the digit is seen then the number is not unique so skip to the next number
                    isUnique = false;
                    break;
                } else {
                    // if we are seeing the digit the first time then we set that 
                    seen[digit] = true; // yes the digit is seen for that index
                    num /= 10; // peel the num
                    continue; // and then continue to do the same
                }
            }
            if ( isUnique ) list.add(i); // if the digit was not seen then and is true == isUnique number then add it! 
        }
        return list;
    }
}
```