/*
 
 Write a recursive function FIB to generate nth Fibonacci term. Write a main program
 to print first N Fibonacci terms using function FIB.
 
 */
#include<stdio.h>
int fib(int);
int fib(int n)
{
    if (n==0)
        return 0;
    else if (n==1)
        return 1;
    else
        return (n-1)+(n-2);
}
int main()
{
    int no;
    printf("Enter the number of terms to be generated in the fibonacci series: ");
    scanf("%d", &no);
    printf("%d\n", fib(no-1));
    return 0;
}
