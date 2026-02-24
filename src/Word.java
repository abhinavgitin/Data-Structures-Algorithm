import java.util.*;

public class Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // we need the loop to get the upper case and lowercase count =( sorry Time complexity the optiomal solution will be O(n) only
        int lowerCharCount = 0;
        int UpperCharCount = 0;
        for ( int i = 0 ; i < str.length() ; i++ ) {
            if ( str.charAt(i) >= 97 ) lowerCharCount++; // or use this Character.isLowerCase(str.charAt(i))
            else UpperCharCount++; 
        }
        if ( lowerCharCount > UpperCharCount ) {
            System.out.println(str.toLowerCase());
        } else if ( lowerCharCount < UpperCharCount ) {
            System.out.println(str.toUpperCase());
        } else {
            System.out.println(str.toLowerCase());
        }
        sc.close();
    }
}