/*
 Write a C program to define a function patternFilter() that takes a one-dimensional integer array and its size as parameters.
 Inside the function, perform the following modifications for each element:

 • If the element is a palindrome, replace it with the sum of its digits.
 • Else if the element is odd and divisible by 3, replace it with the number of digits in that element.
 • Otherwise, leave the element unchanged.

 Input the array in the main function. Finally, print the modified array in the main() function.
*/

#include <stdio.h>

int patternFilter(int arr[], int n)
{
    for (int i = 0; i < n; i++)
    {
        int temp = arr[i];
        int original = temp;
        int rem, rev = 0, sum = 0, count = 0;

        while (temp != 0)
        {
            rem = temp % 10;
            rev = rev * 10 + rem;
            sum += rem;
            count++;
            temp = temp / 10;
        }

        if (rev == original)
            arr[i] = sum;
        else if (original % 3 == 0 && original % 2 != 0)
            arr[i] = count;
    }

    return 1;
}

int main()
{
    int n;
    printf("Enter the number of elements to be stored in the array: ");
    scanf("%d", &n);

    int arr[n];
    for (int i = 0; i < n; i++)
    {
        printf("Enter element %d: ", i + 1);
        scanf("%d", &arr[i]);
    }

    patternFilter(arr, n);

    printf("\nModified Array: ");
    for (int i = 0; i < n; i++)
        printf("%d ", arr[i]);

    return 0;
}
