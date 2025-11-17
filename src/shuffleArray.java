public class shuffleArray {
    public static void main(String[] args) {
        // Example usage
        shuffleArray obj = new shuffleArray();
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        int[] result = obj.shuffle(nums, n);
        for (int num : result) {
            System.out.print(num + " "); // Output: 2 3 5 4 1 7
        }
    }
    public int[] shuffle(int[] nums, int n) {
        // so i need to shuffle and make it like x1 y1 x2 y2 
        int[] arr = new int[nums.length];
        int left = 0;
        int right = n;
        for ( int i = 0 ; i+1 < nums.length ; i+=2 ) {
            arr[i] = nums[left];
            arr[i+1] = nums[right];
            left++;
            right++;
        }
        return arr;
    }
}


