/*
 Create a class called Counter that contains a static data member to count the number
 of Counter objects being created. Also define a static member function called
 showCount() which displays the number of objects created at any given point of
 time. Illustrate this.
 */
import java.util.*;
public class Counter
{
    static int ocount = 0;
    Counter()
    {
        ocount++;
    }
    static void showCount()
    {
        System.out.println("Number of objects is: "+ocount);
    }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of objects to be created: ");
        int n = sc.nextInt();
        Counter[] c = new Counter[n];
        for(int i =0; i<n; i++)
        {
            c[i] = new Counter();
        }
        Counter.showCount();
    }
}
