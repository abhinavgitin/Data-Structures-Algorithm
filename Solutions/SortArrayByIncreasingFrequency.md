## Code
[View Code Here](../src/SortArrayByIncreasingFrequency.java)

# Problem:  SortArrayByIncreasingFrequency
**Platform:** Leetcode
**Problem link:** https://leetcode.com/problems/sort-array-by-increasing-frequency/
**Date solved: 2026-02-25**  
**Tags:** Array, Hash Table, Sorting

---
## What this shows and what this can be used for!

This solution demonstrates how to sort an array by the frequency of its elements in ascending order, and for elements with the same frequency, by their values in descending order. It can be used for problems requiring frequency-based sorting or custom ordering based on counts.

---
## Intuition

To achieve the required sorting, we first need to count the frequency of each element. Then, we can sort the array using a custom comparator that first compares the frequencies (ascending), and if frequencies are equal, compares the element values (descending).

---

## Approach (step-by-step)s
1. Create a HashMap to store the frequency of each element in the input array.
2. Convert the int[] array to an Integer[] array to enable sorting with a custom comparator.
3. Use Arrays.sort with a lambda comparator that:
   - Compares frequencies first (ascending order).
   - If frequencies are equal, compares the element values (descending order).
4. Copy the sorted Integer[] array back to the original int[] array.
5. Return the sorted array.

---

## Alternate Approaches / Methods
- Use a list of pairs (element and frequency) and sort the list using a custom comparator.
- Use a priority queue (min-heap for frequency, max-heap for values) to build the sorted array.
- Implement bucket sort where elements are grouped by frequency and then sorted within buckets.

---

## Complexity
- Time: O(n log n)
- Space: O(n)

---

## Code
```java
import java.util.*;

public class SortArrayByIncreasingFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length : ");
        int length = sc.nextInt();
        System.out.println("Enter the elements of the array : ");
        int[] arr = new int[length];
        for ( int i = 0 ; i < length ; i++ ) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString( new SortArrayByIncreasingFrequency().sortArrayByFreq(arr)) );
        sc.close();
    }
    public int[] sortArrayByFreq( int num[] ) {
        Integer[]  arr = new Integer[num.length];
        HashMap<Integer,Integer> map = new HashMap<>();
        for ( int idx = 0 ; idx < num.length ; idx++ ) {
            map.put(num[idx], map.getOrDefault(num[idx], 0)+1);
            arr[idx] = num[idx];
        }
        Arrays.sort( arr, (a,b) -> {
            int fa = map.get(a);
            int fb = map.get(b);

            if ( fa != fb ) return fa-fb;
            else return b-a;
        });
        for ( int i = 0 ; i < num.length ; i++ ) {
            num[i] = arr[i];
        }
        return num;
    }
}
```
