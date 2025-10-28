# Problem:  How Many 1 till n 
**Platform:** LeetCode
**Problem link:** [LeetCode](https://leetcode.com/problems/number-of-digit-one/)
**Date solved:** 2025-10-28 

---
## What this shows and what this can be used for!
- to count the target digits till n 
- how to divide the numbers for its 1 10 and 100th positions

---
## Intuition
The problem requires counting the total number of digit '1' appearances in all numbers from 1 to n. There are two main approaches to solve this:
1. Brute Force: Check each number and count '1's in it
2. Pattern-based: Analyze the pattern of '1's occurrence at each decimal place

---

## Approach (step-by-step)s
1. Initialize a counter variable to keep track of the number of '1's
2. Iterate through all numbers from 1 to n
3. For each number:
   - Extract each digit using modulo operation
   - Check if the digit is 1
   - If yes, increment the counter
   - Divide the number by 10 to move to next digit
4. Return the final count

---

## Alternate Approaches / Methods
- Mathematical Pattern Approach:
  - Consider each decimal place (ones, tens, hundreds, etc.)
  - For each place value:
    - Calculate higher digits contribution
    - Calculate current digit contribution
    - Calculate lower digits contribution
    - Sum up all contributions
- Using String Conversion:
  - Convert each number to string
  - Count occurrences of '1' in the string
  - Add to total count

---

## Complexity
- Time: O(n × log n), where n is the input number and log n represents the average number of digits in each number
- Space: O(1), as we only use a constant amount of extra space

---

## Code
```[java]
public class HowManyOnes {
    public static void main(String[] args) {
        HowManyOnes obj = new HowManyOnes();
        int n = 1768;
        int result = obj.countDigitOne(n);
        System.out.println("Number of ones from 1 to " + n + " : " + result);
    }
    // Brute Force Approach
    public int countDigitOne(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int specificNumber = i;
            while (specificNumber > 0) {
                int digit = specificNumber % 10;
                if (digit == 1) {
                    count++;
                }
                specificNumber = specificNumber / 10;
            }
        }
        return count;
    }

    // Optimized Pattern-based Approach
    public int countDigitOneOptimized(int n) {
        if (n <= 0)
            return 0;

        int count = 0;
        long place = 1; 

        while (place <= n) {
            long current = (n / place) % 10;
            long higher = n / (place * 10);
            long lower = n % place;

            if (current == 0)
                count += higher * place;
            else if (current == 1)
                count += higher * place + (lower + 1);
            else
                count += (higher + 1) * place;

            place *= 10;
        }

        return count;
    }
}
```