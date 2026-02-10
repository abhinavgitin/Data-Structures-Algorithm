import java.util.Scanner;

public class PrefixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfTestCases = sc.nextInt();
        // it is said that we need to calcculate the maximum sum of the array my taking the maximum value from the prefix sum that we have
        // also being said that we can do one swap that will increase the max sum of the array but it has to be just one swap
        while (noOfTestCases > 0) {
            // so we take the no of test cases
            int len = sc.nextInt();
            int[] arr = new int[len]; // store in array
            for (int in = 0; in < len; in++) {
                arr[in] = sc.nextInt(); // input all of them
            }
            int ans = calcMax(arr); // calculate the default max that can go
            for (int i = 0; i < len; i++) {
                for (int j = i + 1; j < len; j++) {
                    // now we swap exactly one time for each interval in the array to see that can the array with just one universal swap in it will give the more then the default max?
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    ans = Math.max(ans, calcMax(arr) ); // we pass the swaped array
                    // if it gave more then the previous max valure it will get stored and then will be ready to see that does there exist any value more then the current maximum value
                    // then we swap to the original formation
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(ans);
            noOfTestCases--;
        }
        sc.close();
    }

    static int calcMax(int[] arr) {
        int sum = 0;
        int max = 0;
        for (int i : arr) {
            max = Math.max(max, i);
            sum += max; // sum of the default max here for the first time called
        }
        return sum;
    }
}