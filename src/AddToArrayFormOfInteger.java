import java.math.BigInteger;
import java.util.*;

class AddToArrayFormOfInteger {
    public static void main(String[] args) {
        AddToArrayFormOfInteger obj = new AddToArrayFormOfInteger();
        int[] num = {1,2,0,0};
        int k = 34;
        List<Integer> list = obj.addToArrayForm(num, k);
        System.out.println(list);
    }
    public List<Integer> addToArrayForm(int[] num, int k) {
        // String sb = new String(Arrays.toString(num));
        // sb = sb.replaceAll(",", "");
        // sb = sb.replace("[", "");
        // sb = sb.replace("]", "");
        // sb = sb.replaceAll(" ", "");
        // int add = Integer.parseInt(sb)+k;
        // String str = Integer.toString(add);
        // ArrayList<Integer> list = new ArrayList<>();
        // for ( char c : str.toCharArray() ) {
        //     list.add(c-'0');
        // }
        // return list;
        // that works for small inputs
        StringBuilder sb = new StringBuilder();
        for ( int i : num ) sb.append(i);
        BigInteger number = new BigInteger(sb.toString()).add(BigInteger.valueOf(k));
        ArrayList<Integer> list = new ArrayList<>();
        for ( char c : number.toString().toCharArray() ) list.add(c-'0');
        return list;
    }
}