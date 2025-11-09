import java.util.HashSet;
public class firstLetterTwoAppearTwice {
    public static void main(String[] args) {
        firstLetterTwoAppearTwice obj = new firstLetterTwoAppearTwice();
        String s = "abccbaacz"; 
        char result = obj.repeatedCharacter(s);
        System.out.println(result); // Output: 'c'
    }
    public char repeatedCharacter(String s) {
        HashSet<Character> set = new HashSet<>();
        for ( int i = 0 ; i < s.length() ; i++ ){
            if ( set.contains(s.charAt(i)) ){
                return s.charAt(i);
            }
            set.add(s.charAt(i));
        }
        return '\0';
    }
}