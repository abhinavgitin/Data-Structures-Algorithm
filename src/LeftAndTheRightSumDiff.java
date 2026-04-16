public class LeftAndTheRightSumDiff {
    public static void main(String[] args) {
        LeftAndTheRightSumDiff solution = new LeftAndTheRightSumDiff();
        int[] nums = { 10, 4, 8, 3 };
        int[] result = solution.leftRightDifference(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public int[] leftRightDifference(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;
        int length = nums.length;
        int[] diff = new int[length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < i; j++) {
                leftSum += nums[j];
            }
            for (int j = i + 1; j < length; j++) {
                rightSum += nums[j];
            }
            int sum = rightSum - leftSum;
            diff[i] = (sum >= 0) ? sum : sum * -1;
            rightSum = 0;
            leftSum = 0;
        }
        return diff;
    }
}