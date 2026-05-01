public class KadanesAlgorithm {
    public static void main(String[] args) {
        KadanesAlgorithm sol = new KadanesAlgorithm();

        int[] test1 = {2, 3, -8, 7, -1, 2, 3};
        int[] test2 = {-2, -4};
        int[] test3 = {5, 4, 1, 7, 8};

        System.out.println(sol.maxSubarraySum(test1)); // 11
        System.out.println(sol.maxSubarraySum(test2)); // -2
        System.out.print(sol.maxSubarraySum(test3)); // 25
    }
    int maxSubarraySum(int[] arr) {
        int sum = arr[0];
        int maxSum = arr[0];
        for ( int end = 1 ; end < arr.length ; end++ ) {
            sum = Math.max(sum+arr[end], arr[end]);
            // we simply do that does the last sum were greater than the current index itsel?
            // if yes then the prest sum will be fresh from the arr[i]th index
            // else we keep the previous sum
            maxSum = Math.max(maxSum,sum);
        }
        return maxSum;
    }
}