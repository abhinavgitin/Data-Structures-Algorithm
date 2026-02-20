
// User function Template for Java
import java.util.*;

class MissingKthElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(new MissingKthElement().KthMissingElement(arr, k));
        }
        sc.close();
    }

    int KthMissingElement(int arr[], int k) {
        // Complete the function
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1] + 1) {
                int noOfMissingGap = arr[i] - arr[i - 1] - 1;
                // this gives the gap difference between the two numbers!
                if (noOfMissingGap >= k) {
                    return arr[i - 1] + k;
                } else {
                    k -= noOfMissingGap;
                }
            }
        }
        return -1; // when we are outOfThBOunds
    }
}
