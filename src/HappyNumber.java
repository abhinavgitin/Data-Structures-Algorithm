class HappyNumber {
    public static void main(String[] args) {
        HappyNumber happyNumber = new HappyNumber();
        System.out.println(happyNumber.isHappy(1111111));
    }
    public boolean isHappy(int n) {
        int sum = 0;
        while (n > 0 && sum != 10) {
            int num = n;
            while ( num > 0 ) {
                int digits = num % 10;
                sum += digits*digits;
                num /= 10;
            }
            n = sum;
            if ( sum == 1 ) return true;
            else sum = 0;
        }
        return false;
    }
}