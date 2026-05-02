/**
 Write a Java program that performs the following operations on an integer
 array:
 1. Accepts N elements from the user and stores them in an array.
 2. Finds and prints the largest and smallest elements in the array
 using a loop (control structure).
 3. Reverses the array elements and prints the reversed array.
 4. Counts and displays the number of even and odd elements in the
 array.
 Constraints:
    Use loops (for/while) and conditional statements (if-else) for
 processing the array.
    Do not use built-in sorting or reversing methods.
    Ensure proper input validation to handle negative numbers.
 
 */
import java.util.*;
public class t1
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int largest =0, smallest =0, ec =0, oc =0;
        for (int i =0; i<n; i++)
        {
            System.out.println("Enter element "+(i+1)+": ");
            arr[i] = sc.nextInt();
            if (arr[i] > largest)
                largest = arr[i];
            if (arr[i] < smallest)
                smallest = arr[i];
            if (arr[i] % 2 == 0)
                ec++;
            else
                oc++;
        }
        for (int i =0; i<n; i++)
            System.out.print(arr[i]+ " ");
        
        for (int i = 0; i < n/2; i++)
        {
            int temp = arr[n - i - 1];
            arr[n - i - 1] = arr[i];
            arr[i] = temp;
        }
        System.out.println();
        for (int i =0; i<n; i++)
            System.out.print(arr[i]+ " ");
        System.out.println();
        System.out.println("Number of odd elements: "+ oc);
        System.out.println("Number of even elements: "+ ec);

    }
}
