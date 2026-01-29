import java.util.HashMap;

class Solution {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3, 5, 6, 1};
        System.out.println(firstRepeated(arr)); // Output: 3
    }
    public static int firstRepeated(int[] arr) {
        // code here
         HashMap<Integer,Integer> map = new HashMap<>();
        for ( int i : arr ){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for ( int i = 0 ; i < arr.length ; i++ ){
            if (map.get(arr[i]) > 1) {
            return i + 1; // 1-based index
            }
        }
        return -1;
    }
}
