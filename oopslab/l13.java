/*
 
 Write a Java program to execute the following statements. Observe and analyze the
 outputs.
 a. int x =10; b. double x = 10.5;
 c. double x=10.5;
 double y = x; int y = x;
 int y = (int) x
 System.out.println(y); System.out.println(y);
 System.out.println(y);
 
 */
import java.util.*;
public class l13
{
    public static void main(String[]args)
    {
        int x =10;
        double x1 = 10.5;
        double y1 = x1;
        int y = x;
        y = (int) x;
        System.out.println(y);
        System.out.println(y);
        System.out.println(y);
    }
}

