## Code
[View Code Here](../src/SecondLargestElementInAnArray.java)

# Problem:  SecondLargestElementInAnArray
**Platform:** GFG
**Problem link:** [GFG](https://www.geeksforgeeks.org/problems/maximum-product-of-two-numbers2730/1?page=3&sortBy=difficulty)
**Date solved: 2026-01-30**  
**Tags:** Arrays , Searching the second largest element

---
## What this shows and what this can be used for!
- i shows the exact algorith to find the first largest and the second largest element in the array the list so its importnat to undestand how to find the first and the second largest element into the data list!
---
## Intuition
To find the maximum product of two numbers in an array, we need to identify the two largest elements efficiently. This approach avoids sorting and finds both values in a single pass through the array.

---

## Approach (step-by-step)s
1. Initialize two variables, `largest` and `secondLargest`, to track the maximum and second maximum values (set to a value smaller than any possible element, like Integer.MIN_VALUE).
2. Iterate through each element in the array.
3. For each element, check if it is greater than `largest`. If so, update `secondLargest` to the current `largest`, and set `largest` to the current element.
4. If the element is not greater than `largest` but greater than `secondLargest`, update `secondLargest` to the current element.
5. After processing all elements, return the product of `largest` and `secondLargest`.

---

## Alternate Approaches / Methods
- Sort the array in ascending order and return the product of the last two elements (arr[arr.length-1] * arr[arr.length-2]). This has O(n log n) time complexity due to sorting.
- Use a priority queue or heap to maintain the top two elements, but this is overkill for finding just two maximums.

---

## Complexity
- Time: O(n)
- Space: O(1)

---

## Code
```java
class SecondLargestElementInAnArray {
    public static void main(String[] args) {
        int[] arr = {1, 100, 42, 4, 23};
        System.out.println(maxProduct(arr)); // Output: 4200 (100*42)
    }
    public static int maxProduct(int[] arr) {
        // code here
        // first approach is to sort and then return the multiplication of the last two elements
        // Arrays.sort(arr);
        // return arr[arr.length-1]*arr[arr.length-2];
        
        // second approch
        // we need to find the largest and the second largets value
        int largest = -1;
        int secondLargest = -1;
        for ( int i : arr ){
            if ( largest < i ){
                secondLargest = largest; // we see that if the condition is true then there might be a number greater then the largest so we put that largest value into the second largest
                // and the the current number into the largest one
                largest = i; // then updated the largest with the i which is the first comparision done that was the current element larger then the largest
            } else if ( i > secondLargest ) { // here we search that does the current element is also greater then the second largest
                secondLargest = i; // if yes then update the value;
            }
        }
        return secondLargest*largest;
    }
}
```