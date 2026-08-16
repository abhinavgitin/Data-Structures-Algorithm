## Code
[View Code Here](../src/MinSumkAvoidingArray.cpp)

# Problem:  MinSumkAvoidingArray
**Platform:** Leetcode
**Problem link:** [Leetcode](https://leetcode.com/problems/determine-the-minimum-sum-of-a-k-avoiding-array/description/)
**Date solved: 2026-08-16**  
**Tags:** Greedy, Array, Optimization, Pairing, Mathematical

---
## What this shows and what this can be used for!
This solution demonstrates a **greedy pairing strategy** to minimize the sum of selected elements while avoiding certain pair combinations. This technique is useful for:
- Problems involving constraints on element pairs (sum, product, or difference constraints)
- Optimization problems where selecting elements must respect mutual exclusivity rules
- Mathematical sequence problems requiring strategic selection from a range

---
## Intuition
The key insight is that if we want to avoid pairs where both elements sum to k or more, we should select smaller numbers from the lower half and larger numbers from the upper half of our range. By selecting 1 to k/2 (lower numbers) and then jumping to k and beyond (upper numbers), we ensure no two selected numbers can sum to k or more. This greedy approach minimizes the total sum by using the smallest possible numbers.

---

## Approach (step-by-step)s
1. **Handle Edge Cases**: If k ≤ 2 or if the constraint (n + n - 1) < k is violated, return the sum of all numbers 1 to n using the formula n*(n+1)/2
2. **First Part Selection**: Select all numbers from 1 to k/2, calculating their sum using the arithmetic series formula
3. **Second Part Selection**: Select numbers starting from k up to k + (n - k/2 - 1), ensuring we select exactly n - k/2 numbers
4. **Second Part Sum**: Calculate the sum of the arithmetic sequence from k to the last selected number
5. **Return Total**: Add the first and second part sums to get the minimum possible sum

---

## Alternate Approaches / Methods
- **Brute Force**: Try all possible selections of n elements and check if any pair sums to k or more. Choose the selection with minimum sum (Exponential time complexity)
- **Dynamic Programming**: Use DP to build up valid selections, tracking the last selected element to ensure constraint compliance (O(n²) time complexity)
- **Mathematical Formula**: Directly compute the answer using closed-form formulas without iteration (O(1) time - optimal approach)

---

## Complexity
- Time: O(1) - All calculations use mathematical formulas; only basic arithmetic operations performed
- Space: O(1) - Uses only a fixed number of variables regardless of input size

---

## Code
```cpp
#include <iostream>
using namespace std;

class Solution {
public:
    int minimumSum(int n, int k) {
        // Edge case: if k is too small or constraint is violated
        if (k == 1 || k == 2 || (n + n - 1) < k) {
            return (n * (n + 1)) / 2;  // Sum of 1 to n using arithmetic series
        }
        
        // First part: select numbers from 1 to k/2 (lower half)
        int firstPartLastNumber = (int) k / 2;
        // Calculate sum using arithmetic series formula: n*(n+1)/2
        int firstPartSum = (firstPartLastNumber * (firstPartLastNumber + 1)) / 2;
        
        // Second part: select numbers from k onwards (upper half, skipping k/2 to k-1)
        int secondPartFirstNumber = k;
        // Last number of second part: k + (remaining numbers to select)
        int secondPartLastNumber = k + (n - firstPartLastNumber - 1);
        
        // Calculate sum of arithmetic sequence from k to secondPartLastNumber
        // Formula: (first + last) * count / 2
        int secondPartSum = ((secondPartFirstNumber + secondPartLastNumber) * 
                            (secondPartLastNumber - secondPartFirstNumber + 1)) / 2;
        
        return firstPartSum + secondPartSum;
    }
};

int main() {
    Solution sol;
    int n = 5;  // Select 5 elements
    int k = 4;  // Avoid pairs summing to 4 or more
    int result = sol.minimumSum(n, k);
    std::cout << "Minimum sum: " << result << std::endl;
    return 0;
}
```