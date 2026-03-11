import java.util.*;
public class Streams {
    public static void main(String[] args) {
        int[] arr = {23,3,2,2,3,4,5,6,7,7,8,8,8,7,6,5,4,3,2,2,2,2,2};
        System.out.println(sumUsingStreams(arr));
    }
    public static int sumUsingStreams(int[] arr) {
        // code here
        return Arrays.stream(arr).sum();
    }
}
