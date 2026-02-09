import java.util.*;

public class ArrayColouring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalInput = sc.nextInt(); // this is the total no of inputs for each sub inputs
        // i will make two arrays and the i will take the inputs and then i will also
        // put the R and B for each of the inputs that is Being taken
        // then at last for the first run i will check thet is that the previous char
        // and the recent char matches if yes then the output is no and vise versa
        // what i can also do and the best is that as per the index i can append to a sb
        // and then chcek that does that sb contain "RR or BB" if yes then its a no and
        // vise versa
        for (int i = 0; i < totalInput; i++) {
            int subInput = sc.nextInt();
            int[] arr = new int[subInput];
            char[] ch = new char[subInput];
            for (int j = 0; j < subInput; j++) {
                arr[j] = sc.nextInt();
                if ( j % 2 == 0 ) ch[j] = 'R';
                else ch[j] = 'B';
            }
            for (int m = 0; m < arr.length; m++) {
                for (int n = 0; n < arr.length - m - 1; n++) {
                    if (arr[n] > arr[n + 1]) {
                        int temp = arr[n];
                        char tempCh = ch[n];
                        arr[n] = arr[n + 1];
                        ch[n] = ch[n+1];
                        arr[n + 1] = temp;
                        ch[n+1] = tempCh;
                    }
                }
            }
            String str = new String(ch);
            if ( str.contains("RR") || str.contains("BB") ) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
        sc.close();
    }
}