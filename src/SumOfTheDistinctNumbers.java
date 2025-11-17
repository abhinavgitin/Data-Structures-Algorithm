import java.util.HashSet;

public class SumOfTheDistinctNumbers {
    public static void main(String[] args) {
        SumOfTheDistinctNumbers obj = new SumOfTheDistinctNumbers();
        int arr[] = {1, 2, 2, 3, 4, 4, 5};
        int result = obj.findSum(arr);
        System.out.println("Sum of distinct numbers: " + result);
    }
    int findSum(int arr[]) {
        HashSet<Integer> s = new HashSet<>();
        for ( int i : arr ){
            s.add(i);
        }
        long sum = 0;
        for ( int j : s ){
            sum += j;
        }
        return (int)sum;
    }
}