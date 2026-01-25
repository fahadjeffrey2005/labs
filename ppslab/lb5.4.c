// Search the position of the number that is entered by the user and delete that particular number from the array and display the resultant array elements.
#include <stdio.h>

int main() {
    int size, num, i, pos = -1;
    
    printf("Enter the size of the array: ");
    scanf("%d", &size);
    int arr[size];
    
    printf("Enter %d elements:\n", size);
    for(i = 0; i < size; i++) {
        scanf("%d", &arr[i]);
    }
    
    printf("Enter the number to delete: ");
    scanf("%d", &num);
    
    for(i = 0; i < size; i++) {
        if(arr[i] == num) {
            pos = i;
            break;
        }
    }
    
    if(pos != -1) {
        for(i = pos; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
        
        printf("Array after deleting %d:\n", num);
        for(i = 0; i < size; i++) {
            printf("%d ", arr[i]);
        }
        printf("\n");
    } else {
        printf("Number %d not found in the array.\n", num);
    }
    
    return 0;
}
