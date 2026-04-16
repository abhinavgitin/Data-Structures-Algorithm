import java.util.Scanner;

public class Flag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        boolean isValid = true;
        char prevColor = ' ';

        for (int i = 0; i < n; i++) {
            String row = scanner.next();
            char color = row.charAt(0);
            for (int j = 1; j < m; j++) {
                if (row.charAt(j) != color) {
                    isValid = false;
                    break;
                }
            }
            if (!isValid)
                break;

            // Check adjacent rows differ
            if (color == prevColor) {
                isValid = false;
                break;
            }
            prevColor = color;
        }

        System.out.println(isValid ? "YES" : "NO");
        scanner.close();
    }
}