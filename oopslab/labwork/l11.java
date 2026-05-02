/*
 
 1. Write a Java program to accept the number of hours worked, hourly rate and calculates
 the salary for an employee according to the following criteria: The company pays
 straight time for the first 40 hours worked by each employee and time and a half for
 all hours worked in excess of 40 hours.
 
 */

import java.util.*;
public class l11
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of hours worked by employee: ");
        int hrs = sc.nextInt();
        System.out.println("Enter the hourly rate of payement for first 40 hrs: ");
        int r1 = sc.nextInt();
        if (hrs <= 40)
        {
            double sal = hrs * r1;
            System.out.println("Employee has worked for "+hrs+" hrs and the salary is: "+sal);
        }
        else if(hrs>40)
        {
            double sal = hrs*r1 + (hrs-40)*(r1*1.5);
            System.out.println("Employee has worked for "+hrs+" hrs and the salary is: "+sal);
        }
    }
}
