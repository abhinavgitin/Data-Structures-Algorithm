class Solution {
    public int getSum(int a, int b) {
        while (b != 0) {
            int carry = (a & b) << 1;
            a = a ^ b;
            b = carry;
        }
        return a;
    }

    /*
     Our aim is to add integers and then return the sum.

     We follow the same idea as basic mathematics done by hand:
     focusing on addition and carry generation separately.

     The carrying part of addition is handled using bit manipulation.

     We use a loop because carry generated in one step
     may create another carry in the next step.

     (a & b) detects positions where carry is generated.
     << 1 shifts that carry to the left just like we shift carry
     while doing paper-based addition.

     a ^ b performs partial addition (addition without carry).

     We assign carry back into b and repeat the process
     until carry becomes 0.

     Once carry is 0, the addition is complete and 'a'
     contains the final result.
    */
}