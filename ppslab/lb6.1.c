
/*    Display whether a given matrix is symmetric or not. [Hint: A = AT]    */
#include <stdio.h>
int main()
{
    int n1, n2;
    printf("Enter the number of rows of matrix A: ");
    scanf("%d", &n1);
    printf("Enter the number of columns of matrix A: ");
    scanf("%d", &n2);

    int arr1[n1][n2];
    int arr2[n2][n1];

    for (int i = 0; i < n1; i++)
    {
        for (int j = 0; j < n2; j++)
        {
            printf("Enter value %d %d of matrix A: ", i, j);
            scanf("%d", &arr1[i][j]);
            arr2[j][i] = arr1[i][j];
        }
    }

    printf("Matrix A:\n");
    for (int i = 0; i < n1; i++)
    {
        printf("|");
        for (int j = 0; j < n2; j++)
        {
            printf(" %d ", arr1[i][j]);
        }
        printf("| \n");
    }

    printf("Matrix A':\n");
    for (int i = 0; i < n2; i++)
    {
        printf("|");
        for (int j = 0; j < n1; j++)
        {
            printf(" %d ", arr2[i][j]);
        }
        printf("|\n");
    }

    if (n1 != n2) {
        printf("The matrix is not symmetric (not a square matrix).\n");
        return 0;
    }

    int symmetric = 1;
    for (int i = 0; i < n1; i++)
    {
        for (int j = 0; j < n2; j++)
        {
            if (arr1[i][j] != arr2[i][j])
            {
                symmetric = 0;
                break;
            }
            
        }
    }

    if (symmetric)
        printf("The matrix is symmetric.\n");
    else
        printf("The matrix is not symmetric.\n");

    return 0;
        
}
