# Problem: Array insert at index
**Platform:** GFG  
**Problem link:** <[Gfg](https://www.geeksforgeeks.org/problems/array-insert-at-index/1?page=2&sortBy=difficulty)>  
**Date solved:** 2025-10-21

---

## Intuition
< it is simple we can just use add() at this solution >

---

## Approach (step-by-step)s
1. add the val at the index at zero based indexing

---

## Alternate Approaches / Methods
- this is the best approach and what i was thinking that if you have to input the data at that index andd then remove the same data that was there then you can totally use arr.remove(index) this first and then add() the value

---

## Complexity
- Time: O(n)
- Space: O(1)

---

## Code
```<java>
import java.util.*;
public class ArrayInsertAtIndex {
    public static void main(String[] args) {
        ArrayInsertAtIndex solution = new ArrayInsertAtIndex();
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int index = 2;
        int val = 10;
        solution.insertAtIndex(arr, index, val); // we call the method using the object
        System.out.println(arr); // Output should be [1, 2, 10, 3, 4, 5]
    }
    public void insertAtIndex(ArrayList<Integer> arr, int index, int val) {
        // code here
        arr.add(index , val );
    }
}

