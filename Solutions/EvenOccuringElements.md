## Code
[View Code Here](../src/EvenOccuringElements.java)

# Problem:  EvenOccuringElements
**Platform:** GFG
**Problem link:** 
**Date solved: 2026-04-03**  
**Tags:** <tag1, tag2>

---
## What this shows and what this can be used for!
This solution demonstrates how to find elements that appear an even number of times in an array using frequency counting. It's useful for problems involving element frequency analysis and maintaining order of first occurrences.

---
## Intuition
We need to identify elements that have even frequency counts. By using a HashMap to count occurrences and a HashSet to track already processed elements, we can efficiently collect elements in their first appearance order while avoiding duplicates.

---

## Approach (step-by-step)s
1. Use a HashMap to count the frequency of each element in the array
2. Initialize an ArrayList to store results and a HashSet to track seen elements
3. Iterate through the array in order, checking for each element:
   - If not seen before and frequency is even, add to result list and mark as seen
4. If no elements with even occurrences found, add -1 to the result list
5. Return the result list

---

## Alternate Approaches / Methods
- Sort the array and count consecutive elements
- Use a single pass with XOR for finding elements with odd/even counts (but less efficient for multiple elements)
- Use a frequency array if elements are within a small range

---

## Complexity
- Time: O(n) where n is the array length (two passes through the array)
- Space: O(n) for the HashMap and HashSet in worst case

---

## Code
```java
import java.util.*;
class EvenOccuringElements {

    public static void main(String[] args) {
        EvenOccuringElements obj = new EvenOccuringElements();
        int[] arr = {1,2,3,2,3,1,3,3};
        System.out.println(obj.findEvenOccurrences(arr));
    }

    public List<Integer> findEvenOccurrences(int[] arr) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();
        for ( int n : arr ) {
            map.put( n, map.getOrDefault(n,0)+1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> seen = new HashSet<>();
        
        for ( int num : arr ) {
            if ( !seen.contains(num) && map.get(num) % 2 == 0 ) {
                seen.add(num);
                list.add(num);
            }
        }
        // never use list.conatins()!!
        // it searches again and again for the same repeated element and thus the TC increases!
        // so always use Set for such operation cause the conatins in 
        // hashSet is like each element has been registered and there the searchin becomes easier!
        if ( list.size() == 0 ) {
            list.add(-1);
        }
        return list;
    }
}
```