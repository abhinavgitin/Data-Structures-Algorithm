import java.util.HashMap;

public class NearestDuplicate {
    public static void main(String[] args) {
        NearestDuplicate nd = new NearestDuplicate();
        int[] nums = {1,2,3,1,2,3};
        int k = 2;
        System.out.println( nd.containsNearbyDuplicate(nums,k) );
    }
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // suing hashmap here 
        // so its like element and its index 
        int oldIndex = -1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for ( int i = 0 ; i < nums.length ; i++ ){
            if ( !(map.containsKey(nums[i])) ){
                map.put(nums[i],i);
            } else {
                oldIndex = map.get(nums[i]);
                if ( i - oldIndex <= k ) return true;
            }
            map.put(nums[i],i); // update the same elemnt with the latest index;
        }
        return false;
    }
}
