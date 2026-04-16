public class FindFirstPalindromiicStringInTheArray {

    public static void main(String[] args) {
        FindFirstPalindromiicStringInTheArray obj = new FindFirstPalindromiicStringInTheArray();
        String[] words = { "racecar", "car", "ada", "racecar", "cool" };
        System.out.println(obj.firstPalindrome(words));
    }

    public String firstPalindrome(String[] words) {
        for (String str : words) {
            if (str.equals(new StringBuilder(str).reverse().toString())) {
                return str;
            }
        }
        
        return "";
    }
    public boolean isPalinSent(String s) {
        // code here
        int length = s.length();
        StringBuilder str = new StringBuilder();
        for ( int i = 0 ; i < length ; i++ ) {
            if ( Character.isAlphabetic(s.charAt(i)) ) str.append(s);
        }
        if ( str.toString().equals(str.reverse().toString()) ) return true;
        return false;
    }
}