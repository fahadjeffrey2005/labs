import java.util.*;
public class productDemo
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of products: ");
        int n = sc.nextInt();
        product[] p = new product[n];
        sc.nextLine();
        for(int i =0; i<n; i++)
        {
            System.out.println("Product "+(i+1)+": ");
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("ID: ");
            int id = sc.nextInt();
            System.out.println("price: ");
            double price = sc.nextDouble();
            System.out.println("Category: ");
            String cat = sc.nextLine();
            p[i] = new product(name, id, price, cat);
        }
        System.out.println("Enter the ID number of the two products to be compared: ");
        int id1 = sc.nextInt();
        int id2 = sc.nextInt();
        for(int i =0;i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(p[i].id == id1 && p[j].id == id2)
                {
                    p[i].compare(p[j]);
                }
            }
        }
        for(int i =0;i<n; i++)
        {
            p[i].display();
        }
    }
}
