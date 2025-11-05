public class toLowerCase {
    public static void main(String[] args) {
        toLowerCase obj = new toLowerCase();
        String s = "Hello THIS IS ABHINAV";
        System.out.println(obj.toLowerCaseString(s));
    }
    public String toLowerCaseString(String s) {
        StringBuilder str = new StringBuilder();
        int num = 0;
        int digit = 0;
        for (int i = 0 ; i < s.length() ; i++ ){
            if ( (int)s.charAt(i) >= 65 && (int)s.charAt(i) <= 90 ){
            num = (int)s.charAt(i);
            digit = num + 32;
            str.append(String.valueOf((char)digit));
            } else {
                str.append(String.valueOf(s.charAt(i)));
            }
        }
        return str.toString();
    }
}