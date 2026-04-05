## Code
[View Code Here](../src/JewelsAndStones.java)

# Problem:  JewelsAndStones
**Platform:** leetcode
**Problem link:** https://leetcode.com/problems/jewels-and-stones/
**Date solved: 2026-03-28**  
**Tags:** Hash Table, String

---
## What this shows and what this can be used for!

This solution demonstrates the use of a HashMap to efficiently count the frequency of characters in a string and then query the counts for specific characters. It can be used in scenarios where you need to count occurrences of elements and perform lookups, such as in string processing problems involving character frequencies.

---
## Intuition

The problem requires counting how many stones are jewels. Since jewels are represented by a string of unique characters, we can use a map to store the count of each stone character, then iterate through the jewels string and sum up the counts from the map.

---

## Approach (step-by-step)s
1. Create a HashMap to store the frequency of each character in the stones string.
2. Iterate through each character in stones and update the count in the map.
3. Initialize a counter for the number of jewels.
4. Iterate through each character in jewels and add the count from the map (defaulting to 0 if not present) to the counter.
5. Return the total count.

---

## Alternate Approaches / Methods
- Use a HashSet for jewels and iterate through stones, incrementing count for each stone that is in the set. This would have O(m + n) time but O(m) space where m is jewels length.
- Use an array of size 256 (for ASCII) to count frequencies instead of HashMap, which would be more efficient for ASCII characters.

---

## Complexity
- Time: O(n + m) where n is the length of stones and m is the length of jewels
- Space: O(n) for the HashMap storing stone frequencies

---

## Code
```java
import java.util.*;

class JewelsAndStones {
    public static void main(String[] args) {
        JewelsAndStones solution = new JewelsAndStones();
        System.out.println(solution.numJewelsInStones("aA", "aAAbbbb")); // Output: 3
        System.out.println(solution.numJewelsInStones("z", "ZZ")); // Output: 0
        // more test cases:
        System.out.println(solution.numJewelsInStones("abc", "aabbcc")); // Output: 6
        System.out.println(solution.numJewelsInStones("xYz", "xXyYzZ")); // Output: 3
        System.out.println(solution.numJewelsInStones("", "ZZ")); // Output: 0
        System.out.println(solution.numJewelsInStones("aA", "")); // Output: 0
        System.out.println(solution.numJewelsInStones("aA", "bB")); // Output: 0
        // and like that, you can add more test cases to validate the solution further.
    }
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer> map = new HashMap<>();
        int length = stones.length();
        for ( int i = 0 ; i < length ; i++ ) {
            map.put( stones.charAt(i), map.getOrDefault(stones.charAt(i),0)+1 );
        }
        int lengthForJewels = jewels.length();
        int noOfJewels = 0;
        for ( int j = 0 ; j < lengthForJewels ; j++ ) {
            noOfJewels += map.getOrDefault(jewels.charAt(j),0);
        }
        return noOfJewels;
    }
}
```