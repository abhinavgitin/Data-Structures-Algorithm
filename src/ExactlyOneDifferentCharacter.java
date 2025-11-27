class ExactlyOneDifferentCharacter {
    public static void main(String[] args) {
        String arr[] = {"code" , "coda", "cide", "cove"};
        String S = "coda";
        int N = arr.length;
        System.out.println(isStringExist(arr, N, S));
    }
    static String isStringExist(String arr[], int N, String S) {
        // code here
        for ( String i : arr ){
            int diff = 0;
            if ( i.length() == S.length() ){
                for ( int idx = 0 ; idx < S.length() ; idx++ ){
                    if ( i.charAt(idx) != S.charAt(idx) ){
                    diff++;
                    if ( diff > 1 ) {
                        break;
                    }
                    }
                }
            }
            if ( diff == 1 ) return "True";
        }
        return "False";
    }
}