import java.util.ArrayList;

public class maxConsecutivesOnes {
    public static void main(String[] args) {
        maxConsecutivesOnes obj = new maxConsecutivesOnes();
        int[] nums = {1,1,0,1,1,1};
        System.out.println(obj.findMaxConsecutiveOnes(nums));
    }
    public int findMaxConsecutiveOnes(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int max = 0;
        for ( int i : nums ){
            if ( i == 1 ) {
                max++;
            } else {
                list.add(max);
                max = 0;
            } 
        }
        list.add(max);
        for ( int i : list ){
            if ( i > max ){
                max = i;
            }
        }
        /* or do this 
        int element = 0;
        int max = 0;

        for (int i : nums) {
            if (i == 1) {
                element++;
                max = Math.max(max, element);
            } else {
                element = 0;
            }
        }

        return max; */
        return max;
    }
}