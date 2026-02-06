import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        String players = sc.nextLine();
        Football ft = new Football();
        if ( ft.positionSituation(players) ) {
            System.out.println("YES"); // the players are in a dangerous Situation
        } else {
            System.out.println("NO"); // the players position are safe
        }
        sc.close();
    }

    boolean positionSituation( String players ) {
        int count = 0; // safe at first and the count the current situation
        char previousPosition = players.charAt(0);
        for ( char ch : players.toCharArray() ) {
            char currentPosition = ch;
            if ( currentPosition == previousPosition ) {
                count++;
                previousPosition = currentPosition;
                if ( count >= 7 ) return true;
            } else {
                previousPosition = currentPosition;
                count = 1;
            }
        }
        return false;
    }
}