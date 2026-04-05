class ThirdMaximumNumber {
    public static void main(String[] args) {
        
    }
    public int thirdMax(int[] arr) {
        long largest = Long.MIN_VALUE;
        long secondLargest = Long.MIN_VALUE;
        long thirdLargest = Long.MIN_VALUE;
        for (int i : arr) {
            if ( i == largest || i == secondLargest || i == thirdLargest ) continue; // for the duplicates
            if (largest < i) {
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = i;
            } else if ( secondLargest < i ) {
                thirdLargest = secondLargest;
                secondLargest = i;
            } else if ( thirdLargest < i ) {
                thirdLargest = i;
            }
        }
        return ( thirdLargest == Long.MIN_VALUE )? (int)largest : (int)thirdLargest;
    }
}