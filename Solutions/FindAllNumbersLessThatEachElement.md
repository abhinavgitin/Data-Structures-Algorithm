## Code
[View Code Here](../src/FindAllNumbersLessThatEachElement.java)

# Problem:  FindAllNumbersLessThatEachElement
**Platform:** LeetCode
**Problem link:** [LeetCode](https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description/)
**Date solved: 2025-11-20**  
**Tags:** Nested Loops

---
## What this shows and what this can be used for!

- **Counts how many numbers in the array are smaller than each element.**
- **Demonstrates a brute-force comparison approach for array element relationships.**

---
## Intuition

- For each element, iterate through the entire array and count how many elements are smaller than it.

---
## Approach (step-by-step)
1. Initialize a result array of the same length as nums.
2. For each element at index i, initialize a counter to 0.
3. Loop through all elements j, and if nums[i] > nums[j], increment the counter.
4. Set result[i] to the counter value.
5. Return the result array.

---

## Alternate Approaches / Methods
- **Frequency Count Approach:** Since nums[i] <= 100, use a frequency array to count occurrences, then compute prefix sums for cumulative smaller counts.
  ```java
  public int[] smallerNumbersThanCurrentFreq(int[] nums) {
      int[] count = new int[101];
      for (int num : nums) {
          count[num]++;
      }
      int[] prefix = new int[101];
      for (int i = 1; i < 101; i++) {
          prefix[i] = prefix[i - 1] + count[i - 1];
      }
      int[] result = new int[nums.length];
      for (int i = 0; i < nums.length; i++) {
          result[i] = prefix[nums[i]];
      }
      return result;
  }
  ```
- **Sorting with Binary Search:** Sort a copy of the array, then for each element, find its position in the sorted array using binary search.
  ```java
  public int[] smallerNumbersThanCurrentSort(int[] nums) {
      int[] sorted = Arrays.copyOf(nums, nums.length);
      Arrays.sort(sorted);
      int[] result = new int[nums.length];
      for (int i = 0; i < nums.length; i++) {
          result[i] = binarySearch(sorted, nums[i]);
      }
      return result;
  }
  private int binarySearch(int[] arr, int target) {
      int left = 0, right = arr.length;
      while (left < right) {
          int mid = left + (right - left) / 2;
          if (arr[mid] < target) {
              left = mid + 1;
          } else {
              right = mid;
          }
      }
      return left;
  }
  ```

---

## Complexity
- Time: O(n^2) where n is the length of nums (nested loops).
- Space: O(n) for the result array.

---

## Code
```java
class FindAllNumbersLessThatEachElement {
    public static void main(String[] args) {
        FindAllNumbersLessThatEachElement solution = new FindAllNumbersLessThatEachElement();
        int[] nums = {8,1,2,2,3};
        int[] result = solution.smallerNumbersThanCurrent(nums);
        // Print the result
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] smallerNums = new int[nums.length];
        int areSmaller = 0;
        for ( int i = 0 ; i < nums.length ; i++ ){
            for ( int j = 0 ; j < nums.length ; j++ ){
                if ( nums[i] > nums[j] ){
                    areSmaller++;
                }
            }
            smallerNums[i] = areSmaller;
            areSmaller = 0;
        }
        return smallerNums;
    }
}
```