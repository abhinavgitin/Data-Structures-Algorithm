class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 5;
        int start = 0;
        int result = sol.xorOperation(n, start);
        System.out.println("The result is: " + result);
    }
    public int xorOperation(int n, int start) {
        int[] nums = new int[n];
        for ( int i = 0 ; i < n ; i++ ){
            nums[i] = start + 2 * i ;
        }
        int xor = 0;
        for ( int num : nums ) {
            xor ^= num;
        }
        return xor;
    }
}