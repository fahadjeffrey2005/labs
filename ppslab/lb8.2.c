/*
 
 Write a function CornerSum which takes as a parameter, no. of rows and no. of col-
 umns of a matrix and returns the sum of the elements in the four corners of the matrix.
 Write a main function to test the function.
 
 */

#include <stdio.h>
int CornerSum(int r, int c, int arr[r][c])
{
    int sum = arr[0][0] + arr[0][c-1] + arr[r-1][0] + arr[r-1][c-1];
    return sum;
}
int main()
{
    int r,c,sum;
    printf("Enter the number of rows in the matrix: ");
    scanf("%d", &r);
    printf("Enter the number of columns in the matrix: ");
    scanf("%d", &c);
    int arr[r][c];
    for (int i =0; i<r;i++)
    {
        for(int j =0; j<c; j++)
        {
            printf("Enter the value %d %d of the matrix: ",i,j);
            scanf("%d", &arr[i][j]);
        }
    }
    sum = CornerSum(r, c, arr);
    printf("The sum of the elements in the corners is: %d\n", sum);
    return 0;
}
