class FinalValueAfterIncrementAndDecrementOperations {
    public static void main(String[] args) {
        FinalValueAfterIncrementAndDecrementOperations solution = new FinalValueAfterIncrementAndDecrementOperations();
        String[] operations = {"--X", "X++", "X++"};
        int result = solution.finalValueAfterOperations(operations);
        System.out.println(result);
    }
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        int n = operations.length;
        while ( n > 0 ) {
            if ( operations[ operations.length - n ].contains("++") ){
                x++;
            } else {
                x--;
            }
            n--;
        }
        return x;
    }
}