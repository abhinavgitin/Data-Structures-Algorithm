public class Shuffle_String {
    public static void main(String[] args) {
        Shuffle_String sol = new Shuffle_String();
        String s = "tiger is king jungle of the the the"; // the tiger is the king of the jungle
        int[] indices = {20, 21, 22, 23, 24, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19}; 
         // indices to shuffle the string to "the tiger is the king of the jungle"
        String result = sol.restoreString(s, indices);
        System.out.println(result);  // Output: "the tiger is the king of the jungle"
    }
    public String restoreString(String s, int[] indices) {
        char[] arr = new char[indices.length];
        int j = 0;
        for ( int i : indices ){
            arr[i] = s.charAt(j);
            j++;
        }
        return new String(arr);
    }
}