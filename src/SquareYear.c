#include <stdio.h>
#include <math.h>
#include <stdlib.h>

int main() {
    int t;
    scanf("%d", &t);

    while (t--) {
        char s[5];
        scanf("%s", s);

        int year = atoi(s);   // convert string to integer

        int r = (int)sqrt(year);

        if (r * r == year) {
            // valid perfect square
            printf("0 %d\n", r);
        } else {
            // impossible
            printf("-1\n");
        }
    }

    return 0;
}
