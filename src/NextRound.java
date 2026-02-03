import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        /* it was said that the given no of contesttent are n and there scores are respective in the array 
        we need to find such ppl whos score is greater or equal to the said kth contesttent score such that if thay quallify for that 
        they can go for the next round */
        Scanner sc = new Scanner( System.in );
        int n = sc.nextInt(); // i take the imput that how many players were there
        int k = sc.nextInt(); // then the imput for that specific player 
        int[] arr = new int[n];
        for ( int i = 0 ; i < n ; i++ ) {
            arr[i] = sc.nextInt(); // here the scores of the players are takes respectively 
        }
        int count = 0; // we make a count to see how many players qualify for the next round
        int val = arr[k-1]; // we store the valur for that specific score of the kth player into val
        for ( int j : arr ){ 
            if ( j > 0 && j >= val ) count++; // then if the score is greater than zero and is less than or equal to the kth score the val 
            // then we increment the count++;
        }
        System.out.println(count); // display it!
        sc.close();
    
    }
}