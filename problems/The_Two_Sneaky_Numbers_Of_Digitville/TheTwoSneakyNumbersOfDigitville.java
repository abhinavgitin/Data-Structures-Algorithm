import java.util.*;

public class TheTwoSneakyNumbersOfDigitville {

    public static int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (int j : map.keySet()) {
            if (map.get(j) > 1) {
                list.add(j);
            }
        }

        int[] arr = list.stream().mapToInt(Integer::intValue).toArray();
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 3, 4, 2};
        int[] result = getSneakyNumbers(nums);

        System.out.print("Sneaky numbers are: ");
        for (int n : result) {
            System.out.print(n + " ");
        }
    }
}
