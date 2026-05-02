/*
 
 Write a Java program to define a class called Matrix that has a 2D array of integers and the following methods.
 a) A parameterized constructor to receive two integers (m and n) as parameter and allocate memory basic for the 2D array of size m*n.
 b) Another parameterized constructor to receive an integer 2D array and allocate memory to the instance variable and initialize the array
 with the contents of the array received.
 (5)
 c) Method to display the Matrix using for each loop
 d) Method find() to return a 1D array containing all prime numbers in the matrix.
 Test class Matrix with class MatrixDemo having main method to test all the methods of the class appropriately.
 
 */

import java.util.*;

public class Matrix
{
    int arr[][];

    Matrix(int m, int n)
    {
        arr = new int[m][n];
    }

    Matrix(int a[][])
    {
        arr = new int[a.length][a[0].length];
        for(int i = 0; i < a.length; i++)
            for(int j = 0; j < a[0].length; j++)
                arr[i][j] = a[i][j];
    }

    void display()
    {
        for(int[] row : arr)
        {
            for(int val : row)
            {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    int[] find()
    {
        int w = 0;
        int parr[] = new int[arr.length * arr[0].length];

        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[0].length; j++)
            {
                boolean isPrime = true;
                if(arr[i][j] < 2) isPrime = false;
                for(int k = 2; k <= (int)(Math.sqrt(arr[i][j])); k++)
                {
                    if(arr[i][j] % k == 0)
                    {
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime)
                {
                    parr[w] = arr[i][j];
                    w++;
                }
            }
        }
        return parr;
    }
}
