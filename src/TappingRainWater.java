public class TappingRainWater {
    public static void main(String[] args) {
       TappingRainWater obj = new TappingRainWater();
       System.out.println(obj.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1})); 
    }
    public int trap(int[] arr) {
        // we set the left ad the right max for each of the ith index
        int length = arr.length;
        int[] leftMax = new int[length];
        int[] rightMax = new int[length];
        leftMax[0] = arr[0];
        for ( int i = 1 ; i < length ; i++ ) {
            leftMax[i] = Math.max(leftMax[i-1], arr[i]);
        }
        rightMax[length-1] = arr[length-1]; // the last is already the highest for that ith index
        for ( int i = length-2 ; i >= 0 ; i-- ) {
            rightMax[i] = Math.max(rightMax[i+1], arr[i]); // is my last index greater or the second last from the arr!?
        }
        int trappedWater = 0; 
        for ( int i = 0 ; i < length ; i++ ) {
            trappedWater += Math.min(leftMax[i],rightMax[i]) - arr[i];
        }
        return trappedWater;
    }
}