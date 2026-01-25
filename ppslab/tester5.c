//Matrix mutliplication

#include <stdio.h>
int main()
{
    int a1,a2;
    printf("Enter the number of columns of matrix A: ");
    scanf("%d", &a1);
    printf("Enter the number of rows of matrix A: ");
    scanf("%d", &a2);
    int arr1[a1][a2];
    printf("===================================================================================\n");
    for (int i =0; i<a1; i++)
    {
        for (int j =0; j<a2; j++)
        {
            printf("Enter the value to be stored in position %d%d of matrix A: ", i,j);
            scanf("%d", &arr1[i][j]);
        }
    }
    printf("===================================================================================\n");
    int b1,b2;
    printf("Enter the number of columns of matrix B: ");
    scanf("%d", &b1);
    printf("Enter the number of rows of matrix B: ");
    scanf("%d", &b2);
    int arr2[b1][b2];
    printf("===================================================================================\n");
    for (int i =0; i<b1; i++)
    {
        for (int j =0; j<b2; j++)
        {
            printf("Enter the value to be stored in position %d%d of matrix B: ", i,j);
            scanf("%d", &arr2[i][j]);
        }
    }
    printf("===================================================================================\n");
    int arr3[a1][b2];
    if (a2 == b1)
    {
        for (int i= 0; i<a1; i++)
        {
            for (int j=0; j<b2; j++)
            {
                for (int k =0; k<a1; k++)
                    arr3[i][j] += arr1[i][k]*arr2[k][j];
            }
        }
    }
    else
        printf("Multiplication is not possible.");
    for (int i =0; i<a1; i++)
    {
        for (int j =0; j<b2; j++)
        {
            printf("%d\t",arr3[i][j]);
        }
        printf("\n");
    }
    return 0;
}

