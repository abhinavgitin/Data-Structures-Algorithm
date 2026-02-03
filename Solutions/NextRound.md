## Code
[View Code Here](../src/NextRound.java)

# Problem:  NextRound
**Platform:** Codeforces
**Problem link:** https://codeforces.com/problemset/problem/158/A
**Date solved: 2026-02-03**  
**Tags:** array, implementation, counting

---
## What this shows and what this can be used for!

This problem demonstrates a simple array traversal to count elements that meet specific criteria relative to a reference value. It can be used in scenarios where you need to filter and count items based on a threshold derived from the data itself.

---
## Intuition

Given n contestants with their scores in an array, and a position k, we need to count how many contestants have a score that is greater than zero and at least as high as the score of the k-th contestant. This determines who qualifies for the next round.

---

## Approach (step-by-step)s
1. Read the number of contestants n and the position k from input.
2. Read the array of n scores.
3. Store the score of the k-th contestant (arr[k-1]) as the threshold value.
4. Iterate through each score in the array and count how many are greater than 0 and greater than or equal to the threshold.
5. Output the count.

---
## Alternate Approaches / Methods
- Sort the array in descending order and find the position where scores drop below the threshold, but this would be O(n log n) instead of O(n).
- Use streams in Java for a more functional approach, but the loop is straightforward and efficient.

---
## Complexity
- Time: O(n)
- Space: O(n)

---

## Code
```[java]
import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        /* it was said that the given no of contesttent are n and there scores are respective in the array 
        we need to find such ppl whos score is greater or equal to the said kth contesttent score such that if thay quallify for that 
        they can go for the next round */
        Scanner sc = new Scanner( System.in );
        int n = sc.nextInt(); // i take the imput that how many players were there
        int k = sc.nextInt(); // then the imput for that specific player 
        int[] arr = new int[n];
        for ( int i = 0 ; i < n ; i++ ) {
            arr[i] = sc.nextInt(); // here the scores of the players are takes respectively 
        }
        int count = 0; // we make a count to see how many players qualify for the next round
        int val = arr[k-1]; // we store the valur for that specific score of the kth player into val
        for ( int j : arr ){ 
            if ( j > 0 && j >= val ) count++; // then if the score is greater than zero and is less than or equal to the kth score the val 
            // then we increment the count++;
        }
        System.out.println(count); // display it!
        sc.close();
    
    }
}
```