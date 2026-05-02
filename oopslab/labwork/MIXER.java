/*
 Define a class Mixer to merge two sorted integer arrays in ascending order with
 the following instance variables and methods:
 instance variables:
 int arr[] //to store the elements of an array
 Methods:
 void accept() // to accept the elements of the array in ascending order
 without any duplicates
 Mixer mix(Mixer A) // to merge the current object array elements with the
 parameterized array elements and return the resultant object
 void display() // to display the elements of the
 array Define the main() method to test the class.
 
 */


//import java.util.*;
//
//public class MIXER
//{
//    int[] arr;
//    int n;
//
//    void accept(int a[], int size)
//    {
//        n = size;
//        arr = new int[n];
//        for(int i = 0; i < n; i++)
//            arr[i] = a[i];
//    }
//
//    MIXER mix(MIXER A)
//    {
//        int i = 0, j = 0, k = 0;
//        MIXER R = new MIXER();
//        R.arr = new int[this.n + A.n];
//
//        while(i < this.n && j < A.n)
//        {
//            if(this.arr[i] < A.arr[j])
//                R.arr[k++] = this.arr[i++];
//            else if(this.arr[i] > A.arr[j])
//                R.arr[k++] = A.arr[j++];
//            else
//            {
//                R.arr[k++] = this.arr[i];
//                i++;
//                j++;
//            }
//        }
//
//        while(i < this.n)
//            R.arr[k++] = this.arr[i++];
//
//        while(j < A.n)
//            R.arr[k++] = A.arr[j++];
//
//        R.n = k;
//        return R;
//    }
//
//    void display()
//    {
//        for(int i = 0; i < n; i++)
//            System.out.print(arr[i] + " ");
//        System.out.println();
//    }
//
//    public static void main(String args[])
//    {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter size of first sorted array: ");
//        int n1 = sc.nextInt();
//        int a1[] = new int[n1];
//
//        System.out.println("Enter " + n1 + " elements in ascending order (no duplicates):");
//        for(int i = 0; i < n1; i++)
//            a1[i] = sc.nextInt();
//
//        System.out.print("Enter size of second sorted array: ");
//        int n2 = sc.nextInt();
//        int a2[] = new int[n2];
//
//        System.out.println("Enter " + n2 + " elements in ascending order (no duplicates):");
//        for(int i = 0; i < n2; i++)
//            a2[i] = sc.nextInt();
//
//        MIXER A = new MIXER();
//        MIXER B = new MIXER();
//
//        A.accept(a1, n1);
//        B.accept(a2, n2);
//
//        MIXER C = A.mix(B);
//
//        System.out.println("\nFirst Array:");
//        A.display();
//
//        System.out.println("Second Array:");
//        B.display();
//
//        System.out.println("Merged Array:");
//        C.display();
//    }
//}

import java.util.*;

public class MIXER
{
    int[] arr;
    int n;
    
    void accept(int a[], int size)
    {
        size = n;
        arr[] = new int[size];
        for (int i =0; i<n; i++)
            arr[i] = a[i];
    }
    
    MIXER mix(MIXER A)
    {
        MIXER R = new MIXER();
        R.arr = new int[this.n + A.n];
        
        for(int i =0, int j =0; i<this.n, j<A.n; i++,j++)
        {
            if(this.arr[i] < A.arr[j])
                R.arr[k++] = this.arr[i++];
            else if(this.arr[i] > A.arr[j])
                R.arr[k++] = A.arr[j++];
            else
                R.arr[k++] = this.arr[i];
        }
        while(i < this.n)
                    R.arr[k++] = this.arr[i++];
        
                while(j < A.n)
                    R.arr[k++] = A.arr[j++];
        
                R.n = k;
                return R;
            }
        
            void display()
            {
                for(int i = 0; i < n; i++)
                    System.out.print(arr[i] + " ");
                System.out.println();
            }
        
            public static void main(String args[])
            {
                Scanner sc = new Scanner(System.in);
        
                System.out.print("Enter size of first sorted array: ");
                int n1 = sc.nextInt();
                int a1[] = new int[n1];
        
                System.out.println("Enter " + n1 + " elements in ascending order (no duplicates):");
                for(int i = 0; i < n1; i++)
                    a1[i] = sc.nextInt();
        
                System.out.print("Enter size of second sorted array: ");
                int n2 = sc.nextInt();
                int a2[] = new int[n2];
        
                System.out.println("Enter " + n2 + " elements in ascending order (no duplicates):");
                for(int i = 0; i < n2; i++)
                    a2[i] = sc.nextInt();
        
                MIXER A = new MIXER();
                MIXER B = new MIXER();
        
                A.accept(a1, n1);
                B.accept(a2, n2);
        
                MIXER C = A.mix(B);
        
                System.out.println("\nFirst Array:");
                A.display();
        
                System.out.println("Second Array:");
                B.display();
        
                System.out.println("Merged Array:");
                C.display();
            }
        }
