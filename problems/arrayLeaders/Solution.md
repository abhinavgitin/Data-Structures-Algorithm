# Problem:  Leaders in an Array
**Platform:** GFG
**Problem link:** [GFG](https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1?page=1&sortBy=submissions)
**Date solved:** 2025-11-10
**Tags:** Array, 

---
## What this shows and what this can be used for!
This solution showcases a powerful pattern: scanning from right to left while maintaining a running suffix aggregate (here, the maximum). By flipping the traversal direction, any “depends on all elements to the right” condition becomes a constant-time check using a single accumulator. This eliminates nested loops and reduces time from O(n^2) to O(n).

Where this pattern is reusable:
- Problems that require comparing each element to everything on its right (leaders, record-breakers, dominance checks).
- Building suffix arrays on the fly (suffix max/min/sum/gcd) to answer per-index queries in one pass.
- Turning future-dependent logic into present state: carry the best-so-far (max/min) as you move.

Mental model to keep:
1) Choose traversal so “future info” becomes “known state”.
2) Maintain an invariant (max of suffix seen so far).
3) Update the invariant and decide in O(1) per element.
---
## Intuition
An element is a leader if no element to its right is greater than it. If we traverse from the end, we always know the maximum to the right. When the current element is >= that maximum, it must be a leader. Collect such elements and reverse at the end.
---

## Approach (step-by-step)s
1. Initialize an empty list `leaders`.
2. Set `max` to the last element (the last element is always a leader).
3. Traverse from right to left:
	- If `arr[i] >= max`, add `arr[i]` to the list and update `max = arr[i]`.
4. Reverse the collected list to restore left-to-right order.
5. Return the list.

---

## Complexity
- Time: O(n) — single linear pass plus a reverse.
- Space: O(1) extra (excluding the output list). Output itself can be up to O(n) in the worst case.

---

## Code
```[java]
import java.util.ArrayList;
import java.util.Collections;

public class arrayLeaders {
	public static void main(String[] args) {
		arrayLeaders obj = new arrayLeaders();
		int[] arr = {16,17,4,3,5,2};
		ArrayList<Integer> result = obj.leaders(arr);
		System.out.println(result); // Output: [17, 5, 2]
	}
	ArrayList<Integer> leaders(int arr[]) {
		// code here
		// boolean isGreater = false;
		ArrayList<Integer> list = new ArrayList <>();
		// for ( int i = 0 ; i < arr.length ; i++ ){
		//     for ( int j = i+1 ; j < arr.length ; j++ ){
		//         if ( arr[i] >= arr[j] ){
		//             isGreater = true;
		//         } else {
		//             isGreater = false;
		//             j = arr.length;
		//         }
		//     }
		//     if ( isGreater ) list.add(arr[i]);
		// }
		// return list;
        
        
		// --- 
		int max = arr[arr.length-1];
		for ( int i = arr.length-1 ; i >= 0 ; i-- ){
			if ( arr[i] >= max ){
				max = arr[i];
				list.add(max);
			}
		}
		Collections.reverse(list);
		return list;
	}
}
```