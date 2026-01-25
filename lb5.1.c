//largest and smallest element in a 1d array
#include <stdio.h>

int main()
{
    int n, smallest = 0 , greatest = 0;
    printf("Enter the number of values to be stored in the array: ");
    scanf("%d", &n);
    int arr[n];
    for (int i = 0; i <n; i++)
    {
        printf("Enter value %d of the array: ", i+1);
        scanf("%d", &arr[i]);
        smallest = arr[0];
        greatest = arr[0];
        if (arr[i]<smallest)
            smallest = arr[i];
        if (arr[i]>greatest)
            greatest = arr[i];
    }
    printf("The greatest value is: %d\n", greatest);
    printf("The smallest vlaue is: %d\n", smallest);
    
    return 0;
}
