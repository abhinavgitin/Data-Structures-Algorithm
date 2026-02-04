import java.util.*;

public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userNmae = sc.nextLine();
        BoyOrGirl object = new BoyOrGirl();;
        System.out.println(object.identify(userNmae));
        sc.close();
    }
    String identify( String str ) {
        // it is mentiond that the no of distinct characters in the username must be even for the girl to be real
        // distinct characters means that each characters should be unique even they appear more than 1 time
        // so if we take the distinct characters which is every unique characters with the help of set 
        // and the chrck that the no of the distinct characters are even then its a girl as other wise its a boy! 
        HashSet<Character> set = new HashSet<>();
        for ( char c : str.toCharArray() ) set.add(c);
        int distinctCharacters = set.size();
        if ( distinctCharacters % 2 == 0 ) {
            // its a girl;
            return "CHAT WITH HER!";
        }
        return "IGNORE HIM!"; // its then a Boy disguised
    }
}