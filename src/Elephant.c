#include <stdio.h>
int main() {
    long i;
    scanf("%ld",&i);
    // if ( i == 5l ) {
    //     printf("1");
    //     return 0;
    // }
    long minSteps = ( i + 5 - 1 ) / 5;
    printf("%ld",minSteps);
    return 0;
}