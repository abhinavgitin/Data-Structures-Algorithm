## Code
[View Code Here](../src/FurnitureStore.java)

# Problem:  FurnitureStore
**Platform:** Codeforces
**Problem link:** 
**Date solved: 2026-02-20**  
**Tags:** array, greedy, minimum-tracking

---
## What this shows and what this can be used for!

This problem demonstrates a technique for identifying elements in an array that are greater than the minimum value encountered so far. This can be useful in scenarios where we need to filter out suboptimal choices based on historical minimums, such as in optimization problems or when selecting the best option from a sequence.

---
## Intuition

The key insight is to maintain a running minimum of the prices seen so far. Any sofa with a price higher than this running minimum cannot be the cheapest option available at that point, making it "useless" for the purpose of finding the minimum-priced sofa up to that index.

---

## Approach (step-by-step)s
1. Read the number of test cases, t.
2. For each test case:
   a. Read the number of sofas, n.
   b. Read the array of prices, arr[0..n-1].
   c. Initialize an empty list 'useless' to store indices of useless sofas.
   d. Initialize minimumSoFar to Integer.MAX_VALUE.
   e. Iterate through each sofa i from 0 to n-1:
      - If arr[i] > minimumSoFar, add (i+1) to useless (1-based index).
      - Otherwise, update minimumSoFar to arr[i].
   f. Output the size of useless.
   g. Output the indices in useless, separated by spaces.
3. Close the scanner.

---

## Alternate Approaches / Methods
- Use a stack to keep track of indices of minimum elements, but the current approach is simpler and sufficient for this problem.

---

## Complexity
- Time: O(n) per test case, as we iterate through the array once.
- Space: O(n) for the useless list in the worst case.

---

## Code
```java
import java.util.*;

public class FurnitureStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while ( t-- > 0 ) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for ( int i = 0 ; i < n ; i++ ) {
                arr[i] = sc.nextInt();
            }
            // now i want to add that sofas that are of no use when the customer enters
            // the logic is that if the current element is greater then the previous one then we mark that as the sofas of no use
            List<Integer> useless = new ArrayList<>();
            int minimumSoFar = Integer.MAX_VALUE;
            for ( int i = 0 ; i < n ; i++ ) {
                if ( arr[i] > minimumSoFar ){ // here if the minimum pricing of the sofas for the ai sofa is more then the previous we mark that for useless
                    // cause the price is more then we saw last time
                    useless.add(i+1); // we return the 1-based index of the sofas places
                } else {
                    // else the minimum price that we saw till now will be
                    minimumSoFar = arr[i];
                }
            }
            // the output demanded here is no of the sofas that cannot be ordered 
            System.out.println(useless.size());
            // then exactly the sofas placed positions!
            for ( int i : useless ) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
```