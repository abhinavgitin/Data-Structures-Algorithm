## Code
[View Java Code](../src/valuesPresentInAtLeastTwoArrays.java)

# Problem: Two Out of Three
**Platform:** LeetCode
**Problem link:** [LeetCode](https://leetcode.com/problems/two-out-of-three/description/)
**Date solved:** 2025-11-11
**Tags:** Array, Hash Table, HashSet, HashMap

---
## What this shows and what this can be used for!
Demonstrates using HashSet to eliminate duplicates within each array and HashMap to count occurrences across multiple arrays. Useful for finding common elements across datasets while ignoring duplicates within individual datasets.

---
## Intuition
The problem asks for values appearing in at least 2 arrays. Since duplicates within the same array don't matter (e.g., [1,1,3] should treat 1 as appearing once), we first convert each array to a HashSet. Then count how many arrays contain each unique value using a HashMap.

---

## Approach (step-by-step)s
1. Convert each input array (`nums1`, `nums2`, `nums3`) to HashSets to remove duplicates within each array
2. Use a HashMap to count in how many arrays each unique value appears (iterate through each set and increment the count)
3. Collect all values from the HashMap that have a count >= 2 into the result list
4. Return the result list

---

## Alternate Approaches / Methods

---

## Complexity
- Time: O(n1 + n2 + n3) where n1, n2, n3 are the lengths of the three arrays
- Space: O(n1 + n2 + n3) for the HashSets and HashMap

---

## Code
```java
public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
    HashSet<Integer> set1 = new HashSet<>();
    HashSet<Integer> set2 = new HashSet<>();
    HashSet<Integer> set3 = new HashSet<>();
    for ( int i : nums1 ) set1.add(i);
    for ( int i : nums2 ) set2.add(i);
    for ( int i : nums3 ) set3.add(i);
    HashMap<Integer,Integer> map = new HashMap<>();
    for ( int i : set1 ){
        map.put(i,map.getOrDefault(i,0)+1);
    }
    for ( int i : set2 ){
        map.put(i,map.getOrDefault(i,0)+1);
    }
    for ( int i : set3 ){
        map.put(i,map.getOrDefault(i,0)+1);
    }
    ArrayList<Integer> list = new ArrayList<>();
    for ( int i : map.keySet() ) {
        if ( map.get(i) >= 2 ){
            list.add(i);
        }
    }
    return list;
}
```