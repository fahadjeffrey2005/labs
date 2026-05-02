import java.util.*;
public class counterDemo
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of objects: ");
        int n = sc.nextInt();
        Counter[] c = new Counter[n];
        for(int i=0; i<n;i++)
        {
            c[i] = new Counter();
            Counter.showCount();
        }
    }
}
