import java.util.*;

public class YetAnotherTwoIntegersProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        int t = sc.nextInt();
        while ( t-- > 0 ) {
            int currNum = sc.nextInt();
            int finalNum = sc.nextInt();
            if ( currNum == finalNum ) {
                System.out.println(0);
                continue;
            }
            double diff = Math.abs(finalNum-currNum);
            double count = diff/10d;
            System.out.println((int)Math.ceil(count));
            // or more optimised :
            //System.out.println((int)(diff + 10 - 1 ) / 10);
        }
        sc.close();
    }
}