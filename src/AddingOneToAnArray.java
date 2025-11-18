import java.util.Collections;
import java.util.Vector;

public class AddingOneToAnArray {
    public static void main(String[] args) {
        AddingOneToAnArray obj = new AddingOneToAnArray();
        int[] digits = {9, 9, 9};
        Vector<Integer> result = obj.addOne(digits);
        System.out.println(result); // Output: [1, 0, 0, 0]
    }
    Vector<Integer> addOne(int[] digits) {
        // code here
        Vector<Integer> ans = new Vector<>();
        int carry = 1;

        for (int i = digits.length - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            ans.add(sum % 10); // this will give us the last digit if its more than ones
            carry = sum / 10; // removes the last digit eg : 10 -> 0 removed and 1 is the new carry
        }
        if (carry == 1) ans.add(1);
        Collections.reverse(ans);
        return ans;
    }
}