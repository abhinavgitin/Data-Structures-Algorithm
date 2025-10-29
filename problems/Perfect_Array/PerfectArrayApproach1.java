public class PerfectArrayApproach1 {
    public static void main(String[] args) {
        PerfectArrayApproach1 obj = new PerfectArrayApproach1();
        int[] arr = {1,2,3,3,2,1};
        System.out.println(obj.isPerfect(arr));
    }
    public boolean isPerfect(int[] arr) {
        boolean strictlyIncreasing = false;
        int index1 = -1;
        boolean same = false;
        int index2 = -1;
        boolean strictlyDecreasing = false;
        for ( int i = 1 ; i < arr.length ; i++ ){
            if ( arr[i-1] < arr[i] ){
                strictlyIncreasing = true;
            } else {
                index1 = i;
                break;
            }
        }
        //if ( strictlyIncreasing ){
        if ( index1 == -1 ) index1 = 0;
            for ( int j = index1 ; j < arr.length-1 ; j++ ){ 
                if ( arr[j] == arr[j+1] ){
                    same = true;
                } else {
                    index2 = j;
                    break;
                }
            }
        //}
        //if ( same ){
        if ( index2 == -1 ) index2 = 0;
            for ( int k = index2 ; k < arr.length-1 ; k++ ){
                if ( arr[k] > arr[k+1] ){
                    strictlyDecreasing = true;
                } else {
                    break;
                }
            }
        //}
        if ( strictlyIncreasing && same && strictlyDecreasing ){
            return true;
        } else if ( strictlyIncreasing || same || strictlyDecreasing ){
            return true;
        }
        return false;
    }
}
