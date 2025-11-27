## Code
[View Code Here](../src/FindMissingElements.java)

# Problem:  FindMissingElements
**Platform:** LeetCode
**Problem link:** [Leetcode](https://leetcode.com/problems/find-missing-elements/description/)
**Date solved: 2025-11-28**  
**Tags:** HashSet, List, 

---
## What this shows and what this can be used for!

Finds all integers missing between the smallest and largest values of an integer array when the endpoints are guaranteed to be present. Useful for range-completion checks and basic data validation.

---
## Intuition

If the smallest and largest elements define the original full range, any missing numbers must lie between them. Using a `HashSet` gives constant-time membership checks so we can collect missing values quickly.

---
## Approach (step-by-step)
1. Insert every number from `nums` into a `HashSet` while tracking the minimum and maximum values.
2. Iterate from `min` to `max` (inclusive) and add any value not present in the set to the result list.
3. Return the collected list — iteration from `min` to `max` produces ascending order, so the result is sorted.

---
## Alternate Approaches / Methods
- Sort `nums` and scan adjacent elements for gaps (time O(n log n), space O(1) or O(n) depending on sort).
- Use a boolean presence array sized by the value range (works well given constraints `nums[i] <= 100`).

---
## Complexity
- Time: O(n + R) where n = `nums.length` and R = `max - min` (worst-case bounded by problem constraints). Practically this is O(n) for small ranges.
- Space: O(n) for the `HashSet` plus O(k) for the output, where k is number of missing elements.

---
## Code
```java
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class FindMissingElements {
    public static void main(String[] args) {
        FindMissingElements finder = new FindMissingElements();
        int[] nums = {3, 7, 1, 2, 8, 4, 5 , 19};
        List<Integer> missingElements = finder.findMissingElements(nums);
        System.out.println(missingElements); // Output: [6]
    }
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> numbers = new HashSet<>();
        int smallest = nums[0];
        int largest = nums[0];
        for ( int i : nums ){
            numbers.add(i);
            if ( smallest > i ){
                smallest = i;
            }
            if ( largest < i ){
                largest = i;
            }
        }
        for ( int i = smallest ; i <= largest ; i++ ){
            if ( !numbers.contains(i) ) list.add(i);
        }
        return list;
    }
}