// Write a C program to find the sum, difference, product and quotient of 2 numbers.
#include <stdio.h>

int main() {
    float num1, num2;
    printf("Enter two numbers: ");
    scanf("%f %f", &num1, &num2);

    printf("Sum: %.2f\n", num1 + num2);
    printf("Difference: %.2f\n", num1 - num2);
    printf("Product: %.2f\n", num1 * num2);
    if (num2 != 0) {
        printf("Quotient: %.2f\n", num1 / num2);
    } else {
        printf("Quotient: Undefined (division by zero)\n");
    }

    return 0;
}