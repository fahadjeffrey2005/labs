import java.util.*;
public class productDemo
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of products: ");
        int n = sc.nextInt();
        sc.nextLine();
        Product p[] = new Product[n];
        for (int i =0; i<n; i++)
        {
            System.out.println("Product "+(i+1)+" details: ");
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Category: ");
            String cat = sc.nextLine();
            System.out.println("Price: ");
            double price = sc.nextDouble();
            if (cat.equalsIgnoreCase("electronics"))
            {
                try
                    p[i] = new Electronics(name, id, cat, price);
                catch(InvalidPriceException e)
                    System.out.println(e.getMessage());
            }
            else if (cat.equalsIgnoreCase("clothing"))
            {
                try
                    p[i] = new Clothing(name, id, cat, price);
                catch(InvalidPriceException e)
                    System.out.println(e.getMessage());
            }
            else if (cat.equalsIgnoreCase("grocery"))
            {
                try
                    p[i] = new Grocery(name, id, cat, price);
                catch(InvalidPriceException e)
                    System.out.println(e.getMessage());
            }
            else
                System.out.println("Invalid category.");
        }
        
        for(int i=0; i<n; i++)
        {
            p[i].applyDiscount();
        }
        double maxp = 0.0;
        String maxn = "";
        for(int i =0; i<n;i++)
        {
            if(p[i].price > maxp)
            {
                maxp = p[i].getPrice();
                maxn = p[i].getProductName();
            }
        }
        
        System.out.println("Enter product numbers for price comparision: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        p[a].compare(p[b]);
        System.out.println("Most expensive product is: "+maxn+" with a price of: "+maxp);
    }
}
