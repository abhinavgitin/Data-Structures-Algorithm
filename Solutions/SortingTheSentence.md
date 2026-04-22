## Code
[View Code Here](../src/SortingTheSentence.java)

# Problem:  SortingTheSentence
**Platform:** Leetcode
**Problem link:** 
**Date solved: 2026-04-18**  
**Tags:** string, sorting, parsing

## What this shows and what this can be used for!

This solution demonstrates how to reconstruct a sentence by sorting words based on numerical suffixes appended to each word.

It can be used in scenarios where text data has embedded ordering information, such as processing shuffled sentences or reordering parsed text elements.
## Intuition

Each word in the input string ends with a digit indicating its correct position in the sorted sentence. By extracting these digits and using them as indices, we can place the words in the correct order in an array before joining them back into a string.

## Approach (step-by-step)s
1. Count the number of spaces to determine the number of words.
2. Create an array to hold the words in their sorted positions.
3. Iterate through the string, extracting each word and its position digit, then place the word (without the digit) into the array at the correct index.
4. Join the array elements into a single string and return it.

## Alternate Approaches / Methods
- Use a list or map to store words with their indices and then sort the list.
- Split the string into words, extract digits, and use a priority queue or sorting algorithm.

## Complexity
- Time: O(n)
- Space: O(n)

## Code
```java
public class SortingTheSentence {
    public static void main(String[] args) {
        SortingTheSentence obj = new SortingTheSentence();
        System.out.println(obj.sortSentence("is2 sentence4 This1 a3"));

    }
    public String sortSentence(String s) {
        StringBuilder str = new StringBuilder(s);
        // we take the right and the left index here
        int leftIndex = 0;
        int length = str.length();
        int count = 0;
        for ( int i = 0 ; i < length ; i++ ) if ( str.charAt(i) == ' ' ) count++;
        String arr[] = new String[count+1];
        for ( int rightIndex = 0 ; rightIndex < length ; rightIndex++ ) {
            if ( str.charAt(rightIndex) == ' ' ) {
                String temp = str.substring(leftIndex, rightIndex-1);
                int thatIndex = str.charAt(rightIndex-1)-'0';
                arr[thatIndex-1] = temp+" ";
                leftIndex = rightIndex+1;
            }
        }
        arr[(str.charAt(length-1)-'0')-1] = str.substring(str.lastIndexOf(" ")+1, length-1)+" "; 
        String sb = String.join("", arr);
        return sb;
    }
}
```