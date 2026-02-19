import java.util.*;

public class GameWithSticks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if ( Math.min(a, b) % 2 == 0 ) System.out.println("Malvika");
        else System.out.println("Akshat");
        sc.close();
    }
}