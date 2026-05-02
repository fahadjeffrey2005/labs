/*
 
 For a given date of birth of a person, calculate the date of retirement by taking
 years of service as input. (assume service periods as 60 years).
 
 */
import java.util.*;

public class l23
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the date of birth (DDMMYYYY): ");
        long dob = sc.nextLong();

        int day = (int)(dob / 1000000);
        int month = (int)((dob / 10000) % 100);
        int year = (int)(dob % 10000);

        boolean valid = true;

        if (month < 1 || month > 12)
            valid = false;

        else if (day < 1 || day > 31)
            valid = false;

        else if (month == 2)
        {
            boolean leap = false;

            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
                leap = true;

            if (leap && day > 29)
                valid = false;
            if (!leap && day > 28)
                valid = false;
        }

        else if (month == 4 || month == 6 || month == 9 || month == 11)
        {
            if (day > 30)
                valid = false;
        }

        if (valid)
        {
            int ryear = year + 60;
            System.out.println("Individual will retire on: " +
                               day + "/" + month + "/" + ryear);
        }
        else
        {
            System.out.println("Invalid date entered.");
        }
    }
}
