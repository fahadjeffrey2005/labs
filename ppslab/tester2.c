/*
 Search the position of the number that is entered by the user and delete that particular
 number from the array and display the resultant array elements
 */

#include <stdio.h>

int main() {
    int n;
    printf("Enter the number of values to be stored in the array: ");
    scanf("%d", &n);
    
    int arr[n];
    for (int i = 0; i < n; i++) {
        printf("Enter value %d of the array: ", i + 1);
        scanf("%d", &arr[i]);
    }
    int tarv;
    printf("Enter the target value: ");
    scanf("%d", tarv);
    for (int i = 0; i <n; i++)
    {
        if (arr[i] == tarv)
        {
            
        }
    }
    return 0;
}
