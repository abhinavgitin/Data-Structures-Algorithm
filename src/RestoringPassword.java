import java.util.*;
public class RestoringPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next(); // the encoded noo will not have the spaces in them
        String[] bString = new String[10];
        for ( int i = 0 ; i < 10 ; i++ ) {
            bString[i] = sc.next();
        }
        // now we check and make the password
        StringBuilder password = new StringBuilder();
        for ( int i = 0 ; i < 8 ; i++ ) {
            String chunk = str.substring(i*10,i*10+10); // that i * 10 is the one which skips the 10 digits part by part!
            for ( int j = 0 ; j < 10 ; j++ ) {
                if (chunk.equals(bString[j])) {
                    password.append(j);
                    break;
                }
            }
        }
        System.out.println(password);
        sc.close();
    }
}