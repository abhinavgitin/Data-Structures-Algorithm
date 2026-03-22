class ArrangingCoins {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(5));
    }
    public static int arrangeCoins(int n) {
        int steps = 1;
        while ( n > 0 ) {
            n -= steps;
            if ( n <= steps ) return steps;
            steps++;
        }
        return -1;
    }
}