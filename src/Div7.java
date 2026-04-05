import java.util.Scanner;

public class Div7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String n = sc.next();

            int num = Integer.parseInt(n);

            // Step 1: already divisible
            if (num % 7 == 0) {
                System.out.println(n);
                continue;
            }

            char[] arr = n.toCharArray();
            boolean found = false;
            // Step 2: try changing one digit
            for (int i = 0; i < arr.length; i++) {
                char original = arr[i];

                for (char d = '0'; d <= '9'; d++) {

                    // no leading zero
                    if (i == 0 && d == '0')
                        continue;

                    arr[i] = d;

                    int newNum = Integer.parseInt(new String(arr));

                    if (newNum % 7 == 0) {
                        System.out.println(newNum);
                        found = true;
                        break;
                    }
                }

                arr[i] = original;

                // break outer loop if found
                if (found)
                    break;
            }
        }
        sc.close();
    }
}