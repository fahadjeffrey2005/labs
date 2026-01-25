// Interchange any two Rows & Columns in the given matrix and display resultant.
#include <stdio.h>

int main()
{
    int n1, n2;
    printf("Enter the number of rows of matrix A: ");
    scanf("%d", &n1);
    printf("Enter the number of columns of matrix A: ");
    scanf("%d", &n2);

    int arr1[n1][n2];
    for (int i = 0; i < n1; i++)
    {
        for (int j = 0; j < n2; j++)
        {
            printf("Enter value at (%d,%d): ", i, j);
            scanf("%d", &arr1[i][j]);
        }
    }

    printf("Original Matrix: \n");
    for (int i = 0; i < n1; i++)
    {
        for (int j = 0; j < n2; j++)
        {
            printf("%d\t", arr1[i][j]);
        }
        printf("\n");
    }
    
    char ch;
    printf("Enter (R) to interchange rows:\nEnter (C) to interchange columns: ");
    scanf(" %c", &ch);

    if (ch == 'R' || ch == 'r')
    {
        int r1, r2;
        printf("Enter 2 rows to interchange: ");
        scanf("%d %d", &r1, &r2);
        for (int i = 0; i < n2; i++)
        {
            int temp = arr1[r1][i];
            arr1[r1][i] = arr1[r2][i];
            arr1[r2][i] = temp;
        }
    }
    else if (ch == 'C' || ch == 'c')
    {
        int c1, c2;
        printf("Enter 2 columns to interchange: ");
        scanf("%d %d", &c1, &c2);
        for (int i = 0; i < n1; i++)
        {
            int temp = arr1[i][c1];
            arr1[i][c1] = arr1[i][c2];
            arr1[i][c2] = temp;
        }
    }
    else
    {
        printf("Error! Pick only between R and C");
    }

    printf("New Matrix: \n");
    for (int i = 0; i < n1; i++)
    {
        for (int j = 0; j < n2; j++)
        {
            printf("%d\t", arr1[i][j]);
        }
        printf("\n");
    }

    return 0;
}
