# Problem: Find all the numbers that are dissapered in the array
**Platform:** LeetCode  
**Problem link:** [Leetcode448](https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/)
**Date solved:** <2025-10-22>  

---
## What this shows and what this can be used for!
- how to handel the dublicate in the array
- this shows how to handle the duplicate in the array data
- By using the array’s indices themselves to record whether we’ve seen a number.
- So what we need is a way to mark which numbers we’ve already seen 
---
## Intuition
- ### we make the numbers negative and leave the once that is not counted 
- here we have an array and we have to return the list of the numbers we dont have the same in the array 
- so what we do is we know -> that the number is the index of itself like for number 5 its index for the array data will be at index 5 ( say 4 cause of 0 bases indexing )
- thus what we do then is we check that if in the same index the element is greater then zero then its the first time we are seeing it so we make it to the negative of the same data
- we have 5 and it is true that its true position will be at 4 which is 5-1 
- so we see that if on index 5-1 the 5 is there and it is > 0 so we make it as -5 this will help us know that we have tracked 5
- at last if we have not tarced  any number then it should be more than 0 so that is the number that is missing 
---

## Approach (step-by-step)s
1. we make a loop and then we ilitrate throgh the nums[index] where the index is the actual number itself just - 1 cause 5 will be at 5 - 1 = 4 
2. then we convert the 5 to -5 tracked
3. at last we check if the number is more then 0 that means we have not tracked that number so we add that to the result.add(i+1) where i+1 is the number we want to return or is missing!
## refer this table :
| Step | Current num | Index to mark | Array after marking          |
| ---- | ----------- | ------------- | ---------------------------- |
| 1    | 4           | 3             | [4,3,2,-7,8,2,3,1]           |
| 2    | 3           | 2             | [4,3,-2,-7,8,2,3,1]          |
| 3    | 2           | 1             | [4,-3,-2,-7,8,2,3,1]         |
| 4    | 7           | 6             | [4,-3,-2,-7,8,2,-3,1]        |
| 5    | 8           | 7             | [4,-3,-2,-7,8,2,-3,-1]       |
| 6    | 2           | 1             | (index 1 already neg → skip) |
| 7    | 3           | 2             | (index 2 already neg → skip) |
| 8    | 1           | 0             | [-4,-3,-2,-7,8,2,-3,-1]      |

---

## Alternate Approaches / Methods
- if we didnt had the dublicates we could have used this method 
```[java]
Arrays.sort(nums); 
List<Integer> list = new ArrayList<>(); 
int n = nums.length;
int[] arr = new int[n]; 
for ( int i = 0 ; i < n ; i++ ){ 
    arr[i] = i+1;
} 
for ( int j = 0 ; j < n ; j++ ){ 
    if ( arr[j] != nums[j] ){
        list.add(arr[j]); 
    }
} 
 return list;
```

---

## Complexity
- Time: O(n)
- Space: O(1)

---

## Code
```[java]
public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();

        // Step 1: Mark the indices corresponding to each number
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }
        // Step 2: Collect the indices that are still positive
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }

        return result;
    }
```
