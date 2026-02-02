import java.util.Scanner;

public class BitIncremet {
    public static void main(String[] args) {
        // we take the no of inputs form the user and see each string that 
        // waht should be done with the x increent or decrement
        Scanner sc = new Scanner( System.in );
        int x = 0;
        int n = sc.nextInt();
        while ( n > 0 ) {
            String str = sc.next();
            // new string object is created evertime the loop run but the last string which was make that looses then connection in the
            // memory and thus the java garbage collection handels it for no memory loss and too much accumalation of the same varable again and again
            // why is this neccessary is because the nextLine creates a buffer and then one count of the loop  decrements thus
            // for 2 no of the loop run we get to see that the input takes is only one time
            // Using next() instead of nextLine() to avoid issues with leftover newline after nextInt()
            if ( str.contains("++") ) {
                x++;
            } else {
                x--;
            }
            n--;
        }
        System.out.println(x);
        sc.close();
    }
}