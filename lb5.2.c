//Arrange the given elements in a 1D array in ascending and descending order using bubble sort method. [Hint: use switch case (as case ‘a’ and case ‘d’) to specify the order].
#include <stdio.h>
int main()
{
    int n;
    printf("Enter the number of values to be stored in the array: ");
    scanf("%d", &n);
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        printf("Enter value %d of the array: ", i+1);
        scanf("%d", &arr[i]);
    }
    //bubble sort region
    char s;
    printf("Enter (a) to view the array in ascending order:\nEnter (d) to view the array in descending order: ");
    scanf(" %c", &s);
    switch(s)
    {
        case 'a':
        {
            for (int i = 0; i < n-1; i++)
            {
                for (int j = 0; j < n-i-1; j++)
                {
                    if (arr[j] > arr[j+1])
                    {
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
            for(int i = 0; i < n; i++)
                printf("Value %d of array is: %d\n", i+1, arr[i]);
            break;
        }
        case 'd':
        {
            for (int i = 0; i < n-1; i++)
            {
                for (int j = 0; j < n-i-1; j++)
                {
                    if (arr[j] < arr[j+1])
                    {
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
            for(int i = 0; i < n; i++)
                printf("Value %d of array is: %d\n", i+1, arr[i]);
            break;
        }
        default:
        {
            printf("Invalid input! Please enter 'a' or 'd'.\n");
        }
    }
    return 0;
}
