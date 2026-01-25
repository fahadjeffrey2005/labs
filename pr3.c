//structures with pointers
//4x4 matrix swap diagonal elements

/*
 
 Write a C program using structures, arrays, and pointers

 1. Define a structure `Student` with:

    * `rollNo` (int)
    * `name` (char array)
    * `marks[5]` (int)
    * `avg` (float)

 2. In `main()`:

    * Input `n` (number of students).
    * Create an **array of `Student` structures**.
    * Use a **pointer to structure** to input student details and compute average marks.

 3. Write a function `displayTopper()` that:

    * Accepts the array and `n` using pointers
    * Finds and displays the student with the highest average.

 
 */


#include <stdio.h>

struct student
{
    int rollNo;
    char name[50];
    int marks[5];
    float avg;
};

int displayTopper(struct student *s, int n)
{
    int i, j;
    for(i = 0; i < n - 1; i++)
    {
        for(j = 0; j < n - i - 1; j++)
        {
            if (s[j].avg < s[j+1].avg)
            {
                struct student temp = s[j];
                s[j] = s[j+1];
                s[j+1] = temp;
            }
        }
    }
    printf("\nTopper Details:\n");
    printf("Name: %s\n", s[0].name);
    printf("Roll No: %d\n", s[0].rollNo);
    printf("Average: %.2f\n", s[0].avg);

    return 0;
}

int main()
{
    int n, total;
    printf("Enter the number of students: ");
    scanf("%d", &n);

    struct student s[n], *ptr;
    for(int i = 0; i < n; i++)
    {
        ptr = &s[i];
        total = 0;

        printf("\nStudent %d\n", i + 1);

        printf("Name: ");
        scanf(" %[^\n]", ptr->name);

        printf("Roll No: ");
        scanf("%d", &ptr->rollNo);

        for (int j = 0; j < 5; j++)
        {
            printf("Marks in Subject %d: ", j + 1);
            scanf("%d", &ptr->marks[j]);
            total += ptr->marks[j];
        }

        ptr->avg = total / 5.0;
    }

    displayTopper(s, n);

    return 0;
}
