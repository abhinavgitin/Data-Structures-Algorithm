public class ElementsLessAndGreater {
    public static void main(String[] args) {
        ElementsLessAndGreater obj = new ElementsLessAndGreater();
        int[] arr = {0,1,2,3,4,4,4,4,4,4,4,5,6,7,8,9};
        int target = 4;
        int[] result = obj.getMoreAndLess(arr , target);
        System.out.println("Elements less than or equal to " + target + " : " + result[0]);
        System.out.println("Elements greater than or equal to " + target + " : " + result[1]);
    }
    int[] getMoreAndLess(int[] arr, int target) {
        // // code here
        // int elementsLesser = 0;
        // int elementsGreater = 0;
        
        // for ( int i : arr ){
        //     if ( i <= target ){
        //         elementsLesser++;
        //     }
        //     if ( i >= target ){
        //         elementsGreater++;
        //     }
        // }
        // return new int[]{elementsLesser,elementsGreater};
        
        // next approach is 
        
        return new int[] {
            countLessOrEqual(arr, target),
            countGreaterOrEqual(arr, target)
        };
        
    }
    int countLessOrEqual(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }

    int countGreaterOrEqual(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] >= target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return arr.length - (end + 1);
    }
}