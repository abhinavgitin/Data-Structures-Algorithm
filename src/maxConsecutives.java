import java.util.HashSet;

public class maxConsecutives {
    public static void main(String[] args) {
        maxConsecutives obj = new maxConsecutives();
        int[] arr = {100, 4, 200, 1, 3, 2};
        System.out.println(obj.longestConsecutive(arr));
    }
    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        for ( int i : arr ){
            set.add(i);
        }
        int maxCount = 0;
        for ( int i : set ){
            if (!set.contains(i-1)){
                // it says that i is the start 
                int count = 0;
                while ( set.contains(i+count) ){
                    count++;
                    // the count will increase by +1 and then the checks happens
                }
                maxCount = Math.max(maxCount,count);
            }
        }
        return maxCount;
    }
}