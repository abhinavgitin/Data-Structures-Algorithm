class BreakAPalindrome {
    public static void main(String[] args) {
        BreakAPalindrome breakAPalindrome = new BreakAPalindrome();
        String palindrome = "abccba";
        System.out.println(breakAPalindrome.breakPalindrome(palindrome));
    }
    public String breakPalindrome(String palindrome) {
        int length = palindrome.length();

        if ( length == 1 ) return "";
        StringBuilder str = new StringBuilder(palindrome);
        for ( int i = 0 ; i < length/2 ; i++ ) {
            if ( str.charAt(i) != 'a' ) {
                str.setCharAt(i,'a');
                return str.toString();
            } 
        }
        str.setCharAt(length-1,'b');
        return str.toString();
    }
}