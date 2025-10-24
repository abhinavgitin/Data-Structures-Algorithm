import java.util.*;

class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "abcde";
        String goal = "cdeab";
        System.out.println(sol.rotateString(s, goal));
        
        List<String> strings = Arrays.asList("abcde", "cdeab", "deabc", "edcba");
        for (String str : strings) {
            System.out.println(sol.rotateString(s, str));
        }
    }
    public boolean rotateString(String s, String goal) {
        // If lengths don't match, rotation is impossible
        return s.length() == goal.length() && (s + s).contains(goal);
    }
}