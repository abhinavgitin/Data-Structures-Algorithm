class MinimumOpearationsToReduceXto0 {
    public int minOperations(int[] nums, int x) {
        // i will use the sliding window technique
        // one condition ! to know that do we need to remove the whole element of the
        // arry such that it becomes equal to x ?
        int totalSum = 0;
        for (int num : nums)
            totalSum += num;
        if (totalSum - x == 0)
            return nums.length;
        int left = 0;
        int maxLen = -1;
        int sum = 0;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while (left <= right && sum > totalSum - x) {
                sum -= nums[left++];
            }
            if (sum == totalSum - x) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }
        return (maxLen == -1) ? -1 : nums.length - maxLen;
    }
}
