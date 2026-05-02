/*
 
 Write a Java program to display non diagonal elements and find their sum.
 [Hint: Non Principal diagonal: The diagonal of a diagonal matrix from the top
 right to the bottom left corner is called non principal diagonal.]
 
 */
import java.util.*;

public class l24
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows: ");
        int r = sc.nextInt();
        System.out.println("Enter the no of columns: ");
        int c = sc.nextInt();
        int sum =0;
        int[][] arr = new int[r][c];
        for(int i =0; i<r; i++)
        {
            for(int j =0; j<c; j++)
            {
                System.out.println("Enter element "+i+","+j+": ");
                arr[i][j] = sc.nextInt();
                if (i + j == c - 1)
                {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("The sum of the non principal diagonal is: "+sum);
    }
}
