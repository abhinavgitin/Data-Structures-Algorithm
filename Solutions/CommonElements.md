# Problem:  CommonElements
**Platform:** GFG
**Problem link:** 
**Date solved: 2026-02-08**  
**Tags:** arrays, hashmap, intersection

---
## What this shows and what this can be used for!

This problem shows how to find the intersection of two arrays while considering the frequency of elements, taking the minimum count for common elements. It can be used in data processing tasks where you need to find overlapping items with their multiplicities, such as in set operations or duplicate handling.

---
## Intuition

To find elements that appear in both arrays, we need to account for their frequencies. Using hashmaps to count occurrences allows us to easily identify common elements and determine how many times each should appear in the result based on the minimum frequency.

---

## Approach (step-by-step)s
1. Create two HashMaps: `map` for array `a` and `map2` for array `b`, to count the frequency of each element.
2. Iterate through the keys of `map` (from array `a`).
3. For each key, check if it exists in `map2` (array `b`).
4. If it does, calculate the minimum frequency between `map.get(num)` and `map2.get(num)`.
5. Add the key to the result ArrayList that many times.
6. After processing all keys, sort the ArrayList in ascending order.
7. Return the sorted ArrayList.

---

## Alternate Approaches / Methods
- If the arrays are sorted, use two pointers to find common elements while tracking counts.
- Use a single HashMap and decrement counts while iterating the second array, but the current approach is straightforward.
- For unique elements only, use HashSets, but this problem requires handling duplicates.

---

## Complexity
- Time: O(n + m + k log k), where n and m are the sizes of the arrays, and k is the number of common elements (due to sorting).
- Space: O(n + m), for the two HashMaps.

---

## Code
```java
// User function Template for Java
import java.util.*;
class CommonElements {
    public static ArrayList<Integer> commonElements(int a[], int b[]) {
        // -------------------- another approach --------------------
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();
        for ( int i : a ) {
            map.put(i,map.getOrDefault(i, 0)+1);
        }
        for ( int j : b ) {
            map2.put(j,map2.getOrDefault(j,0)+1);
        }
        for ( int num : map.keySet() ){
            if ( map2.containsKey(num) ) {
                int totalCount = Math.min(map.get(num), map2.get(num) );
                while ( totalCount > 0 ) {
                    list.add(num);
                    totalCount--;
                }
            }
        }
        Collections.sort(list);
        return list;
    }
    public static void main(String[] args) {
        // i want that the user enters the elements by themselves and then we will call the function to get the common elements
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the first array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of the first array: ");
        for ( int i = 0 ; i < n ; i++ ) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the size of the second array: ");
        int m = sc.nextInt();
        int[] b = new int[m];
        System.out.println("Enter the elements of the second array: ");
        for ( int i = 0 ; i < m ; i++ ) {
            b[i] = sc.nextInt();
        }
        System.out.println("Common elements are: " + commonElements(a,b) );
        sc.close();
    }
}
```