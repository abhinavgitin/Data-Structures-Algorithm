# Problem: Elements Less or Greater
**Platform:** GFG
**Problem link:** [GFG](https://www.geeksforgeeks.org/problems/smaller-and-larger4005/1?page=4&sortBy=difficulty)
**Date solved:** 2025-10-28

---
## What this shows and how it can be used
- this shows that how can we get the fiest position of the target and the end most position of the target 
- for example in arr [0,1,2,3,4,4,4,4,4,4,4,5,6,7,8,9] the first position for the target "4" is 4 and the end most position of the target is 10 
- so it returns us as 11 and 12

---
## Intuition
- If the input array is sorted, you can find counts by locating boundary indices instead of scanning every element.
- Count of elements <= target equals the index of the rightmost element <= target plus one (or the insertion point where target would be placed to keep array sorted).
- Count of elements >= target equals total length minus the index of the first element >= target.
- When the array isn't large or extra clarity is preferred, a simple single-pass linear scan can compute both counts in O(n) time.

---
## Approach (binary-search, step-by-step)
1. Use a binary search to find how many elements are <= target:
   - Maintain start and end pointers. If arr[mid] <= target, move start = mid + 1 to search right; otherwise move end = mid - 1.
   - When the loop finishes, start is the insertion point and equals the count of values <= target.
2. Use a second binary search to find how many elements are >= target:
   - If arr[mid] >= target, move end = mid - 1 to find an earlier occurrence; otherwise move start = mid + 1.
   - When the loop finishes, the first index >= target is end + 1, so count = n - (end + 1).
3. Return the two counts as an int array: {countLessOrEqual, countGreaterOrEqual}.

Edge cases covered:
- Empty array -> both counts 0.
- All elements < target -> countGreaterOrEqual may be 0.
- All elements > target -> countLessOrEqual may be 0.
- Duplicates around target -> binary search correctly handles duplicates by moving left/right appropriately.

---
## Alternate approach (linear scan)
- Iterate the array once and maintain two counters:
  - If element <= target, increment lesser counter.
  - If element >= target, increment greater counter.
- This is straightforward, easy to implement, and runs in O(n) time and O(1) extra space.

Pseudo-steps:
1. Set elementsLesser = 0 and elementsGreater = 0.
2. For each element in the array:
   - If element <= target, elementsLesser++.
   - If element >= target, elementsGreater++.
3. Return {elementsLesser, elementsGreater}.

---
## Complexity
- Binary-search approach:
  - Time: O(log n) — two binary searches on the array (each O(log n)), total still O(log n).
  - Space: O(1) — only a few integer variables used.
- Linear-scan approach:
  - Time: O(n) — single pass over the array.
  - Space: O(1) — only two counters.

---
## Code
The implementation below matches the code in `ElementsLessAndGreater.java`. It includes a `main` for a quick local run and two helper binary-search methods.

```java
public class ElementsLessAndGreater {
	public static void main(String[] args) {
		ElementsLessAndGreater obj = new ElementsLessAndGreater();
		int[] arr = {1,2,2,2,3,4,5,6,7,8,9};
		int target = 2;
		int[] result = obj.getMoreAndLess(arr , target);
		System.out.println("Elements less than or equal to " + target + " : " + result[0]);
		System.out.println("Elements greater than or equal to " + target + " : " + result[1]);
	}
	int[] getMoreAndLess(int[] arr, int target) {
		// Alternate (simple) approach - linear scan
		// int elementsLesser = 0;
		// int elementsGreater = 0;
		//
		// for ( int i : arr ){
		//     if ( i <= target ){
		//         elementsLesser++;
		//     }
		//     if ( i >= target ){
		//         elementsGreater++;
		//     }
		// }
		// return new int[]{elementsLesser,elementsGreater};
        
		// Efficient approach using binary search
		return new int[] {
			countLessOrEqual(arr, target),
			countGreaterOrEqual(arr, target)
		};
        
	}
	int countLessOrEqual(int[] arr, int target) {
		int start = 0, end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] <= target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return start;
	}

	int countGreaterOrEqual(int[] arr, int target) {
		int start = 0, end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] >= target) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return arr.length - (end + 1);
	}
}
```

---
### Quick verification
- The `main` prints counts for the sample array and target. You can compile and run the Java file to verify output.

---
