import java.util.*;

class Rotated_String_On_All_Possible_Shifts {
    public static void main(String[] args) {
        Rotated_String_On_All_Possible_Shifts sol = new Rotated_String_On_All_Possible_Shifts();
        String s = "abcde";
        String goal = "cdeab";
        System.out.println(sol.rotateString(s, goal));
        
        List<String> strings = Arrays.asList("abcde", "cdeab", "deabc", "edcba");
        for (String str : strings) {
            System.out.println(sol.rotateString(s, str));
        }
    }
    public boolean rotateString(String s, String goal) {
    
        return s.length() == goal.length() && (s + s).contains(goal);
    }
}