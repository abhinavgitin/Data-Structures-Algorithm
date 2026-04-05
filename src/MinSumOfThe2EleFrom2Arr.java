public class MinSumOfThe2EleFrom2Arr {
    public static void main(String[] args) {
        MinSumOfThe2EleFrom2Arr obj = new MinSumOfThe2EleFrom2Arr();
        int ans = obj.minSum(new int[]{5,4,13,1}, new int[]{3,2,6,1});
        System.out.println(ans);
    }
    public int minSum(int[] arr1, int[] arr2) {
        // code here
        int len1 = arr1.length;
        int len2 = arr2.length;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int i = 0;
        int j = len2-1;
        int idx1 = 0, idx2 = len2-1;
        while ( len1-- > 0 ) {
            if ( min1 > arr1[i] ) { // if we get the min
                idx1 = i; // we save ist position
                if ( idx1 != idx2 ) { // we check that is idx of min1 is not equal to idx of min2
                    min1 = arr1[i]; // if not then save the min1 of the arr1
                }
            }
            if ( min2 > arr2[j] ) {
                idx2 = j;
                if ( idx2 != idx1 ) {
                    min2 = arr2[j];
                }
            }
            i++;
            j--;
        }
        return min1+min2;
    }
}
