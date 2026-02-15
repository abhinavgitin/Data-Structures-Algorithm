import java.util.*;

public class SieveofErato67henes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while ( t-- > 0 ) {
            int l = sc.nextInt();
            int a[] = new int[l];
            boolean found = false;
            for ( int i = 0 ; i < l ; i++ ) {
                // what i have to do is that i have to find two numbers into the array that can product up to 67 
                // if  so then its sout YES and if not then NO
                a[i] = sc.nextInt();
                if ( a[i] == 67 ) found = true;
            }
            if ( found ) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            found = false;
        }
        sc.close();
    }
}