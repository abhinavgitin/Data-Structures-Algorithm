public class FirstLetterOfAWord {
    public static void main(String[] args) {
        FirstLetterOfAWord obj = new FirstLetterOfAWord();
        String S = "  Hello   World  From  Java  ";
        System.out.println(obj.firstAlphabet(S));
    }
    String firstAlphabet(String S) {
        S = S.trim();  // must assign
        StringBuilder str = new StringBuilder();
        str.append(S.charAt(0));

        for (int i = 1; i < S.length() - 1; i++) {
            if (S.charAt(i) == ' ' && S.charAt(i + 1) != ' ') {
                str.append(S.charAt(i + 1));
            }
        }
        return str.toString();
    }
}