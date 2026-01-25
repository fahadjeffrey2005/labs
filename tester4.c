/*
 
 2D Arrays
 addition of 2 matrices
 first for loop defines the row and the second for loop defines the column
 
 */
#include <stdio.h>
int main()
{
    int n1,n2;
    printf("Enter the number of columns of matrix A and B: ");
    scanf("%d", &n1);
    printf("Enter the number of rows of matrix A and B: ");
    scanf("%d", &n2);
    int arr1[n1][n2];
    int arr2[n1][n2];
    printf("===================================================================================\n");
    for (int i =0; i<n1; i++)
    {
        for (int j =0; j<n2; j++)
        {
            printf("Enter the value to be stored in position %d%d of matrix A: ", i,j);
            scanf("%d", &arr1[i][j]);
        }
    }
    printf("===================================================================================\n");
    for (int i =0; i<n1; i++)
    {
        for (int j =0; j<n2; j++)
        {
            printf("Enter the value to be stored in position %d%d of matrix B: ", i,j);
            scanf("%d", &arr2[i][j]);
        }
    }
    printf("===================================================================================\n");
    for (int i =0; i<n1; i++)
    {
        for (int j =0; j<n2; j++)
        {
            printf("%d\t",arr1[i][j] + arr2[i][j]);
        }
        printf("\n");
    }
    return 0;
}
