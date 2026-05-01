## Code
[View Code Here](../src/ProductOfArrayExceptSelf.java)

# Problem:  ProductOfArrayExceptSelf
**Platform:** LeetCode
**Problem link:** https://leetcode.com/problems/product-of-array-except-self/
**Date solved: 2026-04-25**  
**Tags:** Array, Prefix Product, Math

---
## What this shows and what this can be used for!

This solution demonstrates an efficient way to compute the product of all elements in an array except the current element without using division. This approach is particularly useful in scenarios where division is not allowed (e.g., due to zeros in the array) or when we want to avoid floating-point precision issues. It showcases the use of prefix and suffix products to solve problems involving cumulative operations on arrays.
## Intuition

The problem requires finding the product of all elements in the array except the current element for each position. A naive approach would be to calculate the total product and divide by each element, but this fails when there are zeros or when division is not permitted. Instead, we can use the concept of prefix and suffix products: for each element at index i, the result is the product of all elements before i multiplied by the product of all elements after i.

## Approach (step-by-step)s
1. Initialize an answer array of the same length as the input array.
2. Compute the prefix products: Set ans[0] = 1, then for each subsequent index i, set ans[i] = ans[i-1] * nums[i-1]. This gives the product of all elements before i.
3. Compute the suffix products: Initialize a suffix variable to 1. Iterate from right to left: for each index i, multiply ans[i] by the current suffix, then update suffix by multiplying it with nums[i]. This incorporates the product of all elements after i.
4. Return the answer array.

## Alternate Approaches / Methods
- **Naive Division Approach**: Calculate the total product of all elements, then for each element, divide the total product by that element. However, this approach fails when there are zeros in the array (division by zero) and is not allowed on LeetCode as it uses division.
- **Two-Pass with Extra Space**: Use separate arrays for prefix and suffix products, then combine them. This uses O(n) extra space but is easier to understand.

## Complexity
- Time: O(n) - We perform two linear passes through the array.
- Space: O(1) - The output array is not counted as extra space; we only use a constant amount of extra space for variables.

## Code
```java
public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        ProductOfArrayExceptSelf p = new ProductOfArrayExceptSelf();
        int[] nums = {-1,-1,1,-1,-1,1,-1,-1,1,1,-1,1,-1,1,1,1,-1,1,-1,-1,1,-1,1,-1,1,-1};
        int[] ans = p.productExceptSelf(nums);
        for ( int i : ans ) {
            System.out.print(i + " ");
        }
    }
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int ans[] = new int[length];
        ans[0] = 1;
        for ( int i = 1 ; i < length ; i++ ) {
            ans[i] = ans[i-1]*nums[i-1];
        }
        int suffix = 1;
        for ( int i = length - 1; i >= 0 ; i-- ) {
            ans[i] *= suffix;
            suffix *= nums[i];
        }
        return ans;
    }
}
```