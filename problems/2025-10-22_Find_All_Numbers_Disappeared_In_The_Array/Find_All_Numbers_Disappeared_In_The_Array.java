import java.util.ArrayList;
import java.util.List;
class Find_All_Numbers_Disappeared_In_The_Array {
    public static void main(String[] args) {
        Find_All_Numbers_Disappeared_In_The_Array solution = new Find_All_Numbers_Disappeared_In_The_Array();
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> disappearedNumbers = solution.findDisappearedNumbers(nums);
        System.out.println(disappearedNumbers); // Output: [5, 6]
    }
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
}
