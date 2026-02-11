public class CrazyString {
    public static void main(String[] args) {
        System.out.println(getCrazy("geeksforgeeks"));
    }

    static String getCrazy(String s) {
        // Your code here
        char firstCharacter = s.charAt(0);
        StringBuilder sb = new StringBuilder();
        if (firstCharacter <= 'z' && firstCharacter >= 'a') {
            sb.append(s.charAt(0));
            for (int i = 1; i < s.length(); i++) {
                if (i % 2 == 1) {
                    sb.append(Character.toUpperCase(s.charAt(i)));
                } else {
                    sb.append(Character.toLowerCase(s.charAt(i)));
                }
            }
        } else {
            sb.append(s.charAt(0));
            for (int i = 1; i < s.length(); i++) {
                if (i % 2 == 1) {
                    sb.append(Character.toLowerCase(s.charAt(i)));
                } else {
                    sb.append(Character.toUpperCase(s.charAt(i)));
                }
            }
        }
        return sb.toString();
    }
}