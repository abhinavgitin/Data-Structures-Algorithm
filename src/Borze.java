import java.util.*;

public class Borze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder num = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            if (str.charAt(i) == '.') {
                num.append("0");
                i++;
            } else {
                if (str.charAt(i) == '-') {
                    // we check that is the nextchar a "." ?
                    if (str.charAt(i + 1) == '.') {
                        num.append("1");
                        i += 2;
                    } else {
                        if (str.charAt(i + 1) == '-') {
                            num.append("2");
                            i += 2;
                        }
                    }
                }
            }
        }
        System.out.println(num.toString());
        sc.close();
    }
}