class DivisibleAndNonDivisibleSumDifference {
    public static void main(String[] args) {
        DivisibleAndNonDivisibleSumDifference obj = new DivisibleAndNonDivisibleSumDifference();
        System.out.println(obj.differenceOfSums(10, 3));
    }

    public int differenceOfSums(int n, int m) {
        // Alternative solution (commented out):
        // int num1 = 0, num2 = 0;
        // for (int i = 1; i <= n; i++) {
        //     if (i % m == 0) {
        //         num2 += i;
        //         continue;
        //     }
        //     num1 += i;
        // }
        // return num1 - num2;

        // Optimized solution using formula
        int num1 = (n * (n + 1)) / 2;
        int num2 = 0;
        for (int i = 0; i <= n; i += m) {
            num2 += i;
        }
        return (num1 - 2 * num2);
    }
}