import java.util.*;

public class LawnMower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for ( int i = 0 ; i < n ; i++ ){
            long a = sc.nextLong(); // the number of the boards 
            long b = sc.nextLong(); // this is the width 
            // the values can be large so we take the input as large;
            long removed = a - ( a / b );
            System.out.println(removed);
        }
        sc.close();
    }
} 