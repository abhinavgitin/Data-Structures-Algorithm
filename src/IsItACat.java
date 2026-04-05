import java.util.Scanner;

public class IsItACat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            sc.nextInt();
            sc.nextLine();
            String str = sc.nextLine();

            str = str.toLowerCase(); // FIX 1

            char prev = ' '; // track previous valid char
            boolean valid = true;

            for (char c : str.toCharArray()) {

                // FIX 2: only allow m, e, o, w
                if (c != 'm' && c != 'e' && c != 'o' && c != 'w') {
                    valid = false;
                    break;
                }

                // FIX 3: enforce order
                if (prev == ' ' && c != 'm') {
                    valid = false;
                    break;
                }

                if (prev == 'm' && (c != 'm' && c != 'e')) {
                    valid = false;
                    break;
                }

                if (prev == 'e' && (c != 'e' && c != 'o')) {
                    valid = false;
                    break;
                }

                if (prev == 'o' && (c != 'o' && c != 'w')) {
                    valid = false;
                    break;
                }

                if (prev == 'w' && c != 'w') {
                    valid = false;
                    break;
                }

                prev = c;
            }

            // final check: must end at 'w'
            if (valid && prev == 'w') {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}