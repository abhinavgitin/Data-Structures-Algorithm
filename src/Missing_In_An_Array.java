class Missing_In_An_Array {
    public static void main(String[] args) {
        Missing_In_An_Array sol = new Missing_In_An_Array();
        int[] arr = {1, 2, 4, 6, 3, 5, 7, 8, 9, 10};
        System.out.println(sol.missingNum(arr));
    }
    int missingNum(int arr[]) {
        // code here
        int xor = 0 ; 
        int n = arr.length+1;
        for ( int i = 1 ; i <= n ; i++ ){
            xor ^= i;
        }
        for ( int j : arr ){
            xor ^= j;
        }
        return xor;
    }
}