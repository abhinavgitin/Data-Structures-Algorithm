import java.util.ArrayList;
class IndexesOfSubArraySumIMP {
    public static void main(String[] args) {
        int[] arr = {1,2,3,7,5};
        int target = 12;
        ArrayList<Integer> result = subarraySum(arr, target);
        System.out.println(result);
    }
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // // code here
        // ArrayList<Integer> list = new ArrayList<>();
        // int sum = 0;
        // int start = -1;
        // int end = -1;
        // for ( int i = 1 ; i <= arr.length ; i++ ) {
        //     if ( sum == target ) break;
        //     sum = 0;
        //     for ( int j = i ; j <= arr.length ; j++ ){
        //         sum += arr[j-1];
        //     if ( sum == target ) {
        //         start = i;
        //         end = j;
        //         break;
        //     }
        //     }
        // }
        // list.add(start);
        // if ( list.get(0) != -1 ) {
        //     list.add(end);
        //     return list;
        // }
        // return list;
        // // not an optimal solution cause the Time Complexity is O(n^2)
        
        ArrayList<Integer> list = new ArrayList<>();
        int start = 0;
        int sum = 0;
        for ( int end = 0 ; end < arr.length ; end++ ) {
            sum += arr[end];
            while( sum > target && start <= end ){
                sum -= arr[start];
                start++;
            }
            if ( sum == target ){
                list.add(start+1);
                list.add(end+1);
                return list;
            }
        }
        list.add(-1);
        return list;
        /* so what we do here is we use te sliding window technique 
        first we start adding the digits from the start 
        the we check that if the added sum till the digit is more then the target we reduce the sum by the first digit
        that was added previously we add continiously and the if more than the target then we start removing from the back(start) 
        and thus we get the indexes of the start and the end */
    }
}
