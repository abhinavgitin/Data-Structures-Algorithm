# Problem: Difference between highest and lowest occurrence
**Platform:** GFG
**Problem link:** [GFG](https://www.geeksforgeeks.org/problems/difference-between-highest-and-lowest-occurrence4613/1?page=5&sortBy=difficulty)
**Date solved:** 2025-10-27 


---
## What this shows and what this can be used for!
- handeling the frequency 
- Using HashMap
- comparing w.r.t minFrequency = Integer.MIN_VALUE;
                  maxFrequency = Integer.MAX_VALUE;
- .get() , .keySet() , .value();
---
## Intuition
The problem requires us to find the difference between the highest and lowest frequencies of elements in an array. By using a HashMap to store element frequencies, we can easily track how many times each element appears and then find the maximum and minimum frequencies.

---

## Approach (step-by-step)s
1. Create a HashMap to store the frequency count of each element
2. Iterate through the array once to build the frequency map
3. Initialize maxFrequency as MIN_VALUE and minFrequency as MAX_VALUE
4. Iterate through the frequency values in the HashMap to find max and min frequencies
5. Handle edge case: if there's only one unique element, return 0
6. Return the difference between maxFrequency and minFrequency

---

## Alternate Approaches / Methods
- Use Array/ArrayList instead of HashMap if input range is known and small
- Use TreeMap to maintain sorted frequencies (but increases time complexity)

---

## Complexity
- Time: O(n) where n is the length of input array
- Space: O(k) where k is the number of unique elements

---

## Code
```java
public int findDiff(int[] arr) {
    HashMap<Integer,Integer> frequency = new HashMap<>();
    
    for (int num : arr) {
        frequency.put(num, frequency.getOrDefault(num,0) + 1);
    }
    
    int maxFrequency = Integer.MIN_VALUE;
    int minFrequency = Integer.MAX_VALUE;
        
    for (int element : frequency.keySet()) {
        int count = frequency.get(element);
        if (count > maxFrequency) {
            maxFrequency = count;
        }
        if (count < minFrequency) {
            minFrequency = count;
        }
    }
    
    if (frequency.size() == 1) return 0;
    
    return maxFrequency - minFrequency;
}
```