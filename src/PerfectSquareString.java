import java.util.*;

public class PerfectSquareString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isSquare(str));
        sc.close();
    }

    static int isSquare(String S)
    {
        char[] ch = S.toCharArray();
        long sum = 0;
        for ( int i = 0 ; i < ch.length ; i++ ) {
            sum += ch[i];
        }
        // System.out.println(sum);
        long root = (long)Math.sqrt(sum);
        if (  root*root == sum ) return 1;
        return 0;
    }
}