/**
 
 An e-commerce company maintains product information such as product name (String), selling
 price (double), cost price (double), and category (String). The company intends to enhance its
 existing product management system to dynamically apply category-based discounts and analyze
 profit margins. The discount percentage should vary according to the product category, where
 Electronics items receive a 10% discount, Clothing items receive a 5% discount, and all other
 categories receive a 2% discount. The discount logic must be implemented in a separate method
 named applyDiscount(), which applies the appropriate discount and returns the updated Product
 object after modification. After processing all products, the system should compute the profit margin
 (selling price minus cost price) for each product and identify the product with the highest profit
 margin. Design and implement the complete Java program using an array of at least five Product
 objects to demonstrate this functionality. (5)
 
 */


import java.util.*;

class product
{
    String name, cat;
    double sp, cp;
    
    product(String name, String cat, double sp, double cp)
    {
        this.name = name;
        this.cat = cat;
        this.sp = sp;
        this.cp = cp;
    }
    
    product applyDiscount()
    {
        if ("electronics".equalsIgnoreCase(cat))
        {
            sp = 0.9*sp;
        }
        else if ("clothing".equalsIgnoreCase(cat))
        {
            sp = 0.95*sp;
        }
        else
        {
            sp = 0.98*sp;
        }
        
        return this;
    }
    
    double margin()
    {
        return sp-cp;
    }
    
    void display()
    {
        System.out.println("Name: "+ name);
        System.out.println("Category: "+ cat);
        System.out.println("Cost Price: "+ cp);
        System.out.println("Selling Price: "+ sp);
    }
}


public class ProductManagement
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        product[] p;
        
        System.out.println("Enter number of products: ");
        int n = sc.nextInt();
        p = new product[n];
        
        for(int i=0; i<n; i++)
        {
            System.out.println("Enter details for product "+(i+1)+": ");
            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Category: ");
            String cat = sc.nextLine();
            System.out.println("Cost Price: ");
            double cp = sc.nextDouble();
            System.out.println("Selling Price: ");
            double sp = sc.nextDouble();
            p[i] = new product(name, cat, sp, cp);
            p[i].applyDiscount();
        }
        double max = p[0].margin();
        int j=0;
        for (int i=0; i<n; i++)
        {
            System.out.println("Product: "+(i+1);
            p[i].display();
            System.out.println("Margin: "+p[i].margin());
            if(p[i].margin()>max)
                max = p[i].margin();
                j = i;
        }
        
        System.out.println("Product "+j+" has max margin of "+max);
    }
}
