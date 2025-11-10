public class monotonicArray {
    public static void main(String[] args) {
        monotonicArray obj = new monotonicArray();
        int[] nums = {1,2,2,3};
        boolean result = obj.isMonotonic(nums);
        System.out.println(result); // Output: true
    }
    public boolean isMonotonic(int[] nums) {
        boolean decreasing = false;
        boolean increasing = false;

        for (int i = 0; i + 1 < nums.length; i++) {
            if (nums[i] < nums[i+1]) {
                increasing = true;
            }
            if (nums[i] > nums[i+1]) {
                decreasing = true;
            }
        }

        if (increasing && decreasing) return false;
        return true;
    }
}