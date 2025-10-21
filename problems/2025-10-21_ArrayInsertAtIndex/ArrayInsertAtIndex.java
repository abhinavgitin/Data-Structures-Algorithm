import java.util.*;
public class ArrayInsertAtIndex {
    public static void main(String[] args) {
        ArrayInsertAtIndex solution = new ArrayInsertAtIndex();
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int index = 2;
        int val = 10;
        solution.insertAtIndex(arr, index, val); // we call the method using the object
        System.out.println(arr); // Output should be [1, 2, 10, 3, 4, 5]
    }
    public void insertAtIndex(ArrayList<Integer> arr, int index, int val) {
        // code here
        arr.add(index , val );
    }
}

