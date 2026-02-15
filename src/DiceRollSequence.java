import java.util.*;

public class DiceRollSequence {
    public static void main(String[] args) {
        // this solution is false and will not work for some cases!
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int count = 0;
            int len = sc.nextInt();
            int arr[] = new int[len];
            for (int i = 0; i < len; i++) {
                arr[i] = sc.nextInt();
            }
            for (int j = 0 ; j < len-1 ; j++) {
                if ( arr[j+1] == arr[j] || 7 - arr[j] == arr[j+1] ){
                    count++;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}