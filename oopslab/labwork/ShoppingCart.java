import java.util.*;

public class ShoppingCart
{
    int n;
    Item[] items;
    Scanner sc = new Scanner(System.in);

    // Inner class
    class Item
    {
        String itemName;
        int quantity;
        float price;

        // Method to set item details
        void setItem()
        {
            sc.nextLine(); // clear buffer
            System.out.println("Enter item name: ");
            itemName = sc.nextLine();

            System.out.println("Enter quantity: ");
            quantity = sc.nextInt();

            System.out.println("Enter price: ");
            price = sc.nextFloat();
        }

        // Method to display item
        void displayItem()
        {
            System.out.println(itemName + " | Qty: " + quantity + " | Price: " + price);
        }

        // Method to calculate total for this item
        float getTotal()
        {
            return quantity * price;
        }
    }

    // Method to add items
    public void addItems()
    {
        System.out.println("Enter number of items: ");
        n = sc.nextInt();

        items = new Item[n];

        for(int i = 0; i < n; i++)
        {
            items[i] = new Item();
            items[i].setItem();
        }
    }

    // Method to calculate total cart price
    public float calculateTotal()
    {
        float total = 0;

        for(int i = 0; i < n; i++)
        {
            total += items[i].getTotal();
        }

        return total;
    }

    // Method to display cart
    public void displayCart()
    {
        System.out.println("Cart Contents:");

        for(int i = 0; i < n; i++)
        {
            items[i].displayItem();
        }

        System.out.println("Total Price: " + calculateTotal());
    }

    public static void main(String[] args)
    {
        ShoppingCart cart = new ShoppingCart();
        cart.addItems();
        cart.displayCart();
    }
}
