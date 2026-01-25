//Print all the prime numbers in a given 1D array.

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
     
     printf("Prime numbers in the array are: ");
     int flag = 0; 
     for (int i = 0; i < n; i++) {
         int num = arr[i];
         int isPrime = 1; 
         if (num <= 1) {
             isPrime = 0;
         } else {
             for (int j = 2; j * j <= num; j++) {
                 if (num % j == 0) {
                     isPrime = 0;
                     break;
                 }
             }
         }
         if (isPrime) {
             printf("%d ", num);
             flag = 1;
         }
     }
     
     if (!flag) {
         printf("None");
     }
     printf("\n");
     
     return 0;
 }
 

