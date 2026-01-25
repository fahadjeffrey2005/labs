/*
Generate prime numbers between 2 given limits. (use while loop)
*/

#include <stdio.h>

int main()
{
    int lower, upper, num, i, isPrime;

    printf("Enter lower limit: ");
    scanf("%d", &lower);
    printf("Enter upper limit: ");
    scanf("%d", &upper);
    printf("Prime numbers between %d and %d are:\n", lower, upper);
  
    num = lower;
    while (num <= upper)
     {
        isPrime = 1; 
        i = 2;
        
        while (i <= num / 2) 
        {
            if (num % i == 0) 
            {
                isPrime = 0; 
                break;
            }
            i++;
        }
        
        if (isPrime && num > 1) 
        {
            printf("%d ", num);
        }
        
        num++;
    }
    printf("\n");
    
    return 0;
}