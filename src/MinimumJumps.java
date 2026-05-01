public class MinimumJumps {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5,6,7,8,9 };
        System.out.println(new MinimumJumps().minJumps(arr));
    }

    public int minJumps(int[] arr) {
        int n = arr.length;

        if (n == 1) return 0;
        if (arr[0] == 0) return -1;

        int jumps = 0;
        int maxReach = 0;
        int currentEnd = 0;

        for (int i = 0; i < n - 1; i++) {
            maxReach = Math.max(maxReach, i + arr[i]);

            if (i == currentEnd) {
                jumps++;
                currentEnd = maxReach;

                if (currentEnd <= i) return -1;
            }
        }

        return jumps;
    }
}