import java.io.*;
public class DubStep {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        str = str.replaceAll("WUB", " ");
        str = str.trim();
        System.out.println(str);
    }
}