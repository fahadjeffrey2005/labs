/**
 
 Q. Design and implement a Java program for a Movie Ticket Booking System.
 The system should have a class MovieTicket that manages ticket bookings for a cinema hall. The cinema hall has three sections — Gold (seats 1–20), Silver (seats 21–50), and Bronze (seats 51–100) — with different pricing for each.
 The system should be able to handle multiple bookings, compute the total amount for each customer, apply a 10% discount if more than 3 tickets are booked, and display a structured booking summary for each customer.
 A static member must be used appropriately to track something meaningful across all bookings.
 The program must demonstrate the use of constructor overloading and method overloading at least once.
 All inputs must be taken from the user at runtime.
 
 */
import java.util.*;

public class movie
{
    String name;
    int seat;
    int no;
    float bill;
    static int totalBookings = 0;

    movie(String name, int seat)
    {
        this.name = name;
        this.seat = seat;
        this.no = 1;
        this.bill = 0.0f;
        totalBookings++;
    }

    movie(String name, int seat, int no)
    {
        this.name = name;
        this.seat = seat;
        this.no = no;
        this.bill = 0.0f;
        totalBookings+=no;
    }

    void pricing()
    {
        if (seat >= 1 && seat <= 20)
            bill = 700 * no;
        else if (seat >= 21 && seat <= 50)
            bill = 350 * no;
        else if (seat >= 51 && seat <= 100)
            bill = 200 * no;
        else
        {
            System.out.println("Invalid seat number.");
            bill = 0.0f;
        }
    }

    void discount()
    {
        if (no > 3)
        {
            bill *= 0.9f;
            System.out.println("10% discount applied.");
        }
        else
            System.out.println("No discount applicable.");
    }

    void discount(int percentage)
    {
        bill *= (1 - percentage / 100.0f);
        System.out.println(percentage + "% discount applied.");
    }

    void display()
    {
        String section;
        if (seat >= 1 && seat <= 20)
            section = "Gold";
        else if (seat >= 21 && seat <= 50)
            section = "Silver";
        else if (seat >= 51 && seat <= 100)
            section = "Bronze";
        else
            section = "Invalid";

        System.out.println("Name: " + name);
        System.out.println("Seat No: " + seat);
        System.out.println("Section: " + section);
        System.out.println("No. of Tickets: " + no);
        System.out.println("Total Bill: Rs." + bill);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of bookings: ");
        int n = sc.nextInt();
        sc.nextLine();

        movie[] m = new movie[n];

        for (int i = 0; i < n; i++)
        {
            System.out.println("Booking " + (i + 1));

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter seat no (1-100): ");
            int seat = sc.nextInt();

            System.out.print("Multiple tickets? Y/N: ");
            char op = sc.next().charAt(0);

            if (op == 'Y' || op == 'y')
            {
                System.out.print("Enter number of tickets: ");
                int no = sc.nextInt();
                m[i] = new movie(name, seat, no);
            }
            else
                m[i] = new movie(name, seat);

            sc.nextLine();

            m[i].pricing();

            if (m[i].bill > 0)
            {
                System.out.print("Special discount? Y/N: ");
                char op2 = sc.next().charAt(0);
                sc.nextLine();

                if (op2 == 'Y' || op2 == 'y')
                {
                    System.out.print("Enter discount percentage: ");
                    int per = sc.nextInt();
                    sc.nextLine();
                    m[i].discount(per);
                }
                else
                    m[i].discount();
            }

            m[i].display();
            System.out.println("Total bookings so far: " + totalBookings);
        }
    }
}
