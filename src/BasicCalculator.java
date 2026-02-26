import java.util.*;

public class BasicCalculator {
    public int calculate(String s) {
        // what is the best twist here is that there are parenthesis and this is the
        // wildest thing here
        // what intution i can do is that whenever we see the new parenthesis opening
        // and then closing we consider it
        // to be a new minicalc for the one which we were doing
        s = s.trim().replace(" ", "");
        int len = s.length();
        int result = 0;
        int number = 0;
        int sign = 1;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if ( Character.isDigit(c) ) {
                number = number * 10 + ( c - '0' );
            } else {
                // if the current number is not a digit then enter here
                // know that for nums like 1234 all of them will be stored in a num cause the char is the each digits of the ith positon of the string

                switch (c) {
                    case '+':
                        result += sign * number;
                        sign = +1;
                        number = 0;
                        break;

                    case '-':
                        result += sign * number;
                        sign = -1;
                        number = 0; // reset the number for the next count; 
                        break;
                    
                    case '(':
                        stack.push(result);
                        stack.push(sign);
                        sign = 1;
                        result = 0;
                        number = 0;
                        continue;
                    
                    case ')':
                        result += sign * number;
                        number = 0;
                        result *= stack.pop();
                        result += stack.pop(); // cause i entered the sign first
                        // then the result so the result is at the top that comes out first 
                        // we know -> last in first out simple;
                        break;

                    default:
                        break;
                }
            }
        }
        result += sign * number;
        return result;
    }
}