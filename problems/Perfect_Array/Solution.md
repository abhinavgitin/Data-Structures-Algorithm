# Problem:  Perfect Array
**Platform:** GFG
**Problem link:** [GFG](https://www.geeksforgeeks.org/problems/perfect-array2344/1?page=1&sortBy=difficulty)
**Date solved:**  2025-10-28


---
## What this shows and what this can be used for!
- how to handel or go through each of the element in the loop from 0 to arr.length-1;
- what i saw is that you can use the loop like this to go through all the elements execpt the last element in the loop 
```[java]
for ( int i = 0 ; i+1 < arr.length ; i++ )
{ if ( arr[i] < arr[i+1] ) 
break;
} // this way probably yes or no chat so conterversial in my mind all the time 
```
- Loop through all elements, handle last separately
> 👉 Use this when you still want to do something with the last element individually.
```[java]
for (int i = 0; i < arr.length; i++) {
    if (i + 1 < arr.length) {
        System.out.println(arr[i] + " and " + arr[i + 1]);
    } else {
        // handle the last element separately
        System.out.println(arr[i] + " (last element)");
    }
}

```
✅ Goes through every element
✅ Lets you use arr[i+1] safely when possible
✅ Handles the last element too
---
## Intuition
The problem requires us to identify if an array follows a "perfect" pattern where:
1. Elements first increase strictly (each element greater than previous)
2. Then remain constant (plateau of same values)
3. Finally decrease strictly (each element less than previous)

Think of it like a mountain profile:
- First climb up (strictly increasing)
- Then walk on flat ground (same values)
- Finally descend (strictly decreasing)

Example: [1,2,3,3,2,1] is perfect because:
- 1→2→3 (increasing)
- 3→3 (plateau)
- 3→2→1 (decreasing)

---

## Approach (step-by-step)s
### First Approach (Multiple Flags):
1. Initialize three boolean flags:
   - `strictlyIncreasing` for upward phase
   - `same` for plateau phase
   - `strictlyDecreasing` for downward phase
2. Use two index markers (`index1`, `index2`) to track phase transitions
3. First loop: Find where strictly increasing ends
4. Second loop: Find where same values end
5. Third loop: Check for strictly decreasing
6. Validate all three phases exist

### Final Optimized Approach:
1. Handle base cases:
   - Empty array → return false
   - Single element → return false
2. Use single pointer `i` starting from 1
3. Three-phase check:
   - While current > previous: move forward (increasing)
   - While current = previous: move forward (plateau)
   - While current < previous: move forward (decreasing)
4. If pointer reaches end, array is perfect

---

## Alternate Approaches / Methods
1. Flag-Based Approach (PerfectArrayApproach1.java):
   - Uses multiple boolean flags
   - Tracks each phase separately
   - More verbose but clear logic
   - Good for understanding the problem

2. King Value Approach (PerfectArrayApproach2.java):
   - Tries to find peak value first
   - Validates plateau around peak
   - Checks increasing/decreasing patterns
   - More complex implementation

3. Single Pass Approach (PerfectArrayFinalApproach.java):
   - Most elegant solution
   - Uses single pointer
   - Minimal variables
   - Cleaner state transitions

---

## Complexity
1. Flag-Based Approach:
   - Time: O(n) - three separate passes through array
   - Space: O(1) - few boolean variables
   - Trade-off: More readable but less efficient

2. King Value Approach:
   - Time: O(n) - multiple passes through array
   - Space: O(1) - constant extra space
   - Trade-off: Complex logic, same complexity

3. Final Optimized Approach:
   - Time: O(n) - single pass through array
   - Space: O(1) - single counter variable
   - Most efficient implementation
   - Best balance of clarity and performance

---

## Code
```java
public class PerfectArrayFinalApproach {
    public static void main(String[] args) {
        PerfectArrayFinalApproach obj = new PerfectArrayFinalApproach();
        int[] arr = {1,2,3,3,2,1};
        System.out.println(obj.isPerfect(arr));
    }
    public boolean isPerfect(int[] arr) {
        int n = arr.length;
        if (n == 0 || n == 1) return false;
        int i = 1;
        while (i < n && arr[i] > arr[i - 1]) i++;  // Find end of increasing phase

        while (i < n && arr[i] == arr[i - 1]) i++;  // Find end of plateau phase

        while (i < n && arr[i] < arr[i - 1]) i++;  // Find end of decreasing phase

        return i == n;  // Perfect if we reached the end
    }
}
```