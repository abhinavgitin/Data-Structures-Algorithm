import java.util.*;

public class YourName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while ( t-- > 0 ) {
            int[] freq = new int[26]; // cause there are 26 letters
            int n = sc.nextInt();
            String str1 = sc.next();
            String str2 = sc.next();
            if ( str1.length() != str2.length() ) {
                System.out.println("NO");
                continue;
            }
            for ( int i = 0 ; i < n ; i++ ) {
                freq[str1.charAt(i) - 'a']++;
                freq[str2.charAt(i) - 'a']--;
            }
            boolean printedFalse = false;
            for ( int i : freq ) {
                if ( i != 0 ) {
                    System.out.println("NO");
                    printedFalse = true;
                    break;
                }
            }
            if ( !printedFalse ) System.out.println("Yes");
        }
        sc.close();
    }
}