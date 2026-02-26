#include <stdio.h>

int main()
{
    // take the input
    // i want it to be for int only
    printf("Enter the low and high values: ");
    int low, high;
    scanf("%d %d", &low, &high);
    int count = high - low + 1;
    if (count % 2 == 0)
    {
        printf("%d", count / 2);
    }
    else
    {
        int addOrNot = (low % 2 != 0) ? 1 : 0;
        printf("%d", (count / 2) + addOrNot);
    }
    return 0;
}