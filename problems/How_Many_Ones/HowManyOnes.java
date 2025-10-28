public class HowManyOnes {
    public static void main(String[] args) {
        HowManyOnes obj = new HowManyOnes();
        int n = 1768;
        int result = obj.countDigitOne(n);
        System.out.println("Number of ones from 1 to " + n + " : " + result);
    }
    // public int countDigitOne(int n) {
    //     int count = 0;
    //     for (int i = 1; i <= n; i++) {
    //         int specificNumber = i;
    //         while (specificNumber > 0) {
    //             int digit = specificNumber % 10;
    //             if (digit == 1) {
    //                 count++;
    //             }
    //             specificNumber = specificNumber / 10;
    //         }
    //     }
    //     return count;
    // }

    public int countDigitOne(int n) {
        if (n <= 0)
            return 0;

        int count = 0;
        long place = 1; 

        while (place <= n) {
            long current = (n / place) % 10;
            long higher = n / (place * 10);
            long lower = n % place;

            if (current == 0)
                count += higher * place;
            else if (current == 1)
                count += higher * place + (lower + 1);
            else
                count += (higher + 1) * place;

            place *= 10;
        }

        return count;
    }
}