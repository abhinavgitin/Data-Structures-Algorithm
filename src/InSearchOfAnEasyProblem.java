import java.util.Scanner;

public class InSearchOfAnEasyProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        int n = sc.nextInt();
        boolean itsHard = false;
        for ( int i = 0 ; i < n ; i++ ) {
            int x = sc.nextInt();
            if ( x == 1 ) {
                itsHard = true;
                break;
            }
        }
        if ( itsHard ) System.out.println("HARD");
        else System.out.println("EASY");
        sc.close();
    }
}