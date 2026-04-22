public class AnagramPalirome {
    public static void main(String[] args) {
        AnagramPalirome anagramPalirome = new AnagramPalirome();
        String s = "aabbcc";
        System.out.println(anagramPalirome.canFormPalindrome(s));
    }
    boolean canFormPalindrome(String s) {
        // code here
        // int length = s.length();
        // int arr[] = new int[26];
        // for ( int i = 0 ; i < length ; i++ ) {
        //     arr[s.charAt(i)-'a']++;
        // }
        // int odd = 0;
        // for ( int i : arr ) {
        //     if ( (i & 1) == 1 ) { // the pair is odd
        //         odd++;
        //     }
        // }
        // return odd <= 1;
        
        int length = s.length();
        int mask = 0;
        for ( int i = 0 ; i < length ; i++ ) {
            mask ^= ( 1 << (s.charAt(i)-'a') );
        }
        return (mask & (mask-1)) == 0;
    }
}