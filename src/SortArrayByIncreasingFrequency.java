import java.util.*;

public class SortArrayByIncreasingFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length : ");
        int length = sc.nextInt();
        System.out.println("Enter the elements of the array : ");
        int[] arr = new int[length];
        for ( int i = 0 ; i < length ; i++ ) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString( new SortArrayByIncreasingFrequency().sortArrayByFreq(arr)) );
        sc.close();
    }
    public int[] sortArrayByFreq( int num[] ) {
        Integer[]  arr = new Integer[num.length];
        HashMap<Integer,Integer> map = new HashMap<>();
        for ( int idx = 0 ; idx < num.length ; idx++ ) {
            map.put(num[idx], map.getOrDefault(num[idx], 0)+1);
            arr[idx] = num[idx];
        }
        Arrays.sort( arr, (a,b) -> {
            int fa = map.get(a);
            int fb = map.get(b);

            if ( fa != fb ) return fa-fb;
            else return b-a;
        });
        for ( int i = 0 ; i < num.length ; i++ ) {
            num[i] = arr[i];
        }
        return num;
    }
}