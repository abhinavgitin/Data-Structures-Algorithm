// import java.util.*;

// class Solution {
//     public static void main(String[] args) {
//         Solution sol = new Solution();
//         long[] arr = {5, 1, 3, 4, 2};
//         long[] result = sol.findElements(arr);
//         for (long num : result) {
//             System.out.print(num + " ");
//         }
//     }
//     public long[] findElements(long arr[]) {
//         // Your code goes here
//         Arrays.sort(arr);
//         int len = arr.length-2;
//         long[] nums = new long[len];
//         for ( int i = 0 ; i < len ; i++ ){
//             nums[i] = arr[i];
//         }
//         return nums;
//     }
// }
import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        long[] arr = {5, 1, 3, 4, 2, 8, 2, 9, 10, 11, 11, 15};
        long[] result = sol.findElements(arr);
        System.out.println(Arrays.toString(result)); // Output: [1, 2, 3]
    }

    public long[] findElements(long arr[]) {
        return Arrays.stream(arr)
                .sorted()
                .limit(arr.length - 2)
                .toArray();
    }
}