class AddStrings {
    public static void main(String[] args) {
        System.out.println( new AddStrings().addStrings("11", "123"));
    }
    public String addStrings(String num1, String num2) {
        int i = num1.length()-1;
        int j = num2.length()-1;
        // int max = ( i > j )? i : j;
        int[] arr = new int[i+j+2]; // just as we be safe
        int carry = 0;
        int idx = i+j+1;
        while ( i >= 0 || j >= 0 ) {
            int dig1 = ( i >= 0 )? num1.charAt(i) - '0' : 0;
            int dig2 = ( j >= 0 )? num2.charAt(j) - '0' : 0;

            int sum = dig1 + dig2 + carry;

            int toAdd = sum%10;
            carry = sum/10;
            arr[idx--] = toAdd;
            i--;
            j--;
        }
        if (carry > 0) arr[idx] = carry;
        StringBuilder sb = new StringBuilder();
        for ( int num : arr ) {
            if ( !(sb.length() == 0 && num == 0 ) ) sb.append(num);
        }
        return ( sb.length() == 0 )? "0" : sb.toString();
    }
}