/*
 
 Write a java program to add two numbers using the bitwise operator and check if the
 output is an even or odd number. [Hint: use left shift and right shift bitwise operators].

 
 */
import java.util.*;
public class l12
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value: ");
        int a = sc.nextInt();
        System.out.println("Enter second value: ");
        int b = sc.nextInt();
        int carry;
        while(b!=0)
            {
                carry = (a&b)<<1;
                a=a^b;
                b=carry;
            }
        System.out.println("Sum = " + a);
        if (a%2 != 0)
            System.out.println("The sum is odd. " );
        else
            System.out.println("The sum is even. " );

        
    }
}
