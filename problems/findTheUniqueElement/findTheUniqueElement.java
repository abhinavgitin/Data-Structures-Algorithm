import java.util.HashMap;

public class findTheUniqueElement {
    public int findUnique(int k, int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for ( int i : arr ){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for ( int j : map.keySet() ){
            if ( map.get(j) < k ){
                return j;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        findTheUniqueElement finder = new findTheUniqueElement();
        int[] arr = {2, 2, 3, 2, 4, 4, 4};
        int k = 3;
        int uniqueElement = finder.findUnique(k, arr);
        System.out.println("The unique element is: " + uniqueElement); 
    }
}