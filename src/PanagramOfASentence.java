public class PanagramOfASentence {

    // boolean checkPanagram( String str ) {
    //     StringBuilder sb = new StringBuilder(str.toLowerCase());
    //     for ( char ch = 'a'; ch <= 'z'; ch++ ) {
    //         if ( sb.indexOf(String.valueOf(ch)) == -1 ) return false;
    //     }
    //     return true;
    // } OR WE CAN DO IT THIS WAY 
    public static void main(String[] args) {
        PanagramOfASentence obj = new PanagramOfASentence();
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(obj.checkIfPangram(sentence));
    }
    public boolean checkIfPangram(String sentence) {
        int[] alphabets = new int[26];
        for ( char c : sentence.toCharArray() ) {
            if ( (int)c >= 97 || (int)c <= 122 ) {
                alphabets[(int)c - (int)'a'] = 1;
            } else {
                return false;
            }
        }
        for ( int i : alphabets ) {
            if ( i != 1 ) return false;
        }
        return true;
    }
}