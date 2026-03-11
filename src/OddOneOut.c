#include <stdio.h>
int main()
{
    int t, a, b, c;
    scanf("%d", &t);
    while (t-- > 0)
    {
        scanf("%d", &a);
        scanf("%d", &b);
        scanf("%d", &c);
        if (a == b)
            printf("%d\n", c);
        else if (b == c)
            printf("%d\n", a);
        else
            printf("%d\n", b);
    }
    return 0;
}