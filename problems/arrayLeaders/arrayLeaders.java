import java.util.ArrayList;
import java.util.Collections;

public class arrayLeaders {
    public static void main(String[] args) {
        arrayLeaders obj = new arrayLeaders();
        int[] arr = {16,17,4,3,5,2};
        ArrayList<Integer> result = obj.leaders(arr);
        System.out.println(result); // Output: [17, 5, 2]
    }
    ArrayList<Integer> leaders(int arr[]) {
        // code here
        // boolean isGreater = false;
        ArrayList<Integer> list = new ArrayList <>();
        // for ( int i = 0 ; i < arr.length ; i++ ){
        //     for ( int j = i+1 ; j < arr.length ; j++ ){
        //         if ( arr[i] >= arr[j] ){
        //             isGreater = true;
        //         } else {
        //             isGreater = false;
        //             j = arr.length;
        //         }
        //     }
        //     if ( isGreater ) list.add(arr[i]);
        // }
        // return list;
        
        
        // --- 
        int max = arr[arr.length-1];
        for ( int i = arr.length-1 ; i >= 0 ; i-- ){
            if ( arr[i] >= max ){
                max = arr[i];
                list.add(max);
            }
        }
        Collections.reverse(list);
        return list;
    }
}