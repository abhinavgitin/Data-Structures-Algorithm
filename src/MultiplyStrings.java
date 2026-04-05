
public class MultiplyStrings {
    public static void main(String[] args) {
        System.out.println(new MultiplyStrings().multiply("999999999999999999999999999999999999", "9"));
    }

    public String multiply(String num1, String num2) {
        // // we put that into a n1 and n2 int
        // long n1 = 0 , n2 = 0;
        // int num1Length = num1.length();
        // int num2Length = num2.length();
        // for ( int i = 0 ; i < num1Length ; i++ ) {
        // int digits = num1.charAt(i) - '0';
        // n1 = (n1*10)+digits;
        // }
        // for ( int i = 0 ; i < num2Length ; i++ ) {
        // int digits = num2.charAt(i) - '0';
        // n2 = (n2*10)+digits;
        // }
        // long ans = n1*n2;
        // return Long.toString(ans);
        // ---- one solution which you thought should be this---
        int num1Length = num1.length();
        int num2Length = num2.length();
        int[] ans = new int[num1Length + num2Length];
        for (int i = num1Length - 1; i >= 0; i--) {
            for (int j = num2Length - 1; j >= 0; j--) {
                int firstDigit = num1.charAt(i) - '0';
                int secondDigit = num2.charAt(j) - '0';

                int currentMultiplication = firstDigit * secondDigit;

                int currentValueIndex = i + j + 1;
                int carryIndex = i + j;

                int totalSumForThatIndex = currentMultiplication + ans[currentValueIndex];

                int totalSumLastDigit = totalSumForThatIndex % 10;
                int carry = totalSumForThatIndex / 10;

                ans[currentValueIndex] = totalSumLastDigit;
                ans[carryIndex] += carry;
                // this is to add all that drop down that we used to make in the manual hand
                // multiplication!
                // Important - we store the carry in front of the value and so when the i + j +
                // 1 decrease as j decreases
                // we add the carry the ans[currentValueIndex]; not the carryIndex = i+j;

            }
        }
        /*
         * 123
         * × 456
         * -------------
         * 738
         * 615-
         * 492-
         * -------------
         * 56088
         * As you can see that the numbers that are in the dropdown should be added
         * fine!
         * so when we iterate from j to 0 and the for one i being less and then again j
         * to 0 what we do is we add that each level of 3 1 9
         * and that is for once stored into the totalSumLastDigit for each iteration
         * so as the iteration goes we add that val for each of them!
         * thus we do the -> " total = multiplication + ans[currentValueIndex]; " for
         * each of them!
         * cause we need to add the currentValueIndex not the carry for the
         * currentIteration!
         */
        StringBuilder sb = new StringBuilder();
        for (int i : ans) {
            if (!(sb.length() == 0 && i == 0))
                sb.append(i);
        }
        return (sb.length() == 0) ? "0" : sb.toString();
    }
}