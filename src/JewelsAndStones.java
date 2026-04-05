import java.util.*;

class JewelsAndStones {
    public static void main(String[] args) {
        JewelsAndStones solution = new JewelsAndStones();
        System.out.println(solution.numJewelsInStones("aA", "aAAbbbb")); // Output: 3
        System.out.println(solution.numJewelsInStones("z", "ZZ")); // Output: 0
        // more test cases:
        System.out.println(solution.numJewelsInStones("abc", "aabbcc")); // Output: 6
        System.out.println(solution.numJewelsInStones("xYz", "xXyYzZ")); // Output: 3
        System.out.println(solution.numJewelsInStones("", "ZZ")); // Output: 0
        System.out.println(solution.numJewelsInStones("aA", "")); // Output: 0
        System.out.println(solution.numJewelsInStones("aA", "bB")); // Output: 0
        // and like that, you can add more test cases to validate the solution further.
    }
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer> map = new HashMap<>();
        int length = stones.length();
        for ( int i = 0 ; i < length ; i++ ) {
            map.put( stones.charAt(i), map.getOrDefault(stones.charAt(i),0)+1 );
        }
        int lengthForJewels = jewels.length();
        int noOfJewels = 0;
        for ( int j = 0 ; j < lengthForJewels ; j++ ) {
            noOfJewels += map.getOrDefault(jewels.charAt(j),0);
        }
        return noOfJewels;
    }
}