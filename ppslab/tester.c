
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
