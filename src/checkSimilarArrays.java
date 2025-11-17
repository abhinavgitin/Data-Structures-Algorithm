import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class checkSimilarArrays {
    public static void main(String[] args) {
        // Example usage
        checkSimilarArrays checker = new checkSimilarArrays();
        List<Integer> array1 = List.of(1, 2, 3, 4);
        List<Integer> array2 = List.of(4, 3, 2, 1);
        System.out.println(checker.isIdentical(array1, array2)); // Output: true
    }
    public boolean isIdentical(List<Integer> a, List<Integer> b) {
        if (a.size() != b.size()) return false;
        
        Map<Integer, Integer> freq = new HashMap<>();
        
        for (int num : a) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        
        for (int num : b) {
            if (!freq.containsKey(num)) return false;
            freq.put(num, freq.get(num) - 1);
            if (freq.get(num) < 0) return false;
        }
        
        return true;
    }
}