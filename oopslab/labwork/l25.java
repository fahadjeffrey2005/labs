/*
 Write a java program to print the factorial using recursive functions
 */

import java.util.*;

public class l25
{
    public int fact(int n)
    {
        if (n ==0)
            return 1;
        else
            return n*fact(n-1);
    }
    public void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value whose fatorial is to be found: ");
        int n = sc.nextInt();
        int f = fact(n);
        System.out.println("The factorial of "+n+" is: "+f);
    }
}
