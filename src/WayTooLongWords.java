import java.util.*;

public class WayTooLongWords {
    public static void main(String[] args) {
        // if the length of the srring is more then 10 letters then we short it by writing the 
        // first and the last letter and then putting the remaning number of letters into the middle of the first and the last letter
        Scanner sc = new Scanner( System.in );
        int n = sc.nextInt();
        for ( int i = 1 ; i <= n ; i++ ){
            // now i read each string and the give the output one by one for them
            String str = sc.next();
            if ( str.length() > 10 ) {
                // we make the abbrivation
                System.out.println(str.charAt(0)+""+(str.length()-2)+""+str.charAt(str.length()-1));
            } else {
                System.out.println(str);
            }
        }
        sc.close();
    }
}