import java.util.*;
public class moviedemo
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tickets being booked: ");
        int n = sc.nextInt();
        movie[] m = new movie[n];
        for (int i =0; i<n; i++)
        {
            System.out.println("Ticket "+(i+1)+": ");
            System.out.println("Enter movie id: ");
            short id = sc.nextShort();
            System.out.println("Enter screen no: ");
            short screen = sc.nextShort();
            System.out.println("Enter date: ");
            String date = sc.nextLine();
            System.out.println("Enter time: ");
            float time = sc.nextFloat();
            m[i] = new movie(id, screen, date, time);
        }
        m[0].checkSchedule(m);
    }
}
