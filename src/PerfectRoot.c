#include <stdio.h>
#include <math.h>
int main(){
    int n;
    scanf("%d",&n);
    while ( n-- ) {
        int x;
        scanf("%d",&x);
        for ( int i = 1; i <= x ; i++ ) {
            printf("%d ", i*i);
        }
        printf("\n");
    }
    return 0;
}