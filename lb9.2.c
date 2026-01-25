//Write a C program to swap two numbers using pointers (Call by reference)
#include <stdio.h>
int main()
{
    int *a,*b,x,y,temp;
    printf("Enter first value: ");
    scanf("%d", &x);
    printf("Enter second value: ");
    scanf("%d", &y);
    a = &x;
    b = &y;
    
    temp = *a;
    *a = *b;
    *b = temp;
    
    printf("The value of a and b after swapping are: %d and %d\n",*a,*b);
    return 0;
}
