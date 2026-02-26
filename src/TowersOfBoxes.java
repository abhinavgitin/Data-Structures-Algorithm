import java.util.*;

public class TowersOfBoxes {
    // said that the no of boxes is n | then weight of each box is m | and tthe durabilaty of each of the boxes is d
    // they want to stack the boxes on top of each other
    // also being said that the total weight of the boxes should not exceed the durability of the boxes
    // we have to return the minimum no of towers that he can achieve given that all the n boxes must be used
    // what is actually said is that the weight of the box above the each box must not exceed the durability of that box
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while ( t-- > 0 ) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int d = sc.nextInt();
            // we know that one box can hold k * m boxes above it
            // where k is the no of boxes above it and the m is the mass of the boxes such that the k * m should not exceed the durability
            // so it becomes like k*m <= d then we can make the tower
            // to get the no of boxes ( k ) above the box we can do simple maths k*m <= d | k <= d/m;
            int k = d/m;
            // so the maxx height that we can reach is 
            int  maxHeight = k+1; // includeing the box below it too
            // so if there are n number of boxes how many towers can we make from the maxheight
            // cause the each one hight is a one box | so we divide the total no of boxes by the maxHeight boxes reached to distribute the no of towers
            int minTowersThatCanBeMade = ( n + maxHeight - 1 ) / maxHeight; // works same as ceil;
            System.out.println(minTowersThatCanBeMade); 
        }
        sc.close();
    }
}