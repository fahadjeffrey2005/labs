/*
 
 Define a structure to store student details (e.g., name, roll number, marks in three
 subjects). Write a program to input data for five students, calculate their total and
 average marks, and display the results.
 
 */
#include <stdio.h>
int main()
{
    struct student
    {
        int rollno;
        char name[50];
        int sub[3];
        float avg;
        int total;
    }s[5];
    for (int i = 0; i < 5; i++)
    {
        printf("Enter the roll no of student %d: ", i+1);
        scanf("%d", &s[i].rollno);
        getchar();
        printf("Enter name of the student: ");
        scanf("%[^\n]", s[i].name);
        s[i].total = 0;
        for (int j = 0; j < 3; j++)
        {
            printf("Enter the marks in subject %d: ", j+1);
            scanf("%d", &s[i].sub[j]);
            s[i].total += s[i].sub[j];
        }
        printf("\n");
        s[i].avg = s[i].total / 3.0;
    }
    printf("\n");
    for (int i = 0; i < 5; i++)
    {
        printf("Student name: %s\n", s[i].name);
        printf("Total marks: %d\n", s[i].total);
        printf("Average mark: %.2f\n", s[i].avg);
        printf("\n");
    }
    return 0;
}
