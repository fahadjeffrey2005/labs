/*
 
 Define a structure for a student with a nested structure for the address (including
 street, city, and zip code). Write a program to input and display student details along
 with their address (Use nested structure concept)
 
 */
#include <stdio.h>

int main()
{
    struct details
    {
        char street[50];
        char city[30];
        int zip;
    };

    struct student
    {
        char name[50];
        int rollno;
        struct details address;
    }; 

    int n;
    printf("Enter the number of students: ");
    scanf("%d", &n);
    getchar();
    struct student s[n];

    for (int i = 0; i < n; i++)
    {
        printf("\nEnter the name of student %d: ", i + 1);
        scanf("%s", s[i].name);
        getchar(); 

        printf("Enter roll no of student %d: ", i + 1);
        scanf("%d", &s[i].rollno);
        getchar();

        printf("Address:\n");
        printf("Enter street name: ");
        scanf("%s", s[i].address.street);
        getchar();

        printf("Enter city name: ");
        scanf("%s", s[i].address.city);
        getchar();

        printf("Enter Zip Code No: ");
        scanf("%d", &s[i].address.zip);
        getchar();

        printf("\n");
    }

    for (int i = 0; i < n; i++)
    {
        printf("\nName of student: %s\n", s[i].name);
        printf("Roll No: %d\n", s[i].rollno);
        printf("Address of student:\n");
        printf("Street: %s\n", s[i].address.street);
        printf("City: %s\n", s[i].address.city);
        printf("Zip Code: %d\n", s[i].address.zip);
        printf("\n");
    }

    return 0;
}
