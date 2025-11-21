## Code
[View Code Here](../src/NearestDuplicate.java)

# Problem:  NearestDuplicate
**Platform:** Leetcode
**Problem link:** [Leetcode](https://leetcode.com/problems/contains-duplicate-ii/description/)
**Date solved: 2025-11-22**  
**Tags:** <tag1, tag2>

---
## What this shows and what this can be used for!
Detects whether any value appears at two distinct indices within distance `k` — useful for nearby-duplicate checks in arrays or streaming data.

---
## Intuition
Remember the last index where each value appeared; when you see the same value again, check the index gap.

---

## Approach (step-by-step)s
1. Iterate the array with index `i`.
2. If `nums[i]` exists in the map, get its previous index and check `i - prevIndex <= k`. If true, return `true`.
3. Update the map with the current index for `nums[i]`.
4. If the loop ends, return `false`.

---

## Complexity
- Time: O(n)
- Space: O(n)

---

## Code
```java
import java.util.HashMap;

public class NearestDuplicate {
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		HashMap<Integer,Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				int oldIndex = map.get(nums[i]);
				if (i - oldIndex <= k) return true;
			}
			map.put(nums[i], i);
		}
		return false;
	}
}
```