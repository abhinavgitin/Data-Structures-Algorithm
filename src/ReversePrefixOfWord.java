public class ReversePrefixOfWord {

    public String reversePrefix(String word, char ch) {
        if ( word.indexOf(ch) == -1 ) return word;
        String str = String.valueOf(new StringBuilder(word.substring(0,word.indexOf(ch))).reverse());
        StringBuilder newStr = new StringBuilder(word).replace(0,word.indexOf(ch),str);
        return newStr.toString();
    }

    static void main() {
        ReversePrefixOfWord obj = new ReversePrefixOfWord();

        System.out.println(obj.reversePrefix("abcdefd", 'd')); // dcbaefd
        System.out.println(obj.reversePrefix("xyxzxe", 'z'));  // zxyxxe
        System.out.println(obj.reversePrefix("abcd", 'z'));    // abcd
    }
}