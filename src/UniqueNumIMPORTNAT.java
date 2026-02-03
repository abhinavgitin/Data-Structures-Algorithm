import java.util.ArrayList;

public class UniqueNumIMPORTNAT {
    // THIS SHOWS THAT HOW DO WE HANDEL THE NUMBERS THAR ARE IN THE RANGE AND THEN WE HANDEL THE DIGITS OF THE NUMBERS ITSELF FOR EACH NUMBER
    // AGAIN TO HANDEL EACH NUMBER AND SIMULTANEOUSLY THE DIGITS OF THE SAME NUMBER
    public static void main(String[] args) {
        int L = 0, R = 20;
        ArrayList<Integer> result = uniqueNumbers(L, R);
        System.out.println("Unique digit numbers between " + L + " and " + R + ":\n" + result);
    }

    static ArrayList<Integer> uniqueNumbers(int L, int R) {
        ArrayList<Integer> list = new ArrayList<>();
        for ( int i = L ; i <= R ; i++ ){ // we loop all the way to the right limit
            boolean isUnique = true; // to chcek that the current number is unique or not we make a flag and set initially it to true that yes the number is unique FOR NOW!
            boolean[] seen = new boolean[10]; // for each new entity Number we make a fresh new digits checker that chceks that was the number seen?
            // as initial the seen is set to false that nothing was seen 
            if ( i == 0 ) { // for the 0 Case handeling that if the range has 0 in that then we add it and the continue to the next number directly from here
                list.add(i);
                continue;
            }
            int num = i; // now we perform the operation for each current number
            while ( num > 0 ) { // until and unless the num is greater then 0 peel the number
                int digit = num % 10; // last digit extraced
                if ( seen[digit] ) { 
                    // importnat : if the digit is seen then the number is not unique so skip to the next number
                    isUnique = false;
                    break;
                } else {
                    // if we are seeing the digit the first time then we set that 
                    seen[digit] = true; // yes the digit is seen for that index
                    num /= 10; // peel the num
                    continue; // and then continue to do the same
                }
            }
            if ( isUnique ) list.add(i); // if the digit was not seen then and is true == isUnique number then add it! 
        }
        return list;
    }
}