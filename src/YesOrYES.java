import java.util.Scanner;

public class YesOrYES {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while (t-- > 0) {
			String str = sc.nextLine();
			str = str.toLowerCase();
			if (str.charAt(0) == 'y' && str.charAt(1) == 'e' && str.charAt(2) == 's') {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		sc.close();
	}
}