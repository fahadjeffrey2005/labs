/*
 
 Compute and display the trace and norm of a given square matrix.
 [Hint: Trace= sum of principal diagonal elements, Norm= SQRT (sum of squares of
 the individual elements of an array)]
 
 */
#include <stdio.h>
#include <math.h>
int main()
{
    int n1, n2;
    printf("Enter the number of rows of Array A: ");
    scanf("%d", &n1);
    printf("Enter the number of columns of Array A: ");
    scanf("%d", &n2);
    
    int arr1[n1][n2], trace=0;
    float norm = 0.0;
    
    for (int i = 0; i < n1; i++)
    {
        for (int j = 0; j < n2; j++)
        {
            printf("Enter value %d %d of the matrix A: ", i, j);
            scanf("%d", &arr1[i][j]);
            if (i == j)
            {
                trace += arr1[i][j];
            }
            norm += pow(arr1[i][j],2);
        }
    }
    norm = sqrt(norm);
    printf("The value of trace is: %d\n", trace);
    printf("The value of norm is: %.2f\n", norm);
    return 0;
}
