# Problem: Missing In An Array
**Platform:** GFG
**Problem link:**  [GFG](https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1?page=1&sprint=ca8ae412173dbd8346c26a0295d098fd&sortBy=difficulty)
**Date solved:** 2025-10-24

---
## What this shows and what this can be used for!
### IMPORTANT
- Find the missing number

- Find the element that appears once when others appear twice

- Swap numbers without a temporary variable

---
## Intuition
- we can use the XOR to find the element that is left out in the given set of data
- so we use one loop that will xor all the elemnts of the values we should origanally have 
- thus we loop through all th elements till n where n is the last element of that data set or the length of the array or size od the list 
- thus after we xor all the original data 
- then we xor the ones that we have as the arguments or the set in which the elemnts is missing 
- then we will have the set of two xor one xor of the original and te other of what we have 
- after then we xor both of them and this xor will give us the element that was missing cause the one welement wich is already there in both of the data set will cancle out and the only elemnt will be left that was missing 
- Bascially this :
```[java]
(1 ^ 2 ^ 3 ^ 4 ^ 5) ^ (1 ^ 2 ^ 4 ^ 5)
// so it becomes 
(1 ^ 1) ^ (2 ^ 2) ^ (4 ^ 4) ^ (5 ^ 5) ^ 3
//know that this and this 
1 ^ 2 ^ 1 ^ 3 ^ 4 ^ 2 ^ 5 ^ 5 ^ 4
= 3s
//are the same 
// xor dosent see the arrangement of how you keep the data it just compares 
1^1 = 0
0^1 = 1
1^0 = 1
0^0 = 0
// so anything xor with zero is always that itself 
a^0 = a

```
---

## Approach (step-by-step)s
1. loop through the original set of values and xor them
2. loop through the set of values we have and xor them
3. return the xor 

---

## Alternate Approaches / Methods
- add all the elements 
- use the formula (n(n+1))/2 to get the sum of the original set
- return totalsum - givenDataSum

---

## Complexity
- Time: O(n)
- Space: O(1);

---

## Code
```[java]
int missingNum(int arr[]) {
        // code here
        int xor = 0 ; 
        int n = arr.length+1;
        for ( int i = 1 ; i <= n ; i++ ){
            xor ^= i;
        }
        for ( int j : arr ){
            xor ^= j;
        }
        return xor;
    }
```