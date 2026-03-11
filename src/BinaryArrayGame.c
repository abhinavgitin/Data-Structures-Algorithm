// #include <stdio.h>
// #include <stdbool.h>

// int main() {
//     int n, zeros, t, num;
//     scanf("%d",&t);
//     while ( t-- ) {
//         // updated
//         zeros = 0;
//         scanf("%d",&n);
//         bool hasZero = 0;
//         // read n
//         for ( int i = 0 ; i < n ; i++ ) {
//             scanf("%d",&num);
//             // does not return!
//             if ( num == 0 ) hasZero = 1;
//         }
//         if (hasZero) {
//             printf("Alice\n");
//         } else {
//             printf("Bob\n");
//         }
//     }
//     return 0;
// }
#include <stdio.h>

int main() {
    int t;
    scanf("%d", &t);
    while (t--) {
        int n;
        scanf("%d", &n);
        int a[105];
        for (int i = 0; i < n; i++) scanf("%d", &a[i]);

        // Bob wins ONLY if both first and last elements are 0
        if (a[0] == 0 && a[n-1] == 0) {
            printf("Bob\n");
        } else {
            printf("Alice\n");
        }
    }
    return 0;
}