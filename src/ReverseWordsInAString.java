import java.util.Arrays;
import java.util.Collections;

class ReverseWordsInAString {
    public static void main(String[] args) {
        ReverseWordsInAString solution = new ReverseWordsInAString();
        String input = "This is  abhinav a    world ";
        String output = solution.reverseWords(input);
        System.out.println(output); 
    }
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ",words);
    }
}