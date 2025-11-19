class FindAllNumbersLessThatEachElement {
    public static void main(String[] args) {
        FindAllNumbersLessThatEachElement solution = new FindAllNumbersLessThatEachElement();
        int[] nums = {8,1,2,2,3};
        int[] result = solution.smallerNumbersThanCurrent(nums);
        // Print the result
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] smallerNums = new int[nums.length];
        int areSmaller = 0;
        for ( int i = 0 ; i < nums.length ; i++ ){
            for ( int j = 0 ; j < nums.length ; j++ ){
                if ( nums[i] > nums[j] ){
                    areSmaller++;
                }
            }
            smallerNums[i] = areSmaller;
            areSmaller = 0;
        }
        return smallerNums;
    }
}

