package problems.arrayConcatination;
public class arrayConcatination {
    public static void main(String[] args) {
        arrayConcatination ac = new arrayConcatination();
        int[] nums = { 1, 2, 3 };
        int[] result = ac.getConcatenation(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] result = new int[2 * n];
        int i = 0;
        do {
            result[i] = nums[i];
            result[i + n] = nums[i];
            i++;
        } while (i < n);
        return result;
    }
}