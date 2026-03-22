## Code
[View Code Here](../src/RotateArray.java)

# Problem:  RotateArray
**Platform:** Leetcode
**Problem link:** https://leetcode.com/problems/rotate-array/
**Date solved: 2026-03-22**  
**Tags:** Array, Two Pointers, Math

---
## What this shows and what this can be used for!

This demonstrates an efficient in-place method to rotate an array by k positions using array reversals. It can be used in scenarios where you need to shift elements in an array without using extra space, such as in data processing or algorithmic problems involving array manipulations.

---
## Intuition

To rotate an array to the right by k steps, we can reverse the entire array, then reverse the first k elements, and finally reverse the remaining elements. This achieves the rotation in O(n) time and O(1) space.

---

## Approach (step-by-step)s
1. Calculate k modulo n to handle cases where k is greater than the array length.
2. Reverse the entire array.
3. Reverse the first k elements.
4. Reverse the elements from index k to n-1.

---

## Alternate Approaches / Methods
- Using extra space: Create a new array and copy elements to their rotated positions.
- Cyclic replacement: Move each element to its new position one by one, but this can be inefficient for large k.

---

## Complexity
- Time: O(n)
- Space: O(1)

---

## Code
```java
class RotateArray {
    public static void main(String[] args) {
        RotateArray rotateArray = new RotateArray();
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotateArray.rotate(nums, k);
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    void reverse(int[] nums, int i, int j) {
        while (j > i) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            j--;
            i++;
        }
    }
}
```