/*
Define a structure for a product with members for product ID, name, and price. Write
a program to create array of products using pointers, input their details, and display
them. (Use the concept of pointers and structures)
*/
#include <stdio.h>

int main()
{
    struct product
    {
        int id;
        char name[50];
        float price;
    };

    int n;
    printf("Enter the number of products: ");
    scanf("%d", &n);
    getchar();
    struct product p[n];
    struct product *ptr = p;

    for (int i = 0; i < n; i++)
    {
        printf("\nProduct %d:\n", i + 1);
        printf("Enter ID: ");
        scanf("%d%*c", &(ptr + i)->id);

        printf("Enter name: ");
        scanf("%[^\n]%*c", (ptr + i)->name);

        printf("Enter price: ");
        scanf("%f%*c", &(ptr + i)->price);

        printf("\n");
    }

    printf("\nProduct Details:\n");
    for (int i = 0; i < n; i++)
    {
        printf("\nID: %d\n", (ptr + i)->id);
        printf("Name: %s\n", (ptr + i)->name);
        printf("Price: %.2f\n", (ptr + i)->price);
        printf("\n");
    }

    return 0;
}
