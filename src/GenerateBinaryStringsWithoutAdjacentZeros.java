import java.util.*;

public class GenerateBinaryStringsWithoutAdjacentZeros {
    public static void main(String[] args) {
        GenerateBinaryStringsWithoutAdjacentZeros generator = new GenerateBinaryStringsWithoutAdjacentZeros();
        int n = 3; // Example input
        List<String> validBinaryStrings = generator.validStrings(n);
        System.out.println(validBinaryStrings);
    }

    public List<String> validStrings(int n) {
        List<String> result = new ArrayList<>();
        backtrack(n, "", result);
        return result;
    }
    // its importnat for you to revise this topic!
    private void backtrack(int n, String curr, List<String> result) {
        if (curr.length() == n) {
            result.add(curr);
            return;
        }

        // Always can place 1
        backtrack(n, curr + "1", result);

        // Place 0 only if previous isn't 0
        if (curr.isEmpty() || curr.charAt(curr.length() - 1) != '0') {
            backtrack(n, curr + "0", result);
        }
    }
}