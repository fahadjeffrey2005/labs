/*
 Write a function Fact to find the factorial of a given number. Using this function,
 compute NCR in the main function.
 */
#include <stdio.h>
int fact(int n)
{
    int fac = 1;
    for (int i =1; i<=n;i++)
    {
        fac *= i;
    }
    return fac;
}
int main()
{
    int n, r;
    printf("Enter the value of N: ");
    scanf("%d", &n);
    printf("Enter the value of R: ");
    scanf("%d", &r);
    float NCR = ((float)fact(n))/(fact(n-r)*fact(r));
    printf("The nCr is: %.2f\n", NCR);
    return 0;
}

