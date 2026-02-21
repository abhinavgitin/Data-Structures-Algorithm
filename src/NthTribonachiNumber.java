public class NthTribonachiNumber {
    public static void main(String[] args) {
        NthTribonachiNumber nthTribonachiNumber = new NthTribonachiNumber();
        System.out.println(nthTribonachiNumber.tribonacci(4));
    }
    public int tribonacci(int n) {
        int[] triFibo = new int[38];
        triFibo[0] = 0;
        triFibo[1] = 1;
        triFibo[2] = 1;
        int prevToPrev = triFibo[0];
        int prev = triFibo[1];
        int curr = triFibo[2];
        int sum = 0;
        for ( int i = 3 ; i < n+1 ; i++ ) {
            sum += prevToPrev+prev+curr;
            triFibo[i] = sum;
            sum = 0;
            prevToPrev = prev;
            prev = curr;
            curr = triFibo[i];
        }
        return triFibo[n];
    }
}