/*
 
 Write a Java program to manage stock information for multiple products. The program should store the product name, product price, and quantity in separate one-dimensional arrays for n items. The user should be able to specify which products they want to purchase and the desired quantity for each. Based on the user’s input, the program should generate and display the total bill.
 
 */
import java.util.*;
public class l15
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the arrays: ");
        int n = sc.nextInt();
        String name[] = new String[n];
        float price[] = new float[n];
        int quant[] = new int[n];
        sc.nextLine();
        for (int i=0; i<n; i++)
        {
            System.out.println("Enter name of product "+(i+1)+" : ");
            name[i]=sc.nextLine();
            System.out.println("Enter price of product "+(i+1)+" : ");
            price[i]=sc.nextFloat();
            System.out.println("Enter quantity of product "+(i+1)+" : ");
            quant[i]=sc.nextInt();
            sc.nextLine();
        }
        for (int i=0; i<n; i++)
        {
            System.out.println((i+1)+". Name: "+name[i]+" Price: "+price[i]+" Quantity: "+quant[i]);
            
        }
        outer: if(true)
        {
            System.out.println("Do you want to purchase any item? (Y/N) ");
            char ch = sc.next().charAt(0);
            if(ch == "N")
                break outer;
            System.out.println();
            System.out.println("Enter Sl. No. of the item you want to purchase: ");
            int op = sc.nextInt();
            System.out.println("Selected item is: "+name[op]+" price is: "+price[op]+" quantity available: "+quant[op]);
            


            
        }

        
    }
}
