#include <stdio.h>
int main() {
        int t, a, b, c;
        scanf("%d",&t);
        while (t--) {
            scanf("%d",&a);
            scanf("%d",&b);
            scanf("%d",&c);
            if ( ( a + b ) == c || ( b + c) == a || ( a + c ) == b ) {
                printf("YES\n");
            } else {
                printf("NO\n");
            }
        }
        return 0;
}