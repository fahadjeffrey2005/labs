/* Write a C program to find the sum, difference, 
product and quotient of 2 numbers. Read through the keyboard. 
Display the result using third variable sum */

#include <stdio.h>
void main()
 {
    int a, b, sum;
    printf("Enter first integer: ");
    scanf("%d", &a);
    printf("Enter second integer: ");
    scanf("%d", &b);

    sum = a + b;

    printf("The sum of %d and %d is %d\n", a, b, sum);
}