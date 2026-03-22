import java.util.*;
public class XAxis {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        int t = sc.nextInt();
        while ( t-- > 0 ) {
            int[] arr = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
            Arrays.sort(arr);
            int median = arr[1];
            int ans = Math.abs(arr[0]-median)+Math.abs(arr[1]-median)+Math.abs(arr[2]-median);  
            System.out.println(ans);
        }
        sc.close();
    }
}