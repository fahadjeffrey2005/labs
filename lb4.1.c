/*
Generate the multiplication table for ‘n’ numbers up to ‘k’ terms (using nested for loops).
*/
#include <stdio.h>

int main()
{
    int n,k;
    printf("Enter the number for which you want the multiplication table (n): ");
    scanf("%d", &n);
    printf("Enter the number of terms for the multiplication table (k): ");
    scanf("%d", &k);
    for (int i=1; i<=n;i++)
    {
        for (int j=1; j<=k; j++)
        {
            printf("%d X %d = %d\t", j,i,j*i);
        }
        printf("\n");
    }
    return 0;
}