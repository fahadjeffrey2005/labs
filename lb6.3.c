//Perform matrix multiplication and display the resultant matrix.

#include <stdio.h>
int main()
{
    int a1,a2;
    printf("Enter the number of columns of matrix A: ");
    scanf("%d", &a1);
    printf("Enter the number of rows of matrix A: ");
    scanf("%d", &a2);
    int arr1[a2][a1];
    printf("===================================================================================\n");
    for (int i =0; i<a2; i++)
    {
        for (int j =0; j<a1; j++)
        {
            printf("Enter value %d %d of matrix A: ", i,j);
            scanf("%d", &arr1[i][j]);
        }
    }
    printf("===================================================================================\n");
    int b1,b2;
    printf("Enter the number of columns of matrix B: ");
    scanf("%d", &b1);
    printf("Enter the number of rows of matrix B: ");
    scanf("%d", &b2);
    int arr2[b2][b1];
    printf("===================================================================================\n");
    for (int i =0; i<b2; i++)
    {
        for (int j =0; j<b1; j++)
        {
            printf("Enter value %d %d of matrix B: ", i,j);
            scanf("%d", &arr2[i][j]);
        }
    }
    printf("===================================================================================\n");
    int arr3[a2][b1];
    if (a1 == b2)
    {
        for (int i= 0; i<a2; i++)
        {
            for (int j=0; j<b1; j++)
            {
                arr3[i][j] = 0;
                for (int k =0; k<a1; k++)
                    arr3[i][j] += arr1[i][k]*arr2[k][j];
            }
        }
    }
    else
        printf("Multiplication is not possible.\n");

    for (int i =0; i<a2; i++)
    {
        printf("|");
        for (int j =0; j<b1; j++)
        {
            printf(" %d ",arr3[i][j]);
        }
        printf("| \n");
    }
    return 0;
}
