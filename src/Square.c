#include <stdio.h>
int main() {
    int t;
    scanf("%d", &t);

    while (t-- > 0) {
        int a[4];
        for (int i = 0; i < 4; i++) {
            scanf("%d", &a[i]);
        }

        printf(
            a[0]==a[1] && a[1]==a[2] && a[2]==a[3]
            ? "YES\n"
            : "NO\n"
        );
    }
    return 0;
}
