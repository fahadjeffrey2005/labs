/*
 
 1. Write a menu driven program to do the following
 i. To check whether a string is palindrome or not
 ii. Write the string in an alphabetical order
 iii. Reverse the string
 iv. Concatenate the original string and the reversed string
 
 */

import java.util.*;
public class Palindrome
{
    String x;
    Palindrome(String x)
    {
        this.x = x;
    }
    public void checker()
    {
        StringBuffer sb = new StringBuffer(x);
        String rev = sb.reverse().toString();

        if (x.equals(rev))
            System.out.println("Palindrome.");
        else
            System.out.println("Not Palindrome.");
    }
    
    public void arrange()
    {
        char[] arr = x.toCharArray();
        Arrays.sort(arr);
        String sorted = new String(arr);
        System.out.println("Alphabetical order: " + sorted);
    }
    
    public void reverse()
    {
        char[] arr = x.toCharArray();
        char[] rev = new char[x.length];
        for(int i =0; i< x.length; i++)
        {
            rev[i] = arr[x.length - 1];
        }
        String x1 = new String(rev);
    }
    
    public void join()
    {
        String rev = reverse();
        System.out.println("Concatenated string: " + x + rev);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String x = sc.nextLine();

        Palindrome p = new Palindrome(x);

        while(true)
        {
            System.out.println("\nMenu:");
            System.out.println("1. Check Palindrome");
            System.out.println("2. Alphabetical Order");
            System.out.println("3. Reverse String");
            System.out.println("4. Concatenate Original + Reverse");
            System.out.println("5. Exit");

            int choice = sc.nextInt();
            
            switch(choice)
            {
                case 1:
                    p.checker();
                    break;
                    
                case 2:
                    p.arrange();
                    break;
                    
                case 3:
                    System.out.println("Reversed: " + p.reverse());
                    break;
                    
                case 4:
                    p.join();
                    break;
                    
                case 5:
                    System.exit(0);
                    
                default: System.out.println("Invalid choice");
            }
        }
    }
}
