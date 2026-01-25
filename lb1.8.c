/*Write a C program to evaluate the following expression 
for the values a = 30, b=10, c=5, d=15
(i) (a + b) * c / d
(ii) ((a + b) * c) / d
(iii) a + (b * c) / d
(iv) (a + b) * (c / d)*/
#include <stdio.h>
#include <math.h>
int main() 
{
    int a = 30, b = 10, c = 5, d = 15;
    float result;

    // 1
    result = (a + b) * c / d;
    printf("(a + b) * c / d = %.2f\n", result);

    // 2
    result = ((a + b) * c) / d;
    printf("((a + b) * c) / d = %.2f\n", result);

    // 3
    result = a + (b * c) / d;
    printf("a + (b * c) / d = %.2f\n", result);

    // 4
    result = (a + b) * (c / d);
    printf("(a + b) * (c / d) = %.2f\n", result);

    return 0;
}
