/**
 
 Implement a ShoppingCart class that contains an inner class Item.
 a) The Item class should have fields like itemName, quantity, and price.
 b) The ShoppingCart class should provide methods to add items, calculate the total price,
 and display the cart contents.
 
 */
import java.util.*;
public class shoppingCart
{
    Scanner sc = new Scanner(System.in);
    Item[] items;
    int n;
    float total;
    void addItem()
    {
        System.out.println("Enter number of items to be added: ");
        n = sc.nextInt();
        items = new Item[n];
        for(int i =0; i<n; i++)
        {
            System.out.println("Item "+(i+1)+": ");
            items[i] = new Item();
            items[i].setItem();
        }
    }
    float calculate()
    {
        for(int i =0; i<n; i++)
        {
            total += items[i].itemTotal();
        }
        return total;
    }
    void display()
    {
        for(int i =0; i<n; i++)
        {
            items[i].displayItem();
        }
    }
    public class Item
    {
        String itemName;
        int quantity;
        float price;
        
        void setItem()
        {
            sc.nextLine();
            System.out.println("Enter item name: ");
            itemName = sc.nextLine();
            System.out.println("Enter quantity of "+itemName+" :");
            quantity = sc.nextInt();
            System.out.println("Enter price of "+itemName+" :");
            price = sc.nextFloat();
        }
        void displayItem()
        {
            System.out.println();
            System.out.println("Item: "+itemName);
            System.out.println("Quantity :"+ quantity);
            System.out.println("Price :"+ price);
            System.out.println();
        }
        float itemTotal()
        {
            return quantity*price;
        }
    }
    
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        shoppingCart s = new shoppingCart();
        s.addItem();
        s.display();
        float total = s.calculate();
        System.out.println("Total bill: "+total);
    }
}
