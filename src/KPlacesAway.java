public class KPlacesAway {
    public static void main(String[] args) {
        KPlacesAway kpa = new KPlacesAway();
        int[] nums = {1,0,0,1,0,1};
        int k = 2;
        boolean result = kpa.kLengthApart(nums, k);
        System.out.println(result);
    }
    public boolean kLengthApart(int[] nums, int k) {
        int previousIdx = -1;
        for ( int i = 0 ; i < nums.length ; i++ ){
            if (nums[i] == 1) {
                if (previousIdx != -1) {
                    if (i - previousIdx - 1 < k) return false;
                }
                previousIdx = i;
            }
        }
        return true;
    }
}