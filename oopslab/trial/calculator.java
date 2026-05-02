/**
 Define a class Calculator that demonstrates method overloading by
 implementing different versions of a method named calculate(). The class
 should support the following operations:
 1. calculate(int a, int b) → Returns the sum of two integers.
 2. calculate(double a, double b) → Returns the product of two double
 values.
 3. calculate(int a, int b, int c) → Returns the average of three integers.
 4. calculate(String str1, String str2) → Concatenates two strings and
 returns the result.
 Write a Java program that takes user input, invokes the appropriate
 overloaded method based on the arguments provided, and displays the
 output.
 
 */

import java.util.*;
public class calculator
{
    int calculate (int a, int b)
    {
        int c = a+b;
        return c;
    }
    double calculate (double a, double b)
    {
        double c = a+b;
        return c;
    }
    int calculate (int a, int b, int c)
    {
        int d = (int) ((a+b+c)/3);
        return d;
    }
    String calculate (String a, String b)
    {
        String c = a+b;
        return c;
    }
    
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);
        calculator C = new calculator();
        System.out.println("Enter option: \n1. Add 2 integers \n2. Add 2 decimals \n3. Calculate average of 3 integers \n4. Add 2 Strings ");
        int op = sc.nextInt();
        sc.nextLine();
        switch (op)
        {
            case 1:
                {
                    System.out.println("Enter var1: ");
                    int a = sc.nextInt();
                    System.out.println("Enter var2: ");
                    int b = sc.nextInt();
                    int c = C.calculate(a,b);
                    System.out.println(c);
                    break;
                }
            case 2:
                {
                    System.out.println("Enter var1: ");
                    double a = sc.nextDouble();
                    System.out.println("Enter var2: ");
                    double b = sc.nextDouble();
                    double c = C.calculate(a,b);
                    System.out.println(c);
                    break;
                }
            case 3:
                {
                    System.out.println("Enter var1: ");
                    int a = sc.nextInt();
                    System.out.println("Enter var2: ");
                    int b = sc.nextInt();
                    System.out.println("Enter var3: ");
                    int c = sc.nextInt();
                    int d = C.calculate(a,b,c);
                    System.out.println(d);
                    break;
                }
            case 4:
                {
                    System.out.println("Enter var1: ");
                    String a = sc.nextLine();
                    System.out.println("Enter var2: ");
                    String b = sc.nextLine();
                    String c = C.calculate(a,b);
                    System.out.println(c);
                    break;
                }
            default:
                {
                    System.out.println("Invalid input. ");
                    break;
                }
        }
    }
}
