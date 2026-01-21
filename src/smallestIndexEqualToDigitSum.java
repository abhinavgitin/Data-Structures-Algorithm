class smallestIndexEqualToDigitSum {
    public static void main(String[] args) {
        smallestIndexEqualToDigitSum sol = new smallestIndexEqualToDigitSum();
        int[] nums = {1,3,2};
        System.out.println(sol.smallestIndex(nums)); 
    }
    public int smallestIndex(int[] nums) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (i == digitSum(nums[i])) {
                if ( i < smallest ){
                    smallest = i;
                }
            }
        }
        if ( smallest == Integer.MAX_VALUE ) return -1;
        return smallest;
    }

    int digitSum(int num) {
        int sum = 0;
        while ( num > 0 ) {
            sum += num%10;
            num /= 10;
        }
        return sum;
    }
}