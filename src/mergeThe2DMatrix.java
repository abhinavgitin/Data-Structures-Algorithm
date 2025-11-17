import java.util.ArrayList;
import java.util.Collections;

public class mergeThe2DMatrix {
    public static void main(String[] args) {
        // Example usage
        mergeThe2DMatrix obj = new mergeThe2DMatrix();
        int[][] matrix = {
            {1, 3, 5},
            {2, 4, 6},
            {7, 8, 9}
        };
        ArrayList<Integer> result = obj.mergeArrays(matrix);
        System.out.println(result); // Output: [1, 2, 3, 4, 5, 6, 7, 8, 9]
    }
    public ArrayList<Integer> mergeArrays(int[][] mat) {
        // Code here
        ArrayList<Integer> list = new ArrayList<>();
        for ( int i = 0 ; i < mat.length ; i++ ){
            for ( int j = 0 ; j < mat[i].length ; j++ ){
                list.add(mat[i][j]);
            }
        }
        Collections.sort(list);
        return list;
    }
}
