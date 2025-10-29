public class PerfectArrayFinalApproach {
    public static void main(String[] args) {
        PerfectArrayFinalApproach obj = new PerfectArrayFinalApproach();
        int[] arr = {1,2,3,3,2,1};
        System.out.println(obj.isPerfect(arr));
    }
    public boolean isPerfect(int[] arr) {
        int n = arr.length;
        if (n == 0 || n == 1) return false;
        int i = 1;
        while (i < n && arr[i] > arr[i - 1]) i++;

        while (i < n && arr[i] == arr[i - 1]) i++;

        while (i < n && arr[i] < arr[i - 1]) i++;

        return i == n;
    }
}
