# Problem: This is to reverse a string keeping the words intacked
**Platform:** LeetCode
**Problem link:** <[Leetcode→](https://leetcode.com/problems/reverse-words-in-a-string/description/)>  
**Date solved:** 2025-10-21

---

## Intuition
- we need to remove the spaces of the start and the end of the stings first
- then the spaces in between so we use split("\\s+") this says that we can split the words by the spaces for example if the words ends with a space " " then thats the first word wich will go into the first index of the array 
- the use of the + in the "\\s+" shows that count we can count all the leading spaces after a word if its there
- this methods removes the whole of the spaces in between of the words
- the method that i was thinking was tp put the words of the string in a box and then reverse the order of the box and at this point the collection.reverse came in use 
- but first i convert the array into the list because the collections.reverse() is for the list operations
- to do that i used Arrays.asList( name );
- no we return the reversed list 
- we then use the string.join ( what you want in between of the words , list_name or arry_name ); -> this is the syntax


## Approach (step-by-step)s
1. use trim and then split them using this "\\s+" (spaces)
2. use collections method to reverse 
3. then join them and return as string 

---

## Alternate Approaches / Methods
- you can definately use string array and then use the while loop to reverse the array 
- then make a string builder and then append all the string in the reverse order and retun the string tostring ();

---

## Complexity
- Time: O(n)
- Space: O(n)

---

## Code
```<java>
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
