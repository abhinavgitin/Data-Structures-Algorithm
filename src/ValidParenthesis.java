import java.util.*;

class ValidParenthesis {
    public static void main(String[] args) {
        System.out.println(isValid("(}"));
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for ( char c : s.toCharArray() ) {
            if ( c == '[' || c == '(' || c == '{' ) {
                stack.push(c);
            } else {
                if ( stack.isEmpty() ) return false;
                char isItClosing = stack.pop();
                if ( c == ')' && isItClosing != '(' ) return false;
                if ( c == ']' && isItClosing != '[' ) return false;
                if ( c == '}' && isItClosing != '{' ) return false;
            }
        }
        return stack.isEmpty();
    }
}