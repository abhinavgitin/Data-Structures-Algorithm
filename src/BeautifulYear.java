import java.util.Scanner;

public class BeautifulYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        BeautifulYear object = new BeautifulYear();
        System.out.println(object.chcekBeautifulYear(year));
        sc.close();
    }
    int chcekBeautifulYear( int year ) {
        for ( int i = year+1 ; ; i++ ) {
            int thisYear = i;
            boolean[] seen = new boolean[10];
            while ( thisYear > 0 ) {
                int digits = thisYear%10;
                if ( seen[digits] ) {
                    break;
                } else {
                   seen[digits] = true;
                   thisYear /= 10; 
                }
                if ( thisYear == 0 ) return i;
            }
        }
    }
}