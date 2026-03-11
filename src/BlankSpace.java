import java.util.*;
// this is using normal convention and one flow!
public class BlankSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while ( t-- > 0 ) {

            int n = sc.nextInt();
            int[] arr = new int[n];
            int count = 0;
            int maxCount = 0;
            for ( int i = 0 ; i < n ; i++ ) {
                arr[i] = sc.nextInt();
                if ( arr[i] == 0 ) {
                    count++;
                    maxCount = Math.max(maxCount, count);
                } else {
                    count = 0;
                }
            }
            System.out.println(maxCount);
        }
        sc.close();
    }
}
