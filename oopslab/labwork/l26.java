/*
 
 Write a Java program to compute the electricity bill for an industry using a
 switch-case statement. The program should take the daily consumption in units
 for 7 days as input. Based on the total consumption, the program should
 calculate and display the total electricity bill according to the following pricing
 table:
 Units Price per Unit (INR)
 0 - 100 7.00
 101 - 200 8.00
 >= 201 10.00
 
 */

import java.util.*;

public class l26
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[7];
        int total = 0;
        for (int i =0; i <7; i++)
        {
            System.out.println("Enter units for day "+(i+1));
            v[i] = sc.nextInt();
            total += v[i];
        }
        int op =0;
        if (total<=100)
            op =1;
        else if (total >100 && total<=200)
            op=2;
        else
            op =3;
        float val = 0.0f;
        switch (op)
        {
            case 1:
            {
                val = total*7.0f;
                break;
            }
            case 2:
            {
                val = total*8.0f;
                break;
            }
            case 3:
            {
                val = total*10.0f;
                break;
            }
            default:
            {
                System.out.println("Invalid.");
                break;
            }
        }
        System.out.println("The bill for "+total+" units is: ₹"+val);
    }
}
