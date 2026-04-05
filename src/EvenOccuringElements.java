import java.util.*;
class EvenOccuringElements {

    public static void main(String[] args) {
        EvenOccuringElements obj = new EvenOccuringElements();
        int[] arr = {1,2,3,2,3,1,3,3};
        System.out.println(obj.findEvenOccurrences(arr));
    }

    public List<Integer> findEvenOccurrences(int[] arr) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();
        for ( int n : arr ) {
            map.put( n, map.getOrDefault(n,0)+1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> seen = new HashSet<>();
        
        for ( int num : arr ) {
            if ( !seen.contains(num) && map.get(num) % 2 == 0 ) {
                seen.add(num);
                list.add(num);
            }
        }
        // never use list.conatins()!!
        // it searches again and again for the same repeated element and thus the TC increases!
        // so always use Set for such operation cause the conatins in 
        // hashSet is like each element has been registered and there the searchin becomes easier!
        if ( list.size() == 0 ) {
            list.add(-1);
        }
        return list;
    }
}
