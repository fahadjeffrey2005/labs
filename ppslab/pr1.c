
//Input a 3x3 character matrix and find the sum of ascii values of upper triangular, lower triangular and diagonal matrix
#include <stdio.h>
int main()
{
    char arr[3][3];
    int c,sum=0;
    for (int i =0; i< 3; i++)
    {
        for (int j =0; j<3; j++)
        {
            printf("Enter value %d %d of the matrix: ",i,j);
            scanf("%c", &arr[i][j]);
            getchar();
        }
    }
    printf("The matrix entered is: \n");
    for (int i =0; i< 3; i++)
    {
        printf("| ");
        for (int j =0; j<3; j++)
        {
            printf("%c-(%d) ",arr[i][j], arr[i][j]);
        }
        printf("|\n");
    }
    printf("\n");
    printf("Enter code for computation: \n1. Upper triangular region: \n2. Lower triangular region: \n3. Diagonal elements: \n");
    scanf("%d",&c);
    switch (c)
    {
        case 1:
        {
            for (int i =0; i< 3; i++)
            {
                for (int j =0; j<3; j++)
                {
                    if (j>=i)
                        sum +=arr[i][j];
                }
            }
        }
        case 2:
        {
            for (int i =0; i< 3; i++)
            {
                for (int j =0; j<3; j++)
                {
                    if (i>=j)
                        sum +=arr[i][j];
                }
            }
        }
        case 3:
        {
            for (int i =0; i< 3; i++)
            {
                for (int j =0; j<3; j++)
                {
                    if (j==i)
                        sum +=arr[i][j];
                }
            }
        }
    }
    printf("Output of operation %d is: %d\n",c,sum);
    return 0;
}
