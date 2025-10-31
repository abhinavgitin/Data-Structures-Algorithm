# Problem:  TheTwoSneakyNumbersOfDigitville
**Platform:** LeetCode
**Problem link:** [LeetCode](https://leetcode.com/problems/the-two-sneaky-numbers-of-digitville/)
**Date solved:**  2025-10-31
**Tags:** HashMap , Streams

---
## What this shows and what this can be used for!
- shows how to convert the arrayList to the array
- use of the streams();
- handel the dublicates using the HashMap <Integer,Integer>
- use of setKey -> element and .get() -> to get the value of that element 
---
## Intuition

The task is to return the numbers that appear more than once in the input array. A frequency count of elements is the most straightforward way to detect duplicates. Using a HashMap lets us build this frequency table in a single pass over the array and then collect all keys whose frequency is greater than 1.

---

## Approach (step-by-step)s
1. Create a HashMap<Integer, Integer> to store counts for each number.
2. Iterate once over the input array and increment the count in the map for each element.
3. Iterate over the map's keys and collect keys whose count > 1 into a list.
4. Convert the list to an int[] and return it.

---

## Alternate Approaches / Methods
- Sorting-based approach:
  - Sort the array (O(n log n)).
  - Scan once to collect consecutive equal elements as duplicates.
  - Simpler code in some languages but worse time complexity.
- Boolean / BitSet approach (when value range is small):
  - Use a boolean[] "seen" and another boolean[] "duplicate" to mark repeated values.
  - O(n) time and O(range) space — good when values are bounded and memory is acceptable.

---

## Complexity
- Time: O(n) on average — one pass to count frequencies and another pass over the map's keys. HashMap operations are O(1) average.
- Space: O(k) where k is number of unique elements (map + temporary list). Worst-case k = n.

---

## Code
```[java]
import java.util.ArrayList;
import java.util.HashMap;

public class TheTwoSneakyNumbersOfDigitville {
	public static void main(String[] args) {
		TheTwoSneakyNumbersOfDigitville obj = new TheTwoSneakyNumbersOfDigitville();
		int[] nums = {1,2,3,4,3,2,5,6,7,8,9,1};
		int[] res = obj.getSneakyNumbers(nums);
		for ( int i : res ){
			System.out.print(i + " ");
		}
	}
	public int[] getSneakyNumbers(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		ArrayList<Integer> list = new ArrayList<>();
		for ( int i : nums ){
			map.put(i , map.getOrDefault(i,0)+1);
		}
		for ( int j : map.keySet() ){
			if ( map.get(j) > 1 ){
				list.add(j);
			}
		}
		int[] arr = list.stream().mapToInt(Integer::intValue).toArray();
		return arr;
	}
}
```