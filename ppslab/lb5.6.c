/*
 Define a 1D array called MARKS of size N, that holds the marks of N students, sort
 the marks in descending order and display the resultant array.
 MARKS
 23 79 68 93 37 89 … N
 
 */
#include <stdio.h>

int main()
{
    int n, i, j, maxIdx, temp;

    printf("Enter number of students: ");
    scanf("%d", &n);

    int marks[n];

    printf("Enter marks of %d students:\n", n);
    for (i = 0; i < n; i++)
    {
        scanf("%d", &marks[i]);
    }

    for (i = 0; i < n - 1; i++)
    {
        maxIdx = i;
        for (j = i + 1; j < n; j++)
        {
            if (marks[j] > marks[maxIdx])
            {
                maxIdx = j;
            }
        }
        temp = marks[i];
        marks[i] = marks[maxIdx];
        marks[maxIdx] = temp;
    }

    printf("Marks in descending order:\n");
    for (i = 0; i < n; i++)
    {
        printf("%d ", marks[i]);
    }
    printf("\n");

    return 0;
}
