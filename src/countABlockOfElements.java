import java.util.Arrays;

public class countABlockOfElements {
    public static void main(String[] args) {
        // Example usage
        countABlockOfElements obj = new countABlockOfElements();
        int[] arr1 = {4,5,8};
        int[] arr2 = {10,9,1,8};
        int d = 2;
        int result = obj.findTheDistanceValue(arr1, arr2, d);
        System.out.println(result); // Output: 2
    }
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int eval = 0;
        int count = 0;
        boolean isGreater = false;
        for ( int i : arr1 ){
            for ( int j : arr2 ){
                eval = Math.abs(i-j);
                if ( eval > d ){
                    isGreater = true;
                } else {
                    isGreater = false;
                    break;
                }
            }
            if ( isGreater ) count++;
            isGreater = false;
        }
        return count;
    }
}