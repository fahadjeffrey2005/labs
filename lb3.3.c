/*
Check if the sum of the cubes of all digits of an inputted number equals the number
itself (Armstrong Number).
*/

#include <stdio.h>
#include <math.h>
int main() 
{
    int n, temp, digit, sum = 0;
    
    printf("Enter the value to be checked: ");
    scanf("%d", &n);
    temp = n;

    while (n > 0) 
    {
        digit = n % 10;          
        sum += pow(digit,3); 
        n /= 10;                 
    }
    
    if (sum == temp) 
    {
        printf("%d is an Armstrong number.\n", temp);
    } else 
    {
        printf("%d is not an Armstrong number.\n", temp);
    }
    
    return 0;
}