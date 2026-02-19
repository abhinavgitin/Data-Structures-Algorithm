import java.util.*;

public class FurnitureStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while ( t-- > 0 ) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for ( int i = 0 ; i < n ; i++ ) {
                arr[i] = sc.nextInt();
            }
            // now i want to add that sofas that are of no use when the customer enters
            // the logic is that if the current element is greater then the previous one then we mark that as the sofas of no use
            List<Integer> useless = new ArrayList<>();
            int minimumSoFar = Integer.MAX_VALUE;
            for ( int i = 0 ; i < n ; i++ ) {
                if ( arr[i] > minimumSoFar ){ // here if the minimum pricing of the sofas for the ai sofa is more then the previous we mark that for useless
                    // cause the price is more then we saw last time
                    useless.add(i+1); // we return the 1-based index of the sofas places
                } else {
                    // else the minimum price that we saw till now will be
                    minimumSoFar = arr[i];
                }
            }
            // the output demanded here is no of the sofas that cannot be ordered 
            System.out.println(useless.size());
            // then exactly the sofas placed positions!
            for ( int i : useless ) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}