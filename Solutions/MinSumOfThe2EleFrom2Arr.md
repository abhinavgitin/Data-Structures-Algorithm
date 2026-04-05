## Code
[View Code Here](../src/MinSumOfThe2EleFrom2Arr.java)

# Problem:  MinSumOf2EleFrom2Arr
**Platform:** GFG
**Problem link:** 
**Date solved: 2026-04-02**  
**Tags:** <tag1, tag2>

---
## What this shows and what this can be used for!
This solution demonstrates finding the minimum sum of one element from each of two arrays, with the constraint that elements cannot be taken from the same index position. It's useful for optimization problems involving array selections with index restrictions.

---
## Intuition
To minimize the sum while avoiding the same index, we need to find the smallest element in the first array and pair it with the smallest element in the second array that isn't at the same index. The algorithm efficiently tracks both minimums and their indices in a single pass.

---

## Approach (step-by-step)s
1. Initialize minimum values to MAX_VALUE and index trackers
2. Iterate through both arrays simultaneously (arr1 from start, arr2 from end)
3. For each position, update the minimum for arr1 if a smaller value is found and the index doesn't conflict with arr2's minimum index
4. Similarly update the minimum for arr2, ensuring the index doesn't match arr1's minimum index
5. After the loop, return the sum of the two minimums found

---

## Alternate Approaches / Methods
- Find the minimum and second minimum in each array separately, then choose the optimal pairing
- Use sorting to find the smallest elements and check index conflicts
- Brute force: check all possible pairs except same index and find minimum sum

---

## Complexity
- Time: O(n) where n is the length of the arrays (assuming equal length)
- Space: O(1) excluding input arrays

---

## Code
```java
public class MinSumOfThe2EleFrom2Arr {
    public static void main(String[] args) {
        MinSumOfThe2EleFrom2Arr obj = new MinSumOfThe2EleFrom2Arr();
        int ans = obj.minSum(new int[]{5,4,13,1}, new int[]{3,2,6,1});
        System.out.println(ans);
    }
    public int minSum(int[] arr1, int[] arr2) {
        // code here
        int len1 = arr1.length;
        int len2 = arr2.length;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int i = 0;
        int j = len2-1;
        int idx1 = 0, idx2 = len2-1;
        while ( len1-- > 0 ) {
            if ( min1 > arr1[i] ) { // if we get the min
                idx1 = i; // we save ist position
                if ( idx1 != idx2 ) { // we check that is idx of min1 is not equal to idx of min2
                    min1 = arr1[i]; // if not then save the min1 of the arr1
                }
            }
            if ( min2 > arr2[j] ) {
                idx2 = j;
                if ( idx2 != idx1 ) {
                    min2 = arr2[j];
                }
            }
            i++;
            j--;
        }
        return min1+min2;
    }
}
```