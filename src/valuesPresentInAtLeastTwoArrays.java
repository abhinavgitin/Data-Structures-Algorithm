import java.util.*;

public class valuesPresentInAtLeastTwoArrays{
    public static void main (String[] args) {
        int nums1[] = {1,1,3,2};
        int nums2[] = {2,3};
        int nums3[] = {3};
        valuesPresentInAtLeastTwoArrays obj = new valuesPresentInAtLeastTwoArrays();
        List<Integer> result = obj.twoOutOfThree(nums1,nums2,nums3);
        System.out.println(result);

    }
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        HashSet<Integer> set3 = new HashSet<>();
        for ( int i : nums1 ) set1.add(i);
        for ( int i : nums2 ) set2.add(i);
        for ( int i : nums3 ) set3.add(i);
        HashMap<Integer,Integer> map = new HashMap<>();
        for ( int i : set1 ){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for ( int i : set2 ){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for ( int i : set3 ){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for ( int i : map.keySet() ) {
            if ( map.get(i) >= 2 ){
                list.add(i);
            }
        }
        return list;
    }
}