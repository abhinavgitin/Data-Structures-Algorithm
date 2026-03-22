import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeforcesChecking {
    public static void main(String[] args) throws IOException  {
        BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
        String str = "codeforces";
        int t = Integer.parseInt(inp.readLine());
        while ( t-- > 0 ) {
            String c = inp.readLine();
            if ( str.contains(c)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}