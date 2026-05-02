import java.util.*;

public class MatrixDemo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows: ");
        int p = sc.nextInt();
        System.out.println("Enter no of cols: ");
        int q = sc.nextInt();
        int arr[][] = new int[p][q];
        for(int i = 0; i < p; i++)
        {
            for(int j = 0; j < q; j++)
            {
                System.out.println("Enter element: " + i + " " + j);
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter option: ");
        System.out.println("1. Display Matrix");
        System.out.println("2. Find Primes");
        System.out.println("3. Test empty Matrix constructor");
        int option = sc.nextInt();

        switch(option)
        {
            case 1:
                Matrix m1 = new Matrix(arr);
                m1.display();
                break;

            case 2:
                Matrix m2 = new Matrix(arr);
                int parr[] = m2.find();
                System.out.println("Prime numbers in matrix:");
                for(int i = 0; i < parr.length; i++)
                {
                    if(parr[i] != 0)
                        System.out.print(parr[i] + " ");
                }
                System.out.println();
                break;

            case 3:
                Matrix m3 = new Matrix(p, q);
                m3.display();
                break;
        }
    }
}
