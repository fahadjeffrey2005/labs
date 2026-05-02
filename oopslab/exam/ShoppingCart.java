import java.util.*;

public class ShoppingCart
{
    class Item
    {
        String itemName;
        int quantity;
        double price;
        
        Item(String itemName, int quantity, double price)
        {
            this.itemName = itemName;
            this.quantity = quantity;
            this.price = price;
        }

        void displayItem()
        {
            System.out.println("Name: " + itemName);
            System.out.println("Quantity: " + quantity);
            System.out.println("Price: " + price);
        }

        double calculate()
        {
            return quantity * price;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        System.out.println("Enter number of items to be added to cart: ");
        int n = sc.nextInt();
        sc.nextLine();

        Item[] it = new Item[n];

        for (int i = 0; i < n; i++)
        {
            System.out.println("Product " + (i + 1) + ": ");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Quantity: ");
            int quant = sc.nextInt();
            sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            sc.nextLine();
            it[i] = cart.new Item(name, quant, price);
        }

        double total = 0;
        for (int i = 0; i < n; i++)
        {
            it[i].displayItem();
            System.out.println("Subtotal: " + it[i].calculate());
            total += it[i].calculate();
        }
        System.out.println("Total: " + total);
    }
}
