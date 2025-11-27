import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class FindMissingElements {
    public static void main(String[] args) {
        FindMissingElements finder = new FindMissingElements();
        int[] nums = {3, 7, 1, 2, 8, 4, 5 , 19};
        List<Integer> missingElements = finder.findMissingElements(nums);
        System.out.println(missingElements); // Output: [6]
    }
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> numbers = new HashSet<>();
        int smallest = nums[0];
        int largest = nums[0];
        for ( int i : nums ){
            numbers.add(i);
            if ( smallest > i ){
                smallest = i;
            }
            if ( largest < i ){
                largest = i;
            }
        }
        for ( int i = smallest ; i <= largest ; i++ ){
            if ( !numbers.contains(i) ) list.add(i);
        }
        return list;
    }
}