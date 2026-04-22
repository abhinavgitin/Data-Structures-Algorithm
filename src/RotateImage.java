public class RotateImage {
    public static void main(String[] args) {
        RotateImage rotateImage = new RotateImage();
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotateImage.rotate(matrix);
    }
    public void rotate(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int result[][] = new int[row][col];
        for ( int i = 0 ; i < row ; i++ ) {
            for ( int j = 0 ; j < col ; j++ ) {
                result[j][row-1-i] = matrix[i][j];
            }
        }
        for ( int i = 0 ; i < row ; i++ ) {
            for ( int j = 0 ; j < col ; j++ ) {
                matrix[i][j] = result[i][j];
            }
        }
    }
}
/*
The initial matrix looks like :
1 2 3
4 5 6
7 8 9

and after the rotation it looks like :
7 4 1
8 5 2
9 6 3
*/