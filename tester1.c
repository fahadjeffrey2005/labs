/*
 ==================================
 
 #include <stdlib.h>
 #include <stdio.h>
 
 int main() {
 int num = -10;
 int absolute_num = abs(num);
 printf("Absolute value of %d is %d\n", num, absolute_num); // Output: Absolute value of -10 is 10
 return 0;
 }
 ======================================
 // largest and smallest in 1d array
 
 
 #include <stdio.h>
 #include <math.h>
 
 int main()
 {
 int n;
 printf("Enter the number of elements in the array: ");
 scanf("%d", &n);
 int arr[n];
 for(int i=0; i<n; i++)
 {
 printf("Enter element %d: ", i+1);
 scanf("%d", &arr[i]);
 }
 int largest = arr[0];
 int smallest = arr[0];
 for(int i=1; i<n; i++)
 {
 if(arr[i] > largest)
 largest = arr[i];
 if(arr[i] < smallest)
 smallest = arr[i];
 }
 printf("Largest element: %d\n", largest);
 printf("Smallest element: %d\n", smallest);
 return 0;
 }
 =========================================
 // ascending and descending order using bubble sort method
 
 #include <stdio.h>
 
 int main()
 {
 int n;
 printf("Enter the number of elements in the array: ");
 scanf("%d", &n);
 int arr[n];
 for (int i = 0; i <n; i++)
 {
 printf("Enter element %d: ", i+1);
 scanf("%d", &arr[i]);
 }
 for (int i = 0; i < n-1;i++)
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
 printf("Ascending order: \n");
 for (int i = 0; i < n; i++)
 {
 printf("%d ", arr[i]);
 }
 printf("\nDescending order: \n");
 for (int i = n-1; i >= 0; i--)
 {
 printf("%d ", arr[i]);
 }
 printf("\n");
 return 0;
 }
 =========================================
 // prime numbers in a 1d
 
 #include <stdio.h>
 int main()
 {
 int n;
 printf("Enter the number of values to be stored in the array: ");
 scanf("%d", &n);
 int arr[n];
 for (int i = 0; i < n; i++ )
 {
 printf("Enter value %d: ", i+1);
 scanf("%d", &arr[i]);
 }
 
 printf("Prime numbers in the array: ");
 for (int i = 0; i < n; i++) {
 int isPrime = 1;
 if (arr[i] < 2)
 isPrime = 0;
 for (int x = 2; x <= arr[i]/2; x++) {
 if (arr[i] % x == 0) {
 isPrime = 0;
 break;
 }
 }
 if (isPrime)
 printf("%d ", arr[i]);
 }
 printf("\n");
 return 0;
 }
 =========================================
 // search the position and delete that specific element from 1d array
 #include <stdio.h>
 int main()
 {
 int n;
 printf("Enter the number of values to store in the array: ");
 scanf("%d", &n);
 int arr[n];
 for (int i = 0; i < n; i++)
 {
 printf("Enter value %d: ",i+1);
 scanf("%d", &arr[i]);
 }
 int v, found = 0, z;
 printf("Enter the value to check: ");
 scanf("%d", &v);
 
 for (z = 0; z < n; z++)
 {
 if (v == arr[z])
 {
 found = 1;
 for (int i = z; i < n - 1; i++)
 {
 arr[i] = arr[i + 1];
 }
 break;
 }
 }
 if (found)
 {
 printf("The value %d is found at position %d in the array\nUpdated array is:\n", v, z);
 for (int i = 0; i < n; i++)
 {
 printf("%d ", arr[i]);
 }
 printf("\n");
 }
 else
 {
 printf("Entry has no match\n");
 }
 return 0;
 }
 
*/

//selection sort program
#include <stdio.h>

int main() {
    int n, target, i, j, minIndex, temp, result = -1;

    // Input size
    printf("Enter the size of the array: ");
    scanf("%d", &n);

    int arr[n];

    // Input elements
    printf("Enter %d elements:\n", n);
    for (i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    // Selection Sort
    for (i = 0; i < n - 1; i++) {
        minIndex = i;
        for (j = i + 1; j < n; j++) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j;
            }
        }
        // Swap
        temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
    }

    // Print sorted array
    printf("Sorted array: ");
    for (i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");

    // Input target
    printf("Enter the target value to search: ");
    scanf("%d", &target);

    // Linear search
    for (i = 0; i < n; i++) {
        if (arr[i] == target) {
            result = i;
            break;
        }
    }

    if (result != -1)
        printf("Target %d found at position (0-based index): %d\n", target, result);
    else
        printf("Target %d not found in the array.\n", target);

    return 0;
}


 
 
