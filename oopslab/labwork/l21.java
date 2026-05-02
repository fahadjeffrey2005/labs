/*
 
 A Taxi service offers a new service based on travel distance. Write a Java
 program to calculate the total distance traveled by considering the following
 charges. First 5 km = INR 10/km, Next 15 km = INR 8/km, Next 25 km = INR
 5/km.
 
 */
import java.util.*;

public class l21
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance travelled totally in KMs: ");
        float d = sc.nextFloat();
        float c =0.0f;
        if (d<5)
        {
            c = d*10;
        }
        else if(d>=5 && d <=20)
        {
            c = (d-5)*8 + 5*10;
        }
        else if(d>20)
        {
            c = 15*8 + 5*10 + (d-20)*5;
        }
        System.out.println("User has travelled "+d+" kms, the charge is: ₹"+c);
    }
}
