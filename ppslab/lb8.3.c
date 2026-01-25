/*
 Write a recursive function, GCD to find the GCD of two numbers.
 Write a main program which reads 2 numbers and finds the GCD of the numbers using the specified function.
 Example: GCD of 9, 24 is 3.
*/

#include <stdio.h>

int gcd(int, int);

int gcd(int a, int b)
{
    if (b == 0)
        return a;
    return gcd(b, a % b);
}

int main()
{
    int n1, n2;
    printf("Enter two positive integers: ");
    scanf("%d %d", &n1, &n2);

    printf("The GCD of %d and %d is %d.\n", n1, n2, gcd(n1, n2));
    return 0;
}
