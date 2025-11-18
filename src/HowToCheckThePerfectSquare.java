import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class HowToCheckThePerfectSquare {
    public static void main(String[] args) throws IOException {
        HowToCheckThePerfectSquare obj = new HowToCheckThePerfectSquare();
        //taking number as input from the user using BufferedReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        boolean result = obj.isPerfectSquare(number);
        System.out.println(result); // Output: true
    }
    public boolean isPerfectSquare(int num) {
        return (long) Math.sqrt(num) * (long) Math.sqrt(num) == num;
    }
}