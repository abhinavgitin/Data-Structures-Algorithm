
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