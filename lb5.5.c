/*
 
 Define a 1D array called STUDENTS of size N, which holds the roll numbers of N
 students, display the roll numbers, search for a given roll number and display appro-
 priate message.
 STUDENTS
 1 2 3 4 5 6 … N
 
 */


#include <stdio.h>

int main()
{
    int N, key, i, found = 0;

    printf("Enter number of students (N): ");
    scanf("%d", &N);
    int STUDENTS[N];
    for (i = 0; i < N; i++)
    {
        STUDENTS[i] = i + 1;
    }
    printf("Roll numbers of students:\n");
    for (i = 0; i < N; i++)
    {
        printf("%d ", STUDENTS[i]);
    }
    printf("\n");
    printf("Enter roll number to search: ");
    scanf("%d", &key);
    int first = 0, last = N - 1, mid;
    while (first <= last)
    {
        mid = (first + last) / 2;
        if (STUDENTS[mid] == key)
        {
            found = 1;
            break;
        }
        else if (key > STUDENTS[mid])
        {
            first = mid + 1;
        }
        else
        {
            last = mid - 1;
        }
    }
    if (found == 1)
        printf("Roll number %d found at position %d.\n", key, mid + 1);
    else
        printf("Roll number %d NOT found.\n", key);

    return 0;
}
