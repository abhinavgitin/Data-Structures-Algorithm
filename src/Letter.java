import java.util.Scanner;

public class Letter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] arr = new char[n][m];
        for ( int i = 0 ; i < n ; i++ ) {
            String line = sc.next();
            for ( int j = 0 ; j < m ; j++ ) {
                arr[i][j] = line.charAt(j);
            }
        }
        sc.close();
        int minRow = Integer.MAX_VALUE;
        int maxRow = Integer.MIN_VALUE;
        int minCol = Integer.MAX_VALUE;
        int maxCol = Integer.MIN_VALUE;
        for ( int i = 0 ; i < n ; i++ ) {
            for ( int j = 0 ; j < m ; j++ ) {
                if ( arr[i][j] == '*' ) {
                    minRow = Math.min(minRow,i);
                    minCol = Math.min(minCol,j);
                    maxRow = Math.max(maxRow, i);
                    maxCol = Math.max(maxCol,j);

                }
            }
        }
        for ( int i = minRow ; i <= maxRow ; i++ ) {
            for ( int j = minCol ; j <= maxCol ; j++ ) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}