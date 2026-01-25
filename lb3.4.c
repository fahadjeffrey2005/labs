/*
Write a program using do-while loop to read the numbers until -1 is encountered. Also
count the number of prime numbers and composite numbers entered by user.
*/

#include <stdio.h>

int main()
 {
    int n, pc = 0, cc = 0, i, isPrime;
    
    do {
        
        printf("Enter a number (-1 to stop): ");
        scanf("%d", &n);

        if (n == -1) break;
        if (n <= 1) continue;
        
        isPrime = 1; 
        i = 2;
        while (i <= n / 2) {
            if (n % i == 0) {
                isPrime = 0; 
                break;
            }
            i++;
        }
        
        
        if (isPrime) 
        {
            pc++;
        } else 
        {
            cc++;
        }
        
    } 
    while (n != -1);
    
    
    printf("Number of prime numbers: %d\n", pc);
    printf("Number of composite numbers: %d\n", cc);
    
    return 0;
}