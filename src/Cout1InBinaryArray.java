class Cout1InBinaryArray {
    public static void main(String[] args) {
        Cout1InBinaryArray obj = new Cout1InBinaryArray();
        System.out.println(obj.countOnes(new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1}));
    }
    public int countOnes(int[] arr) {
        // code here
        // what we do is we find the first 0 and then from that index we do
        // return that position of the 0 cause the 1 counts till there
        int start = 0;
        int end = arr.length-1;
        int mid = 0;
        int index = -1;
        while ( start <= end ) {
            mid = start + ( end - start ) / 2;
            if ( arr[mid] == 0 ) {
                index = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ( index >= 0 )? index : arr.length;
    }
}