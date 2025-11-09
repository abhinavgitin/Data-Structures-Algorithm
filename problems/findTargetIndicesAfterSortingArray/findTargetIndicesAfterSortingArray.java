import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findTargetIndicesAfterSortingArray {
    public static void main(String[] args) {
        findTargetIndicesAfterSortingArray obj = new findTargetIndicesAfterSortingArray();
        int[] nums = {1,2,5,2,3};
        int target = 2;
        List<Integer> result = obj.targetIndices(nums, target);
        System.out.println(result); // Output: [1, 2]
    }
    public List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        for ( int i = 0 ; i < nums.length ; i++ ){
            if ( nums[i] == target ){
                list.add(i);
            }
        }
        return list;
    }
}