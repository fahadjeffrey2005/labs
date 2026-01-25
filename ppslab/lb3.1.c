/* 
Reverse a given number and check if it is a palindrome or not. (use while loop). [Ex:
1234, reverse=4*10 3 +3 * 10 2 + 2 * 10 1 + 1 * 10 0 =4321]
*/

#include <stdio.h>

int main()
{
    int n,rev =0,temp =0,rem=0;
    printf("Enter the value: ");
    scanf("%d",&n);
    temp=n;
    while(n!=0)
    {
        rem = n%10;
        rev = rev*10+rem;
        n =n/10;
    }
    if (rev == temp)
    {
        printf("The number entered is a palindrome number.\n");
        printf("Original number: %d\n",temp);
        printf("Reversed number: %d\n",rev);
    }
    else 
    {
        printf("The number is not a palindrome number.\n");
        printf("Original number: %d\n",temp);
        printf("Reversed number: %d\n",rev);
    }
    return 0;
}

