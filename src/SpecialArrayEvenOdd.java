class SpecialArrayEvenOdd {
    public static void main(String[] args) {
        SpecialArrayEvenOdd sae = new SpecialArrayEvenOdd();
        int[] nums = {2,4,5,6,8,7,9,9};
        int[] nums2 = {1,2,3,4,5,6};
        System.out.println(sae.isArraySpecial(nums));
        System.out.println(sae.isArraySpecial(nums2));
    }
    public boolean isArraySpecial(int[] nums) {
        // we see the sequence is like 
        // even odd even odd OR
        // odd even odd even 
        // so we take the first element to be either false or even by this ternary operator
        boolean isEven = (nums[0] % 2 == 0 )? true : false;
        //if the first elemet is even its true if not than false;
        for ( int i = 1 ; i < nums.length ; i++ ){
            if ( isEven ) {                   // here if the first element was even then we
                if ( nums[i] % 2 == 0 ){      // we check that the next element must be odd 
                    return false;             // if its not odd we return false cause it becomes even even
                }
            } else {                          // or if the first element was odd then we
                if ( nums[i] % 2 != 0 ){      // check that the next element must be even
                    return false;             // if its odd then return false cause it becomes odd odd 
                }
            }
            isEven = !isEven; // now since we know that the second element was either odd or even we
            // convert the is even ; 
            // if is even was true then it becomes false cause the second elemnt has to be false
            // if is even was false then it becomes true cause the second elemnt has to be true
            // and then we keep on checking for each single element at one go
        }
        return true;
    }

}