#include <stdio.h>
#include <string.h>

int main() {
    char a[102], b[102];
    scanf("%s", a);
    scanf("%s", b);
    int length = strlen(a);
    for ( int i = 0 ; i < length ; i++ ){
        if ( a[i] == b[i] ) {
            printf("0");
        } else {
            printf("1");
        }
    }
    printf("\n");
    return 0;
}