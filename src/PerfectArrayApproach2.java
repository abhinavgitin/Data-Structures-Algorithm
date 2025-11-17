public class PerfectArrayApproach2 {
    public static void main(String[] args) {
        PerfectArrayApproach2 obj = new PerfectArrayApproach2();
        int[] arr = {1,2,3,3,2,1};
        System.out.println(obj.isPerfect(arr));
    }
    public boolean isPerfect(int[] arr) {
        int king = 0;
        int highest = -1;
        boolean same = false;
        int index2= -1;
        boolean strictlyDecreasing = false;
        boolean strictlyIncreasing = false;
        for ( int i = 1 ; i < arr.length-1 ; i++ ){
            if ( arr[i-1] == arr[i] && arr[i] > arr[i+1] ){  // fails here for this approach 
                king = arr[i];
            }
        }
        for ( int j = highest ; j > 0 ; j-- ){ // same condition
            if ( king == arr[j-1] ){
                same = true;
            } else {
                index2 = j;
                break;
            }
        }
        for ( int k = highest ; k < arr.length-1 ; k++ ){ //strictly decreasing
            if ( arr[k] > arr[k+1] ){
                strictlyDecreasing = true;
            } else if ( arr[k] < arr[k+1] ) {
                strictlyDecreasing = false;
                break;
            }
        }
        //i have to handle the last element here too
        for ( int l = index2 ; l > 1 ; l-- ){ //strictly increasing
            if ( arr[l] > arr[l-1] ){
                strictlyIncreasing = true;
            } else if ( arr[l] > arr[l-1] ) {
                strictlyIncreasing = false;
                break;
            }
        }
        if ( strictlyIncreasing && same && strictlyDecreasing ){
            return true;
        } else if ( strictlyIncreasing || same || strictlyDecreasing ){
            return true;
        }
        return false;
    }
}
