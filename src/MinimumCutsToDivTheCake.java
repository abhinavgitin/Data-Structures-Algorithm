public class MinimumCutsToDivTheCake {
    public static void main(String[] args) {
        MinimumCutsToDivTheCake obj = new MinimumCutsToDivTheCake();
        int n = 4; // Example input
        int result = obj.MinimumCuts(n);
        System.out.println("Minimum cuts needed to divide the cake into " + n + " pieces: " + result);
    }
    
    int MinimumCuts( int n ) {
        return ( n % 2 != 0 )? (( n > 1 )? n : 1 ) : n / 2;
    }
}