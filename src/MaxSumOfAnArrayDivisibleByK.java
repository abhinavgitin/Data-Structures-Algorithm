class MaxSumOfAnArrayDivisibleByK {
    public static void main(String[] args) {
        MaxSumOfAnArrayDivisibleByK obj = new MaxSumOfAnArrayDivisibleByK();
        int[] nums = {3,9,7};
        int k = 5;
        int result = obj.minOperations(nums, k);
        System.out.println("Minimum operations to make sum divisible by " + k + " is: " + result);
    }
    public int minOperations(int[] nums, int k) {
        // we find out the original sum first 
        //and then we keep on subtracting the sum by -1 and 
        //similtaneously check did it divide the wil the k properly
        int sum = 0;
        int operations = 0;
        for ( int i : nums ){
            sum += i;
        }
        while (sum % k != 0 ){
            sum--;
            operations++;
        }
        return operations;
    }
}