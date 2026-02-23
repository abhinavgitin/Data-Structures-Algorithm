import java.util.*;

public class NearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        String n = sc.nextLine();
        System.out.println(luckyNum(n));
        sc.close();
        
    }
    public static String luckyNum ( String str ) {
        int count = 0;
        char[] ch = str.toCharArray();
        for ( char c : ch ) {
            if ( c == '4' || c == '7' ) count++;
        }
        if ( count == 0 ) return "NO";
        while ( count > 0 ) {
            int digits = count % 10;
            if ( digits != 4 && digits != 7 ) {
                return "NO";
            }
            count /= 10;
        }
        return "YES";
    }
}