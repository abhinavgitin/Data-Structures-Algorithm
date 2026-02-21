import java.util.*;

public class QueueattheSchool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfChildren = sc.nextInt();
        int time = sc.nextInt();
        String arrangement = sc.next();
        char[] posOfBAndG = arrangement.toCharArray();
        while (time-- > 0) {
            int i = 0;
            while ( i < noOfChildren ) {
                if ( i == noOfChildren-1 ) break;
                if (posOfBAndG[i] == 'B' && posOfBAndG[i + 1] == 'G') {
                    // we swap them
                    posOfBAndG[i + 1] = 'B';
                    posOfBAndG[i] = 'G';
                    i += 2;
                    continue;
                }
                i++;
            }
        }
        String newArr = new String(posOfBAndG);
        System.out.println(newArr);
        sc.close();
    }
}