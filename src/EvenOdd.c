#include <stdio.h>
int main() {
    long long n, k, oddCount;
    scanf("%lld",&n);
    scanf("%lld",&k);
    oddCount = (n+1)/2;
    if ( k <= oddCount ) {
        printf("%lld",2*k-1);
    } else {
        printf("%lld",2*(k-oddCount));
    }
    return 0;
}