class Power_Of_Two {
    public static void main(String[] args) {
        Power_Of_Two sol = new Power_Of_Two();
        System.out.println(sol.isPowerOfTwo(1));
        System.out.println(sol.isPowerOfTwo(16));
        System.out.println(sol.isPowerOfTwo(3)); 
    }
    public boolean isPowerOfTwo(int n) {
        return n > 0 && ( n & ( n -1 ) ) == 0;
    }
}