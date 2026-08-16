class MinimumSizeSubArraySum {

    static void main() {
        int target = 15;
        int[] arr = {1,7,1,1,1,7,1};
        System.out.println(minSubArrayLen(target, arr));
    }
    public static int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int minLength = Integer.MAX_VALUE;
        // int minPreLength = minLength;
        int length = nums.length;
        int start = 0;
        int len = 0;
        for (int end = 0; end < length; end++) {
            if (nums[end] >= target) return 1;
            sum += nums[end];
            while ( sum > target ) {
                len = (end-start) + 1;

                if ( len < minLength ) {
                    minLength = len;
                }
                sum -= nums[start];
                start++;
            }
        }
        if (minLength == Integer.MAX_VALUE)
            return 0;
        return minLength;
    }
}