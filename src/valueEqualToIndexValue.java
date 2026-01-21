import java.util.*;

class valueEqualToIndexValue {
    public static void main(String[] args) {
        valueEqualToIndexValue sol = new valueEqualToIndexValue();
        List<Integer> nums = Arrays.asList(-10, -5, 0, 3, 7);
        System.out.println(sol.valueEqualToIndex(nums)); // Output: [3]
    }
    public List<Integer> valueEqualToIndex(List<Integer> nums) {
        // code here
        ArrayList<Integer> arrList = new ArrayList<>();
        // for ( int i : nums ){
        //     if ( i == nums.indexOf(i)+1 ){
        //         arrList.add(i);
        //     }
        // }
        // return arrList;
        /* this above code will work for all the uniques identities and not for the repeated ones 
        cause the fun index of gives the first index of the desired element*/
        for ( int i = 1 ; i <= nums.size() ; i++ ){
            if ( i == nums.get(i-1) ){
                arrList.add(i);
            }
        }
        return arrList;
    }
}