import java.util.*;
public class SeriesDemo
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first term of the series: ");
        int s = sc.nextInt();
        ByTwos s2 = new ByTwos(s);
        System.out.println("Enter number of terms to be generated in this series: ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++)
        {
            int temp = s2.getNext();
            System.out.println(temp);
        }
        s2.reset();
    }
}
