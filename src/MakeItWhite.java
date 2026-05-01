import java.util.Scanner;

public class MakeItWhite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while ( t-- > 0 ) {
            int length = sc.nextInt();
            sc.nextLine();
            String strip = sc.nextLine();
            // int start = 0;
            // int end = length-1;
            // int chStart = 0;
            // int chEnd = 0;
            // while ( start < end ) {
            //     if ( strip.charAt(start) == 'B' && chStart == 0 ) {
            //         chStart = start;
            //     }
            //     if ( strip.charAt(end) == 'B' && chEnd == 0 ) {
            //         chEnd = end;
            //         break;
            //     }
            //     start++;
            //     end--;
            // }
            int chStart = strip.indexOf("B");
            int chEnd = strip.lastIndexOf("B");
            System.out.println((chEnd-chStart)+1);
        }
        sc.close();
    }
}