/*
 
 Write a Java program to rotate the elements of an array to the right/left by a given number of steps. The program should handle arrays of different sizes and should be able to rotate the array in both directions (left and right).
 
 */
import java.util.*;
public class l14
{
    static void swap1(int arr[], int i)
    {
        int temp = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = temp;
    }
    static void swap2(int arr[], int i)
    {
        int temp = arr[i+1];
        arr[i+1] = arr[i];
        arr[i] = temp;
    }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0; i<n; i++)
        {
            System.out.println("Enter element "+i+" : ");
            arr[i]=sc.nextInt();
        }
        System.out.println("Original Array: ");
        for (int i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Left shift or Right shift? (L/R):  ");
        char ch = sc.next().charAt(0);
        
        switch(ch)
        {
            case 'L':
            {
                System.out.println("Enter number of left shift steps: ");
                int ls = sc.nextInt();
                for (int j=0; j<ls; j++)
                    for(int i =0; i<n-1;i++)
                        swap1(arr, i);
                break;
            }
            case 'R':
            {
                System.out.println("Enter number of right shift steps: ");
                int rs = sc.nextInt();
                for (int j=0; j<rs; j++)
                    for(int i =0; i<n-1;i++)
                        swap2(arr, i);
                break;
            }
            default:
            {
                System.out.println("Enter L or R only. ");
                break;
            }
        }
        System.out.println();
        System.out.println("New Array: ");
        for (int i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

