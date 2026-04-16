import java.util.*;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        sc.close();
        if (password.length() >= 5) {

            for (int i = 0; i < password.length(); i++) {
                if (Character.isUpperCase(password.charAt(i))) {
                    hasUpper = true;
                    continue;
                }
                if (Character.isLowerCase(password.charAt(i))) {
                    hasLower = true;
                    continue;
                }
                if (Character.isDigit(password.charAt(i))) {
                    hasDigit = true;
                    continue;
                }
                if (hasDigit && hasLower && hasUpper)
                    break;
            }
            if (hasDigit && hasLower && hasUpper) {
                System.out.println("Correct");
            } else {
                System.out.println("Too weak");
            }

        } else {
            System.out.println("Too weak");
        }
    }
}