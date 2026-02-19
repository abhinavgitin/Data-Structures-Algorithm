public class FibonacciSeriesRec {
    public static void main(String[] args) {
        int a = 0 , b = 1 , c = 0;
        fibo(a,b,c);
    }
    static void fibo( int a, int b, int c){
        // i want the use of recursion to print the fibonacci series
        if ( c > 13 ) return;
        System.out.print(a+" ");
        c = a+b;
        fibo(b, c, c);
    }
}