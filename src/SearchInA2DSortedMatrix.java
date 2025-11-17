public class SearchInA2DSortedMatrix {
public static void main(String[] args) {
    SearchInA2DSortedMatrix obj = new SearchInA2DSortedMatrix();
    int[][] matrix = {
        {1, 3, 5, 7},
        {10, 11, 16, 20},
        {23, 30, 34, 60}
    };
    int target = 3;
    boolean result = obj.searchMatrix(matrix, target);
    System.out.println("Target " + target + " found in matrix: " + result);
}
public boolean searchMatrix(int[][] matrix, int target) {
        // int rows = matrix.length;
        // int cols = matrix[0].length;
        // boolean found = false;
        // for ( int i = 0 ; i < rows ; i++ ){
        //     for ( int j = 0 ; j < cols ; j++ ){
        //         if ( matrix[i][j] == target ){
        //             found = true;
        //             return found;
        //         }
        //     }
        // }
        // return found;
        // the matrix is sorted we will apply the binary search then 
        
        int noOfRow = matrix.length;
        int noOfCol = matrix[0].length;
        int start = 0;
        int end = noOfRow * noOfCol - 1;
        while ( start <= end ){
            int mid = start + ( end - start ) / 2;
            int thatRow = mid / noOfCol; // the / gives the quotation for all the mid for 1 row the col changes 4*
            int thatCol = mid % noOfCol; // keeps on changinging cause the % gives the remainder for all the mids
            if ( matrix[thatRow][thatCol] == target ){
                return true;
            } else if ( matrix[thatRow][thatCol] > target ){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }
}