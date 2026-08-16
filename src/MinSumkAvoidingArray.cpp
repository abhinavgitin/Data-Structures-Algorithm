#include <iostream>
using namespace std;

class Solution {
public:
    int minimumSum(int n, int k) {
        if ( k == 1 || k == 2 || (n + n - 1) < k ) return (n * ( n+1 )) / 2;
        
        int firstPartLastNumber = (int) k / 2; // or say firstPartLastNumber
        
        int firstPartSum = (firstPartLastNumber * (firstPartLastNumber + 1)) / 2; // the sum of the first part || the half of the k
        
        int secondPartLastNumber = k + (n - firstPartLastNumber - 1);
        
        int secondPartFirstNumber = k;
        
        int secondPartSum = ((secondPartFirstNumber + secondPartLastNumber) * (secondPartLastNumber - secondPartFirstNumber + 1)) / 2;
        
        return firstPartSum + secondPartSum;
    }
};

int main() {
    Solution sol;
    int n = 5; // Example value for n
    int k = 4; // Example value for k
    int result = sol.minimumSum(n, k);
    std::cout << "Minimum sum: " << result << std::endl;
    return 0;
}

/* the 7: secondPart is the end length till where the other part after the left over in the array goes so we do:
 k + ( n - firstPart -1 )
 |     |    |
 |     |    |---> is the part that we need to subtract from the length such that we do not exceed the n
 |     |----> is the length that we must not exceed here for the array
 |---> if the starting idx of the second part  
 */