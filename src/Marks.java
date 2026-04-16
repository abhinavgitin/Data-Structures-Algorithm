import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        sc.nextLine();
        int mat[][] = new int[row][col];
        for ( int i = 0 ; i < row ; i++ ) {
            String str = sc.nextLine();
            for ( int j = 0 ; j < col ; j++ ) {
                mat[i][j] = str.charAt(j)-'0'; // just keep in mind that we are storing the numbers not the integers so type cast that implicit
            }
        }
        sc.close();
        boolean eligibleStudents[] = new boolean[row];
        for ( int i = 0 ; i < col ; i++ ) {
            int max = 0 ;
            for ( int j = 0 ; j < row ; j++ ) {
                // now we see what is the max marks for the row students
                max = Math.max(max,mat[j][i]);
            }
            for ( int k = 0 ; k < row ; k++ ) {
                if ( max == mat[k][i] ) {
                    eligibleStudents[k] = true;
                }
            }
        }
        int noOfStudnets = 0;
        for ( boolean eligibility : eligibleStudents ) {
            if ( eligibility ) noOfStudnets++;
        }
        System.out.println(noOfStudnets);
    }
}