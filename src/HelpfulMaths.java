import java.util.*;
public class HelpfulMaths {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();
        // sc.close();
        // int length = str.length();
        // ArrayList<Integer> list = new ArrayList<>();
        // for ( int i = 0 ; i < length ; i++ ) {
        //     char digit = str.charAt(i);
        //     if ( digit != '+' ) {
        //         list.add(digit - '0');
        //     }
        // }
        // Collections.sort(list);
        // StringBuilder sb = new StringBuilder();
        // for ( int i : list ) {
        //     sb.append(i);
        //     sb.append("+");
        // }
        // if ( sb.charAt(sb.length()-1) == '+' ) {
        //     sb.deleteCharAt(sb.length()-1);
        // }
        // System.out.println(sb);

        // ------- other way ------ 
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        int countOf1 = 0;
        int countOf2 = 0;
        int countOf3 = 0;     
        int length = str.length();   
        for ( int i = 0 ; i < length ; i++ ) {
            char digits = str.charAt(i);
            if ( digits != '+' ){
                if ( digits == '1' ) countOf1++;
                else if ( digits == '2' ) countOf2++;
                else countOf3++;
            }
        }
        StringBuilder sb = new StringBuilder();
        while ( countOf1-- > 0 ) sb.append("1+");
        while ( countOf2-- > 0 ) sb.append("2+");
        while ( countOf3-- > 0 ) sb.append("3+");
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb);
    }
}