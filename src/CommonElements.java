// User function Template for Java
import java.util.*;
class CommonElements {
    public static ArrayList<Integer> commonElements(int a[], int b[]) {
        // ArrayList<Integer> list = new ArrayList<>();
        // // to store all the numbers that are common
        // HashMap<Integer,Integer> map = new HashMap<>();
        // for ( int i : a ) {
        //     map.put(i,map.getOrDefault(i,0)+1);
        // }
        // for ( int j : b ) {
        //     map.put(j,map.getOrDefault(j,0)+1);
        // }
        // for ( int num : map.keySet() ) {
        //     int count = map.get(num);
        //     if ( count == 1 ) {
        //         continue;
        //     } 
        //     int runIt = 0;
        //     if ( count % 2 == 0 ) {
        //         runIt = count/2;
        //         while ( runIt > 0 ) {
        //             list.add(num);
        //             runIt--;
        //         }
        //     } else {
        //         runIt = (count-1)/2;
        //         while ( runIt > 0 ) {
        //             list.add(num);
        //             runIt--;
        //         }
        //     }
        // }
        // Collections.sort(list);
        // return list;

        // -------------------- another approach --------------------
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();
        for ( int i : a ) {
            map.put(i,map.getOrDefault(i, 0)+1);
        }
        for ( int j : b ) {
            map2.put(j,map2.getOrDefault(j,0)+1);
        }
        for ( int num : map.keySet() ){
            if ( map2.containsKey(num) ) {
                int totalCount = Math.min(map.get(num), map2.get(num) );
                // int timesToRun = 0;
                // if ( totalCount % 2 == 0 ) {
                //     timesToRun = totalCount/2;
                //     while ( timesToRun > 0 ) {
                //         list.add(num);
                //         timesToRun--;
                //     }
                // } else {
                //     timesToRun = totalCount-1/2;
                //     while ( timesToRun > 0 ) {
                //         list.add(num);
                //         timesToRun--;
                //     }
                // }
                while ( totalCount > 0 ) {
                    list.add(num);
                    totalCount--;
                }
            }
        }
        Collections.sort(list);
        return list;
    }
    public static void main(String[] args) {
        // i want that the user enters the elements by themselves and then we will call the function to get the common elements
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the first array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of the first array: ");
        for ( int i = 0 ; i < n ; i++ ) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the size of the second array: ");
        int m = sc.nextInt();
        int[] b = new int[m];
        System.out.println("Enter the elements of the second array: ");
        for ( int i = 0 ; i < m ; i++ ) {
            b[i] = sc.nextInt();
        }
        System.out.println("Common elements are: " + commonElements(a,b) );
        sc.close();
    }
} 
