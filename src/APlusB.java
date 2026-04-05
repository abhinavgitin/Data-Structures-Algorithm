import java.io.*;

public class APlusB {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in)); 
        int t = Integer.parseInt(br.readLine());
        while ( t-- > 0 ) {
            String str = br.readLine();
            int a = str.charAt(0) - '0';
            int b = str.charAt(2) - '0';
            System.out.println(a+b);
        }
    }
}