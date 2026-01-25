/*
Evaluate the sine series, sin(x)= x- x^3/3! + x^5/5!–x^7/7!+ ……… to n terms.
*/

#include <stdio.h>
#include <math.h>

#define PI 3.141592

int main()
{
    int n, i;
    float x, no, term, sum;
    printf("Enter the number of terms for series (n): ");
    scanf("%d", &n);
    printf("Enter the value of x: ");
    scanf("%f", &x);
    no = x;
    x = x * PI / 180.0;
    term = x;
    sum = x;
    
    for (i = 1; i <= n; i++)
    {
        term *= (((-1) * x * x) / (2 * i * (2 * i + 1)));
        sum += term;
    }
    
    printf("Library value of Sin(%.2f) = %.2f ", no, sin(x));
    printf("\nSin (%.2f) = %.2f\n", no, sum);
    
    return 0;
}
