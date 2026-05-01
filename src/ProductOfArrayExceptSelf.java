public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        ProductOfArrayExceptSelf p = new ProductOfArrayExceptSelf();
        int[] nums = {-1,-1,1,-1,-1,1,-1,-1,1,1,-1,1,-1,1,1,1,-1,1,-1,-1,1,-1,1,-1,1,-1};
        int[] ans = p.productExceptSelf(nums);
        for ( int i : ans ) {
            System.out.print(i + " ");
        }
    }
    public int[] productExceptSelf(int[] nums) {
        // int product = 1;
        // int length = nums.length;
        // for ( int i = 0 ; i < length ; i++ ) {
        //     if ( nums[i] == 0 ) continue;
        //     product *= nums[i];
        // }
        // for ( int i = 0 ; i < length ; i++ ) {
        //     if ( nums[i] == 0 ) {
        //         nums[i] = 0;
        //         continue;
        //     }
        //     nums[i] = product/nums[i];
        // } Leetcode cannot digest this so we do :
        int length = nums.length;
        int ans[] = new int[length];
        ans[0] = 1;
        for ( int i = 1 ; i < length ; i++ ) {
            ans[i] = ans[i-1]*nums[i-1];
        }
        int suffix = 1;
        for ( int i = length - 1; i >= 0 ; i-- ) {
            ans[i] *= suffix;
            suffix *= nums[i];
        }
        return ans;
    }
}