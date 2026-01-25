#include <stdio.h>

int main() {
    int arr[100], n, key, i, low, high, mid, found = 0;

    printf("Enter size of array: ");
    scanf("%d", &n);

    printf("Enter %d sorted elements: ", n);  // must be sorted!
    for (i = 0; i < n; i++) scanf("%d", &arr[i]);

    printf("Enter element to search: ");
    scanf("%d", &key);

    low = 0;
    high = n - 1;

    while (low <= high) 
    {
        mid = (low + high) / 2;
        for (int i =0; i <n; i++) 
        {
        if (arr[mid] == key) {
            printf("Element %d found at position %d\n", key, mid);
            found = 1;
            break;
        }
        else if (arr[mid] < key)
            low = mid + 1;
        else
            high = mid - 1;
    }
    }

    if (!found) printf("Element not found\n");

    return 0;
}
