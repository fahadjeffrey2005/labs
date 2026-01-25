//Find the maximum number in the input integer array using pointers.
#include <stdio.h>
int main()
{
    int n;
    printf("Enter the size of the array: ");
    scanf("%d", &n);
    int arr[n];
    int *ptr = arr;
    for (int i = 0; i < n; i++)
    {
        printf("Enter value %d of the array: ", i);
        scanf("%d", &arr[i]);
        if (i > 0 && arr[i] > *ptr)
            ptr = &arr[i];
    }
    if (n > 0)
        printf("The greatest number in the array is: %d\n", *ptr);
    else
        printf("Array is empty.\n");
    return 0;
}
