class ShortestUnsortedSubarray {
    static void main() {
        int[] arr = {1,2,3,4,5,6,8,9,9,1,1,2,4,5,6,77,7,7,5,4,2,2,1,1,1};
        System.out.println(shortestUnorderedSubarray(arr));
    }
    public static int shortestUnorderedSubarray(int[] arr) {
        // Code Here
        int len = arr.length;
        
        // int left = -1;
        // for ( int i = 0; i < len-1 ; i++ ) {
        //     if ( arr[i] > arr[i+1] ) {
        //         left = i;
        //         break;
        //     }
        // }
        // // if there is no left the array is sorted
        // if ( left == -1 ) return 0;
        
        // int right = -1;
        // for ( int i = len-1 ; i > 0 ; i-- ) {
        //     if ( arr[i] < arr[i-1] ) {
        //         right = i;
        //         break;
        //     }
        // }
        
        // int min = Integer.MAX_VALUE;
        // int max = Integer.MIN_VALUE;
        // for ( int i = left ; i <= right ; i++ ) {
        //     min = Math.min(min,arr[i]);
        //     max = Math.max(max,arr[i]);
        // }
        
        // while ( left > 0 && arr[left-1] > min ) {
        //     // we go left;
        //     left--;
        // }
        // while ( right < len - 1 && arr[right+1] < max ) {
        //     // we go right
        //     right++;
        // }
        // return right - left + 1;
        
        if (len < 3 ) return 0;
        
        for ( int i = 1 ; i < len-1 ; i++ ) {
            if ( 
                (arr[i] > arr[i+1] && arr[i] > arr[i-1]) || 
                (arr[i] < arr[i+1] && arr[i] < arr[i-1])
            ) {
                return 3;
            }
        }
        return 0;
    }
}