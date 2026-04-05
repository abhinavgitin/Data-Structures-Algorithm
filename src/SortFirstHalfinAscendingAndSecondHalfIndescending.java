// User function Template for Java
import java.util.*;
class SortFirstHalfinAscendingAndSecondHalfIndescending {
    public static void main(String[] args) {
        SortFirstHalfinAscendingAndSecondHalfIndescending obj = new SortFirstHalfinAscendingAndSecondHalfIndescending();
        int[] arr = {5, 4, 6, 2, 3, 8, 9, 7};
        System.out.println(obj.customSort(arr));
    }
    public ArrayList<Integer> customSort(int[] arr) {
        // your code
        ArrayList<Integer> list = new ArrayList<>();
        int mid = arr.length/2;
        int start = 0;
        int end = arr.length-1;
        Arrays.sort(arr, 0, mid);
        Arrays.sort(arr, mid, arr.length);
        while( start < mid ) list.add(arr[start++]);
        while ( end >= mid ) list.add(arr[end--]);
        return list;
    }
}