class DisariumNumber {

    public static boolean isDisarium(int n) {
        // code here
        int sum = 0;
        int temp = n;
        int count = getLengthFast(n);
        while (n > 0) {
            int digit = n % 10;
            sum = (int) ( sum + Math.pow(digit, count) );
            count--;
            n /= 10;
        }
        return sum == temp;
    }

    public static int getLengthFast(int number) {
        if ( number < 10 ) {
            return 1;
        } else if ( number < 100 ) {
            return 2;
        } else if (number < 1000) { // 100 to 999
            return 3;
        } else if (number < 10000) {
            return 4;
        } else if (number < 100000) {
            return 5;
        } else if (number < 1000000) {
            return 6;
        } else if (number < 10000000) {
            return 7;
        } else if (number < 100000000) {
            return 8;
        } else { // 100,000,000 to 999,999,999
            return 9;
        }
    }

    static void main() {
        System.out.println(isDisarium(89));
    }
}
