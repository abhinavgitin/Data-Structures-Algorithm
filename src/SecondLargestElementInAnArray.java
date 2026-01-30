class SecondLargestElementInAnArray {
    public static void main(String[] args) {
        int[] arr = {1, 100, 42, 4, 23};
        System.out.println(maxProduct(arr)); // Output: 20 (4*5)
    }
    public static int maxProduct(int[] arr) {
        // code here
        // first approach is to sort and then return the multiplication of the last two elements
        // Arrays.sort(arr);
        // return arr[arr.length-1]*arr[arr.length-2];
        
        // second approch
        // we need to find the largest and the second largets value
        int largest = -1;
        int secondLargest = -1;
        for ( int i : arr ){
            if ( largest < i ){
                secondLargest = largest; // we see that if the condition is true then there might be a number greater then the largest so we put that largest value into the second largest
                // and the the current number into the largest one
                largest = i; // then updated the largest with the i which is the first comparision done that was the current element larger then the largest
            } else if ( i > secondLargest ) { // here we search that does the current element is also greater then the second largest
                secondLargest = i; // if yes then update the value;
            }
        }
        return secondLargest*largest;
    }
}