/*
Generate Floyd’s triangle using natural numbers for a given limit N. (using for loops)
[Hint: Floyd’s triangle is a right angled-triangle using the natural numbers]
Ex: Input: N = 4
Output:
1
2 3
4 5 6
7 8 9 10
*/
#include <stdio.h>

int main()
{
    int n, count;
    printf("Enter the limit for Floyd's triangle (N):");
    scanf("%d", &n);
    count = 1;
    for (int i = 1; i <= n; i++)
    {
        for (int j = 1; j <= i; j++)
        {
            printf("%d ",count);
            count++;
        }
        printf("\n");
    }
    return 0;
}