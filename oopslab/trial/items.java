/*
 
 A shop sells items. Each item has a name (String) and price (double).
 Create 4 items, display all of them, and find the most expensive one.
 
 */

import java.util.*;

public class items
{
    String name;
    double price;
    items(String name, double price)
    {
        this.name = name;
        this.price = price;
    }
    
    public void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Price: "+price);

    }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of items: ");
        int n = sc.nextInt();
        items[] i = new items[n];
        for (int j = 0; j<n; j++)
        {
            System.out.println("Enter the name of item "+j+": ");
            String name = sc.nextLine();
            System.out.println("Enter the price: ");
            double price = sc.nextDouble();
            
            i[j] = new items(name,price);
        }
        for (int j = 0; j<n; j++)
        {
            i[j].display();
        }
    }
}
