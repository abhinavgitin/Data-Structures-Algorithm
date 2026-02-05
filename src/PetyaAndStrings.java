import java.util.*;

public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        PetyaAndStrings objcet = new PetyaAndStrings();
        System.out.println(objcet.checkStringForHer(str1, str2));
        sc.close();
    }
    int checkStringForHer( String str1, String str2 ) {
        StringBuilder sb1 = new StringBuilder(str1.toLowerCase());
        StringBuilder sb2 = new StringBuilder(str2.toLowerCase());
        int result = sb1.compareTo(sb2);
        if ( result > 0 ) return 1;
        else if ( result < 0 )return -1;
        return 0;
    }
}