import java.util.*;
public class WordCapitalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(String.valueOf(str.charAt(0)).toUpperCase()+""+str.substring(1));
        sc.close();
    }
}