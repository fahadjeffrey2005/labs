#include <stdio.h>

int main()
{
    int a,b,c;
    printf("Enter the first number: ");
    scanf("%d", &a);
    printf("Enter the second number: ");
    scanf("%d", &b);
    printf("Enter the thrid number: ");
    scanf("%d", &c);
    
    // Using a ternary operator
    int smallest = (a < b) ? ((a < c) ? a : c) : ((b < c) ? b : c);
    printf("%d is the smallest number\n", smallest);

    return 0;
}