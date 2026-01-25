//odd or even

#include <stdio.h>

int main()
{
    int a;
    printf("Enter the value you want to check: ");
    scanf("%d", &a);
    if(a%2==0)
    {
        printf("The value entered is even.\n");
    }
    else
    {
        printf("The value entered is odd.\n");
    }
    return 0;
}