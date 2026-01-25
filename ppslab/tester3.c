/*
 binary search
 */

#include <stdio.h>
int main()
{
    int n;
    printf("Enter the size of the array: ");
    scanf("%d", &n);
    int arr[n], low =0, high = n-1, tarv, flag=0, mid, temp;
    for(int i= 0; i <n; i++)
    {
        printf("Enter value %d of the array: ", i+1);
        scanf("%d", &arr[i]);
    }
    mid = (low+high)/2;
    printf("Enter the target value: ");
    scanf("%d", &tarv);
    for(int i= 0; i <n; i++)
    {
        if(arr[mid]==tarv)
        {
            temp = mid;
            flag = 1;
            break;
        }
        else if (arr[mid] < tarv)
        {
            low = mid + 1;
            mid = (low+high)/2;
        }
        else if(arr[mid] > tarv)
        {
            high = mid - 1;
            mid = (low+high)/2;
        }
    }
    if(flag)
        printf("The target value is found at position: %d \n", temp+1);
    else
        printf("The element is not found.\n");
    return 0;
}
//refine this code, keep the skeleton the same, make the output look attractive and all inclusive with all details
