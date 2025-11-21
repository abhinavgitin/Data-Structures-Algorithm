class AlternatingWithArrays {
    public static void main(String[] args) {
        AlternatingWithArrays awa = new AlternatingWithArrays();
        int[] arr1 = {1,3,5,2,4};
        int[] arr2 = {2,1,3,4,5};
        System.out.println( awa.minTime(arr1, arr2) );
    }
    public int minTime(int[] arr1, int[] arr2) {
        // code here
        long startArr1 = 0; // start with arr1
        long startArr2 = 0; // start with arr2

        for (int i = 0; i < arr1.length; i++) {
            if (i % 2 == 0) {
                startArr1 += arr1[i];
                startArr2 += arr2[i];
            } else {
                startArr1 += arr2[i];
                startArr2 += arr1[i];
            }
        }
        // what we do is that we add both the scenarios
        // where we add starting with arr1 and starting with arr2
        // after that we do it like this
        // Imagine it like this. That. We have. To sum the indexex alternatively
        return (int)Math.min(startArr1, startArr2);
    }
}